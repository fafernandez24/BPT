/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bpt;

/**
 *
 * @author Freddy A. Fernández
 */
public abstract class Person {
    
    // Atributtes
    
    protected String id;
    protected String name;
    protected String password;
    
    // Methods
    
    // Constructors
    
    // Constructor #1
    public Person(){};
    
    // Constructor #2
    public Person(String id, String name, String password){};
    
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
    
    // Validations
    
    public boolean validateId(){
        return id.matches("[0-9]") && (id.length() > 0 && id.length() < 100000000);
    }
    
    public boolean validateName(){
        return name.matches("/^[a-zA-ZÀ-ÿñÑ]+(([,\\. -][a-zA-ZÀ-ÿñÑ ])?[a-zA-ZÀ-ÿñÑ]*)*[^\\w\\s\\d\\(\\)\\[\\]\\?]$/");
    }
    
    // Others Methods
    
    public abstract void readData();
    public abstract void showData();
    
}
