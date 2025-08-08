/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static controller.TypeBecomeType.JComboBoxBecomeString;
import static controller.TypeBecomeType.JTextFieldBecomeInt;
import static controller.ValidationControl.validateParticipantsNumber;
import static controller.ValidationControl.validateTournamentCost;
import static controller.ValidationControl.validateTournamentName;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Group;
import model.Match;
import model.Organizator;
import model.Player;
import model.Tournament;
import view.MenuDriveTournament;

/**
 *
 * @author Freddy
 */
public class MenuOrganizatorControl {
   
    public static void organizatorFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
        dataEnter.setForeground(new Color(153,153,153));
    }
    
    public static void organizatorFocusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void changeButtonColor(JButton button, int r, int g, int b){
        button.setBackground(new Color(r,g,b));
    }
    
    public static void changePanelColor(JPanel panel, int r, int g, int b){
        panel.setBackground(new Color(r,g,b));
    }
    
    public static void changeLabelIcon(JLabel label, String imageName){
        String url = "/images/"+imageName;
        ImageIcon icon = new ImageIcon(MenuOrganizatorControl.class.getResource(url));
        label.setIcon(icon);
    }
    
    public static void openMenuDriveTournament(Tournament tour, Organizator org){
        MenuDriveTournament openMenu = new MenuDriveTournament(tour, org);
        openMenu.setVisible(true);
    }
    
    public static void openMenuDriveTournamentDeleteTour(Tournament tour, Organizator org){
        MenuDriveTournament openMenu = new MenuDriveTournament(tour, org);
        openMenu.setVisible(true);
        openMenu.getDeleteTournamentTab(4);
    }
    
    public static void organizatorCleanTable(JTable table){
        DefaultTableModel defaultTable = (DefaultTableModel) table.getModel();
        defaultTable.setRowCount(0);
    }
    
    public static int organizatorGetPlayOffJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("DIECISEISAVOS", 1);
        playOff.put("OCTAVOS", 2);
        playOff.put("CUARTOS", 3);
        playOff.put("SEMIFINALES", 4);
        playOff.put("FINAL", 5);
        return playOff.get(JComboBoxBecomeString(comboBox));
    }
    
    public static int organizatorGetTicketForPlayOffJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("DIECISEISAVOS", 32);
        playOff.put("OCTAVOS", 16);
        playOff.put("CUARTOS", 8);
        playOff.put("SEMIFINALES", 4);
        playOff.put("FINAL", 2);
        return playOff.get(JComboBoxBecomeString(comboBox));
    }
    
    public static int organizatorGetNumberOfGroupsJComboBox(JComboBox comboBox){
        HashMap<String, Integer> playOff = new HashMap<>();
        playOff.put("Dos grupos", 2);
        playOff.put("Tres grupos", 3);
        playOff.put("Cuatro grupos", 4);
        playOff.put("Cinco grupos", 5);
        playOff.put("Seis grupos", 6);
        return playOff.get(JComboBoxBecomeString(comboBox));
    }
 
    public static void organizatorTabbedPanelCreateTournament(JTabbedPane tabs, int option){
        switch(option){
            case 1 -> tabs.setSelectedIndex(5);
            case 2 -> tabs.setSelectedIndex(6);
            case 3 -> tabs.setSelectedIndex(7);
            default -> tabs.setSelectedIndex(0);
        }
    }
    
    public static void organizatorTabbedPanelSeeTournaments(JTabbedPane tabs, int option){
        switch(option){
            case 1 -> tabs.setSelectedIndex(10);
            case 2 -> tabs.setSelectedIndex(11);
            case 3 -> tabs.setSelectedIndex(12);
            case 4 -> tabs.setSelectedIndex(13);
            case 5 -> tabs.setSelectedIndex(14);
            case 6 -> tabs.setSelectedIndex(15);
            default -> tabs.setSelectedIndex(0);
        }
    }
    
    public static boolean booleanValidateDataEnterTournament(JTextField name, JTextField cost, JTextField participants, JComboBox playOff){
        return validateTournamentName(name) && validateTournamentCost(cost) && validateParticipantsNumber(participants);
    }
    
    public static Tournament CreateTournament(JTextField name, JTextField cost, JTextField participants, JComboBox playOff){
        List<Player> participantsList = new ArrayList<>();
        List<Group> groupsList = new ArrayList<>();
        List<Player> knockOutStage = new ArrayList<>();
        if (booleanValidateDataEnterTournament(name, cost, participants, playOff)) return new Tournament(name.getText(), cost.getText(), 0, JTextFieldBecomeInt(cost), JTextFieldBecomeInt(participants), 0, 0, 0, participantsList, groupsList, knockOutStage);
        return null;
    }
    
    public static void GetUpTournamentFromPartOne(JTabbedPane tabs, int option, JTextField name, JTextField cost, JTextField participants, JComboBox playOff){
        if (booleanValidateDataEnterTournament(name, cost, participants, playOff)) organizatorTabbedPanelCreateTournament(tabs, option); 
    }
    
    public static void organizatorSeeTournament(JTabbedPane tabs, int tournamentNumber, List<Tournament> tournamentList){
        if ((tournamentNumber) <  tournamentList.size()) 
            organizatorTabbedPanelSeeTournaments(tabs, tournamentList.get(tournamentNumber).getGroupsNumber());
    }
    
    public static void loadPlayerIntoTableGroup(JTable table, List<Player> playerList){
        DefaultTableModel group = (DefaultTableModel) table.getModel();
        for (int i = 0; i < playerList.size(); i++){
            Player player = playerList.get(i);
            Object[] cells = new Object[11];
            cells[0] = player.getName();
            cells[1] = player.getMatchesPlayed();
            cells[2] = player.getMatchesWon();
            cells[3] = player.getMatchesLost();
            cells[4] = String.format("%.2f", player.getMatchAverage());
            cells[5] = player.getSetsWon();
            cells[6] = player.getSetsLost();
            cells[7] = String.format("%.2f", player.getSetAverage());
            cells[8] = player.getGamesWon();
            cells[9] = player.getGamesLost();
            cells[10] = String.format("%.2f", player.getGameAverage());
            group.addRow(cells);
        }
    }

    public static int whichTournamentShow(int tournamentNumber, List<Tournament> tournamentList){
        if (tournamentNumber <  tournamentList.size()) return tournamentList.get(tournamentNumber).getGroupsNumber();
        return 0;    
    }
    
    public static void showTournamentName(JLabel tZero, JLabel tOne, JLabel tTwo, JLabel tThree, JLabel tFour, JLabel tFive, String tName){
        tZero.setText(tName);
        tOne.setText(tName);
        tTwo.setText(tName);
        tThree.setText(tName);
        tFour.setText(tName);
        tFive.setText(tName);
    }
    
    public static void loadTournamentTypeZero(JTable generalTable, List<Player> playerList){
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeOne(JTable tableOne, JTable tableTwo, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        organizatorCleanTable(tableOne);
        organizatorCleanTable(tableTwo);
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeTwo(JTable tableOne, JTable tableTwo, JTable tableThree, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        organizatorCleanTable(tableOne);
        organizatorCleanTable(tableTwo);
        organizatorCleanTable(tableThree);
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeThree(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        organizatorCleanTable(tableOne);
        organizatorCleanTable(tableTwo);
        organizatorCleanTable(tableThree);
        organizatorCleanTable(tableFour);
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeFour(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable tableFive, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        organizatorCleanTable(tableOne);
        organizatorCleanTable(tableTwo);
        organizatorCleanTable(tableThree);
        organizatorCleanTable(tableFour);
        organizatorCleanTable(tableFive);
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(tableFive, groupsList.get(4).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeFive(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable tableFive, JTable tableSix, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        organizatorCleanTable(tableOne);
        organizatorCleanTable(tableTwo);
        organizatorCleanTable(tableThree);
        organizatorCleanTable(tableFour);
        organizatorCleanTable(tableFive);
        organizatorCleanTable(tableSix);
        organizatorCleanTable(generalTable);
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(tableFive, groupsList.get(4).getPlayerList());
        loadPlayerIntoTableGroup(tableSix, groupsList.get(5).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }    
    
    public static String nameCharacters(String name){
        return name.length() > 9 ? name.substring(0, 9) : name;
    }
    
    public static String findDifferentName(List<Player> listPlayer, String nameSave){
        for(Player playerB : listPlayer){
            String nameB= nameCharacters(playerB.getName());
            if(!nameB.equals(nameSave)){
                return nameB;
            }
        }
        return "-";
    }
    
    public static void loadMatchesInTable(List<Match> listMatch, JTable table){      
        try{
            organizatorCleanTable(table);
            for (int i = 0; i < listMatch.size(); i++){
                System.out.println(listMatch.get(i).getResultFirstSet());
                listMatch.get(i).addMatchTableByDate(table);
            }
        } catch (NullPointerException error){
            System.out.println("ERROR: No se cargo un partido");
        }
    }
    
    public static int getNumberOfRows(JTable table){
        return table.getRowCount();
    }
    
    public static int getNumberOfColumns(JTable table){
        return table.getColumnCount();
    }
    
    public static void organizatorUpdatePlayerTable(JTable table, Tournament tour, int rowIndex){
        String playerName = table.getValueAt(rowIndex, 0).toString();
        int pj = Integer.parseInt(table.getValueAt(rowIndex, 1).toString());
        int pg = Integer.parseInt(table.getValueAt(rowIndex, 2).toString());
        int pp = Integer.parseInt(table.getValueAt(rowIndex, 3).toString());
        int sg = Integer.parseInt(table.getValueAt(rowIndex, 5).toString());
        int sp = Integer.parseInt(table.getValueAt(rowIndex, 6).toString());
        int gg = Integer.parseInt(table.getValueAt(rowIndex, 8).toString());
        int gp = Integer.parseInt(table.getValueAt(rowIndex, 9).toString());
        tour.updatePlayerGroup(playerName, pj, pg, pp, sg, sp, gg, gp);
        if (tour.getGroupsNumber() == 0) tour.updatePlayerInGroup(playerName, pj, pg, pp, sg, sp, gg, gp);
    }
    
    public static void saveDataPlayerTable(JTable table, Tournament tour){
        int rows = getNumberOfRows(table);
        for (int i = 0; i < rows; i++){
            organizatorUpdatePlayerTable(table, tour, i);
        }
    }
    
        
    public static void foundMatch(List<Match> matchList, String IdOne, String IdTwo, Match edited){
        try{
            for(Match m: matchList){
                if(m.getPlayerA().getId().equals(IdOne) && m.getPlayerA().getId().equals(IdTwo)) m = edited;
            }
            System.out.println("Patido editado con exito");
        } catch (NullPointerException error){
            System.err.println("AVISO. Lista de partidos vacia");
        }
    }
    
    public static void deleteMatch(List<Match> matchList, String IdOne, String IdTwo){
        try{
            for(Match m: matchList){
                if(m.getPlayerA().getId().equals(IdOne) && m.getPlayerA().getId().equals(IdTwo)) matchList.remove(m);
            }
            System.out.println("Patido editado con exito");
        } catch (NullPointerException error){
            System.err.println("AVISO. Lista de partidos vacia");
        }
    }
    
    
}
