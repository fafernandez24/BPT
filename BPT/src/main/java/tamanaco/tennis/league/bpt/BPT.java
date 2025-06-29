/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tamanaco.tennis.league.bpt;

import com.formdev.flatlaf.FlatLightLaf;
import controller.AdministratorJsonControl;
import controller.OrganizatorJsonControl;
import controller.PlayerJsonControl;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Administrator;
import model.Group;
import model.Organizator;
import model.Player;
import model.Tournament;
import view.MenuStart;

/**
 *
 * @author Freddy A. Fernández
 */
public class BPT {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        // JSON 
        PlayerJsonControl jsonPlayerList = new PlayerJsonControl();
        OrganizatorJsonControl jsonOrganizatorList = new OrganizatorJsonControl();
        AdministratorJsonControl jsonAdministratorList = new AdministratorJsonControl();
        
        List<Organizator> organizatorList = jsonOrganizatorList.allOrganizators(); // Lista de organizadores
        List<Player> players = jsonPlayerList.allPlayers(); // Lista de jugadores
        List<Administrator> administratorList = jsonAdministratorList.allAdministrators(); // Lista de administradores
        
        List<Group> groups = new ArrayList<>();
        List<Player> knockOut = new ArrayList<>();
        Tournament tournament = new Tournament("Copa Libertadores","Profesional",1,1,1,1,1, 1, players, groups,knockOut);
        
        List<Tournament> tournamentList = new ArrayList<>();
        tournamentList.add(tournament);
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openStart = new MenuStart(organizatorList, players, administratorList);
        openStart.setVisible(true);
        
    }
}
