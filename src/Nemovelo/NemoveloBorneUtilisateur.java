/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nemovelo;

import Config.ConfigGlobale;
import vue_user_borne.*;

public class NemoveloBorneUtilisateur {

    public static ControleurStation fntr = new ControleurStation();
    
    public static void main(String[] args) {
        
        // Initialisation des listes d'objets métiers
        ConfigGlobale.InitialisationListesObjets();
        
        fntr.launch();
    }
}
