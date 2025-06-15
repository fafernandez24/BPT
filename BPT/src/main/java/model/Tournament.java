/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static control.TypeBecomeType.JComboBoxBecomeString;
import static control.TypeBecomeType.StringBecomeLocalDate;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Freddy A. Fernández
 */
public class Tournament {
    
    // Attributes
    
    private String tournamentName;
    private String tournamentCategory;
    private int format;
    private int tournamentCost;
    private int participantsNumber;
    private int groupsNumber;
    private int matchsNumber;
    private int ticketPlayOff;
    private List<Player> participantsList;
    private List<Group> groupsList;
    private List<Player> knockOutStage;
    
    // Methods
    
    // Constructor #1
    public Tournament(){}
    
    // Constructor #2

    public Tournament(String tournamentName, String tournamentCategory, int format, int tournamentCost, int participantsNumber, int groupsNumber, int matchsNumber, int ticketPlayOff, List<Player> participantsList, List<Group> groupsList, List<Player> knockOutStage) {
        this.tournamentName = tournamentName;
        this.tournamentCategory = tournamentCategory;
        this.format = format;
        this.tournamentCost = tournamentCost;
        this.participantsNumber = participantsNumber;
        this.groupsNumber = groupsNumber;
        this.matchsNumber = matchsNumber;
        this.ticketPlayOff = ticketPlayOff;
        this.participantsList = participantsList;
        this.groupsList = groupsList;
        this.knockOutStage = knockOutStage;
    }

    // Constructor #3
    public Tournament(String tournamentName, String tournamentCategory, int tournamentCost, int participantsNumber) {
        this.tournamentName = tournamentName;
        this.tournamentCategory = tournamentCategory;
        this.tournamentCost = tournamentCost;
        this.participantsNumber = participantsNumber;
    }

    // Getter Methods

    public String getTournamentName() {
        return tournamentName;
    }

    public String getTournamentCategory() {
        return tournamentCategory;
    }

    public int getTournamentCost() {
        return tournamentCost;
    }

    public int getParticipantsNumber() {
        return participantsNumber;
    }

    public int getGroupsNumber() {
        return groupsNumber;
    }

    public int getMatchsNumber() {
        return matchsNumber;
    }

    public List<Player> getParticipantsList() {
        return participantsList;
    }

    public List<Group> getGroupsList() {
        return groupsList;
    }

    public List<Player> getKnockOutStage() {
        return knockOutStage;
    }

    public int getFormat() {
        return format;
    }

    public int getTicketPlayOff() {
        return ticketPlayOff;
    }
    
    // Setter Methods

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setTournamentCategory(String tournamentCategory) {
        this.tournamentCategory = tournamentCategory;
    }

    public void setTournamentCost(int tournamentCost) {
        this.tournamentCost = tournamentCost;
    }

    public void setParticipantsNumber(int participantsNumber) {
        this.participantsNumber = participantsNumber;
    }

    public void setGroupsNumber(int groupsNumber) {
        this.groupsNumber = groupsNumber;
    }

    public void setMatchsNumber(int matchsNumber) {
        this.matchsNumber = matchsNumber;
    }

    public void setParticipantsList(List<Player> participantsList) {
        this.participantsList = participantsList;
    }

    public void setGroupsList(List<Group> groupsList) {
        this.groupsList = groupsList;
    }

    public void setKnockOutStage(List<Player> knockOutStage) {
        this.knockOutStage = knockOutStage;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public void setTicketPlayOff(int ticketPlayOff) {
        this.ticketPlayOff = ticketPlayOff;
    }
    
    public void addPlayerTournament(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        String name = nombre.getText();
        String identification = id.getText();
        String password = identification;
        String cellPhoneNumber = phoneNumber.getText();
        String gmail = email.getText();
        String level = (String) category.getSelectedItem();
        String teamName = team.getText();
        LocalDate date = StringBecomeLocalDate(dateBirth.getText());   
        Player player = new Player(level, teamName, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, identification, name, password, gmail, date, cellPhoneNumber); 
        participantsList.add(player);
    }
    
    public Player addPlayer(JTextField nombre,JTextField id, JTextField phoneNumber, JTextField email, JComboBox<String> category, JTextField team, JTextField dateBirth){
        String name = nombre.getText();
        String identification = id.getText();
        String password = identification;
        String cellPhoneNumber = phoneNumber.getText();
        String gmail = email.getText();
        String level = (String) category.getSelectedItem();
        String teamName = team.getText();
        LocalDate date = StringBecomeLocalDate(dateBirth.getText());   
        return new Player(level, teamName, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, identification, name, password, gmail, date, cellPhoneNumber); 
    }
    
    public void drawGroups(int numberGroups){
        int group;
        for (int i = 0; i < participantsList.size(); i++){
            group = (int) (Math.random() * (numberGroups-1));
            groupsList.get(group).getPlayerList().add(participantsList.get(i));
        }
    }
    
    public void drawknockOutStage(int numberGroups){
        //TODO
    }
    
    public void ticketsForPlayOffJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("DIECISEISAVOS", 32);
        playOff.put("OCTAVOS", 16);
        playOff.put("CUARTOS", 8);
        playOff.put("SEMIFINALES", 4);
        playOff.put("FINAL", 2);
        ticketPlayOff = playOff.get(JComboBoxBecomeString(comboBox));
    }

}
