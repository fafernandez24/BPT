/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.ValidationControl.validateJFieldTextInt;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;


/**
 *
 * @author Freddy
 */
public class TypeBecomeType {
    
    public static LocalDate StringBecomeLocalDate(String date){
        int year = Integer.parseInt(date.substring(6,10));
        int month = Integer.parseInt(date.substring(3,5));
        int day = Integer.parseInt(date.substring(0,2));
        return LocalDate.of(year, month, day);  
    }
    
    public static String JTextFieldBecomeString(JTextField textField){
        return textField.getText();
    }
    
    public static int JTextFieldBecomeInt(JTextField textField){
        if (validateJFieldTextInt(textField)) return Integer.parseInt(textField.getText());
        return 0;
    }
    
    public static String JComboBoxBecomeString(JComboBox comboBox){
        return (String) comboBox.getSelectedItem();
    }
    
    public static int JComboBoxBecomeInt(JComboBox comboBox){
        return Integer.parseInt((String) comboBox.getSelectedItem());
    }
}