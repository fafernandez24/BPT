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
public class Team extends Player{
    
    // Attributes
    
    private List<Player> teamList;
    
    // Methods
    
    // Constructor
    
    // Constructor #1
    public Team(){}
    
    // Constructor #2
    public Team(List<Player> teamList, int id, String name, String password, String email, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage) {
        super(id, name, password, email, matchesPlayed, matchesWon, matchesLost, setsWon, setsLost, gamesWon, gamesLost, matchAverage, setAverage, gameAverage);
        this.teamList = teamList;
    }
    
    
    // Getter Methods

    public List<Player> getTeamList() {
        return teamList;
    }
    
    // Setter Methods

    public void setTeamList(List<Player> teamList) {
        this.teamList = teamList;
    }
    
}
