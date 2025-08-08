/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.OrganizatorJsonControl;
import controller.PlayerJsonControl;
import controller.TournamentJsonControl;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy A. Fernández
 */
public class Organizator extends Person implements PlayerInterface {
    
    // Attributes
    private List<Tournament> tournamentList;
    private List<Player> playerList;
    
    // Methods
    
    // Private Methods
    
    private void cleanTable(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        defaultTable.setRowCount(0);
    }
    
    // Constructor #1
    public Organizator(){}
    
    // Constructor #2
    public Organizator(List<Tournament> TournamentList, List<Player> playerList, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {
        super(id, name, password, email, dateBirth, phoneNumber);
        this.tournamentList = TournamentList;
        this.playerList = playerList;
    }
    
    // Getter Methods

    public List<Tournament> getTournamentList() {
        return tournamentList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    
    // Setter Methods

    public void setTournamentList(List<Tournament> TournamentList) {
        this.tournamentList = TournamentList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    
    @Override
    public Player searchPlayer(JTextField dataEnterId){
        Player player = null;
        for (int i = 0; i < playerList.size(); i++){
            if(playerList.get(i).getId().equals(dataEnterId.getText())) player = playerList.get(i);
        }
        return player;
    }
    
    @Override
    public Player searchPlayer(String dataEnterId){
        Player player = new Player();
        for (int i = 0; i < playerList.size(); i++){
            if(playerList.get(i).getId().equals(dataEnterId)) player = playerList.get(i);
        }
        return player;
    }
    
    public boolean findPlayer(String id){
        for (Player player: playerList){
            if (player.getId().equals(id)) return true;
        }
        return false;
    }
    
    public void updatePlayers(){
        Player dataPlayer = new Player();
        for (Player player: playerList){
            for (Tournament tour: tournamentList){
                if (player.getId().equals(tour.searchPlayerById(id).getId())) 
                    dataPlayer.recolectDataPlayer(tour.searchPlayerById(id));
            }
            player.updatePlayer(dataPlayer);
        }
    }
    
    public void updatePlayersJson(){
        PlayerJsonControl jsonPlayer = new PlayerJsonControl(); 
        for (Player p: playerList){jsonPlayer.updatePerson(p);}
    }
    
    public void updateTournamentsJson(){
        TournamentJsonControl jsonTour = new TournamentJsonControl();
        for (Tournament t: tournamentList){jsonTour.updatePerson(t);}
    }
    
    public void updateJsonOrganizator(){
        OrganizatorJsonControl jsonOrganizator = new OrganizatorJsonControl();
        updatePlayersJson();
        updateTournamentsJson();
        jsonOrganizator.addPerson(this);
    }
    
    public void loadPlayerList(JTable table){
        cleanTable(table);
        DefaultTableModel playersTable = (DefaultTableModel) table.getModel();
        for (Player player: playerList){
            Object[] cells = new Object[2];
            cells[0] = player.getName();
            cells[1] = player.getId();
            playersTable.addRow(cells);
        }
    }
    
    public boolean findTournament(String tourName){
        try{
            for (Tournament t: tournamentList){
                if (t.getTournamentName().toUpperCase().equals(tourName.toUpperCase())) return true;
            }
        } catch (NullPointerException error){
               return false; 
        }
        return false; 
    }
    
    public void deleteTournament(String tourName){
        try{
            for(Tournament t: tournamentList){
                if (t.getTournamentName().toUpperCase().equals(tourName.toUpperCase())) tournamentList.remove(t);
            }
        } catch (NullPointerException error){
            System.err.println("Lista de torneos vacia NullPointerException");
        }
    }
    
}
