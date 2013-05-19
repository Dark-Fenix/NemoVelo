
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Borne {
    
    private int id_borne = 0;
    private String serialNumber = "HHHH66HHHH";
    private String etat = "off";
    private int fk_id_station = -1;
    
    public Borne(){
    }
    
    public Borne(int id_borne, String etat, int fk_id_station){
        this.id_borne = id_borne;
        this.etat = etat;
        this.fk_id_station = fk_id_station;
    }

    public int getId_borne() {
        return id_borne;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /*public int setId_borne(int id_borne) {
        return this.id_borne = id_borne;
    }*/

    public String getSerialNumber() {
        return serialNumber;
    }

    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNBorne){
            this.serialNumber = serialNumber;
            return 0;
        }
        else{
            return -1;
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

    public int getFk_id_station() {
        return fk_id_station;
    }

    public int setFk_id_station(int fk_id_station) {
        return this.fk_id_station = fk_id_station;
    }
    
    @Override
    public String toString(){
        String temp = "Borne "+this.id_borne+" : numero de serie "+this.serialNumber+", etat : "+this.etat;
        if(this.fk_id_station==-1){
            temp+=", pas de station d'attache.";
        }
        else{
            temp+=", station d'attache : "+this.fk_id_station+".";
        }
        return temp;
    }
    
}
