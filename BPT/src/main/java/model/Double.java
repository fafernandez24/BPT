/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Freddy A. Fernández
 */
public class Double extends Player {
    
    // Attributes
    
    private Player playerA;
    private Player playerB;
    
    // Methods
    
    // Constructor #1
    public Double(){}
    
    // Constructor #2

    public Double(Player playerA, Player playerB, String phoneNumber, String category, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage, String id, String name, String password, String email, LocalDate dateBirth) {
        super(phoneNumber, category, teamName, matchesPlayed, matchesWon, matchesLost, setsWon, setsLost, gamesWon, gamesLost, matchAverage, setAverage, gameAverage, id, name, password, email, dateBirth);
        this.playerA = playerA;
        this.playerB = playerB;
    }
    
    // Getter Methods

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }
    
    // Setter Methods

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }
    
}
