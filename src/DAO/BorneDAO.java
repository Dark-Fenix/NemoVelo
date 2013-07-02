/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Borne;
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

    /**
     * Retourne toutes les bornes de la DB
     * @return ArrayList<Borne>
     */
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

    /**
     * Retourne une borne de la DB en fonction de son ID
     * @param id_borne
     * @return Borne
     */
    public static Borne getBorneById(int id_borne) {

        Borne borne = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from borne where id_borne="+ id_borne);
            int fk_id_station;
            String serialNumber, etat;
            while (res.next()) {
                id_borne = res.getInt("id_borne");
                serialNumber = res.getString("serialNumber");
                etat = res.getString("etat");
                fk_id_station = res.getInt("fk_id_station");
                borne = new Borne(id_borne, serialNumber, etat, fk_id_station);
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
        return borne;
                
    }
	

    /**
     * Met à jour une borne dans la DB
     * @param borne
     */
    public static void updateBorne(Borne borne) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from borne where id_borne=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, borne.getId_borne());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("serialNumber", borne.getSerialNumber());
                res.updateString("etat", borne.getEtat());
                res.updateInt("fk_id_station", borne.getFk_id_station());
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
     * Supprime une borne dans la DB
     * @param borne
     */
    public static void deleteBorne(Borne borne) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from borne where id_borne="+ borne.getId_borne());
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
     * Insère une borne dans la DB
     * @param borne
     */
    public static void insertBorne(Borne borne) {
         
        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into borne (serialNumber,etat,fk_id_station) values (?,?,?)");
            stat.setString(1, borne.getSerialNumber());
            stat.setString(2, borne.getEtat());
            stat.setInt(3, borne.getFk_id_station());
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
