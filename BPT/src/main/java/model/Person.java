/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static controller.TypeBecomeType.StringBecomeLocalDate;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JTextField;

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
        return numberString.matches("^[1-9][0-9]{5,7}$") && (numberString.length() > 0 && numberString.length() < 9);
    } 
    
    public boolean validateName(String name){
        return true;
    } 
    
    public boolean validateEmail(String email){
        return email.matches("^[\\\\w.-]+@[a-zA-Z\\\\d.-]+\\\\.[a-zA-Z]{2,}$");
    } 
    
    public boolean validateDateBirth(String date){
        return date.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$") && date.length() == 10;
    } 
    
    public boolean validatePhoneNumber(String numberString){
        return numberString.matches("^(\\\\+58|0)?(4(12|14|16|24|26))[0-9]{7}$");
    } 
    
    // Read Methods
    
    public void readId(JTextField id){
        if (validateId(id.getText())) this.id = id.getText();
        else{
            id.setText("Numero de Cedula invalido");  
            id.setForeground(Color.red);
        }
    }
    
    public void readName(JTextField name){
        if (validateName(name.getText())) this.name = name.getText();
        else{
            name.setText("Nombre invalido");
            name.setForeground(Color.red);
        }  
    }
    
    public void readPassword(){
        password = id;
    }
    
    public void readEmail(JTextField email){
        if (validateName(email.getText())) this.name = email.getText();
        else{
            email.setText("Email invalido");
            email.setForeground(Color.red);
        }
    }
    
    public void readDateBirth(JTextField date){
        if (validateDateBirth(date.getText())) this.dateBirth = StringBecomeLocalDate(date.getText());
        else{
            date.setText("Fecha invalida");
            date.setForeground(Color.red);
        }
    }
    
        public void readPhoneNumber(JTextField phone){
        if (validatePhoneNumber(phone.getText())) this.phoneNumber = phone.getText();
        else{
            phone.setText("Numero de telefono invalida");
            phone.setForeground(Color.red);
        }
    }
    
}
