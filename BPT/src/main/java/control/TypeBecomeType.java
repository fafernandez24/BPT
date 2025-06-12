/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.time.LocalDate;

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
     
}