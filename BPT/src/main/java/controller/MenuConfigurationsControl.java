/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import static controller.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Group;
import model.Match;
import model.Player;
import model.Tournament;
/**
 *
 * @author Asus
 */
public class MenuConfigurationsControl {
    
    private static Tournament activeTournament; 
    
    
    public MenuConfigurationsControl(Tournament activeTournament) {
        MenuConfigurationsControl.activeTournament = activeTournament; 
    }
    
    public static void  configurationFocusGained (JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void configurationFocusLost(JTextField dataEnter, String message){
        String data = dataEnter.getText();
        if (data.trim().isEmpty()) dataEnter.setText(message);
    }
 
    public static void deletePlayer(JTextField cedula){
       try{
           String cedulaDelete = cedula.getText();
           //Si existen grupos:
           if(activeTournament.getGroupsNumber() > 0) { //Primero lo borra de los grupos
               List<Group> grup = activeTournament.getGroupsList();
               for(Group g : grup) {
                   List<Player> allPlayer = g.getPlayerList();
                   for(int i = 0; i < allPlayer.size(); i++) {
                       Player p = allPlayer.get(i);
                       if(p.getId().equals(cedulaDelete)) {
                           allPlayer.remove(i);
                       }
                   }
               } //Luego lo borra del torneo en si
           for (int i =0; i > activeTournament.getParticipantsList().size(); i++){
               List<Player> playerTournament = activeTournament.getParticipantsList();
               if (playerTournament.get(i).getId().equals(cedulaDelete)){
                   playerTournament.remove(i);
                   }
               }           
           }   
           else {  //Si no hay grupos:
               List<Player> allPlayersTournament = activeTournament.getParticipantsList();
               for(int i = 0; i < allPlayersTournament.size(); i++) {
                   Player p = allPlayersTournament.get(i);
                   if(p.getId().equals(cedulaDelete)) {
                       allPlayersTournament.remove(i);
                   }
               }
           }
       }
       catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Error al guardar los cambios", "ERROR", JOptionPane.ERROR_MESSAGE);
       } 
   }
    
    public static void addPlayer(JTextField name, JTextField cedula, JTextField email, JTextField phone, JTextField team, JComboBox category, JTextField date) {
       try{
       Player newPlayer = new Player();
       newPlayer.readPlayer(name, cedula, phone, email, category, team, date);
       List<Player> players = activeTournament.getParticipantsList();
       players.add(newPlayer);
    } catch(Exception e) {
           JOptionPane.showMessageDialog(null, "Error al guardar los cambios", "ERROR", JOptionPane.ERROR_MESSAGE);
       }
    }
    
    public static void editPlayer(JTextField cedulaLogin, JTextField name, JTextField email, JTextField phone, JTextField cedula, JTextField team ,JComboBox category, JTextField date) {
       String cedulaLog = cedulaLogin.getText();
       List<Player> listPlayers = activeTournament.getParticipantsList();
       for(Player player : listPlayers) {
           if(player.getId().equals(cedulaLog)) {
               player.readPlayer(name, cedula, phone, email, category, team, date);
               listPlayers.add(player);
               return;
           } else { JOptionPane.showMessageDialog(null, "No se puedo modificar el jugador", "ERROR", JOptionPane.ERROR_MESSAGE);}
       }
    }
    
    public static void addMatch(List<Match> matchList, JTextField nameA, JTextField nameB, JTextField date){
        String playerAname = nameA.getText();
        String playerBname = nameB.getText();
        LocalDate dateFormater = StringBecomeLocalDate(date.getText());
        Player playerA = null;
        Player playerB = null;
        for(Player p : activeTournament.getParticipantsList()) {
            if(p.getName().equals(playerAname)) { playerA = p;}
            if(p.getName().equals(playerBname)) { playerB = p;}
        }
        if(playerA == null || playerB == null) {
            JOptionPane.showMessageDialog(null, "Uno o dos jugadores no existe", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        Match newMatch = new Match();
        newMatch.setPlayerA(playerA);
        newMatch.setPlayerB(playerB);
        newMatch.setMatchDate(dateFormater);
        matchList.add(newMatch);
    }   
    
    public static void editMatch(List<Match> listMatch, JTextField nameA, JTextField nameB, JTextField date) {
        String playerA = nameA.getText();
        String playerB = nameB.getText();
        LocalDate dateForm = StringBecomeLocalDate(date.getText());
        Match editMatch = null;
        for(int i = 0; i < listMatch.size(); i++) {
            Match m = listMatch.get(i);
            String namePlayerA = m.getPlayerA().getName();
            String namePlayerB = m.getPlayerB().getName();
            LocalDate matchDate = m.getMatchDate();
            if(namePlayerA.equals(playerA) && namePlayerB.equals(playerB) && matchDate.equals(dateForm)) {
               editMatch = m;
               break;
            }
        }
        Player newPlayerA = null;
        Player newPlayerB = null;
        for(Player p : activeTournament.getParticipantsList()) {
            if(p.getName().equals(playerA)) { newPlayerA = p;}
            if(p.getName().equals(playerB)) { newPlayerB = p;}
        }
        editMatch.setPlayerA(newPlayerA);
        editMatch.setPlayerB(newPlayerB);
        editMatch.setMatchDate(dateForm);
        listMatch.add(editMatch);
    }
    
    public static void deleteMatch(List<Match> listMatch, JTextField nameA, JTextField nameB, JTextField date) {
        String playerAname = nameA.getText();
        String playerBname = nameB.getText();
        LocalDate dateForm = StringBecomeLocalDate(date.getText());
        for(int i = 0; i < listMatch.size(); i++) {
            Match m = listMatch.get(i);
            String namePlayerA = m.getPlayerA().getName();
            String namePlayerB = m.getPlayerB().getName();
            LocalDate matchDate = m.getMatchDate();
            if(namePlayerA.equals(playerAname) && namePlayerB.equals(playerBname) && matchDate.equals(dateForm)) {
                listMatch.remove(m);
                return;
            }
        }
    }
    
    public static void changeNameTournament(JTextField newName){
       String nameNew = newName.getText().trim();
       String oldName = activeTournament.getTournamentName();
       if(!oldName.equals(nameNew)) {
           activeTournament.setTournamentName(nameNew);
       } else { JOptionPane.showMessageDialog(null, "Los nombres son iguales por lo tanto no se ejecutara el cambio de nombre", "ERROR", JOptionPane.ERROR_MESSAGE);}
    }    
}
