/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Carte;
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
public class CarteDAO {

    public static ArrayList<Carte> getAllCarte() {

        Statement stat;
        ArrayList<Carte> cartes = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from carte");
            Carte carte;
            int id_carte;
            String serialNumber;
            while (res.next()) {
                id_carte = res.getInt("id_carte");
                serialNumber = res.getString("serialNumber");
                carte = new Carte(id_carte, serialNumber);
                cartes.add(carte);
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
        return cartes;

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
