/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Player;
import model.Tournament;


public class MenuPlayerControl {
    
    public static void playerShowPlayerInformation(JTextField nameField, JTextField phoneField, JTextField dateBirthField, JTextField idField, JTextField email, JTextField categoryField, JTextField teamField, JTextField mathPlayedField, JTextField matchesWonField, Player player){
        nameField.setText(player.getName());
        phoneField.setText(player.getPhoneNumber());
        dateBirthField.setText(player.getDateBirth().toString());
        idField.setText(player.getId());
        email.setText(player.getEmail());
        categoryField.setText(player.getCategory());
        teamField.setText(player.getTeamName());
        mathPlayedField.setText(String.valueOf(player.getMatchesPlayed()));
        matchesWonField.setText(String.valueOf(player.getMatchesWon()));
    }
    
    public static Player searchPlayer(List<Tournament> tournamentList, String id){
        int i = 0;
        Player player = new Player();
        while (i < tournamentList.size()){
            player = tournamentList.get(i).searchPlayerById(id);
            if (player.getName().equals(id)) return player;
            ++i;
        }
        return player;
    }
    
    public static void playerFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void playerFocusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void changeButtonColor(JButton button, int r, int g, int b){
        button.setBackground(new Color(r,g,b));
    }
    
    public static void changePanelColor(JPanel panel, int r, int g, int b){
        panel.setBackground(new Color(r,g,b));
    }
    
}
