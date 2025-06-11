/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.ValidationControl.validateAdministrator;
import static control.ValidationControl.validateDeveloper;
import static control.ValidationControl.validateOrganizator;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import view.MenuAdministrator;
import view.MenuOrganizator;
import view.MenuPlayer;

/**
 *
 * @author Freddy A. Fernández
 */
public class StartControl {
    
    public static void openMenuOrganizator(String id, String password){
        boolean bol = validateOrganizator(id, password);
        boolean bolDev = validateDeveloper(id, password);
        if (bol == true || bolDev == true ){
            MenuOrganizator openMenu = new MenuOrganizator();
            openMenu.setVisible(true);
        } 
    }
    
    /* TO DO
    public static boolean validatePlayer(String id, String password){

    }
    
    public static void openMenuPlayer(String id, String password){
        boolean bol = validatePlayer(id, password);
        if (bol){
            MenuPlayer openMenu = new MenuPlayer();
            openMenu.setVisible(true);
        } 
    }
    */
    
    public static void openMenuAdministrator(String id, String password){
        boolean bol = validateAdministrator(id, password);
        boolean bolDev = validateDeveloper(id, password);
        if (bol == true || bolDev == true ){
            MenuAdministrator openMenu = new MenuAdministrator();
            openMenu.setVisible(true);
        } 
    }
    
    // FOCUS GAINED AND LOST METHODS
    
    public static void StartFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void StartFocusGained(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.equals(message)) dataEnter.setText("");
    }
     
    public static void StartFocusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void StartFocusLost(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.trim().isEmpty()) dataEnter.setText(message);
    }
        
    // Boton Iniciar sesion
    
    public static void startLoging(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField dataEnterId, JPasswordField dataEnterPassword){
        String id = dataEnterId.getText(), password = new String(dataEnterPassword.getPassword());
        if (checkBoxOrganizator.isSelected()){
            openMenuOrganizator(id, password);
        }
        else if (checkBoxPlayer.isSelected()){
            MenuPlayer openMenu = new MenuPlayer();
            openMenu.setVisible(true);
        }
        else if (checkBoxAdministrator.isSelected()){
            openMenuAdministrator(id, password);
        }
    }
    
}
