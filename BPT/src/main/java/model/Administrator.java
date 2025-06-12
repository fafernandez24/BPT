/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Freddy
 */
public class Administrator extends Person {
    
    // Attributes
    
    private List<Player> playerList;
    
    // Methods

    // Constructor #1
    public Administrator(){}
    
    // Constructor #2
    public Administrator(List<Player> playerList, String id, String name, String password, String email, LocalDate dateBirth) {
        super(id, name, password, email, dateBirth);
        this.playerList = playerList;
    }
        
    // Getter Methods

    public List<Player> getPlayerList() {
        return playerList;
    }
    
    // Setter Methods

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }
    
    // Validation Methods
    
    public boolean validateAdministratorEmail(){
        return true;
    }
    
    // Other Methods
    
    public void checkingPay(){}
    
    @Override
    public String showData(){
        return  "CI: " + id +
                "\nNombre: " + name +
                "\nCorreo: " + email;
    }
    
    @Override
    public void readData(){}
    
}
