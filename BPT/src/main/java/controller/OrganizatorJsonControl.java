package controller;

import com.google.gson.Gson;
import static com.fatboyindustrial.gsonjavatime.Converters.registerAll;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import model.Person;
import model.Organizator;

public class OrganizatorJsonControl {
    
    private final String fileLocation;
    private List<Organizator> organizators;
    private final Gson gson = registerAll(new GsonBuilder()).create();

    public OrganizatorJsonControl() {
        // Para ESCRITURA: el archivo estará fuera del JAR, en el home del usuario
        String userHome = System.getProperty("user.home");
        this.fileLocation = userHome + File.separator + "BPT" + File.separator + "json_organizators.json";

        try {
            File file = new File(fileLocation);
            // Si el archivo no existe, crea una copia desde el recurso empaquetado
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                try (InputStream is = getClass().getResourceAsStream("/files/json_organizators.json")) {
                    if (is != null) {
                        Files.copy(is, file.toPath());
                    } else {
                        System.err.println("No se encontró el recurso /files/json_organizators.json en el JAR.");
                    }
                }
            }
            try (FileReader reader = new FileReader(fileLocation)) {
                Type listType = new TypeToken<List<Organizator>>() {}.getType();
                this.organizators = gson.fromJson(reader, listType);
                if (this.organizators == null) {
                    this.organizators = new ArrayList<>();
                }
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
