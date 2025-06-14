/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.List;
import model.Player;

/**
 *
 * @author Freddy A. Fernández
 */
public class MenuAdministratorControl {
    
    public static Object[][] readPlayerList(List<Player> listPlayer){
        Object playersTable[][] = new Object[listPlayer.size()][3];
        for (int i = 0; i < listPlayer.size(); i++){
            playersTable[i][0] = listPlayer.get(i).getName();
            playersTable[i][1] = listPlayer.get(i).getId();
            playersTable[i][2] = "Pendiente";
        }
        return playersTable;
    }
    
    
}
