package Nemovelo;


import classes.*;
import Config.*;
import DAO.*;
import vue_admin.InterfaceAdminGestion;

/**
 *
 * @author Fenix
 */

public class Nemovelo {

    
// SERT POUR LES TESTS
    public static void main(String[] args) {
        
        //ConnexionDB.getInstance();
        //ConnexionDB.getConnexion().toString();
        
        ConfigGlobale.utilisateurs.add(new Utilisateur());
        ConfigGlobale.bornes.add(new Borne(0, null, null, 0));
        ConfigGlobale.stations.add(new Station(0, null, null, "43.8217403", "4.3684387"));
        ConfigGlobale.cartes.add(new Carte(0));
        ConfigGlobale.comptes.add(new Compte());
        ConfigGlobale.velos.add(new Velo(0, null, null, 0, null, 0));
        ConfigGlobale.velos.add(new Velo(1, null, null, 10, null, 0));
        

        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdminGestion().setVisible(true);
            }
        });
        
    }
}
