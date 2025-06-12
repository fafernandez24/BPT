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
import model.Organizator;
import model.Tournament;
import view.MenuStart;

/**
 *
 * @author Freddy A. Fernández
 */
public class BPT {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        List<Tournament> tournamentList = new ArrayList<>();
        Organizator organizator = new Organizator(tournamentList,"11032757", "Juan Freddy Fernández Da Silva", "11032757", "jfreddyf@hotmail.com", LocalDate.of(1972,04,03));
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openStart = new MenuStart();
        openStart.setVisible(true);
           
    }
}
