
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Velo {

    // Définition des attributs de base de la classe
    private int id_velo = 0;
    private String serialNumber = "CK00000000";
    private String dateMiseEnService = "2000-01-01";
    private double kmParcourus = 0;
    private String etat = "off";
    private int fk_id_borne = -1;

    /**
     * Initialise un objet vélo avec les attributs de base
     */
    public Velo() {
    }
    
    /**
     * Initialise un objet vélo avec les attributs fournis
     * @param id_velo
     * @param serialNumber
     * @param dateMiseEnService
     * @param kmParcourus
     * @param etat
     * @param fk_id_borne
     */
    public Velo(int id_velo, String serialNumber, String dateMiseEnService, double kmParcourus, String etat, int fk_id_borne) {
        this.id_velo = id_velo;
        this.serialNumber = serialNumber;
        this.dateMiseEnService = dateMiseEnService;
        this.kmParcourus = kmParcourus;
        this.etat = etat;
        this.fk_id_borne = fk_id_borne;
    }
    
    /**
     * Retourne l'ID du vélo
     * @return Int
     */
    public int getId_velo() {
        return id_velo;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     * Définit l'ID du vélo
     * @param id_velo
     */
    public void setId_velo(int id_velo) {
        this.id_velo = id_velo;
    }

    /**
     * Retourne le SN du vélo
     * @return String
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Définit le SN du vélo
     * @param serialNumber
     * @return Int
     */
    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNVelo){
            return -1;
        }
        else{
            this.serialNumber = serialNumber;
            return 0;
        }
    }

    /**
     * Retourne la date de mise en service du vélo
     * @return String
     */
    public String getDateMiseEnService() {
        return dateMiseEnService;
    }

    /**
     * Définit la date de mise en service du vélo
     * @param dateMiseEnService
     * @return Int
     */
    public int setDateMiseEnService(String dateMiseEnService) {
        if(dateMiseEnService.matches(ConfigGlobale.regexValidationDate)){
            this.dateMiseEnService = dateMiseEnService;
            return 0;
        }
        else{
            return -1;
        }
    }

    /**
     * Retourne le nombre de km parcourus du vélo
     * @return Double
     */
    public double getKmParcourus() {
        return kmParcourus;
    }

    /**
     * Définit le nombre de kilomètre parcourus du vélo
     * @param kmParcourus
     */
    public void setKmParcourus(double kmParcourus) {
        this.kmParcourus = kmParcourus;
    }

    /**
     * Retourne l'état du vélo
     * @return String
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Définit l'état du vélo
     * @param etat
     * @return Int
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
     * Retourne à quelle borne est attaché le vélo (-1 si aucune)
     * @return Int
     */
    public int getFk_id_borne() {
        return fk_id_borne;
    }

    /**
     * Définit à quelle borne est attaché le vélo
     * @param fk_id_borne
     */
    public void setFk_id_borne(int fk_id_borne) {
        this.fk_id_borne = fk_id_borne;
    }
    
    @Override
    public String toString(){
        return "Vélo "+this.id_velo;
    }
    
    /**
     * Retourne une magnifique chaîne représentant l'objet
     * @return String
     */
    public String toStringComplet(){
        String temp = "Vélo "+this.id_velo+" : SN "+this.serialNumber+", mis en service le "+this.dateMiseEnService+", KM parcourus : "+this.kmParcourus+", etat : "+this.etat;
        if(this.fk_id_borne==-1){
            temp+=", pas de borne d'attache.";
        }
        else{
            temp+=", borne d'attache : "+this.fk_id_borne+".";
        }
        return temp;
    }
    
}
