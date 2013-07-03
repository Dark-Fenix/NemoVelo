/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Config.ConfigGlobale;
import classes.*;

/**
 *
 * @author Fenix
 */
public class Mapper {
    
    /**
     * Supprime la borne dans les ArrayList du modèle et dans la DB
     * @param borne
     */
    public static void supprimerBorne(Borne borne){
        BorneDAO.deleteBorne(borne);
        ConfigGlobale.bornes.remove(borne);
    }
    
    /**
     * Met à jour la borne dans les ArrayList du modèle et dans la DB
     * @param borne
     */
    public static void modifierBorne(Borne borne){
        BorneDAO.updateBorne(borne);
    }
    
    /**
     * Ajoute la borne dans les ArrayList du modèle et dans la DB
     * @param borne
     */
    public static void ajouterBorne(Borne borne){
        BorneDAO.insertBorne(borne);
        ConfigGlobale.bornes.add(borne);
    }
    
    /**
     * Supprime la carte dans les ArrayList du modèle et dans la DB
     * @param carte
     */
    public static void supprimerCarte(Carte carte){
        CarteDAO.deleteCarte(carte);
        ConfigGlobale.cartes.remove(carte);
    }
    
    /**
     * Met à jour la carte dans les ArrayList du modèle et dans la DB
     * @param carte
     */
    public static void modifierCarte(Carte carte){
        CarteDAO.updateCarte(carte);
    }
    
    /**
     * Ajoute la carte dans les ArrayList du modèle et dans la DB
     * @param carte
     */
    public static void ajouterCarte(Carte carte){
        CarteDAO.insertCarte(carte);
        ConfigGlobale.cartes.add(carte);
    }
    
    /**
     * Supprime la station dans les ArrayList du modèle et dans la DB
     * @param station
     */
    public static void supprimerStation(Station station){
        StationDAO.deleteStation(station);
        ConfigGlobale.stations.remove(station);
    }
    
    /**
     * Met à jour la station dans les ArrayList du modèle et dans la DB
     * @param station
     */
    public static void modifierStation(Station station){
        StationDAO.updateStation(station);
    }
    
    /**
     * Ajoute la station dans les ArrayList du modèle et dans la DB
     * @param station
     */
    public static void ajouterStation(Station station){
        StationDAO.insertStation(station);
        ConfigGlobale.stations.add(station);
    }
    
    /**
     * Supprime le compte dans les ArrayList du modèle et dans la DB
     * @param compte
     */
    public static void supprimerCompte(Compte compte){
        CompteDAO.deleteCompte(compte);
        ConfigGlobale.comptes.remove(compte);
    }
    
    /**
     * Met à jour le compte dans les ArrayList du modèle et dans la DB
     * @param compte
     */
    public static void modifierCompte(Compte compte){
        CompteDAO.updateCompte(compte);
    }
    
    /**
     * Ajoute le compte dans les ArrayList du modèle et dans la DB
     * @param compte
     */
    public static void ajouterCompte(Compte compte){
        CompteDAO.insertCompte(compte);
        ConfigGlobale.comptes.add(compte);
    }
    
    /**
     * Supprime l'utilisateur dans les ArrayList du modèle et dans la DB
     * @param utilisateur
     */
    public static void supprimerUtilisateur(Utilisateur utilisateur){
        UtilisateurDAO.deleteUtilisateur(utilisateur);
        ConfigGlobale.utilisateurs.remove(utilisateur);
    }
    
    /**
     * Met à jour l'utilisateur dans les ArrayList du modèle et dans la DB
     * @param utilisateur
     */
    public static void modifierUtilisateur(Utilisateur utilisateur){
        UtilisateurDAO.updateUtilisateur(utilisateur);
    }
    
    /**
     * Ajoute l'utilisateur dans les ArrayList du modèle et dans la DB
     * @param utilisateur
     */
    public static void ajouterUtilisateur(Utilisateur utilisateur){
        UtilisateurDAO.insertUtilisateur(utilisateur);
        ConfigGlobale.utilisateurs.add(utilisateur);
    }
    
    /**
     * Supprime le vélo dans les ArrayList du modèle et dans la DB
     * @param velo
     */
    public static void supprimerVelo(Velo velo){
        VeloDAO.deleteVelo(velo);
        ConfigGlobale.velos.remove(velo);
    }
    
    /**
     * Met à jour le vélo dans les ArrayList du modèle et dans la DB
     * @param velo
     */
    public static void modifierVelo(Velo velo){
        VeloDAO.updateVelo(velo);
    }
    
    /**
     * Ajoute le vélo dans les ArrayList du modèle et dans la DB
     * @param velo
     */
    public static void ajouterVelo(Velo velo){
        VeloDAO.insertVelo(velo);
        ConfigGlobale.velos.add(velo);
    }
    
}
