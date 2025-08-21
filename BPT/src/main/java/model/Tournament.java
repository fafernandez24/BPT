/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.TournamentJsonControl;
import static controller.TypeBecomeType.JComboBoxBecomeString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Freddy A. Fernández
 */
public class Tournament {
    
    // Attributes
    
    private String tournamentName;
    private String tournamentCategory;
    private int format;
    private float tournamentCost;
    private int participantsNumber;
    private int groupsNumber;
    private int matchsNumber;
    private int ticketPlayOff;
    private List<Player> participantsList;
    private List<Group> groupsList;
    private List<Player> knockOutStage;
    private List<Match> matchList = new ArrayList<>();
    
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

    // Getter Methods

    public String getTournamentName() {
        return tournamentName;
    }

    public String getTournamentCategory() {
        return tournamentCategory;
    }

    public float getTournamentCost() {
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

    public List<Match> getMatchList() {
        return matchList;
    }
    
    // Setter Methods

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public void setTournamentCategory(String tournamentCategory) {
        this.tournamentCategory = tournamentCategory;
    }

    public void setTournamentCost(float tournamentCost) {
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

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public void addPlayerTournament(Player player){
        participantsList.add(player);
    }
    
    public void createGroups(){
        for (int i = 0; i < groupsNumber; i++){
            Group group = new Group();
            group.setGroupNumber(i+1);
            groupsList.add(group);
        }
    }
    
    public void drawGroups(){
        for (Player player : participantsList) {
            int index = (int) (Math.random() * groupsList.size());
            groupsList.get(index).getPlayerList().add(player);
        }
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
    
    public Player searchPlayerById(String id){
        for (Player player : participantsList) {
            if (player.getId().equals(id)) return player;
        }
        return new Player();
    } 
    
    @SuppressWarnings("empty-statement")
    public boolean findPlayerById(String id){
        try{
            for (Player player : participantsList) {
                if (player.getId().equals(id)) return false;
            }
        } catch (NullPointerException error){
            System.out.println("AVISO. Lista vacia");
            return true;
        }
        return true;
    }
    
    public void addMatch(Match match){
        try{
            matchList.add(match);
        } catch (NullPointerException error){
           matchList = new ArrayList<>(); 
           matchList.add(match);
        }
    }
    
    public boolean findMatch(String idA, String idB, String date){
        try{
            for (Match m: this.matchList){
                String playerAId = m.getPlayerA().getId(), playerBId = m.getPlayerB().getId(), matchDate = String.valueOf(m.getMatchDate());
                if (playerAId.equals(idA) && playerBId.equals(idB) && matchDate.equals(date)) return true;
            }
        } catch (NullPointerException error){
            return false;
        }
        return false;
    }
    
    public Match searchMatch(String idA, String idB, String date){
        try{
            for (Match m: this.matchList){
                String playerAId = m.getPlayerA().getId(), playerBId = m.getPlayerB().getId(), matchDate = String.valueOf(m.getMatchDate());
                if (playerAId.equals(idA) && playerBId.equals(idB) && matchDate.equals(date)) return m;
            }
        } catch (NullPointerException error){
            return null;
        }
        return null;
    }
    
    public Player updatePlayerGroup(String name, int pj, int pg, int pp, int sg, int sp, int gg, int gp){
        for (Player player : participantsList) {
            if (player.getName().equals(name)) player.updatePlayer(pj, pg, pp, sg, sp, gg, gp);
        }
        return new Player();
    } 
    
    public void updatePlayerInGeneralTable(String name, int pj, int pg, int pp, int sg, int sp, int gg, int gp){
        try {
            for (Player player: participantsList){
                if (player.getName().equals(name)) player.updatePlayer(pj, pg, pp, sg, sp, gg, gp);
            }
        } catch (NullPointerException error){
            System.err.println("ERROR. No se guardaron correctamente los datos en la tabla general");
        } 
    }
    
    public void updatePlayerInGroup(String name, int pj, int pg, int pp, int sg, int sp, int gg, int gp){
       try {
            for (Group group: groupsList){
                group.searchPlayerByName(name).updatePlayer(pj, pg, pp, sg, sp, gg, gp);
            }
       } catch (NullPointerException error) {
           System.err.println("Error. No se guardaron correctamente los datos en los grupos");
       }
    }
    
    public void addTournamentsJson(){
        TournamentJsonControl jsonTour = new TournamentJsonControl();
        jsonTour.addTournament(this);
    }

}
