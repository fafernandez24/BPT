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
        
        Player freddyPlayer = new Player("04241540989", "7ma Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06));
        Player juanFreddy = new Player("0263213594", "6ta Categoria", "Centro Portugues", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03));
        
        List<Player> playerList = new ArrayList<>();
        playerList.add(freddyPlayer);
        playerList.add(juanFreddy);
        
        Organizator organizator = new Organizator(tournamentList, playerList, "11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03));
        Organizator freddyOrganizator = new Organizator(tournamentList, playerList, "31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06));
        
        List<Organizator> organizatorList = new ArrayList<>();
        organizatorList.add(organizator);
        organizatorList.add(freddyOrganizator);
        
        Administrator administrator = new Administrator(playerList,"11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03));
        Administrator freddyAdministrator = new Administrator(playerList,"31703150", "Freddy Alejandro Fernández Tovar", "0406", "freddyf2030@gmail.com", LocalDate.of(2005,04,06));
        
        List<Administrator> administratorList = new ArrayList<>();
        administratorList.add(administrator);
        administratorList.add(freddyAdministrator);
        
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openStart = new MenuStart(organizatorList, playerList, administratorList);
        openStart.setVisible(true);
        
           
    }
}
