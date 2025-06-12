/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import model.Organizator;

/**
 *
 * @author Freddy
 */
public class ValidationControl {
    
    public static boolean validateDeveloper(String id, String password){
        return  (id.equals("31703150") && password.equals("0406")) || 
                (id.equals("31307188") && password.equals("Carlospinto2005")) ||
                (id.equals("31101453") && password.equals("Messi48"));
    }
    
    // VALIDAR ORGANIZADORES
    
    public static boolean validateOrganizator(String id, String password){
        return id.equals("11032757") && password.equals("11032757");
    }
    
    public static boolean validateOrganizatorId(String id){
        return id.equals("11032757");
    }
    
    public static boolean validateOrganizatorPassword(String password){
        return password.equals("11032757");
    }
    
    //     // VALIDAR ADMINISTRADORES
    
    public static boolean validateAdministrator(String id, String password){
        return id.equals("11032757") && password.equals("11032757");
    }
    
    
    public boolean validateName(String name){
        return name.matches("/^[a-zA-ZÀ-ÿñÑ]+(([,\\. -][a-zA-ZÀ-ÿñÑ ])?[a-zA-ZÀ-ÿñÑ]*)*[^\\w\\s\\d\\(\\)\\[\\]\\?]$/");
    }
    
    public static boolean validateId(String id){
        return id.matches("\\d+");
    }
    
    public static boolean validatePassword(String password){
        return true; //password.matches("^(?=.*\\d)(?=.*[a-zA-Z])(?=.*[A-Z])(?=.*[-\\#\\$\\.\\%\\&\\*])(?=.*[a-zA-Z]).{4,16}$");
    }
       
}
