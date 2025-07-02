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
import model.Organizator;

/**
 *
 * @author Freddy A. Fernández
 */
public class OrganizatorJsonControl {
    
    private final String fileLocation;
    private List<Organizator> organizators;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public OrganizatorJsonControl() {
        this.fileLocation = "src/main/resources/files/json_organizators.json";
        try (FileReader reader = new FileReader(fileLocation)) {
            Type listType = new TypeToken<List<Organizator>>() {}.getType();
            this.organizators = gson.fromJson(reader, listType);
            if (this.organizators == null) {
                this.organizators = new ArrayList<>();
            }
        } catch (IOException e) {
            System.err.println("Error al cargar o parsear el archivo JSON: " + e.getMessage());
            this.organizators = new ArrayList<>();
        }
    }
    
    private boolean updateDocument() {
        try (FileWriter writer = new FileWriter(fileLocation)) {
            gson.toJson(organizators, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
            return false;
        }
    }

     public boolean addPerson(Person nOrganizator) {
        organizators.add((Organizator) nOrganizator);
        return updateDocument();
    }

    private Organizator searchElementById(String id) {
        for (Organizator organizator : organizators) {
            if (organizator.getId().equals(id)) {
                return organizator;
            }
        }
        return null;
    }
    
    public Organizator searchPerson(String id) {
        return searchElementById(id);
    }
    
    public boolean updatePerson(Person nOrganizator) {
        Organizator foundOrganizator = searchElementById(nOrganizator.getId());
        if (foundOrganizator != null) {
            Organizator org = (Organizator) nOrganizator;
            foundOrganizator.setId(org.getId());
            foundOrganizator.setName(org.getName());
            foundOrganizator.setPassword(org.getPassword());
            foundOrganizator.setEmail(org.getEmail());
            foundOrganizator.setDateBirth(org.getDateBirth());
            foundOrganizator.setPlayerList(org.getPlayerList());
            foundOrganizator.setTournamentList(org.getTournamentList());
            return updateDocument();
        }
        return false;
    }

    public boolean deletePerson(String id) {
        Organizator foundOrganizator = searchElementById(id);
        if (foundOrganizator != null) {
            organizators.remove(foundOrganizator);
            return updateDocument();
        }
        return false;
    }

    public ArrayList<Organizator> allOrganizators() {
        return new ArrayList<>(organizators);
    }
    
}
