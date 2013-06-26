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

    public static Velo getVeloById(int id_velo) {

        Velo velo = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from velo where id_velo="+ id_velo);
            int fk_id_borne;
            double kmParcourus;
            String serialNumber, dateMiseEnService, etat;
            if (res.next()) {
                id_velo = res.getInt("id_velo");
                serialNumber = res.getString("serialNumber");
                dateMiseEnService = res.getString("dateMiseEnService");
                kmParcourus = res.getDouble("kmParcourus");
                etat = res.getString("etat");
                fk_id_borne = res.getInt("fk_id_borne");
                velo = new Velo(id_velo, serialNumber, dateMiseEnService, kmParcourus, etat, fk_id_borne);
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
        return velo;
                
    }
	

    public static void updateVelo(Velo velo) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from velo where id_velo=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, velo.getId_velo());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("serialNumber", velo.getSerialNumber());
                res.updateString("dateMiseEnService", velo.getDateMiseEnService());
                res.updateDouble("kmParcourus", velo.getKmParcourus());
                res.updateString("etat", velo.getEtat());
                res.updateInt("fk_id_borne", velo.getFk_id_borne());
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

    public static void deleteVelo(Velo velo) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from velo where id_velo="+ velo.getId_velo());
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

    public static void insertVelo(Velo velo) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into velo (serialNumber, dateMiseEnService, kmParcourus, etat, fk_id_borne) values (?,?,?,?,?)");
            stat.setString(1, velo.getSerialNumber());
            stat.setString(2, velo.getDateMiseEnService());
            stat.setDouble(3, velo.getKmParcourus());
            stat.setString(4, velo.getEtat());
            stat.setInt(5, velo.getFk_id_borne());
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
