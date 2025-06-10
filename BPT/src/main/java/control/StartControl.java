/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import view.MenuAdministrator;
import view.MenuOrganizator;

/**
 *
 * @author Freddy A. Fernández
 */
public class StartControl {
    
    public static boolean validateOrganizator(String id, String password){
        return id.equals("11032757") && password.equals("1234");
    }
    
    public static boolean validateAdministrator(String id, String password){
        return id.equals("31703150") && password.equals("4321");
    }
    
    public static void openMenuOrganizator(String id, String password){
        boolean bol = validateOrganizator(id, password);
        if (bol){
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
        if (bol){
            MenuAdministrator openMenu = new MenuAdministrator();
            openMenu.setVisible(true);
        } 
    }
    
}
