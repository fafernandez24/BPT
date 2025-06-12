/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.ValidationControl.validateAdministrator;
import static control.ValidationControl.validateAdministratorId;
import static control.ValidationControl.validateAdministratorPassword;
import static control.ValidationControl.validateDeveloper;
import static control.ValidationControl.validateId;
import static control.ValidationControl.validateOrganizator;
import static control.ValidationControl.validateOrganizatorId;
import static control.ValidationControl.validateOrganizatorPassword;
import static control.ValidationControl.validatePassword;
import static control.ValidationControl.validatePlayer;
import static control.ValidationControl.validatePlayerId;
import static control.ValidationControl.validatePlayerPassword;
import java.awt.Color;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Administrator;
import model.Organizator;
import model.Player;
import view.MenuAdministrator;
import view.MenuOrganizator;
import view.MenuPlayer;

/**
 *
 * @author Freddy A. Fernández
 */
public class StartControl {
    
    public static void openMenuOrganizator(Organizator organizator){
        MenuOrganizator openMenu = new MenuOrganizator();
        openMenu.setVisible(true);
    }

    public static void openMenuPlayer(){
        MenuPlayer openMenu = new MenuPlayer();
        openMenu.setVisible(true);
    }
    
    public static void openMenuAdministrator(){
        MenuAdministrator openMenu = new MenuAdministrator();
        openMenu.setVisible(true);
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
    
    public static int startCheckingOrganizator(JTextField idField, JPasswordField passwordField, Organizator organizator){
        String textId = idField.getText();
        String textPassword = new String(passwordField.getPassword());
        if (!validateOrganizator(textId, textPassword, organizator) && !validateDeveloper(textId, textPassword)) return 0;
        return 1;
    }
    
    public static int startCheckingPlayer(JTextField idField, JPasswordField passwordField, List<Player> player){
        String textId = idField.getText();
        String textPassword = new String(passwordField.getPassword());
        if (!validatePlayer(textId, textPassword, player) && !validateDeveloper(textId, textPassword)) return 0;
        return 2;
    }
    
    public static int startCheckingAdministrator(JTextField idField, JPasswordField passwordField, Administrator administrator){
        String textId = idField.getText();
        String textPassword = new String(passwordField.getPassword());
        if (!validateAdministrator(textId, textPassword, administrator) && !validateDeveloper(textId, textPassword)) return 0;
        return 3;
    }
    
    public static int startLoging(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField idField, JPasswordField passwordField, Organizator organizator, List<Player> player, Administrator administrator){
        if (checkBoxOrganizator.isSelected()) return startCheckingOrganizator(idField, passwordField, organizator);
        else if (checkBoxPlayer.isSelected()) return startCheckingPlayer(idField, passwordField, player);
        else if (checkBoxAdministrator.isSelected()) return startCheckingAdministrator(idField, passwordField, administrator);
        return 0;
    }
    
    public static void idChangeColor(JTextField id, int r, int g, int b){
        id.setForeground(new Color(r,g,b));
    }
    
    public static void passwordChangeColor(JPasswordField password, int r, int g, int b){
        password.setForeground(new Color(r,g,b));
    }
    
    public static int startWhoIsTheIsue(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator){
        if (checkBoxOrganizator.isSelected()) return 1;
        else if (checkBoxPlayer.isSelected()) return 2;
        else if (checkBoxAdministrator.isSelected()) return 3;
        return 0;
    }
    
    public static void startConditionForChangeIdColor(JTextField idField, Organizator organizator){
        String id = idField.getText();
        if (!validateOrganizatorId(id, organizator)) idChangeColor(idField, 255, 0, 51);
    }
    
    public static void startConditionForChangeIdColor(JTextField idField, List<Player> player){
        String id = idField.getText();
        if (!validatePlayerId(id, player)) idChangeColor(idField, 255, 0, 51);
    }
    
    public static void startConditionForChangeIdColor(JTextField idField, Administrator administrator){
        String id = idField.getText();
        if (!validateAdministratorId(id, administrator)) idChangeColor(idField, 255, 0, 51);
    }
    
    public static void startConditionForChangePasswordColor(JPasswordField passwordField, Organizator organizator){
        String textPassword = new String(passwordField.getPassword());
        if (!validateOrganizatorPassword(textPassword, organizator)) passwordChangeColor(passwordField, 255, 0, 51);
    }
    
    public static void startConditionForChangePasswordColor(JPasswordField passwordField, List<Player> player){
        String textPassword = new String(passwordField.getPassword());
        if (!validatePlayerPassword(textPassword, player)) passwordChangeColor(passwordField, 255, 0, 51);
    }
    
    public static void startConditionForChangePasswordColor(JPasswordField passwordField, Administrator administrator){
        String textPassword = new String(passwordField.getPassword());
        if (!validateAdministratorPassword(textPassword, administrator)) passwordChangeColor(passwordField, 255, 0, 51);
    }
    
    public static void startChangeColor(JTextField idField, JPasswordField passwordField, Organizator organizator){
        startConditionForChangeIdColor(idField, organizator);
        startConditionForChangePasswordColor(passwordField, organizator);
    }
    
    public static void startChangeColor(JTextField idField, JPasswordField passwordField, List<Player> player){
        startConditionForChangeIdColor(idField, player);
        startConditionForChangePasswordColor(passwordField, player);
    }
    
    public static void startChangeColor(JTextField idField, JPasswordField passwordField, Administrator administrator){
        startConditionForChangeIdColor(idField, administrator);
        startConditionForChangePasswordColor(passwordField, administrator);
    }
    
    public static void startShowWhereIsError(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField id, JPasswordField password, Organizator organizator, List<Player> player, Administrator administrator){
        int option = startWhoIsTheIsue(checkBoxOrganizator, checkBoxPlayer, checkBoxAdministrator);
        switch(option){
            case 1 -> startChangeColor(id, password, organizator);
            case 2 -> startChangeColor(id, password, player);
            case 3 -> startChangeColor(id, password, administrator);
        }
    }
    
    public static boolean startValidateDataEnter(JTextField id, JPasswordField password, Organizator organizator){
        String textId = id.getText();
        String textPassword = new String(password.getPassword());
        return validateId(textId) && validatePassword(textPassword) && validateOrganizator(textId, textPassword, organizator);
    }
    
    public static void openAnyMenu(int option, JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField dataEnterId, JPasswordField dataEnterPassword, Organizator organizator, List<Player> player, Administrator administrator){
        switch(option){
            case 1 -> openMenuOrganizator(organizator);
            case 2 -> openMenuPlayer();
            case 3 -> openMenuAdministrator();
            default -> startShowWhereIsError(checkBoxOrganizator, checkBoxPlayer, checkBoxAdministrator, dataEnterId, dataEnterPassword, organizator, player, administrator);  
        }
    }
    
    // Presionar boton de iniciar sesion
    
    public static void pushLoginButton(JCheckBox checkBoxOrganizator, JCheckBox checkBoxPlayer, JCheckBox checkBoxAdministrator, JTextField dataEnterId, JPasswordField dataEnterPassword, Organizator organizator, List<Player> player, Administrator administrator){
        int login = startLoging(checkBoxOrganizator, checkBoxPlayer, checkBoxAdministrator, dataEnterId, dataEnterPassword, organizator, player, administrator);
        openAnyMenu(login, checkBoxOrganizator, checkBoxPlayer, checkBoxAdministrator, dataEnterId, dataEnterPassword, organizator, player, administrator);
    }  
    
}
