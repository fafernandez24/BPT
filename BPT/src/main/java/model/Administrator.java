/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Person;
import model.Player;
import java.util.List;

/**
 *
 * @author Freddy
 */
public class Administrator extends Person {
    
    // Atributtes
    
    private String email;
    private List<Player> playerList;
    
    // Methods

    // Constructor #1
    public Administrator(){}
    
    // Constructor #2
    public Administrator(int id, String name, String password, String email, List<Player> playerList) {
        super(id, name, password);
        this.email = email;
        this.playerList = playerList;
    }
        
    // Getter Methods

    public String getEmail() {
        return email;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }
    
    // Setter Methods

    public void setEmail(String email) {
        this.email = email;
    }

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
