/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nemovelo;

import Config.ConfigGlobale;
import DAO.BorneDAO;
import DAO.CarteDAO;
import DAO.CompteDAO;
import DAO.StationDAO;
import DAO.UtilisateurDAO;
import DAO.VeloDAO;
import vue_user_borne.*;

public class NemoveloBorneUtilisateur {

    public static Fenetre fntr = new Fenetre();
    
    public static void main(String[] args) {
        
        ConfigGlobale.velos = VeloDAO.getAllVelo();
        ConfigGlobale.bornes = BorneDAO.getAllBorne();
        ConfigGlobale.stations = StationDAO.getAllStation();
        ConfigGlobale.comptes = CompteDAO.getAllCompte();
        ConfigGlobale.cartes = CarteDAO.getAllCarte();
        ConfigGlobale.utilisateurs = UtilisateurDAO.getAllUtilisateur();
        
        fntr.launch();
    }
}
