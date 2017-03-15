/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lab Interfaces
 */
public class Studio {
    private List<iPlayer> players;
    
    public Studio(){
        players = new LinkedList<>();
    }
    public void addPlayer(iPlayer player){
        players.add(player);
    }
}
