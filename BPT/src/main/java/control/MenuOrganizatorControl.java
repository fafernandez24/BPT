/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import static control.TypeBecomeType.JComboBoxBecomeString;
import static control.TypeBecomeType.JTextFieldBecomeInt;
import static control.ValidationControl.validateParticipantsNumber;
import static control.ValidationControl.validateTournamentCost;
import static control.ValidationControl.validateTournamentName;
import static control.ValidationControl.validateTournamentPlayOff;
import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Group;
import model.Player;
import model.Tournament;

/**
 *
 * @author Freddy
 */
public class MenuOrganizatorControl {
   
    public static void organizatorFocusGained(JTextField dataEnter, String message){
        if (dataEnter.getText().equals(message)) dataEnter.setText("");
    }
    
    public static void organizatorFocusGained(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.equals(message)) dataEnter.setText("");
    }
    
    public static void organizatorFocusLost(JTextField dataEnter, String message){
        String id = dataEnter.getText();
        if (id.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void organizatorFocusLost(JPasswordField dataEnter, String message){
        String password = new String(dataEnter.getPassword());
        if (password.trim().isEmpty()) dataEnter.setText(message);
    }
    
    public static void changeButtonColor(JButton button, int r, int g, int b){
        button.setBackground(new Color(r,g,b));
    }
    
    public static void organizatorShowPlayerInformation(JTextField nameField, JTextField phoneField, JTextField dateBirthField, JTextField idField, JTextField email, JTextField categoryField, JTextField teamField, JTextField mathPlayedField, JTextField matchesWonField, Player player){
        nameField.setText(player.getName());
        phoneField.setText(player.getPhoneNumber());
        dateBirthField.setText(player.getDateBirth().toString());
        idField.setText(player.getId());
        email.setText(player.getEmail());
        categoryField.setText(player.getCategory());
        teamField.setText(player.getTeamName());
        mathPlayedField.setText(String.valueOf(player.getMatchesPlayed()));
        matchesWonField.setText(String.valueOf(player.getMatchesWon()));
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
        return validateTournamentName(name) && validateTournamentCost(cost) && validateParticipantsNumber(participants) && validateTournamentPlayOff(organizatorGetPlayOffJComboBox(playOff), JTextFieldBecomeInt(participants));
    }
    
    public static Tournament CreateTournament(JTextField name, JTextField cost, JTextField participants, JComboBox playOff){
        if (booleanValidateDataEnterTournament(name, cost, participants, playOff)) return new Tournament(name.getText(), cost.getText(), JTextFieldBecomeInt(cost), JTextFieldBecomeInt(participants));
        return null;
    }
    
    public static void GetUpTournamentFromPartOne(JTabbedPane tabs, int option, JTextField name, JTextField cost, JTextField participants, JComboBox playOff){
        if (booleanValidateDataEnterTournament(name, cost, participants, playOff)) organizatorTabbedPanelCreateTournament(tabs, option); 
    }
    
    public static void organizatorSeeTournament(JTabbedPane tabs, int tournamentNumber, List<Tournament> tournamentList){
        if ((tournamentNumber) <  tournamentList.size()) organizatorTabbedPanelSeeTournaments(tabs, tournamentList.get(tournamentNumber).getGroupsNumber());
    }
    
    public static void loadPlayerIntoTableGroup(JTable table, List<Player> playerList){
        DefaultTableModel group = (DefaultTableModel) table.getModel();
        Object[] cells = new Object[11];
            for (int i = 0; i < playerList.size(); i++){
            cells[0] = playerList.get(i).getName();
            cells[1] = playerList.get(i).getMatchesPlayed();
            cells[2] = playerList.get(i).getMatchesWon();
            cells[3] = playerList.get(i).getMatchesLost();
            cells[4] = playerList.get(i).getMatchAverage();
            cells[5] = playerList.get(i).getSetsWon();
            cells[6] = playerList.get(i).getSetsLost();
            cells[7] = playerList.get(i).getSetAverage();
            cells[8] = playerList.get(i).getGamesWon();
            cells[9] = playerList.get(i).getGamesLost();
            cells[10] = playerList.get(i).getGameAverage();
            group.addRow(cells);
        }
    }

    public static int whichTournamentShow(int tournamentNumber, List<Tournament> tournamentList){
        if (tournamentNumber <  tournamentList.size()) return tournamentList.get(tournamentNumber).getGroupsNumber();
        return 0;    
    }
    
    public static void loadTournamentTypeZero(JTable generalTable, List<Player> playerList){
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeOne(JTable tableOne, JTable tableTwo, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeTwo(JTable tableOne, JTable tableTwo, JTable tableThree, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeThree(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeFour(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable tableFive, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(tableFive, groupsList.get(4).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static void loadTournamentTypeFive(JTable tableOne, JTable tableTwo, JTable tableThree, JTable tableFour, JTable tableFive, JTable tableSix, JTable generalTable, List<Player> playerList, List<Group> groupsList){
        loadPlayerIntoTableGroup(tableOne, groupsList.get(0).getPlayerList());
        loadPlayerIntoTableGroup(tableTwo, groupsList.get(1).getPlayerList());
        loadPlayerIntoTableGroup(tableThree, groupsList.get(2).getPlayerList());
        loadPlayerIntoTableGroup(tableFour, groupsList.get(3).getPlayerList());
        loadPlayerIntoTableGroup(tableFive, groupsList.get(4).getPlayerList());
        loadPlayerIntoTableGroup(tableSix, groupsList.get(5).getPlayerList());
        loadPlayerIntoTableGroup(generalTable, playerList);    
    }
    
    public static Object[][] readPlayerListTournament(List<Player> listPlayer){
        HashSet<String> playersNames= new HashSet<>();
        int n= listPlayer.size();  
        Object playersTable[][]= new Object[n][3];
        int index= 0;
        for(Player playerA : listPlayer){
            String nameA= nameCharacters(playerA.getName());
            if(playersNames.add(nameA)){
                String nameB= findDifferentName(listPlayer, nameA);
                playersTable[index][0]= nameA;
                playersTable[index][1]= nameB;
                playersTable[index][2]= "07/02/2005";
                index++;
            }
        }
        return playersTable;
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
    
}
