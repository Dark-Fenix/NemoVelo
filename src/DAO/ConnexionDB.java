package DAO;

import Config.ConfigDB;
import java.sql.*;

public class ConnexionDB {	

    private static Connection _conn;

    static Connection getConnection() {

        if (_conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
            try {
                _conn = DriverManager.getConnection("jdbc:mysql://"+ConfigDB.adresseDB+"/"+ConfigDB.nomDB, ConfigDB.utilisateur, ConfigDB.password);
            } catch (SQLException e) {
                System.out.println("sql exception");
                while (e != null) {
                    System.out.println(e.getErrorCode());
                    System.out.println(e.getMessage());
                    System.out.println(e.getSQLState());
                    e.printStackTrace();
                    e = e.getNextException();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return _conn;
    }
    
}
