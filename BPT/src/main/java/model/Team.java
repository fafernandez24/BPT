/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
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
    public Team(List<Player> teamList, String phoneNumber, String category, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage, String id, String name, String password, String email, LocalDate dateBirth) {
        super(phoneNumber, category, teamName, matchesPlayed, matchesWon, matchesLost, setsWon, setsLost, gamesWon, gamesLost, matchAverage, setAverage, gameAverage, id, name, password, email, dateBirth);
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
