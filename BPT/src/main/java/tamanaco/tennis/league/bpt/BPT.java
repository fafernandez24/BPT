/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tamanaco.tennis.league.bpt;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.MenuStart;

/**
 *
 * @author Freddy A. Fernández
 */
public class BPT {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        
        // Permite que la interfaz grafica se vea un poco mejor.
        UIManager.setLookAndFeel(new FlatLightLaf());
        ///////////////////////////////////////////////////////////
       
        MenuStart openOrganizator = new MenuStart();
        openOrganizator.setVisible(true);
           
    }

}
