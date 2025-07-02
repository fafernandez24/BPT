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
import model.Tournament;

/**
 *
 * @author Freddy A. Fernández
 */
public class TournamentJsonControl {
    
    private final String fileLocation;
    private List<Tournament> tournaments;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public TournamentJsonControl() {
        this.fileLocation = "src/main/resources/files/json_tournaments.json";
        try (FileReader reader = new FileReader(fileLocation)) {
            Type listType = new TypeToken<List<Tournament>>() {}.getType();
            this.tournaments = gson.fromJson(reader, listType);
            if (this.tournaments == null) {
                this.tournaments = new ArrayList<>();
            }
        } catch (IOException e) {
            System.err.println("Error al cargar o parsear el archivo JSON: " + e.getMessage());
            this.tournaments = new ArrayList<>();
        }
    }
    
    private boolean updateDocument() {
        try (FileWriter writer = new FileWriter(fileLocation)) {
            gson.toJson(tournaments, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
            return false;
        }
    }

     public boolean addTournament(Tournament nTournament) {
        tournaments.add((Tournament) nTournament);
        return updateDocument();
    }

    private Tournament searchElementByTournamentName(String tournamentName) {
        for (Tournament tournament : tournaments) {
            if (tournament.getTournamentName().equals(tournamentName)) {
                return tournament;
            }
        }
        return null;
    }
    
    public Tournament searchTournament(String tournamentName) {
        return searchElementByTournamentName(tournamentName);
    }
    
    public boolean updatePerson(Tournament nTournament) {
        Tournament foundTournament = searchElementByTournamentName(nTournament.getTournamentName());
        if (foundTournament != null) {
            Tournament tour = (Tournament) nTournament;
            foundTournament.setTournamentName(tour.getTournamentName());
            foundTournament.setTournamentCategory(tour.getTournamentCategory());
            foundTournament.setTournamentCost(tour.getTournamentCost());
            foundTournament.setParticipantsNumber(tour.getParticipantsNumber());
            foundTournament.setGroupsNumber(tour.getGroupsNumber());
            foundTournament.setMatchsNumber(tour.getMatchsNumber());
            foundTournament.setTicketPlayOff(tour.getTicketPlayOff());
            foundTournament.setParticipantsList(tour.getParticipantsList());
            foundTournament.setGroupsList(tour.getGroupsList());
            foundTournament.setKnockOutStage(tour.getKnockOutStage());
            return updateDocument();
        }
        return false;
    }

    public boolean deleteTournament(String id) {
        Tournament foundAdministrator = searchElementByTournamentName(id);
        if (foundAdministrator != null) {
            tournaments.remove(foundAdministrator);
            return updateDocument();
        }
        return false;
    }

    public ArrayList<Tournament> allTournaments() {
        return new ArrayList<>(tournaments);
    }
    
}
