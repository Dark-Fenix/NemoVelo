/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Carte;
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

    public static Carte getCarteById(int id_carte) {

        Carte carte = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from carte where id_carte="+ id_carte);
            String serialNumber;
            if (res.next()) {
                id_carte = res.getInt("id_carte");
                serialNumber = res.getString("serialNumber");
                carte = new Carte(id_carte, serialNumber);
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
        return carte;
                
    }
	

    public static void updateCarte(Carte carte) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from carte where id_carte=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, carte.getId_carte());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("serialNumber", carte.getSerialNumber());
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

    public static void deleteCarte(Carte carte) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from carte where id_carte="+ carte.getId_carte());
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

    public static void insertCarte(Carte carte) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into carte (serialNumber) values (?)");
            stat.setString(1, carte.getSerialNumber());			
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
