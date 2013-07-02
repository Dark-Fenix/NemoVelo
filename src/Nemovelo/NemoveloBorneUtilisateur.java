package Nemovelo;

import Config.ConfigGlobale;
import vue_user_borne.*;

/**
*
* @author Aurelie
*/
public class NemoveloBorneUtilisateur {

    public static Fenetre fntr = new Fenetre();
    
    /**
     * Lancement de l'interface de la borne utilisateur
     * @param args
     */
    public static void main(String[] args) {
        
        // Initialisation des listes d'objets métiers
        ConfigGlobale.InitialisationListesObjets();
        
        // Lancement de l'interface
        fntr.launch();
    }
}
