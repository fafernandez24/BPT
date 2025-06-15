/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.TypeBecomeType.StringBecomeLocalDate;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Freddy A. Fernández
 */
public class Double {
    
    // Attributes
    
    private Player playerA;
    private Player playerB;
    
    // Methods
    
    // Constructor #1
    public Double(){};
    
    // Constructor #2// Constructor #2
    public Double(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    // Getter Methods
    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }
    
    // Setter Methods

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }
    
    public void readPlayerA(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        playerA.name = nombre.getText();
        playerA.id = id.getText();
        playerA.password = playerA.id;
        playerA.phoneNumber= phoneNumber.getText();
        playerA.email = email.getText();
        playerA.category = (String) category.getSelectedItem();
        playerA.teamName = team.getText();
        playerA.dateBirth = StringBecomeLocalDate(dateBirth.getText());   
    }
    
    public void readPlayerB(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        playerB.name = nombre.getText();
        playerB.id = id.getText();
        playerB.password = playerB.id;
        playerB.phoneNumber= phoneNumber.getText();
        playerB.email = email.getText();
        playerB.category = (String) category.getSelectedItem();
        playerB.teamName = team.getText();
        playerB.dateBirth = StringBecomeLocalDate(dateBirth.getText());   
    }
    
}
