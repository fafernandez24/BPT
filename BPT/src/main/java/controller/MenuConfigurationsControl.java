/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import javax.swing.JTextField;
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
}
