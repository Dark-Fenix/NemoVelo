/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Borne;
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
public class BorneDAO {

    public static ArrayList<Borne> getAllBorne() {

        Statement stat;
        ArrayList<Borne> bornes = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from borne");
            Borne borne;
            int id_borne, fk_id_station;
            String serialNumber, etat;
            while (res.next()) {
                id_borne = res.getInt("id_borne");
                serialNumber = res.getString("serialNumber");
                etat = res.getString("etat");
                fk_id_station = res.getInt("fk_id_station");
                borne = new Borne(id_borne, serialNumber, etat, fk_id_station);
                bornes.add(borne);
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
        return bornes;

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
