/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freddy A. Fernández
 */
public class Team extends Player{
    
    // Attributes
    
    private List<Player> teamList;
    private Player captain;
    
    // Methods
    
    // Constructor
    
    // Constructor #1
    public Team(){}
    
    // Constructor #2
    public Team(List<Player> teamList, Player captain, String category, String teamName, int matchesPlayed, int matchesWon, int matchesLost, int setsWon, int setsLost, int gamesWon, int gamesLost, double matchAverage, double setAverage, double gameAverage, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber) {
        super(category, teamName, matchesPlayed, matchesWon, matchesLost, setsWon, setsLost, gamesWon, gamesLost, matchAverage, setAverage, gameAverage, id, name, password, email, dateBirth, phoneNumber);
        this.teamList = teamList;
        this.captain = captain;
    }

    // Getter Methods

    public List<Player> getTeamList() {
        return teamList;
    }

    public Player getCaptain() {
        return captain;
    }
    
    // Setter Methods

    public void setTeamList(List<Player> teamList) {
        this.teamList = teamList;
    }

    public void setCaptain(Player captain) {
        this.captain = captain;
    }
    
    public void readCaptain(JTextField name,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        captain.name = name.getText();
        captain.id = id.getText();
        captain.password = captain.id;
        captain.phoneNumber= phoneNumber.getText();
        captain.email = email.getText();
        captain.category = (String) category.getSelectedItem();
        captain.teamName = team.getText();
        captain.dateBirth = StringBecomeLocalDate(dateBirth.getText());   
    }
    
    public void readTeam(JTextField teamName, Player captain){
        this.teamName = teamName.getText();
        this.captain = captain;
        this.category = this.captain.getCategory();
    }
       
    @Override
    public void addPlayerTable(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        Object[] cells = new Object[4];
        cells[0] = teamName;
        cells[1] = captain.getName();
        cells[2] = captain.getId();
        cells[3] = captain.getCategory();
        defaultTable.addRow(cells);
    }

}
