
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Utilisateur {
    
    private int id_utilisateur = 0;
    private String prenom = "undefined";
    private String nom = "undefined";
    private String dateNaissance = "2000-01-01";
    private String adresse = "undefined";
    private String codePostal = "00000";
    private String ville = "undefined";
    private String carteBancaire = "undefined";
    private String dateValiditeCarteBancaire = "2000-01-01";
    private String rib = "undefined";
    private String iban = "undefined";
    private String dateCreation = "2000-01-01";
    private String login = "undefined";
    private String password = "undefined";
    private int fk_id_carte = -1;
    private int fk_id_velo = -1;
    
    /**
     *
     */
    public Utilisateur(){
    }

    /**
     *
     * @param id_utilisateur
     * @param prenom
     * @param nom
     * @param dateNaissance
     * @param adresse
     * @param codePostal
     * @param ville
     * @param carteBancaire
     * @param dateValiditeCarteBancaire
     * @param rib
     * @param iban
     * @param dateCreation
     * @param login
     * @param password
     * @param fk_id_carte
     * @param fk_id_velo
     */
    public Utilisateur(int id_utilisateur, String prenom, String nom, String dateNaissance, String adresse, String codePostal, String ville, String carteBancaire, String dateValiditeCarteBancaire, String rib, String iban, String dateCreation, String login, String password, int fk_id_carte, int fk_id_velo){
        this.id_utilisateur = id_utilisateur;
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.carteBancaire = carteBancaire;
        this.dateValiditeCarteBancaire = dateValiditeCarteBancaire;
        this.rib = rib;
        this.iban = iban;
        this.dateCreation = dateCreation;
        this.login = login;
        this.password = password;
        this.fk_id_carte = fk_id_carte;
        this.fk_id_velo = fk_id_velo;
    }
    
    /**
     *
     * @return
     */
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     *
     * @param id_utilisateur
     */
    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     * @return
     */
    public int setPrenom(String prenom) {
        if(prenom.length()>ConfigGlobale.longueurChampTexteGenerique){
            return -1;
        }
        else{
            this.prenom = prenom;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     * @return
     */
    public int setNom(String nom) {
        if(nom.length()>ConfigGlobale.longueurChampTexteGenerique){
            return -1;
        }
        else{
            this.nom = nom;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     *
     * @param dateNaissance
     * @return
     */
    public int setDateNaissance(String dateNaissance) {
        if(dateNaissance.matches(ConfigGlobale.regexValidationDate)){
            this.dateNaissance = dateNaissance;
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
    public String getAdresse() {
        return adresse;
    }

    /**
     *
     * @param adresse
     * @return
     */
    public int setAdresse(String adresse) {
        if(adresse.length()>ConfigGlobale.longueurAdresse){
            return -1;
        }
        else{
            this.adresse = adresse;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     *
     * @param codePostal
     * @return
     */
    public int setCodePostal(String codePostal) {
        if(codePostal.length()>ConfigGlobale.longueurCodePostal){
            return -1;
        }
        else{
            this.codePostal = codePostal;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getVille() {
        return ville;
    }

    /**
     *
     * @param ville
     * @return
     */
    public int setVille(String ville) {
        if(ville.length()>ConfigGlobale.longueurChampTexteGenerique){
            return -1;
        }
        else{
            this.ville = ville;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getCarteBancaire() {
        return carteBancaire;
    }

    /**
     *
     * @param carteBancaire
     * @return
     */
    public int setCarteBancaire(String carteBancaire) {
        if(carteBancaire.length()>ConfigGlobale.longueurCB){
            return -1;
        }
        else{
            this.carteBancaire = carteBancaire;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getDateValiditeCarteBancaire() {
        return dateValiditeCarteBancaire;
    }

    /**
     *
     * @param dateValiditeCarteBancaire
     * @return
     */
    public int setDateValiditeCarteBancaire(String dateValiditeCarteBancaire) {
        if(dateValiditeCarteBancaire.matches(ConfigGlobale.regexValidationDate)){
            this.dateValiditeCarteBancaire = dateValiditeCarteBancaire;
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
    public String getRib() {
        return rib;
    }

    /**
     *
     * @param rib
     * @return
     */
    public int setRib(String rib) {
        if(rib.length()>ConfigGlobale.longueurRIB){
            return -1;
        }
        else{
            this.rib = rib;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getIban() {
        return iban;
    }

    /**
     *
     * @param iban
     * @return
     */
    public int setIban(String iban) {
        if(iban.length()>ConfigGlobale.longueurIBAN){
            return -1;
        }
        else{
            this.iban = iban;
            return 0;
        }
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
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     * @return
     */
    public int setLogin(String login) {
        if(login.length()>ConfigGlobale.longueurChampTexteGenerique){
            return -1;
        }
        else{
            this.login = login;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     * @return
     */
    public int setPassword(String password) {
        if(password.length()>ConfigGlobale.longueurChampTexteGenerique){
            return -1;
        }
        else{
            this.password = password;
            return 0;
        }
    }

    /**
     *
     * @return
     */
    public int getFk_id_carte() {
        return fk_id_carte;
    }

    /**
     *
     * @param fk_id_carte
     */
    public void setFk_id_carte(int fk_id_carte) {
        this.fk_id_carte = fk_id_carte;
    }

    /**
     *
     * @return
     */
    public int getFk_id_velo() {
        return fk_id_velo;
    }

    /**
     *
     * @param fk_id_velo
     */
    public void setFk_id_velo(int fk_id_velo) {
        this.fk_id_velo = fk_id_velo;
    }
    
    @Override
    public String toString(){
        return this.prenom+" "+this.nom;
    }
    
    /**
     *
     * @return
     */
    public String toStringLight(){
        return "Utilisateur "+this.id_utilisateur+" : "+this.prenom+" "+this.nom+", ne(e) le "+this.dateNaissance+", adresse : "+this.adresse+" "+this.codePostal+" "+this.ville+" compte cree le : "+this.dateCreation;
    }
    
    /**
     *
     * @return
     */
    public String toStringSecret(){
        return "Utilisateur "+this.id_utilisateur+", numero CN : "+this.carteBancaire+", date de validite CB : "+this.dateValiditeCarteBancaire+", rib : "+this.rib+", iban : "+this.iban+", login : "+this.login+", password : "+this.password+".";
    }
    
}
