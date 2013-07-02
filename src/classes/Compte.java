
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Compte {
    
    // Définition des attributs de base de la classe
    private int id_compte = 0;
    private String typeCompte = "abonnement";
    private double solde = 0;
    private String dateCreation = "2000-01-01";
    private int fk_id_utilisateur = 0;
    
    /**
     * Initialise un objet compte avec les attributs de base
     */
    public Compte(){
    }

    /**
     * Initialise un objet compte avec les attributs fournis
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
     * Retourne l'ID du compte
     * @return Int
     */
    public int getId_compte() {
        return id_compte;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     * Définit l'ID du compte
     * @param id_compte
     */
    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    /**
     * Retourne le type du compte
     * @return String
     */
    public String getTypeCompte() {
        return typeCompte;
    }

    /**
     * Définit le type du compte
     * @param typeCompte
     * @return Int
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
     * Retourne le solde du compte
     * @return Double
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Définit le solde du compte
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Retourne la date de création du compte
     * @return String
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * Définit la date de création du compte
     * @param dateCreation
     * @return Int
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
     * Retourne l'ID de l'utilisateur à qui est lié le compte
     * @return Int
     */
    public int getFk_id_utilisateur() {
        return fk_id_utilisateur;
    }

    /**
     * Définit l'ID de l'utilisateur à qui est lié le compte
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
     * Retourne une magnifique chaîne représentant l'objet
     * @return String
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
