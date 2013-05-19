
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Carte {
    
    private int id_carte = 0;
    private String serialNumber = "007FF007";
    
    public Carte(){
    }
    
    public Carte(int id_carte){
        this.id_carte = id_carte;
    }

    public int getId_carte() {
        return id_carte;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /*public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }*/
    
    public String getSerialNumber() {
        return serialNumber;
    }

    public int setSerialNumber(String serialNumber) {
        if(serialNumber.length()>ConfigGlobale.longueurSNCarte){
            this.serialNumber = serialNumber;
            return 0;
        }
        else{
            return -1;
        }
    }
    
    @Override
    public String toString(){
        return "Carte "+this.id_carte+" : numero de serie "+this.serialNumber;
    }
    
}
