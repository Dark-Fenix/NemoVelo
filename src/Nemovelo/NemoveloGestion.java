package Nemovelo;


import classes.*;
import Config.*;
import DAO.*;
import vue_admin.InterfaceAdminGestion;
import vue_admin.Interfaces;

/**
 *
 * @author Fenix
 */
public class NemoveloGestion {

    public static void main(String[] args) {
       
        ConfigGlobale.velos = VeloDAO.getAllVelo();
        ConfigGlobale.bornes = BorneDAO.getAllBorne();
        ConfigGlobale.stations = StationDAO.getAllStation();
        ConfigGlobale.comptes = CompteDAO.getAllCompte();
        ConfigGlobale.cartes = CarteDAO.getAllCarte();
        ConfigGlobale.utilisateurs = UtilisateurDAO.getAllUtilisateur();
        
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
