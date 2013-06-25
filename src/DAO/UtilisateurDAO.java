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

    /*public static Velo getVeloById(int idAgent) {

        /*Velo agent = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from AgentMaintenance where idAgent="+ idAgent);
            String nom, prenom, lieuDeNaissance;
            Date dateDeNaissance;
            if (res.next()) {
                idAgent = res.getInt("idAgent");
                nom = res.getString("nom");
                prenom = res.getString("prenom");
                dateDeNaissance = res.getDate("dateDeNaissance");
                lieuDeNaissance = res.getString("lieuDeNaissance");
                agent = new Velo(idAgent, nom, prenom,dateDeNaissance, lieuDeNaissance);
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
        return agent;
                
    }
	

    public static void updateVelo(Velo agent) {

        /*PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from AgentMaintenance where idAgent=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, agent.getIdAgent());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("nom", agent.getNom());
                res.updateString("prenom", agent.getPrenom());
                res.updateDate("dateDeNaissance", (Date) agent.getDateDeNaissance());
                res.updateString("lieuDeNaissance", agent.getLieuDeNaissance());
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

    public static void deleteVelo(Velo agent) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from AgentMaintenance where idAgent="+ agent.getIdAgent());
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

    public static void insertVelo(Velo agent) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into AgentMaintenance (nom,prenom,dateDeNaissance,)lieuDeNaissance values (?,?,?,?)");
            stat.setString(1, agent.getNom());
            stat.setString(2, agent.getPrenom());
            stat.setDate(3, (Date) agent.getDateDeNaissance());
            stat.setString(4, agent.getLieuDeNaissance());			
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
        
    }*/
    
}
