/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import javax.swing.JTextField;
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
        return true;
    }
    
    public static boolean validateJFieldTextInt(JTextField textField){
        return textField.getText().matches("/[-.0-9]+/");
    }
    
    // validate tournament data
    
    public static boolean validateTournamentName(JTextField tournamentName){
        String name = tournamentName.getText();
        return !name.trim().isEmpty();
    }
    
    public static boolean validateParticipantsNumber(JTextField tournamentParticipants){
        int number = 0;
        if (!tournamentParticipants.getText().isEmpty() && tournamentParticipants.getText().matches("^[0-9]+")) number = Integer.parseInt(tournamentParticipants.getText());
        return number > 0 && number < 100;
    }
    
    public static boolean validateTournamentCost(JTextField tournamentCost){
        float number = 0;
        if (!tournamentCost.getText().isEmpty() && tournamentCost.getText().matches("[\\d]*\\.?[\\d]*")) number = Float.parseFloat(tournamentCost.getText());
        return number > 0 && number < 300;
    }
    
    public static boolean validateTournamentPlayOff(Integer playOff, int tournamentParticipants){
        switch(playOff){
                case 1 ->{return tournamentParticipants >= 32;}
                case 2 -> {return tournamentParticipants >= 16;}
                case 3 -> {return tournamentParticipants >= 8;}
                case 4 -> {return tournamentParticipants >= 4;}
                case 5 -> {return tournamentParticipants >= 2;}
                default -> {return false;}
        }
    }
     
}
