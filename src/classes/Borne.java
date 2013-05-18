
package classes;

/**
 *
 * @author Fenix
 */
public class Borne {
    
    private int id_borne = 0;
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

    public void setId_borne(int id_borne) {
        this.id_borne = id_borne;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getFk_id_station() {
        return fk_id_station;
    }

    public void setFk_id_station(int fk_id_station) {
        this.fk_id_station = fk_id_station;
    }
    
    @Override
    public String toString(){
        String temp = "Borne "+this.id_borne+", etat : "+this.etat;
        if(this.fk_id_station==-1){
            temp+=", pas de station d'attache.";
        }
        else{
            temp+=", station d'attache : "+this.fk_id_station+".";
        }
        return temp;
    }
    
}
