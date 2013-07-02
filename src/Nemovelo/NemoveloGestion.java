package Nemovelo;

import Config.*;
import vue_admin.Interfaces;

/**
 *
 * @author Fenix
 */
public class NemoveloGestion {

    /**
     * Lancement de l'interface de gestion
     * @param args
     */
    public static void main(String[] args) {
       
        // Initialisation des listes d'objets métiers
        ConfigGlobale.InitialisationListesObjets();
        
        // Lancement de l'interface
        Interfaces.getInterAdminGestion().setVisible(true);
        
    }
}
