
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Borne {
    
    // Définition des attributs de base de la classe
    private int id_borne = 0;
    private String serialNumber = "HHHH66HHHH";
    private String etat = "off";
    private int fk_id_station = -1;
    
    /**
     * Initialise un objet borne avec les attributs de base
     */
    public Borne(){
    }
    
    /**
     * Initialise un objet borne avec les attributs fournis
     * @param id_borne
     * @param serialNumber
     * @param etat
     * @param fk_id_station
     */
    public Borne(int id_borne, String serialNumber, String etat, int fk_id_station){
        this.id_borne = id_borne;
        this.serialNumber = serialNumber;
        this.etat = etat;
        this.fk_id_station = fk_id_station;
    }

    /**
     * Retourne l'ID de la borne
     * @return Int
     */
    public int getId_borne() {
        return id_borne;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     * Définit l'ID de la borne
     * @param id_borne
     * @return Int
     */
    public int setId_borne(int id_borne) {
        return this.id_borne = id_borne;
    }

    /**
     * Retourne le SN d'une borne
     * @return String
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Définit le SN d'une borne
     * @param serialNumber
     * @return Int
     */
    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNBorne){
            return -1;
        }
        else{
            this.serialNumber = serialNumber;
            return 0;
        }
    }
    
    /**
     * Retourne l'état d'une borne
     * @return Sting
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit l'état d'une borne
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
     * Retourne l'ID de la station d'attache de la borne
     * @return Int
     */
    public int getFk_id_station() {
        return fk_id_station;
    }

    /**
     * Définit l'ID de la station d'attache de la borne
     * @param fk_id_station
     * @return Int
     */
    public int setFk_id_station(int fk_id_station) {
        return this.fk_id_station = fk_id_station;
    }
    
    @Override
    public String toString(){
        return "Borne "+this.id_borne;
    }
    
    /**
     * Retourne une magnifique chaîne représentant l'objet
     * @return
     */
    public String toStringComplet(){
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
