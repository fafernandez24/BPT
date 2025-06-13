/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Administrator;
import model.Organizator;
import model.Player;

/**
 *
 * @author Freddy
 */
public class ValidationControl {
    
    // VALIDAR ORGANIZADORES
    
    public static boolean validateOrganizator(String id, String password, List<Organizator> organizator){
        for (int i = 0; i < organizator.size(); i++){
            if (organizator.get(i).getId().equals(id) && organizator.get(i).getPassword().equals(password)) return true;
        }
        return false;
    }
    
    public static boolean validateOrganizatorId(String id, List<Organizator> organizator){
        for (int i = 0; i < organizator.size(); i++){
            if (organizator.get(i).getId().equals(id)) return true;
        }
        return false;
    }
    
    public static boolean validateOrganizatorPassword(String password, List<Organizator> organizator){
        for (int i = 0; i < organizator.size(); i++){
            if (organizator.get(i).getPassword().equals(password)) return true;
        }
        return false;
    }
    
    // VALIDAR JUGADORES
    
    public static boolean validatePlayer(String id, String password, List<Player> player){
        for (int i = 0; i < player.size(); i++){
            if (player.get(i).getId().equals(id) && player.get(i).getPassword().equals(password)) return true;
        }
        return false;
    }
    
    public static boolean validatePlayerId(String id, List<Player> player){
        for (int i = 0; i < player.size(); i++){
            if (player.get(i).getId().equals(id)) return true;
        }
        return false;
    }
    
    public static boolean validatePlayerPassword(String password, List<Player> player){
        for (int i = 0; i < player.size(); i++){
            if (player.get(i).getPassword().equals(password)) return true;
        }
        return false;
    }
    
    //     // VALIDAR ADMINISTRADORES
    
    public static boolean validateAdministrator(String id, String password, List<Administrator> administrator){
        for (int i = 0; i < administrator.size(); i++){
            if (administrator.get(i).getId().equals(id) && administrator.get(i).getPassword().equals(password)) return true;
        }
        return false;
    }
    
    public static boolean validateAdministratorId(String id, List<Administrator> administrator){
        for (int i = 0; i < administrator.size(); i++){
            if (administrator.get(i).getId().equals(id)) return true;
        }
        return false;
    }
    
    public static boolean validateAdministratorPassword(String password, List<Administrator> administrator){
        for (int i = 0; i < administrator.size(); i++){
            if (administrator.get(i).getPassword().equals(password)) return true;
        }
        return false;
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
