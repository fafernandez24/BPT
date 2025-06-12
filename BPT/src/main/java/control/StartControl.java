/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.ValidationControl.validateAdministrator;
import static control.ValidationControl.validateDeveloper;
import static control.ValidationControl.validateId;
import static control.ValidationControl.validateOrganizator;
import static control.ValidationControl.validateOrganizatorId;
import static control.ValidationControl.validateOrganizatorPassword;
import static control.ValidationControl.validatePassword;
import java.awt.Color;
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
    
    public static void startFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void startFocusGained(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.equals(message)) dataEnter.setText("");
    }
     
    public static void startFocusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void startFocusLost(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.trim().isEmpty()) dataEnter.setText(message);
    }
    
    // Verificar que solo esta marcada una checkBox de 3
    public static void startCheckBox(JCheckBox checkBoxA, JCheckBox checkBoxB, JCheckBox checkBoxC){
        checkBoxA.setSelected(true);
        checkBoxB.setSelected(false);
        checkBoxC.setSelected(false);
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
    
    public static void idChangeColor(JTextField id, int r, int g, int b){
        id.setForeground(new Color(r,g,b));
    }
    
    public static void passworChangeColor(JPasswordField password, int r, int g, int b){
        password.setForeground(new Color(r,g,b));
    }
    
    public static void startDataEnterToRed(JTextField id, JPasswordField password){
        String textId = id.getText();
        String textPassword = new String(password.getPassword());
        if (!validateId(textId) || !validateOrganizatorId(textId)) idChangeColor(id, 255, 0, 51);
        else if (!validatePassword(textPassword) || !validateOrganizatorPassword(textPassword)) passworChangeColor(password, 255, 0, 51);
    }
    
    public static boolean startValidateDataEnter(JTextField id, JPasswordField password){
        String textId = id.getText();
        String textPassword = new String(password.getPassword());
        return validateId(textId) && validatePassword(textPassword) && validateOrganizator(textId, textPassword);
    }
    
    // Presionar boton de iniciar sesion
    
    public static void pushLoginButton(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField dataEnterId, JPasswordField dataEnterPassword){
        if (!startValidateDataEnter(dataEnterId, dataEnterPassword)) startDataEnterToRed(dataEnterId, dataEnterPassword);
        else startLoging(checkBoxOrganizator, checkBoxPlayer, checkBoxAdministrator, dataEnterId, dataEnterPassword);
    }
    
    
    
}
