
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
    private String emplacement = "undefined";
    
    public Station(){
    }
    
    public Station(int id_station, String etat){
        this.id_station = id_station;
        this.etat = etat;
    }

    public int getId_station() {
        return id_station;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /*public void setId_station(int id_station) {
        this.id_station = id_station;
    }*/

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
    
    public String getEmplacement() {
        return emplacement;
    }

    public int setEmplacement(String emplacement) {
        if(emplacement.length()>ConfigGlobale.longueurAdresse){
            return -1;
        }
        else{
            this.emplacement = emplacement;
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Station "+this.id_station;
    }
    
    public String toStringComplet(){
        return "Station "+this.id_station+" : numero de serie "+this.serialNumber+", emplacement : "+this.emplacement+", etat : "+this.etat;
    }
    
}
