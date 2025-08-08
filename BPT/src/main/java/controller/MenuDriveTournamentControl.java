/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Organizator;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuDriveTournamentControl {
    
    public static void changeLabelColor(JLabel label, int r, int g, int b){
        label.setForeground(new Color(r,g,b));
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
    
}
