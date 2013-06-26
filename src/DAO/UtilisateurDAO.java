/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Utilisateur;
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
public class UtilisateurDAO {

    public static ArrayList<Utilisateur> getAllUtilisateur() {

        Statement stat;
        ArrayList<Utilisateur> utilisateurs = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from utilisateur");
            Utilisateur utilisateur;
            int id_utilisateur, fk_id_carte, fk_id_velo;
            String prenom, nom, dateNaissance, adresse, codePostal, ville, carteBancaire, dateValiditeCarteBancaire, rib, iban, dateCreation, login, password;
            while (res.next()) {
                id_utilisateur = res.getInt("id_utilisateur");
                prenom = res.getString("prenom");
                nom = res.getString("nom");
                dateNaissance = res.getString("dateNaissance");
                adresse = res.getString("adresse");
                codePostal = res.getString("codePostal");
                ville = res.getString("ville");
                carteBancaire = res.getString("carteBancaire");
                dateValiditeCarteBancaire = res.getString("dateValiditeCarteBancaire");
                rib = res.getString("rib");
                iban = res.getString("iban");
                dateCreation = res.getString("dateCreation");
                login = res.getString("login");
                password = res.getString("password");
                fk_id_carte = res.getInt("fk_id_carte");
                fk_id_velo = res.getInt("fk_id_velo");
                utilisateur = new Utilisateur(id_utilisateur, prenom, nom, dateNaissance, adresse, codePostal, ville, carteBancaire, dateValiditeCarteBancaire, rib, iban, dateCreation, login, password, fk_id_carte, fk_id_velo);
                utilisateurs.add(utilisateur);
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
        return utilisateurs;

    }

    public static Utilisateur getUtilisateurById(int id_utilisateur) {

        Utilisateur utilisateur = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from utilisateur where id_utilisateur="+ id_utilisateur);
            int fk_id_carte, fk_id_velo;
            String prenom, nom, dateNaissance, adresse, codePostal, ville, carteBancaire, dateValiditeCarteBancaire, rib, iban, dateCreation, login, password;
            if (res.next()) {
                id_utilisateur = res.getInt("id_utilisateur");
                prenom = res.getString("prenom");
                nom = res.getString("nom");
                dateNaissance = res.getString("dateNaissance");
                adresse = res.getString("adresse");
                codePostal = res.getString("codePostal");
                ville = res.getString("ville");
                carteBancaire = res.getString("carteBancaire");
                dateValiditeCarteBancaire = res.getString("dateValiditeCarteBancaire");
                rib = res.getString("rib");
                iban = res.getString("iban");
                dateCreation = res.getString("dateCreation");
                login = res.getString("login");
                password = res.getString("password");
                fk_id_carte = res.getInt("fk_id_carte");
                fk_id_velo = res.getInt("fk_id_velo");
                utilisateur = new Utilisateur(id_utilisateur, prenom, nom, dateNaissance, adresse, codePostal, ville, carteBancaire, dateValiditeCarteBancaire, rib, iban, dateCreation, login, password, fk_id_carte, fk_id_velo);
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
        return utilisateur;
                
    }
	

    public static void updateUtilisateur(Utilisateur utilisateur) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from utilisateur where id_utilisateur=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, utilisateur.getId_utilisateur());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("prenom", utilisateur.getPrenom());
                res.updateString("nom", utilisateur.getNom());
                res.updateString("dateNaissance", utilisateur.getDateNaissance());
                res.updateString("adresse", utilisateur.getAdresse());
                res.updateString("codePostal", utilisateur.getCodePostal());
                res.updateString("ville", utilisateur.getVille());
                res.updateString("carteBancaire", utilisateur.getCarteBancaire());
                res.updateString("dateValiditeCarteBancaire", utilisateur.getDateValiditeCarteBancaire());
                res.updateString("rib", utilisateur.getRib());
                res.updateString("iban", utilisateur.getIban());
                res.updateString("dateCreation", utilisateur.getDateCreation());
                res.updateString("login", utilisateur.getLogin());
                res.updateString("password", utilisateur.getPassword());
                res.updateInt("fk_id_carte", utilisateur.getFk_id_carte());
                res.updateInt("fk_id_velo", utilisateur.getFk_id_velo());
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

    public static void deleteUtilisateur(Utilisateur utilisateur) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from utilisateur where id_utilisateur="+ utilisateur.getId_utilisateur());
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

    public static void insertUtilisateur(Utilisateur utilisateur) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into utilisateur (prenom, nom, dateNaissance, adresse, codePostal, ville, carteBancaire, dateValiditeCarteBancaire, rib, iban, dateCreation, login, password, fk_id_carte, fk_id_velo) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stat.setString(1, utilisateur.getPrenom());
            stat.setString(2, utilisateur.getNom());
            stat.setString(3, utilisateur.getDateNaissance());
            stat.setString(4, utilisateur.getAdresse());
            stat.setString(5, utilisateur.getCodePostal());
            stat.setString(6, utilisateur.getVille());
            stat.setString(7, utilisateur.getCarteBancaire());
            stat.setString(8, utilisateur.getDateValiditeCarteBancaire());
            stat.setString(9, utilisateur.getRib());
            stat.setString(10, utilisateur.getIban());
            stat.setString(11, utilisateur.getDateCreation());
            stat.setString(12, utilisateur.getLogin());
            stat.setString(13, utilisateur.getPassword());
            stat.setInt(14, utilisateur.getFk_id_carte());
            stat.setInt(15, utilisateur.getFk_id_velo());
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
