/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Freddy A. Fernández
 */
public class Match {
    
    // Attributes
    
    private Player playerA;
    private Player playerB;
    private int resultFirstSet;
    private int resultSecondSet;
    private LocalDate matchDate;
    private LocalTime Timehour;
    
    // Methods
    
    // Constructor #1
    public Match(){}
    
    // Constructor #2
    public Match(Player playerA, Player playerB, int resultFirstSet, int resultSecondSet, LocalDate matchDate, LocalTime Timehour) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.resultFirstSet = resultFirstSet;
        this.resultSecondSet = resultSecondSet;
        this.matchDate = matchDate;
        this.Timehour = Timehour;
    }
    
    // Getter Methods

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public int getResultFirstSet() {
        return resultFirstSet;
    }

    public int getResultSecondSet() {
        return resultSecondSet;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public LocalTime getTimehour() {
        return Timehour;
    }
    
    // Setter Methods

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public void setResultFirstSet(int resultFirstSet) {
        this.resultFirstSet = resultFirstSet;
    }

    public void setResultSecondSet(int resultSecondSet) {
        this.resultSecondSet = resultSecondSet;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public void setTimehour(LocalTime Timehour) {
        this.Timehour = Timehour;
    }
       
}
