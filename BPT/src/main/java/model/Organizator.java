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
public class Organizator extends Person {
    
    // Attributes
    private List<Tournament> TournamentList;
    private List<Player> playerList;
    
    // Methods
    
    // Constructor #1
    public Organizator(){}
    
    // Constructor #2
    public Organizator(List<Tournament> TournamentList, List<Player> playerList, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {
        super(id, name, password, email, dateBirth, phoneNumber);
        this.TournamentList = TournamentList;
        this.playerList = playerList;
    }
    
    // Getter Methods

    public List<Tournament> getTournamentList() {
        return TournamentList;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    
    // Setter Methods

    public void setTournamentList(List<Tournament> TournamentList) {
        this.TournamentList = TournamentList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    
    public Player searchPlayer(JTextField dataEnterId){
        Player player = new Player();
        for (int i = 0; i < playerList.size(); i++){
            if(playerList.get(i).getId().equals(dataEnterId.getText())) player = playerList.get(i);
        }
        return player;
    }
    
}
