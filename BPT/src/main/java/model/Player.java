/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Freddy
 */
public class Player extends Person{
   
    // Attributes
    
    protected int matchesPlayed;
    protected int matchesWon;
    protected int matchesLost;
    protected int setsWon;
    protected int setsLost;
    protected int gamesWon;
    protected int gamesLost;
    protected double matchAverage;
    protected double setAverage;
    protected double gameAverage;
    
    // Methods
    
    // Constructor #1
    public Player(){};
    
    // Constructor #2
    public Player(int id, String name, String password, String email, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage) {
        super(id, name, password, email);
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.setsWon = setsWon;
        this.setsLost = setsLost;
        this.gamesWon = gamesWon;
        this.gamesLost = gamesLost;
        this.matchAverage = matchAverage;
        this.setAverage = setAverage;
        this.gameAverage = gameAverage;
    }
    
    // Getter Methods

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public int getSetsWon() {
        return setsWon;
    }

    public int getSetsLost() {
        return setsLost;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesLost() {
        return gamesLost;
    }

    public double getMatchAverage() {
        return matchAverage;
    }

    public double getSetAverage() {
        return setAverage;
    }

    public double getGameAverage() {
        return gameAverage;
    }
    
    // Setter Methods

    public void setMatchesPlayed(int matchPlayed) {
        this.matchesPlayed = matchPlayed;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public void setSetsWon(int setsWon) {
        this.setsWon = setsWon;
    }

    public void setSetsLost(int setsLost) {
        this.setsLost = setsLost;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost = gamesLost;
    }

    public void setMatchAverage(double matchesAverage) {
        this.matchAverage = matchesAverage;
    }

    public void setSetAverage(double setAverage) {
        this.setAverage = setAverage;
    }

    public void setGameAverage(double gameAverage) {
        this.gameAverage = gameAverage;
    }
    
    /* TO DO
    Programar el metodo de searchPlayer...
    public Player searchPlayer(List<Player> playersList){}
    */
    
    /* TO DO
    Tengo que programar 
    public void reviewCalendar(List<partido> matchesList){}
    */    
    @Override
    public String showData(){
        return  "CI: " + id +
                "\nNombre: " + name +
                "\nPartidos jugados: " + matchesPlayed +
                "\nPartidos ganados: " + matchesWon +
                "\nPartidos perdidos: " + matchesLost +
                "\nSets ganados: " + setsWon +
                "\nSets perdidos: " + setsLost +
                "\nGames ganados: "+ gamesWon +
                "\nGames perdidos: " + gamesLost +
                "\nPorcentaje de partidos ganados: " + matchAverage +
                "\nPorcentaje de sets ganados: " + setAverage +
                "\nPorcentaje de games ganados: " + gameAverage;
    }
    
    @Override
    // TO DO
    // HACER ESTE METODO
    public void readData(){}
    
}
