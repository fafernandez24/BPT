/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Player;
import model.Tournament;

/**
 *
 * @author Freddy
 */
public class MenuAdministratorControl {
    
    public static boolean findPlayerById(List<Player> players, Player playerInList){
        try{
            String id = playerInList.getId();
            for (int i = 0; i < players.size(); i++){
                if (players.get(i).getId().equals(id)) return false;
            }
        } catch (NullPointerException error){
            System.out.println("ERROR. Lista vacia. findPlayerById");
        }
        return true;
    }
    
    public static List<Player> bestTenPlayers (List<Player> players, JTable table){
        List<Player> topTen = new ArrayList(); 
        try{
            int matchesWon = players.get(0).getMatchesWon();
            Player player = players.get(0);
            for (int i = 0; i < 10; i++){
                for (int j = 0; j < players.size(); j++){
                    if (matchesWon <= players.get(j).getMatchesWon() && findPlayerById(topTen, players.get(j))){
                        matchesWon = players.get(j).getMatchesWon();
                        player = players.get(j);
                    }
                }
                if (findPlayerById(topTen, player)) topTen.add(player);
            }
        } catch (NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion bestTenPlayers");
        }
        return topTen;
    }
    
    public static void tableTopTen(List<Player> playerList, JTable table){
        administratorCleanTable(table);
        List<Player> topTen = bestTenPlayers(playerList, table);
        System.out.println(topTen);
        for (Player player: topTen){
            player.addPlayerTableTopTen(table);
        }
    }
    
    public static void administratorCleanTable(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        defaultTable.setRowCount(0);
    }
    
    public static int totalPlayers(List<Player> players){
        return players.size();
    }
    
    public static String mostPlayersTournament (List<Tournament> tournamentList){
        String nombreTorneo = "";
        try{
            int mostPlayers = tournamentList.get(0).getParticipantsNumber();
            for (int i = 0; i < tournamentList.size(); i++){
                    if (mostPlayers < tournamentList.get(i).getParticipantsNumber()){
                        mostPlayers = tournamentList.get(i).getParticipantsNumber();
                        nombreTorneo = tournamentList.get(i).getTournamentName();
                    }
                }
            }
         catch (NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostParticipansTournament");
        }
        return nombreTorneo;
    }
    
    public static String lessPlayersTournament (List<Tournament> tournamentList){
        String nombreTorneo = "";
        try{
            int lessPlayers = tournamentList.get(0).getParticipantsNumber();
            for (int i = 0; i < tournamentList.size(); i++){
                    if (lessPlayers > tournamentList.get(i).getParticipantsNumber()){
                        lessPlayers = tournamentList.get(i).getParticipantsNumber();
                        nombreTorneo = tournamentList.get(i).getTournamentName();
                    }
                }
            }
         catch (NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostParticipansTournament");
        }
        return nombreTorneo;
    }
    
    public static String findPlayerName (List<Player> players, int index){
        String nombre = players.get(index).getName();
        return nombre;
    }
    
    public static double findGameAverage(List<Player> players, int index){
        double average = players.get(index).getGameAverage();
        return average;
    }
    
    public static double findSetAverage(List<Player> players, int index){
        double average = players.get(index).getSetAverage();
        return average;
    }
    
    public static double findMatchAverage(List<Player> players, int index){
        double average = players.get(index).getMatchAverage();
        return average;
    }
    
    public static String mostGameAveragePlayer(List<Tournament> tournamentList){
        String nombre = "";
        try{
            double mostGameAverage = findGameAverage(tournamentList.get(0).getParticipantsList(), 0);
            for (int i = 0; i < tournamentList.size(); i++){
                    if (mostGameAverage < findGameAverage(tournamentList.get(i).getParticipantsList(), i)){
                        mostGameAverage = findGameAverage(tournamentList.get(i).getParticipantsList(), i);
                        nombre = findPlayerName(tournamentList.get(i).getParticipantsList(), i);
                    }
                }
        }
        catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostGameAveragePlayer");
        }
        return nombre;
    }
    
    public static String mostSetsAveragePlayer(List<Tournament> tournamentList){
        String nombre = "";
        try{
            double mostSetsAverage = findSetAverage(tournamentList.get(0).getParticipantsList(), 0);
            for (int i = 0; i < tournamentList.size(); i++){
                    if (mostSetsAverage < findSetAverage(tournamentList.get(i).getParticipantsList(), i)){
                        mostSetsAverage = findSetAverage(tournamentList.get(i).getParticipantsList(), i);
                        nombre = findPlayerName(tournamentList.get(i).getParticipantsList(), i);
                    }
                }
        }
        catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostSetsAveragePlayer");
        }
        return nombre;
    }
    
    public static String mostMatchAveragePlayer(List<Tournament> tournamentList){
        String nombre = "";
        try{
            double mostMatchAverage = findMatchAverage(tournamentList.get(0).getParticipantsList(), 0);
            for (int i = 0; i < tournamentList.size(); i++){
                    if (mostMatchAverage < findMatchAverage(tournamentList.get(i).getParticipantsList(), i)){
                        mostMatchAverage = findMatchAverage(tournamentList.get(i).getParticipantsList(), i);
                        nombre = findPlayerName(tournamentList.get(i).getParticipantsList(), i);
                    }
                }
        }
        catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostMatchAveragePlayer");
        }
        return nombre;
    }
    
}
