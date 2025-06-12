/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Freddy A. Fernández
 */
public class GeneralTable {
    
    // Attributes
    
    private List<Player> participantsList;
    
    // Methods
    
    // Constructor #1
    public GeneralTable(){}
    
    // Constructor #2
    public GeneralTable(List<Player> participantsList) {
        this.participantsList = participantsList;
    }
    
    // Getter Methods

    public List<Player> getParticipantsList() {
        return participantsList;
    }
    
    // Setter Methods

    public void setParticipantsList(List<Player> participantsList) {
        this.participantsList = participantsList;
    }
    
}
