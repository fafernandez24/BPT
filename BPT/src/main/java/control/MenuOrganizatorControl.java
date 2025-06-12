/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Player;

/**
 *
 * @author Freddy
 */
public class MenuOrganizatorControl {
    
    public static Player addPlayerSingleSingleTournament(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        String name = nombre.getText();
        String identification = id.getText();
        String cellPhoneNumber = phoneNumber.getText();
        String gmail = email.getText();
        String level = category.getToolTipText();
        String teamName = team.getText();
        LocalDate date = StringBecomeLocalDate(dateBirth.getText());   
        return new Player(cellPhoneNumber, level, teamName, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, identification, name, identification, gmail, date); 
    }
    
    public static void OrganizatorFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void OrganizatorFocusGained(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.equals(message)) dataEnter.setText("");
    }
    
}
