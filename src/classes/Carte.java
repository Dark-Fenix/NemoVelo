
package classes;

/**
 *
 * @author HallerCasagrande-F
 */
public class Carte {
    
    private int id_carte = 0;
    
    public Carte(){
    }
    
    public Carte(int id_carte){
        this.id_carte = id_carte;
    }

    public int getId_carte() {
        return id_carte;
    }

    public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }
    
    @Override
    public String toString(){
        return "Carte "+this.id_carte;
    }
    
}
