/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Velo;
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
public class VeloDAO {

    public static ArrayList<Velo> getAllVelo() {

        Statement stat;
        ArrayList<Velo> velos = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from velo");
            Velo velo;
            int id_velo, fk_id_borne;
            double kmParcourus;
            String serialNumber, dateMiseEnService, etat;
            while (res.next()) {
                id_velo = res.getInt("id_velo");
                serialNumber = res.getString("serialNumber");
                dateMiseEnService = res.getString("dateMiseEnService");
                kmParcourus = res.getDouble("kmParcourus");
                etat = res.getString("etat");
                fk_id_borne = res.getInt("fk_id_borne");
                velo = new Velo(id_velo, serialNumber, dateMiseEnService, kmParcourus, etat, fk_id_borne);
                velos.add(velo);
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
        return velos;

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