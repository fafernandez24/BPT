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
    
    public static boolean validateDeveloper(String id, String password){
        return (id.equals("31703150") && password.equals("0406")) || 
                (id.equals("31307188") && password.equals("Carlospinto2005")) || (id.equals("31101453") && password.equals("Messi48"));
    }
    
    public static boolean validateOrganizator(String id, String password){
        return id.equals("11032757") && password.equals("11032757");
    }
    
    public static boolean validateAdministrator(String id, String password){
        return id.equals("11032757") && password.equals("11032757");
    }
    
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
