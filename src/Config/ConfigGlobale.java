package Config;

import DAO.*;
import java.util.ArrayList;
import classes.*;

/**
*
* @author Fenix
*/
public class ConfigGlobale {

    // Définition des chaînes de caractères génériques
    public static String etatOK = "ok";
    public static String etatHS = "hs";
    public static String etatMaintenance = "maintenance";
    public static String etatOFF = "off";
    public static String typeCompteAbonnement = "abonnement";
    public static String typeCompteSolde = "solde";
    // THE superbe regexp of the dead !!!
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

    // Définition des listes d'objets métiers
    public static ArrayList<Utilisateur> utilisateurs = null;
    public static ArrayList<Compte> comptes = null;
    public static ArrayList<Carte> cartes = null;
    public static ArrayList<Station> stations = null;
    public static ArrayList<Borne> bornes = null;
    public static ArrayList<Velo> velos = null;
    
    // Définition de la clé pour l'API Google Map
    public static String ApiKey = "";
    
    /**
     * Initialisation des listes d'objets métiers si nulles
     */
    public static void InitialisationListesObjets(){
        
        if(velos == null){
            velos = VeloDAO.getAllVelo();
        }
        if(bornes == null){
            bornes = BorneDAO.getAllBorne();
        }
        if(stations == null){
            stations = StationDAO.getAllStation();
        }
        if(comptes == null){
            comptes = CompteDAO.getAllCompte();
        }
        if(cartes == null){
            cartes = CarteDAO.getAllCarte();
        }
        if(utilisateurs == null){
            utilisateurs = UtilisateurDAO.getAllUtilisateur();
        }
        
    }
    
}
