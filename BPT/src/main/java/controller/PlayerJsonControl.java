/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.google.gson.Gson;
import static com.fatboyindustrial.gsonjavatime.Converters.registerAll;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Person;
import model.Player;

/**
 *
 * @author Freddy A. Fernández
 */
public class PlayerJsonControl {
    
    private final String fileLocation;
    private List<Player> players;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public PlayerJsonControl() {
        this.fileLocation = "src/main/resources/files/json_players.json";
        try (FileReader reader = new FileReader(fileLocation)) {
            Type listType = new TypeToken<List<Player>>() {}.getType();
            this.players = gson.fromJson(reader, listType);
            if (this.players == null) {
                this.players = new ArrayList<>();
            }
        } catch (IOException e) {
            System.err.println("Error al cargar o parsear el archivo JSON: " + e.getMessage());
            this.players = new ArrayList<>();
        }
    }
    
    private boolean updateDocument() {
        try (FileWriter writer = new FileWriter(fileLocation)) {
            gson.toJson(players, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
            return false;
        }
    }

     public boolean addPerson(Person nPlayer) {
        players.add((Player) nPlayer);
        return updateDocument();
    }

    private Player searchElementById(String id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                return player;
            }
        }
        return null;
    }
    
    public Player searchPerson(String id) {
        return searchElementById(id);
    }
    
    public boolean updatePerson(Person nPlayer) {
        Player foundPlayer = searchElementById(nPlayer.getId());
        if (foundPlayer != null) {
            Player pla = (Player) nPlayer;
            foundPlayer.setId(pla.getId());
            foundPlayer.setName(pla.getName());
            foundPlayer.setPassword(pla.getPassword());
            foundPlayer.setEmail(pla.getEmail());
            foundPlayer.setDateBirth(pla.getDateBirth());
            foundPlayer.setPhoneNumber(pla.getPhoneNumber());
            foundPlayer.setCategory(pla.getCategory());
            foundPlayer.setTeamName(pla.getTeamName());
            foundPlayer.setMatchesPlayed(pla.getMatchesPlayed());   
            foundPlayer.setMatchesWon(pla.getMatchesWon());
            foundPlayer.setMatchesLost(pla.getMatchesLost());
            foundPlayer.setSetsWon(pla.getSetsWon());
            foundPlayer.setSetsLost(pla.getSetsLost());    
            foundPlayer.setGamesWon(pla.getGamesWon());
            foundPlayer.setGamesLost(pla.getGamesLost());    
            foundPlayer.setMatchAverage(pla.getMatchAverage());
            foundPlayer.setSetAverage(pla.getSetAverage());
            foundPlayer.setGameAverage(pla.getGameAverage());
            return updateDocument();
        }
        return false;
    }

    public boolean deletePerson(String id) {
        Player foundPlayer = searchElementById(id);
        if (foundPlayer != null) {
            players.remove(foundPlayer);
            return updateDocument();
        }
        return false;
    }

    public ArrayList<Player> allPlayers() {
        return new ArrayList<>(players);
    }
    
}
