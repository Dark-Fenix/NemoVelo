package Config;

import java.util.ArrayList;
import classes.*;
import vue_admin.Interfaces;

/**
*
* @author Fenix
*/
public class ConfigGlobale {

    public static String etatOK = "ok";
    public static String etatHS = "hs";
    public static String etatMaintenance = "maintenance";
    public static String etatOFF = "off";
    public static String typeCompteAbonnement = "abonnement";
    public static String typeCompteSolde = "solde";
    public static String regexValidationDate = "^((19|20)\\d\\d)-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    public static int longueurAdresse = 100;
    public static int longueurCodePostal = 5;
    public static int longueurChampTexteGenerique = 30;
    public static int longueurSNVelo = 10;
    public static int longueurSNBorne = 10;
    public static int longueurSNStation = 10;
    public static int longueurSNCarte = 8;
    public static int longueurCB = 16;
    public static int longueurRIB = 23;
    public static int longueurIBAN = 34;

    public static ArrayList<Utilisateur> utilisateurs;
    public static ArrayList<Compte> comptes;
    public static ArrayList<Carte> cartes;
    public static ArrayList<Station> stations;
    public static ArrayList<Borne> bornes;
    public static ArrayList<Velo> velos;
    
    public static String ApiKey = "";
    
}
