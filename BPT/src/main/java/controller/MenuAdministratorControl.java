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
            nombreTorneo = tournamentList.get(0).getTournamentName();
            int mostPlayers = tournamentList.get(0).getParticipantsNumber();
            for (int i = 0; i < tournamentList.size(); i++){
                if (mostPlayers < tournamentList.get(i).getParticipantsNumber()){
                    mostPlayers = tournamentList.get(i).getParticipantsNumber();
                    nombreTorneo = tournamentList.get(i).getTournamentName();
                }
            }
        } catch (NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostParticipansTournament");
        }
        return nombreTorneo;
    }
    
    public static String lessPlayersTournament (List<Tournament> tournamentList){
        String nombreTorneo;
        try{
            nombreTorneo = tournamentList.get(0).getTournamentName();
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
            nombreTorneo = "ERROR";
        }
        return nombreTorneo;
    }
    
    public static String mostGameAveragePlayer(List<Player> playertList){
        String name;
        try{
            name = playertList.get(0).getName();
            double mostGameAverage = playertList.get(0).getGameAverage();
            for (Player player : playertList) {
                if (mostGameAverage < player.getGameAverage()){
                    mostGameAverage = player.getGameAverage();
                    name = player.getName();
                }
            }
        } catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostGameAveragePlayer");
            name = "ERROR";
        }
        return name;
    }
    
    public static String mostSetsAveragePlayer(List<Player> playertList){
        String name = "";
        try{
            name = playertList.get(0).getName();
            double mostSetsAverage = playertList.get(0).getSetAverage();
            for (Player player: playertList){
                if (mostSetsAverage < player.getSetAverage()){
                    mostSetsAverage = player.getSetAverage();
                    name = player.getName();
                }
            }
        } catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostSetsAveragePlayer");
        }
        return name;
    }
    
    public static String mostMatchAveragePlayer(List<Player> playertList){
        String name = "";
        try{
            name = playertList.get(0).getName();
            double mostMatchAverage = playertList.get(0).getMatchAverage();
            for (Player player: playertList){
                if (mostMatchAverage < player.getMatchAverage()){
                    mostMatchAverage = player.getMatchAverage();
                    name = player.getName();
                }
            }
        } catch(NullPointerException error){
            System.out.println("ERROR. Lista vacia. Funcion mostMatchAveragePlayer");
        }
        return name;
    }
    
}
