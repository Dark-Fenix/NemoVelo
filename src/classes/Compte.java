
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Compte {
    
    private int id_compte = 0;
    private String typeCompte = "abonnement";
    private double solde = 0;
    private String dateCreation = "2000-01-01";
    private int fk_id_utilisateur = 0;
    
    /**
     *
     */
    public Compte(){
    }

    /**
     *
     * @param id_compte
     * @param typeCompte
     * @param solde
     * @param dateCreation
     * @param fk_id_utilisateur
     */
    public Compte(int id_compte, String typeCompte, double solde, String dateCreation, int fk_id_utilisateur){
        this.id_compte = id_compte;
        this.typeCompte = typeCompte;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.fk_id_utilisateur = fk_id_utilisateur;
    }
    
    /**
     *
     * @return
     */
    public int getId_compte() {
        return id_compte;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     *
     * @param id_compte
     */
    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    /**
     *
     * @return
     */
    public String getTypeCompte() {
        return typeCompte;
    }

    /**
     *
     * @param typeCompte
     * @return
     */
    public int setTypeCompte(String typeCompte) {
        if(typeCompte.equalsIgnoreCase("solde") || typeCompte.equalsIgnoreCase("abonnement")){
            this.typeCompte = typeCompte.toLowerCase();
            return 0;
        }
        else{
            return -1;
        }
    }

    /**
     *
     * @return
     */
    public double getSolde() {
        return solde;
    }

    /**
     *
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     *
     * @return
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     *
     * @param dateCreation
     * @return
     */
    public int setDateCreation(String dateCreation) {
        if(dateCreation.matches(ConfigGlobale.regexValidationDate)){
            this.dateCreation = dateCreation;
            return 0;
        }
        else{
            return -1;
        }
    }

    /**
     *
     * @return
     */
    public int getFk_id_utilisateur() {
        return fk_id_utilisateur;
    }

    /**
     *
     * @param fk_id_utilisateur
     */
    public void setFk_id_utilisateur(int fk_id_utilisateur) {
        this.fk_id_utilisateur = fk_id_utilisateur;
    }
    
    @Override
    public String toString(){
        return "Compte "+this.id_compte;
    }
    
    /**
     *
     * @return
     */
    public String toStringComplet(){
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
