
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Station {
    
    // Définition des attributs de base de la classe
    private int id_station = 0;
    private String serialNumber = "KL34KL3411";
    private String etat = "off";
    private String latitude = null;
    private String longitude = null;
    
    /**
     * Initialise un objet station avec les attributs de base
     */
    public Station(){
    }
    
    /**
     * Initialise un objet station avec les attributs fournis
     * @param id_station
     * @param serialNumber
     * @param etat
     * @param latitude
     * @param longitude
     */
    public Station(int id_station, String serialNumber, String etat, String latitude, String longitude){
        this.id_station = id_station;
        this.serialNumber = serialNumber;
        this.etat = etat;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     *
     * @return
     */
    public int getId_station() {
        return id_station;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     *
     * @param id_station
     */
    public void setId_station(int id_station) {
        this.id_station = id_station;
    }

    /**
     *
     * @return
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     *
     * @param serialNumber
     * @return
     */
    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNStation){
            return -1;
        }
        else{
            this.serialNumber = serialNumber;
            return 0;
        }
    }
    
    /**
     *
     * @return
     */
    public String getEtat() {
        return etat;
    }

    /**
     *
     * @param etat
     * @return
     */
    public int setEtat(String etat) {
        if(etat.equalsIgnoreCase(ConfigGlobale.etatHS) || etat.equalsIgnoreCase(ConfigGlobale.etatOK) || etat.equalsIgnoreCase(ConfigGlobale.etatOFF) || etat.equalsIgnoreCase(ConfigGlobale.etatMaintenance)){
            this.etat = etat.toLowerCase();
            return 0;
        }
        else{
            return -1;
        }
    }
    
     /**
     *
     * @return
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    
    @Override
    public String toString(){
        return "Station "+this.id_station;
    }
    
    /**
     * Retourne une magnifique chaîne représentant l'objet
     * @return
     */
    public String toStringComplet(){
        return "Station "+this.id_station+" : numero de serie "+this.serialNumber+", etat : "+this.etat+", latitude : "+this.latitude+", longitude : "+this.longitude;
    }
    
}
