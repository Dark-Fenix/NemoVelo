

import classes.*;

/**
 *
 * @author Fenix
 */
public class Main {


    public static void main(String[] args) {

        Borne testBorne = new Borne();
        System.out.println(testBorne.toString());
        Carte testCarte = new Carte();
        System.out.println(testCarte.toString());
        Compte testCompte = new Compte();
        System.out.println(testCompte.toString());
        Station testStation = new Station();
        System.out.println(testStation.toString());
        Utilisateur testUtilisateur = new Utilisateur();
        System.out.println(testUtilisateur.toString());
        System.out.println(testUtilisateur.toStringSecret());
        Velo testVelo = new Velo();
        System.out.println(testVelo.toString());
        
    }
}
