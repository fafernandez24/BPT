/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tamanaco.tennis.league.bpt;

import com.formdev.flatlaf.FlatLightLaf;
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
        
        Player freddyPlayer = new Player("7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        Player juanFreddy = new Player("6ta Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "0263213594");
        Player carlosAPlayer = new Player("7ma Categoria", "Tamanaco Team", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31307188", "Carlos Enrique Pinto Abreu", "carlospinto2005", "carlosepintoa01@gmail.com", LocalDate.of(2005,12,01), "11032757");
        Player pedroPlayer = new Player("7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31703150", "Pedro Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        Player carlitosPlayer = new Player("7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31101453", "Carlos Alejandro Fernández Tovar", "Messi48", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        
        
        
        List<Player> players = new ArrayList<>();
        players.add(juanFreddy);
        players.add(freddyPlayer);
        players.add(carlosAPlayer);
        players.add(pedroPlayer);
        players.add(carlitosPlayer);
        
        List<Group> groups = new ArrayList<>();
        
        List<Player> knockOut = new ArrayList<>();

        Tournament tournament = new Tournament("Copa Libertadores","Profesional",1,1,1,1,1, 1, players, groups,knockOut);
        
        List<Tournament> tournamentList = new ArrayList<>();
        tournamentList.add(tournament);
        

        
        Organizator organizator = new Organizator(tournamentList, players, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "0263213594");
        Organizator freddyOrganizator = new Organizator(tournamentList, players, "31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        Organizator CarlosOrganizator = new Organizator(tournamentList, players, "31101453", "Carlos Eduardo Hernandez Rivas", "Messi48", "eduyeli958@gmail.com", LocalDate.of(2005,04,06), "31101453");
        
        
        List<Organizator> organizatorList = new ArrayList<>();
        organizatorList.add(organizator);
        organizatorList.add(freddyOrganizator);
        organizatorList.add(CarlosOrganizator);
        
        Administrator administrator = new Administrator(players,"11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "11032757");
        Administrator freddyAdministrator = new Administrator(players,"31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "11032757");
        Administrator carlosAdministrator = new Administrator(players,"31307188", "Carlos Enrique Pinto Abreu", "carlospinto2005", "carlosepintoa01@gmail.com", LocalDate.of(2005,12,01), "11032757");
        Administrator CarlosAdministrator = new Administrator(players,"31101453", "Carlos Eduardo Hernandez Rivas", "Messi48", "eduyeli958@gmail.com", LocalDate.of(2005,12,01), "31101453");

        
        List<Administrator> administratorList = new ArrayList<>();
        administratorList.add(administrator);
        administratorList.add(freddyAdministrator);
        administratorList.add(carlosAdministrator);
        administratorList.add(CarlosAdministrator);
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openStart = new MenuStart(organizatorList, players, administratorList);
        openStart.setVisible(true);
        
    }
}
