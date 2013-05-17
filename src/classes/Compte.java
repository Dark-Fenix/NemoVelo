
package classes;

/**
 *
 * @author HallerCasagrande-F
 */
public class Compte {
    
    private int id_compte = 0;
    private String typeCompte = "abonnement";
    private double solde = 0;
    private String dateCreation = "2000-01-01";
    private int fk_id_utilisateur = 0;
    
    public Compte(){
    }

    public Compte(int id_compte, String typeCompte, double solde, String dateCreation, int fk_id_utilisateur){
        this.id_compte = id_compte;
        this.typeCompte = typeCompte;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.fk_id_utilisateur = fk_id_utilisateur;
    }
    
    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getFk_id_utilisateur() {
        return fk_id_utilisateur;
    }

    public void setFk_id_utilisateur(int fk_id_utilisateur) {
        this.fk_id_utilisateur = fk_id_utilisateur;
    }
    
    @Override
    public String toString(){
        String temp = "Compte "+this.id_compte+", type du compte : "+this.typeCompte+", date de creation : "+this.dateCreation+", solde : "+this.solde;
        if(this.fk_id_utilisateur==-1){
            temp+=", pas de detenteur.";
        }
        else{
            temp+=", detenteur : "+this.fk_id_utilisateur+".";
        }
        return temp;
    }
    
}
