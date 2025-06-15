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
        
        List<Tournament> tournamentList = new ArrayList<>();
        
        Player freddyPlayer = new Player("7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        Player juanFreddy = new Player("6ta Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "0263213594");
        Player carlosAPlayer = new Player("7ma Categoria", "Tamanaco Team", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31101453", "Carlos Eduardo Hernandez Rivas", "31101453", "eduyeli958@gmail.com", LocalDate.of(2005,9,07), "31101453");
        Player pedroPlayer = new Player("7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31703150", "Pedro Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "04241540989");
        
        List<Player> playerList = new ArrayList<>();
        playerList.add(freddyPlayer);
        playerList.add(juanFreddy);
        playerList.add(carlosAPlayer);
        playerList.add(pedroPlayer);
        
        Organizator organizator = new Organizator(tournamentList, playerList, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "0263213594");
        Organizator freddyOrganizator = new Organizator(tournamentList, playerList, "31101453", "Carlos Eduardo Hernandez Rivas", "Messi48", "eduyeli958@gmail.com", LocalDate.of(2005,04,06), "31101453");
        
        List<Organizator> organizatorList = new ArrayList<>();
        organizatorList.add(organizator);
        organizatorList.add(freddyOrganizator);
        
        Administrator administrator = new Administrator(playerList,"11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03), "11032757");
        Administrator freddyAdministrator = new Administrator(playerList,"31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06), "11032757");
        Administrator carlosAdministrator = new Administrator(playerList,"31101453", "Carlos Eduardo Hernandez Rivas", "Messi48", "eduyeli958@gmail.com", LocalDate.of(2005,12,01), "31101453");

        
        List<Administrator> administratorList = new ArrayList<>();
        administratorList.add(administrator);
        administratorList.add(freddyAdministrator);
        administratorList.add(carlosAdministrator);
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openStart = new MenuStart(organizatorList, playerList, administratorList);
        openStart.setVisible(true);
        
    }
}
