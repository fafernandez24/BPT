/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.TypeBecomeType.JComboBoxBecomeString;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.Match;
import model.Organizator;
import model.Player;
import model.Tournament;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuDriveTournamentControl {
    
    public static void changeLabelColor(JLabel label, int r, int g, int b){
        label.setForeground(new Color(r,g,b));
    }
    
    public static int getGamesInSetJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("0", 0);
        playOff.put("1", 1);
        playOff.put("2", 3);
        playOff.put("3", 4);
        playOff.put("4", 5);
        playOff.put("5", 6);
        playOff.put("6", 6);
        playOff.put("7", 7);
        playOff.put("6(0)", 6);
        playOff.put("6(1)", 6);
        playOff.put("6(2)", 6);
        playOff.put("6(3)", 6);
        playOff.put("6(4)", 6);
        playOff.put("6(5)", 6);
        playOff.put("6(6)", 6);
        playOff.put("6(7)", 6);
        return playOff.get(JComboBoxBecomeString(comboBox));
    }

    public static void deleteTournament(String tourName, Organizator org, JLabel label){
        if (org.findTournament(tourName)){
            org.deleteTournament(tourName);
            label.setText("El torneo "+tourName+" fue borrado correctamente");
            changeLabelColor(label,36,20,188);
        }
        else {
            changeLabelColor(label,204,0,0);
            label.setText("No se borro el torneo");
        } 
    }
    
    public static String getScoreSetPlayerA(String setScore){
        String[] arrayScore = setScore.split("-");
        return arrayScore[0];
    }
    
    public static String getScoreSetPlayerB(String setScore){
        String[] arrayScore = setScore.split("-");
        return arrayScore[1];
    }
    
    public static void getWinner(Match match, JCheckBox checkPlayerOne, JCheckBox checkPlayerTwo){
        String namePlayerA = match.getPlayerA().getName(), namePlayerB = match.getPlayerB().getName();
        try{
            String winnerName = match.getWinner().getName();
            if (winnerName.equals(namePlayerA)){
                checkPlayerOne.setSelected(true);
                checkPlayerTwo.setSelected(false);
            } else if( winnerName.equals(namePlayerB)){
                checkPlayerOne.setSelected(false);
                checkPlayerTwo.setSelected(true); 
            }  
        } catch (NullPointerException error){
            checkPlayerOne.setSelected(false);
            checkPlayerTwo.setSelected(false); 
        }
    }
    
    public static void getSuperTie(Match match, JCheckBox tie, JTextField ScoreA, JTextField ScoreB){
        if (match.getSuperTie() == true){
            tie.setSelected(true);
            ScoreA.setForeground(Color.black);
            ScoreB.setForeground(Color.black);
        } 
        else{
            tie.setSelected(false);
            ScoreA.setForeground(Color.white);
            ScoreB.setForeground(Color.white);
        }
    }
    
    public static int getSetsWon(JCheckBox winnerCheckBox, JCheckBox superTieCheckBox){
        if (superTieCheckBox.isSelected() == false && winnerCheckBox.isSelected() == false) return 0;
        else if (superTieCheckBox.isSelected() == true && winnerCheckBox.isSelected() == false) return 1;
        return 2;
    }
    
    public static void showMatch(Match match, JLabel playerNameA, JLabel playerNameB, JLabel matchDate, JComboBox playerASetOne, JComboBox playerBSetOne, JComboBox playerASetTwo, JComboBox playerBSetTwo, JCheckBox checkWinMatchPlayer1, JCheckBox checkWinMatchPlayer2, JCheckBox superTieCheckBox,JTextField tiePlayerA, JTextField tiePlayerB){
        playerNameA.setText(match.getPlayerA().getName());
        playerNameB.setText(match.getPlayerB().getName());
        matchDate.setText(String.valueOf(match.getMatchDate()));
        playerASetOne.setSelectedItem(getScoreSetPlayerA(match.getResultFirstSet()));
        playerBSetOne.setSelectedItem(getScoreSetPlayerB(match.getResultFirstSet()));
        getWinner(match, checkWinMatchPlayer1, checkWinMatchPlayer2);
        getSuperTie(match, superTieCheckBox, tiePlayerA, tiePlayerB);
        tiePlayerA.setText(getScoreSetPlayerA(match.getResultSuperTie()));
        tiePlayerB.setText(getScoreSetPlayerB(match.getResultSuperTie()));
    }
    
    public static void safeChangesOfMatch(Tournament tour, Match match, JComboBox playerASetOne, JComboBox playerBSetOne, JComboBox playerASetTwo, JComboBox playerBSetTwo, JCheckBox checkWinMatchPlayer1, JCheckBox checkWinMatchPlayer2, JCheckBox superTieCheckBox){
        int gamesWonPlayerA = getGamesInSetJComboBox(playerASetOne) + getGamesInSetJComboBox(playerASetTwo);
        int gamesWonPlayerB = getGamesInSetJComboBox(playerBSetOne) + getGamesInSetJComboBox(playerBSetTwo);
        int gamesLostPlayerA = gamesWonPlayerB, gamesLostPlayerB = gamesWonPlayerA;
        int setsWonPlayerA = getSetsWon(checkWinMatchPlayer1, superTieCheckBox), setsWonPlayerB = getSetsWon(checkWinMatchPlayer2, superTieCheckBox);
        int setsLostPlayerA = setsWonPlayerB, setsLostPlayerB = setsWonPlayerA;
        boolean bolA = checkWinMatchPlayer1.isSelected(), bolB = checkWinMatchPlayer2.isSelected();
        String playerNameA = match.getPlayerA().getName(), playerNameB = match.getPlayerB().getName();
        try {
            for (Player player: tour.getParticipantsList()){
                
                if (player.getName().equals(playerNameA)) player.updatePlayerForMatch(gamesWonPlayerA, gamesLostPlayerA, bolA, setsWonPlayerA, setsLostPlayerA);
                else if ( player.getName().equals(playerNameB)) player.updatePlayerForMatch(gamesWonPlayerB, gamesLostPlayerB, bolB, setsWonPlayerB, setsLostPlayerB);
            }
        } catch (NullPointerException error){
            System.err.println("ERROR. No se guardaron correctamente los datos en la tabla general");
        }     
    }
    
}
