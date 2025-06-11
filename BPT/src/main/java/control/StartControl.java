/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.ValidationControl.validateAdministrator;
import static control.ValidationControl.validateDeveloper;
import static control.ValidationControl.validateOrganizator;
import view.MenuAdministrator;
import view.MenuOrganizator;

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
    
}
