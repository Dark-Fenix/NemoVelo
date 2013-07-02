/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Compte;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fenix
 */
public class CompteDAO {

    /**
     * Retourne tous les comptes de la DB
     * @return ArrayList<Compte>
     */
    public static ArrayList<Compte> getAllCompte() {

        Statement stat;
        ArrayList<Compte> comptes = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from compte");
            Compte compte;
            int id_compte, fk_id_utilisateur;
            double solde;
            String typeCompte, dateCreation;
            while (res.next()) {
                id_compte = res.getInt("id_compte");
                typeCompte = res.getString("typeCompte");
                solde = res.getDouble("solde");
                dateCreation = res.getString("dateCreation");
                fk_id_utilisateur = res.getInt("fk_id_utilisateur");
                compte = new Compte(id_compte, typeCompte, solde, dateCreation, fk_id_utilisateur);
                comptes.add(compte);
            }
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
                System.out.println(e.getSQLState());
                e.printStackTrace();
                e = e.getNextException();
            }
        }
        return comptes;

    }

    /**
     * Retourne un compte de la DB en fonction de son ID
     * @param id_compte
     * @return Compte
     */
    public static Compte getCompteById(int id_compte) {

        Compte compte = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from compte where id_compte="+ id_compte);
            int fk_id_utilisateur;
            double solde;
            String typeCompte, dateCreation;
            if (res.next()) {
                id_compte = res.getInt("id_compte");
                typeCompte = res.getString("typeCompte");
                solde = res.getDouble("solde");
                dateCreation = res.getString("dateCreation");
                fk_id_utilisateur = res.getInt("fk_id_utilisateur");
                compte = new Compte(id_compte, typeCompte, solde, dateCreation, fk_id_utilisateur);
            }
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
                System.out.println(e.getSQLState());
                e.printStackTrace();
                e = e.getNextException();
            }
        }
        return compte;
                
    }
	

    /**
     * Met à jour un compte dans la DB
     * @param compte
     */
    public static void updateCompte(Compte compte) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from compte where id_compte=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, compte.getId_compte());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("typeCompte", compte.getTypeCompte());
                res.updateDouble("solde", compte.getSolde());
                res.updateString("dateCreation", compte.getDateCreation());
                res.updateInt("fk_id_utilisateur", compte.getFk_id_utilisateur());
                res.updateRow();	
            }
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
                System.out.println(e.getSQLState());
                e.printStackTrace();
                e = e.getNextException();
            }
        }

    }

    /**
     * Supprime un compte dans la DB
     * @param compte
     */
    public static void deleteCompte(Compte compte) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from compte where id_compte="+ compte.getId_compte());
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
                System.out.println(e.getSQLState());
                e.printStackTrace();
                e = e.getNextException();
            }
        }
        
    }

    /**
     * Insère un compte dans la DB
     * @param compte
     */
    public static void insertCompte(Compte compte) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into compte (typeCompte, solde, dateCreation, fk_id_utilisateur) values (?,?,?,?)");
            stat.setString(1, compte.getTypeCompte());
            stat.setDouble(2, compte.getSolde());
            stat.setString(3, compte.getDateCreation());
            stat.setInt(4, compte.getFk_id_utilisateur());			
            stat.executeUpdate();
        } catch (SQLException e) {
            while (e != null) {
                System.out.println(e.getErrorCode());
                System.out.println(e.getMessage());
                System.out.println(e.getSQLState());
                e.printStackTrace();
                e = e.getNextException();
            }
        }
        
    }
    
}
