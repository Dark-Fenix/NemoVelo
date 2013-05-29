package DAO;

import Config.ConfigDB;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnexionDB {	

    private static Connection connexion = null;

    private ConnexionDB() {
        try
{
Class.forName("com.mysql.jdbc.Driver").newInstance();
}
catch(Exception e)
{
e.printStackTrace();
}
        try {
            ConnexionDB.connexion = (Connection) DriverManager.getConnection("jdbc:mysql://"+ConfigDB.adresseDB+"/"+ConfigDB.nomDB, ConfigDB.utilisateur, ConfigDB.password);
        }
        catch (SQLException ex) {
            Logger.getLogger(ConnexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static class SingletonHolder {
        private final static ConnexionDB instance = new ConnexionDB();
    }

    public static ConnexionDB getInstance() {
        return SingletonHolder.instance;
    }
    
    public static Connection getConnexion() {
        return connexion;
    }
    
}
