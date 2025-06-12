/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author Freddy
 */
public class MatchJourney {
    
    // Attributes
    
    private List<Player> teamA;
    private List<Player> teamB;
    private List<Match> matchList;
    private int matchesWonTeamA;
    private int matchesWonTeamB;
    private LocalDate journeyDate;
    private LocalTime journeyHour;
    
    // Methods
    
    // Constructor #1
    public MatchJourney(){}
    
    // Constructor #2
    public MatchJourney(List<Player> teamA, List<Player> teamB, List<Match> matchList, int matchesWonTeamA, int matchesWonTeamB, LocalDate journeyDate, LocalTime journeyHour) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchList = matchList;
        this.matchesWonTeamA = matchesWonTeamA;
        this.matchesWonTeamB = matchesWonTeamB;
        this.journeyDate = journeyDate;
        this.journeyHour = journeyHour;
    }
    
    // Getter Methods

    public List<Player> getTeamA() {
        return teamA;
    }

    public List<Player> getTeamB() {
        return teamB;
    }

    public List<Match> getMatchList() {
        return matchList;
    }

    public int getMatchesWonTeamA() {
        return matchesWonTeamA;
    }

    public int getMatchesWonTeamB() {
        return matchesWonTeamB;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public LocalTime getJourneyHour() {
        return journeyHour;
    }
    
   // Setter Methods

    public void setTeamA(List<Player> teamA) {
        this.teamA = teamA;
    }

    public void setTeamB(List<Player> teamB) {
        this.teamB = teamB;
    }

    public void setMatchList(List<Match> matchList) {
        this.matchList = matchList;
    }

    public void setMatchesWonTeamA(int matchesWonTeamA) {
        this.matchesWonTeamA = matchesWonTeamA;
    }

    public void setMatchesWonTeamB(int matchesWonTeamB) {
        this.matchesWonTeamB = matchesWonTeamB;
    }

    public void setJourneyDate(LocalDate journeyDate) {
        this.journeyDate = journeyDate;
    }

    public void setJourneyHour(LocalTime journeyHour) {
        this.journeyHour = journeyHour;
    }
    
}
