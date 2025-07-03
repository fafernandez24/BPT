/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Freddy A. Fernández
 */
public class Group implements PlayerInterface{
    
    // Attributes
    
    private int groupNumber;
    private int playersNumber;
    private List<Player> playerList;
    
    // Methods
    
    // Constructor #1
    public Group(){}
    
    // Constructor #2
    public Group(int groupNumber, int playersNumber, List<Player> playerList) {
        this.groupNumber = groupNumber;
        this.playersNumber = playersNumber;
        this.playerList = playerList;
    }
    
    // Getter Methods

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getPlayersNumber() {
        return playersNumber;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    
    // Setter Methods

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setPlayersNumber(int playersNumber) {
        this.playersNumber = playersNumber;
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
    
    public Player searchPlayerByName(String name){
        Player player = new Player();
        for (int i = 0; i < playerList.size(); i++){
            if(playerList.get(i).getName().equals(name)) player = playerList.get(i);
        }
        return player;
    }
    
}
