/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Station;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Fenix
 */
public class StationDAO {

    /**
     * Retourne toutes les stations de la DB
     * @return ArrayList<Station>
     */
    public static ArrayList<Station> getAllStation() {

        Statement stat;
        ArrayList<Station> stations = new ArrayList<>();
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from station");
            Station station;
            int id_station;
            String serialNumber, etat, latitude, longitude;
            while (res.next()) {
                id_station = res.getInt("id_station");
                serialNumber = res.getString("serialNumber");
                etat = res.getString("etat");
                latitude = res.getString("latitude");
                longitude = res.getString("longitude");
                station = new Station(id_station, serialNumber, etat, latitude, longitude);
                stations.add(station);
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
        return stations;

    }

    /**
     * Retourne une station de la DB en fonction de son ID
     * @param id_station
     * @return Station
     */
    public static Station getStationById(int id_station) {

        Station station = null;
        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("use nemovelo");
            ResultSet res = stat.executeQuery("select * from station where id_station="+ id_station);
            String serialNumber, etat, latitude, longitude;
            if (res.next()) {
                id_station = res.getInt("id_station");
                serialNumber = res.getString("serialNumber");
                etat = res.getString("etat");
                latitude = res.getString("latitude");
                longitude = res.getString("longitude");
                station = new Station(id_station, serialNumber, etat, latitude, longitude);
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
        return station;
                
    }
	

    /**
     * Met à jour une station dans la DB
     * @param station
     */
    public static void updateStation(Station station) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("select * from station where id_station=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            stat.setInt(1, station.getId_station());
            ResultSet res = stat.executeQuery();
            if (res.next()) {
                res.updateString("serialNumber", station.getSerialNumber());
                res.updateString("etat", station.getEtat());
                res.updateString("latitude", station.getLatitude());
                res.updateString("longitude", station.getLongitude());
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
     * Supprime une station dans la DB
     * @param station
     */
    public static void deleteStation(Station station) {

        Statement stat;
        try {
            stat = ConnexionDB.getConnection().createStatement();
            stat.executeUpdate("delete from station where id_station="+ station.getId_station());
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
     * Insère une station dans la DB
     * @param station
     */
    public static void insertStation(Station station) {

        PreparedStatement stat;
        try {
            stat = ConnexionDB.getConnection().prepareStatement("insert into station (serialNumber, etat, latitude, longitude) values (?,?,?,?)");
            stat.setString(1, station.getSerialNumber());
            stat.setString(2, station.getEtat());
            stat.setString(3, station.getLatitude());
            stat.setString(4, station.getLongitude());			
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
