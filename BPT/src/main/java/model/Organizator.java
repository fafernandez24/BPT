/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Freddy A. Fernández
 */
public class Organizator extends Person implements PlayerInterface {
    
    // Attributes
    private List<Tournament> tournamentList;
    private List<Player> playerList;
    
    // Methods
    
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
        Player player = new Player();
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
    
}
