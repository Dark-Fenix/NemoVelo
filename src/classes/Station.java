
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Station {
    
    private int id_station = 0;
    private String serialNumber = "KL34KL3411";
    private String etat = "off";
    private String latitude = null;
    private String longitude = null;
    
    public Station(){
    }
    
    public Station(int id_station, String serialNumber, String etat, String latitude, String longitude){
        this.id_station = id_station;
        this.serialNumber = serialNumber;
        this.etat = etat;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId_station() {
        return id_station;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    public void setId_station(int id_station) {
        this.id_station = id_station;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNStation){
            return -1;
        }
        else{
            this.serialNumber = serialNumber;
            return 0;
        }
    }
    
    public String getEtat() {
        return etat;
    }

    public int setEtat(String etat) {
        if(etat.equalsIgnoreCase(ConfigGlobale.etatHS) || etat.equalsIgnoreCase(ConfigGlobale.etatOK) || etat.equalsIgnoreCase(ConfigGlobale.etatOFF) || etat.equalsIgnoreCase(ConfigGlobale.etatMaintenance)){
            this.etat = etat.toLowerCase();
            return 0;
        }
        else{
            return -1;
        }
    }
    
     public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    @Override
    public String toString(){
        return "Station "+this.id_station;
    }
    
    public String toStringComplet(){
        return "Station "+this.id_station+" : numero de serie "+this.serialNumber+", etat : "+this.etat+", latitude : "+this.latitude+", longitude : "+this.longitude;
    }
    
}
