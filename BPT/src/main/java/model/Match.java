/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy A. Fernández
 */
public class Match {
    
    // Attributes
    
    private Player playerA;
    private Player playerB;
    private Player winner;
    private String resultFirstSet;
    private String resultSecondSet;
    private LocalDate matchDate;
    
    // Methods
    
    // Constructor #1
    public Match(){}
    
    // Constructor #2
    public Match(Player playerA, Player playerB, Player winner, String resultFirstSet, String resultSecondSet, LocalDate matchDate, LocalTime Timehour) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.winner = winner;
        this.resultFirstSet = resultFirstSet;
        this.resultSecondSet = resultSecondSet;
        this.matchDate = matchDate;
    }
    
    // Getter Methods

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public Player getWinner() {
        return winner;
    }

    public String getResultFirstSet() {
        return resultFirstSet;
    }

    public String getResultSecondSet() {
        return resultSecondSet;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }
    
    // Setter Methods

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public void setResultFirstSet(String resultFirstSet) {
        this.resultFirstSet = resultFirstSet;
    }

    public void setResultSecondSet(String resultSecondSet) {
        this.resultSecondSet = resultSecondSet;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public void setWinner(Player Winner) {
        this.winner = Winner;
    }
       
    public void addMatchTableByDate(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        Object[] cells = new Object[5];
        cells[0] = playerA.getName();
        cells[1] = playerB.getName();
        cells[2] = resultFirstSet;
        cells[3] = resultSecondSet;
        cells[4] = matchDate;
        defaultTable.addRow(cells);  
    }
    
}
