/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Freddy
 */
public class Player extends Person{
   
    // Attributes
    protected String category;
    protected String teamName;
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
    
    // Constructor #2// Constructor #2
    public Player(String category, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {
        super(id, name, password, email, dateBirth, phoneNumber);
        this.category = category;
        this.teamName = teamName;
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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCategory() {
        return category;
    }

    public String getTeamName() {
        return teamName;
    }
    
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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    
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
    
    public void readPlayer(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        this.name = nombre.getText();
        this.id = id.getText();
        this.password = this.id;
        this.phoneNumber= phoneNumber.getText();
        this.email = email.getText();
        this.category = (String) category.getSelectedItem();
        this.teamName = team.getText();
        this.dateBirth = StringBecomeLocalDate(dateBirth.getText());   
    }
    
}
