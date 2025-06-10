/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Freddy A. Fernández
 */
public class Organizator extends Person {
    
    // Attributes
    private List<Tournament> TournamentList;
    
    // Methods
    
    // Constructor #1
    public Organizator(){}
    
    // Constructor #2

    public Organizator(List<Tournament> TournamentList, int id, String name, String password, String email) {
        super(id, name, password, email);
        this.TournamentList = TournamentList;
    }
    
    // Getter Methods

    public List<Tournament> getTournamentList() {
        return TournamentList;
    }
    
    // Setter Methods

    public void setTournamentList(List<Tournament> TournamentList) {
        this.TournamentList = TournamentList;
    }

    @Override
    public void readData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String showData() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
