/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static controller.TypeBecomeType.StringBecomeLocalDate;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.JTextField;
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
    private boolean superTie;
    private String resultSuperTie;
    private String finalScore;
    private LocalDate matchDate;
    
    // Methods
    
    // Constructor #1
    public Match(){}
    
    // Constructor #2
    public Match(Player playerA, Player playerB, Player winner, String resultFirstSet, String resultSecondSet, boolean superTie, String resultSuperTie, String finalScore, LocalDate matchDate) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.winner = winner;
        this.resultFirstSet = resultFirstSet;
        this.resultSecondSet = resultSecondSet;
        this.superTie = superTie;
        this.resultSuperTie = resultSuperTie;
        this.finalScore = finalScore;
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

    public boolean getSuperTie() {
        return superTie;
    }

    public String getResultSuperTie() {
        return resultSuperTie;
    }

    public String getFinalScore() {
        return finalScore;
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

    public void setSuperTie(boolean superTie) {
        this.superTie = superTie;
    }

    public void setResultSuperTie(String resultSuperTie) {
        this.resultSuperTie = resultSuperTie;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }
    
    public boolean validateDate(String date){
        String regexOne = "^(?:(?:31[-/.](?:0?[13578]|1[02]))|(?:(?:29|30)[-/.](?:0?[13-9]|1[0-2]))|(?:0?[1-9]|1\\d|2[0-8])[-/.](?:0?[1-9]|1[0-2]))[-/.](?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        String regexTwo = "^(?:(?:1[6-9]|[2-9]\\d)?\\d{2})[-/.](?:0?[1-9]|1[0-2])[-/.](?:0?[1-9]|[12]\\d|3[01])$";
        return (date.matches(regexOne) || date.matches(regexTwo));
    } 
    
    public void readMatchPlayerA(JTextField idTextField, Tournament tour){
        String id = idTextField.getText();
        if (tour.findPlayerById(id) == false) this.playerA = tour.searchPlayerById(id);
        else idTextField.setForeground(Color.red);
    }
    
    public void readMatchPlayerB(JTextField idTextField, Tournament tour){
        String id = idTextField.getText();
        if (tour.findPlayerById(id) == false) this.playerB = tour.searchPlayerById(id);
        else idTextField.setForeground(Color.red);
    }
    
    public void readMatchDate(JTextField date){
        if (validateDate(date.getText())) this.matchDate = StringBecomeLocalDate(date.getText());
        else{
            date.setText("Fecha invalida");
            date.setForeground(Color.red);
        }
    }
    
    public void readMatch(JTextField idATextField, JTextField idBTextField, JTextField date, Tournament tour){
        readMatchPlayerA(idATextField, tour);
        readMatchPlayerB(idBTextField, tour);
        this.winner = null;
        this.resultFirstSet = "0-0";
        this.resultSecondSet = "0-0";
        this.superTie = false;
        this.resultSuperTie = "0-0";
        this.finalScore = "0-0";
        readMatchDate(date);  
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
