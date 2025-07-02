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
import model.Match;

/**
 *
 * @author Freddy A. Fernández
 */
public class MatchJsonControl {
    
    private final String fileLocation;
    private List<Match> matches;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public MatchJsonControl() {
        this.fileLocation = "src/main/resources/files/json_matches.json";
        try (FileReader reader = new FileReader(fileLocation)) {
            Type listType = new TypeToken<List<Match>>() {}.getType();
            this.matches = gson.fromJson(reader, listType);
            if (this.matches == null) {
                this.matches = new ArrayList<>();
            }
        } catch (IOException e) {
            System.err.println("Error al cargar o parsear el archivo JSON: " + e.getMessage());
            this.matches = new ArrayList<>();
        }
    }
    
    private boolean updateDocument() {
        try (FileWriter writer = new FileWriter(fileLocation)) {
            gson.toJson(matches, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
            return false;
        }
    }

     public boolean addPerson(Match nMatch) {
        matches.add((Match) nMatch);
        return updateDocument();
    }

    private Match searchElementByDate(String date) {
        for (Match match : matches) {
            if (match.getMatchDate().toString().equals(date)) {
                return match;
            }
        }
        return null;
    }
    
    public Match searchMatch(String date) {
        return searchElementByDate(date);
    }
    
    public boolean updatePerson(Match nMatch) {
        Match foundMatch = searchElementByDate(nMatch.getMatchDate().toString());
        if (foundMatch != null) {
            Match mat = (Match) nMatch;
            foundMatch.setPlayerA(mat.getPlayerA());
            foundMatch.setPlayerB(mat.getPlayerB());
            foundMatch.setWinner(mat.getWinner());
            foundMatch.setResultFirstSet(mat.getResultFirstSet());
            foundMatch.setResultSecondSet(mat.getResultSecondSet());
            foundMatch.setMatchDate(mat.getMatchDate());
            return updateDocument();
        }
        return false;
    }

    public boolean deletePerson(String id) {
        Match foundMatch = searchElementByDate(id);
        if (foundMatch != null) {
            matches.remove(foundMatch);
            return updateDocument();
        }
        return false;
    }

    public ArrayList<Match> allMatches() {
        return new ArrayList<>(matches);
    }
    
}
