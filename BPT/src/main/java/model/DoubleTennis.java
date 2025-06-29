/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static controller.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy A. Fernández
 */
public class DoubleTennis extends Player{
    
    // Attributes
    
    private Player playerA;
    private Player playerB;
    
    // Methods
    
    // Constructor #1
    public DoubleTennis(){};
    
    // Constructor #2// Constructor #2
    public DoubleTennis(Player playerA, Player playerB, String category, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {
        super(category, teamName, matchesPlayed, matchesWon, matchesLost, setsWon, setsLost, gamesWon, gamesLost, matchAverage, setAverage, gameAverage, id, name, password, email, dateBirth, phoneNumber);
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
    
    public void readPlayerA(JTextField name,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        Player player = new Player();
        player.readPlayer(name, id, phoneNumber, email, category, team, dateBirth);
        this.setPlayerA(player);
    }
    
    public void readPlayerB(JTextField name,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        Player player = new Player();
        player.readPlayer(name, id, phoneNumber, email, category, team, dateBirth);
        this.setPlayerB(player);
    }
    
    @Override
    public void addPlayerTable(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        Object[] cells = new Object[6];
        cells[0] = playerA.getName();
        cells[1] = playerB.getId();
        cells[2] = playerB.getName();
        cells[3] = playerB.getId();
        cells[4] = playerA.getCategory();
        cells[5] = playerB.getCategory();
        defaultTable.addRow(cells);
    }
    
}
