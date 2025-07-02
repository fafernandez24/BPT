/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Freddy
 */
public class Administrator extends Person {
    
    // Attributes
    
    private List<Player> playerList;
    private List<Tournament> tournamentList;
    
    // Methods

    // Constructor #1
    public Administrator(){}
    
    // Constructor #2
    public Administrator(List<Player> playerList, String id, String name, String password, String email, LocalDate dateBirth, String phoneNumber, List<Tournament> tournamentList) {
        super(id, name, password, email, dateBirth, phoneNumber);
        this.playerList = playerList;
        this.tournamentList = tournamentList;
    }
    
        
    // Getter Methods

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Tournament> getTournamentList() {
        return tournamentList;
    }
    
    // Setter Methods

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public void setTournamentList(List<Tournament> tournamentList) {
        this.tournamentList = tournamentList;
    }
    
    // Validation Methods
    
    public boolean validateAdministratorEmail(){
        return true;
    }
    
    Random random = new Random();
    
    public Object[][] readPlayerList(){
        Object playersTable[][] = new Object[playerList.size()][3];
        for (int i = 0; i < playerList.size(); i++){
            int numeroEnRango = random.nextInt(2); // Genera entre 0 y 99
            playersTable[i][0] = playerList.get(i).getName();
            playersTable[i][1] = playerList.get(i).getId();
            if(numeroEnRango ==  0) playersTable[i][2] = "Pendiente";
            if(numeroEnRango ==  1) playersTable[i][2] = "Abonado";
            if(numeroEnRango ==  2) playersTable[i][2] = "Al dia";
        }
        return playersTable;
    }
    
}
