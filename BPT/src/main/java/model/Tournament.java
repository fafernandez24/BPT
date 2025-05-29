/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Freddy A. Fernández
 */
public class Tournament {
    
    // Attributes
    
    private String tournamentName;
    private int participantsNumber;
    private int groupsNumber;
    private int matchsNumber;
    private GeneralTable generalTable;
    private List<Player> participantsList;
    private List<Group> groupsList;
    private List<Player> knockOutStage;
    
    // Methods
    
    // Constructor #1
    public Tournament(){}
    
    // Constructor #2
    public Tournament(String tournamentName, int participantsNumber, int groupsNumber, int matchsNumber, GeneralTable generalTable, List<Player> participantsList, List<Group> groupsList, List<Player> knockOutStage) {
        this.tournamentName = tournamentName;
        this.participantsNumber = participantsNumber;
        this.groupsNumber = groupsNumber;
        this.matchsNumber = matchsNumber;
        this.generalTable = generalTable;
        this.participantsList = participantsList;
        this.groupsList = groupsList;
        this.knockOutStage = knockOutStage;
    }
    
    // Getter Methods

    public String getTournamentName() {
        return tournamentName;
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

    public GeneralTable getGeneralTable() {
        return generalTable;
    }
    
    // Setter Methods

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
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

    public void setGeneralTable(GeneralTable generalTable) {
        this.generalTable = generalTable;
    }
    
    
    
}
