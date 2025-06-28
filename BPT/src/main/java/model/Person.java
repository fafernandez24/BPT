/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy A. Fernández
 */
public abstract class Person {    
    // Attributes
    
    protected String id;
    protected String name;
    protected String password;
    protected String email;
    protected LocalDate dateBirth;
    protected String phoneNumber;
    
    // Methods
    
    // Constructor #1
    public Person(){};
    
    // Constructor #2
    public Person(String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {    
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    // Getters methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }
    
    // Setter methods

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }
    
    // Validations
    
    public boolean validateId(String numberString){
        return numberString.matches("[0-9]") && (numberString.length() > 0 && numberString.length() < 9);
    } 
    
}
