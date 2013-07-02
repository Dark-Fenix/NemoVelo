
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Carte {
    
    // Définition des attributs de base de la classe
    private int id_carte = 0;
    private String serialNumber = "007FF007";
    
    /**
     * Initialise un objet carte avec les attributs de base
     */
    public Carte(){
    }
    
    /**
     * Initialise un objet carte avec les attributs fournis
     * @param id_carte
     * @param serialNumber
     */
    public Carte(int id_carte, String serialNumber){
        this.id_carte = id_carte;
        this.serialNumber = serialNumber;
    }

    /**
     * Retourne l'ID de la carte
     * @return Int
     */
    public int getId_carte() {
        return id_carte;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     * Définit l'ID de la carte
     * @param id_carte
     */
    public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }
    
    /**
     * Retourne le SN de la carte
     * @return String
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Définit le SN de la carte
     * @param serialNumber
     * @return Int
     */
    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNCarte){
            return -1;
        }
        else{
            this.serialNumber = serialNumber;
            return 0;
        }
    }
    
    @Override
    public String toString(){
        return "Carte "+this.id_carte;
    }
    
    /**
     * Retourne une magnifique chaîne représentant l'objet
     * @return String
     */
    public String toStringComplet(){
        return "Carte "+this.id_carte+" : numero de serie "+this.serialNumber;
    }
    
}
