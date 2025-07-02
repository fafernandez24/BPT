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
import model.Administrator;

/**
 *
 * @author Freddy A. Fernández
 */
public class AdministratorJsonControl {
    
    private final String fileLocation;
    private List<Administrator> administrators;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public AdministratorJsonControl() {
        this.fileLocation = "src/main/resources/files/json_organizators.json";
        try (FileReader reader = new FileReader(fileLocation)) {
            Type listType = new TypeToken<List<Administrator>>() {}.getType();
            this.administrators = gson.fromJson(reader, listType);
            if (this.administrators == null) {
                this.administrators = new ArrayList<>();
            }
        } catch (IOException e) {
            System.err.println("Error al cargar o parsear el archivo JSON: " + e.getMessage());
            this.administrators = new ArrayList<>();
        }
    }
    
    private boolean updateDocument() {
        try (FileWriter writer = new FileWriter(fileLocation)) {
            gson.toJson(administrators, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo JSON: " + e.getMessage());
            return false;
        }
    }

     public boolean addPerson(Person nAdministrator) {
        administrators.add((Administrator) nAdministrator);
        return updateDocument();
    }

    private Administrator searchElementById(String id) {
        for (Administrator administrator : administrators) {
            if (administrator.getId().equals(id)) {
                return administrator;
            }
        }
        return null;
    }
    
    public Administrator searchPerson(String id) {
        return searchElementById(id);
    }
    
    public boolean updatePerson(Person nAdministrator) {
        Administrator foundAdministrator = searchElementById(nAdministrator.getId());
        if (foundAdministrator != null) {
            Administrator adm = (Administrator) nAdministrator;
            foundAdministrator.setId(adm.getId());
            foundAdministrator.setName(adm.getName());
            foundAdministrator.setPassword(adm.getPassword());
            foundAdministrator.setEmail(adm.getEmail());
            foundAdministrator.setDateBirth(adm.getDateBirth());
            foundAdministrator.setPlayerList(adm.getPlayerList());
            return updateDocument();
        }
        return false;
    }

    public boolean deletePerson(String id) {
        Administrator foundAdministrator = searchElementById(id);
        if (foundAdministrator != null) {
            administrators.remove(foundAdministrator);
            return updateDocument();
        }
        return false;
    }

    public ArrayList<Administrator> allAdministrators() {
        return new ArrayList<>(administrators);
    }
    
}
