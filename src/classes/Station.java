
package classes;

/**
 *
 * @author HallerCasagrande-F
 */
public class Station {
    
    private int id_station = 0;
    private String etat = "";
    
    public Station(){
    }
    
    public Station(int id_station, String etat){
        this.id_station = id_station;
        this.etat = etat;
    }

    public int getId_station() {
        return id_station;
    }

    public void setId_station(int id_station) {
        this.id_station = id_station;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    @Override
    public String toString(){
        return "Station "+this.id_station+", etat : "+this.etat;
    }
    
}
