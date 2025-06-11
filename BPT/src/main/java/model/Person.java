/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Freddy A. Fernández
 */
public abstract class Person {
    
    Scanner dataEnter = new Scanner(System.in);
    
    // Attributes
    
    protected String id;
    protected String name;
    protected String password;
    protected String email;
    protected LocalDate dateBirth;
    
    // Methods
    
    // Constructor #1
    public Person(){};
    
    // Constructor #2
    public Person(String id, String name, String password, String email, LocalDate dateBirth){};
    
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
    

    
    // Read Methods
    
    public void readName(){
        do{
            System.out.print("Ingresar nombre: ");
            name = dataEnter.nextLine();
            if (!validateName()) System.out.println("ERROR. Ingresar un nombre valido.");
        } while (!validateName());
    }
    
    public void readPassword(){
        do{
            System.out.println("Ingresar clave de acceso: ");
            password = dataEnter.nextLine();
            if (!validatePassword()) System.out.println("ERROR. La clave debe tener: \n- Minimo 8 caracteres\n- Un caracter especial\n- Un numero\n- Una letra mayuscula\n- Una letra minuscula");
        } while (!validatePassword());
    }
    
    // Others Methods
    
    public abstract void readData();
    public abstract String showData();
    
}
