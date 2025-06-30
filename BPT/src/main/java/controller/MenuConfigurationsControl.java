/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Match;
import model.Player;
/**
 *
 * @author Asus
 */
public class MenuConfigurationsControl {
    public static void  configurationFocusGained (JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void configurationFocusLost(JTextField dataEnter, String message){
        String data = dataEnter.getText();
        if (data.trim().isEmpty()) dataEnter.setText(message);
    }
    public static boolean deletePlayer(List<Player> playersPlay, JTextField name, JTextField cedula){
        String nameDelete= name.getText();
        String cedulaDelete= cedula.getText();
        boolean playerDelete= false;
        for (int i= playersPlay.size()-1; i>= 0 ;i--)  {
            Player player= playersPlay.get(i); 
            String namePlayer= player.getName();
            String cedulaPlayer= player.getId();
            if (nameDelete.equals(namePlayer) || cedulaDelete.equals(cedulaPlayer)) {
                playersPlay.remove(i);
                playerDelete= true;
                break;
            }
        }
        return playerDelete;
    }
    
    public static void addPlayer(List<Player> playersPlay, JTextField name, JTextField cedula, JTextField email, JTextField phone, JTextField equipo, JComboBox category) {
        if(name.getText().isEmpty() || cedula.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || equipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Player newPlayer = new Player();
        newPlayer.setName(name.getText());
        newPlayer.setId(cedula.getText());
        newPlayer.setEmail(email.getText());
        newPlayer.setPhoneNumber(phone.getText());
        newPlayer.setTeamName(equipo.getText());
        newPlayer.setCategory((String) category.getSelectedItem());
        playersPlay.add(newPlayer);
    }
    
    public static void editPlayer(List<Player> playersPlay, JTextField cedulaLogin, JTextField name, JTextField email, JTextField phone, JTextField cedula, JTextField team ,JComboBox category, JTextField date) {
        if(name.getText().isEmpty() || cedula.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || team.getText().isEmpty() || date.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String cedulaLog = cedulaLogin.getText();
        String namePlayer = name.getText();
        String emailPlayer = email.getText();
        String phonePlayer = phone.getText();
        String cedulaPlayer = cedula.getText();
        String teamPlayer = team.getText();
        String categoryPlayer = (String) category.getSelectedItem();
        String datePlayer = date.getText();
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater= LocalDate.parse(datePlayer, dateFormatter);
        
        for(Player player : playersPlay) {
            if(player.getId().equals(cedulaLog)) {
                player.setName(namePlayer);
                player.setEmail(emailPlayer);
                player.setPhoneNumber(phonePlayer);
                player.setId(cedulaPlayer);
                player.setTeamName(teamPlayer);
                player.setCategory(categoryPlayer);
                player.setDateBirth(dateFormater);
                return;
            } else { JOptionPane.showMessageDialog(null, "No se puedo modificar el jugador", "ERROR", JOptionPane.ERROR_MESSAGE);}
        }
    }
    
    public static void addMatch(List<Match> listMatch, JTextField nameA, JTextField nameB, JTextField date) {
        String playerA = nameA.getText();
        String playerB = nameB.getText();
        String dateForm = date.getText();
        if(playerA.isEmpty() || playerB.isEmpty() || dateForm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater= LocalDate.parse(dateForm, dateFormatter); 
        Player player1 = new Player();
        player1.setName(playerA);
        Player player2 = new Player();
        player2.setName(playerB);
        
        Match newMatch = new Match();
        newMatch.setPlayerA(player1);
        newMatch.setPlayerB(player2);
        newMatch.setMatchDate(dateFormater);
        
        listMatch.add(newMatch);
    }
    
    public static void editMatch(List<Match> listMatch, JTextField nameA, JTextField nameB, JTextField date) {
        String playerA = nameA.getText();
        String playerB = nameB.getText();
        String dateForm = date.getText();
        if(playerA.isEmpty() || playerB.isEmpty() || dateForm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater= LocalDate.parse(dateForm, dateFormatter);
        for(Match edit : listMatch) {
            Player player1 = new Player();
            player1.setName(playerA);
            edit.setPlayerA(player1);
            Player player2 = new Player();
            player2.setName(playerB);
            edit.setPlayerB(player2);
            edit.setMatchDate(dateFormater);
        }
    }
    
    public static boolean deleteMatch(List<Match> listMatch, JTextField nameA, JTextField nameB, JTextField date) {
        String playerA = nameA.getText();
        String playerB = nameB.getText();
        String dateForm = date.getText();
        boolean matchDelete = false;
        if(playerA.isEmpty() || playerB.isEmpty() || dateForm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateFormater= LocalDate.parse(dateForm, dateFormatter);
        for(int i = 0; i < listMatch.size(); i++) {
            Match match = listMatch.get(i);
            String namePlayerA = match.getPlayerA().getName();
            String namePlayerB = match.getPlayerB().getName();
            LocalDate dateDelete = match.getMatchDate();
            if(namePlayerA.equals(playerA) && namePlayerB.equals(playerB) && dateDelete.equals(dateFormater)) {
                listMatch.remove(i);
                matchDelete = true;
                break;
            }
        }
        if(!matchDelete) {
            JOptionPane.showMessageDialog(null, "No existe ese partido dentro de la lista de partidos que se jugaran", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return matchDelete;
    }
    
    public static void changeNameTournament(JTextField newName, JTextField oldName){
        String changeName = newName.getText();
        if(changeName.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre a modificar no puede estar vacio si desea cambiar el nombre", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        oldName.setText(changeName);
    } 
}
