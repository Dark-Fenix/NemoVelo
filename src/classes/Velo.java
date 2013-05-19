
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Velo {

    private int id_velo = 0;
    private String serialNumber = "CK00000000";
    private String dateMiseEnService = "2000-01-01";
    private double kmParcourus = 0;
    private String etat = "off";
    private int fk_id_borne = -1;

    public Velo() {
    }
    
    public Velo(int id_velo, String serialNumber, String dateMiseEnService, double kmParcourus, String etat, int fk_id_borne) {
        this.id_velo = id_velo;
        this.serialNumber = serialNumber;
        this.dateMiseEnService = dateMiseEnService;
        this.kmParcourus = kmParcourus;
        this.etat = etat;
        this.fk_id_borne = fk_id_borne;
    }
    
    public int getId_velo() {
        return id_velo;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /*public void setId_velo(int id_velo) {
        this.id_velo = id_velo;
    }*/

    public String getSerialNumber() {
        return serialNumber;
    }

    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNVelo){
            this.serialNumber = serialNumber;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getDateMiseEnService() {
        return dateMiseEnService;
    }

    public int setDateMiseEnService(String dateMiseEnService) {
        if(dateMiseEnService.matches(ConfigGlobale.regexValidationDate)){
            this.dateMiseEnService = dateMiseEnService;
            return 0;
        }
        else{
            return -1;
        }
    }

    public double getKmParcourus() {
        return kmParcourus;
    }

    public void setKmParcourus(double kmParcourus) {
        this.kmParcourus = kmParcourus;
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

    public int getFk_id_borne() {
        return fk_id_borne;
    }

    public void setFk_id_borne(int fk_id_borne) {
        this.fk_id_borne = fk_id_borne;
    }
    
    @Override
    public String toString(){
        String temp = "Velo "+this.id_velo+" : SN "+this.serialNumber+", mis en service le "+this.dateMiseEnService+", KM parcourus : "+this.kmParcourus+", etat : "+this.etat;
        if(this.fk_id_borne==-1){
            temp+=", pas de borne d'attache.";
        }
        else{
            temp+=", borne d'attache : "+this.fk_id_borne+".";
        }
        return temp;
    }
    
}
