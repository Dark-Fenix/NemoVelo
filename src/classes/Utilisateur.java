
package classes;

import Config.ConfigGlobale;

/**
 *
 * @author Fenix
 */
public class Utilisateur {
    
    // Définition des attributs de base de la classe
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
     * Initialise un objet utlisateur avec les attributs de base
     */
    public Utilisateur(){
    }

    /**
     * Initialise un objet utlisateur avec les attributs fournis
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
     * Retourne l'ID de l'utilisateur
     * @return Int
     */
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /**
     * Définit l'ID de l'utilisateur
     * @param id_utilisateur
     */
    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    /**
     * Retourne le prénom de l'utilisateur
     * @return String
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Définit le prénom de l'utilisateur
     * @param prenom
     * @return Int
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
     * Retourne le nom de l'utilisateur
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Définit le nom de l'utilisateur
     * @param nom
     * @return Int
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
     * Retourne la date de naissance de l'utilisateur
     * @return String
     */
    public String getDateNaissance() {
        return dateNaissance;
    }

    /**
     * Définit la date de naissance de l'utilisateur
     * @param dateNaissance
     * @return Int
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
     * Retourne l'adresse de l'utilisateur
     * @return String
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Définit l'adresse de l'utilisateur
     * @param adresse
     * @return Int
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
     * Retourne le code postal de l'utilisateur
     * @return String
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Définit le code postal de l'utilisateur
     * @param codePostal
     * @return Int
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
     * Retourne la ville de l'utilisateur
     * @return String
     */
    public String getVille() {
        return ville;
    }

    /**
     * Définit la ville de l'utilisateur
     * @param ville
     * @return Int
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
     * Retourne le numéro de CB de l'utilisateur
     * @return String
     */
    public String getCarteBancaire() {
        return carteBancaire;
    }

    /**
     * Définit le numéro de CB de l'utilisateur
     * @param carteBancaire
     * @return Int
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
     * Retourne la date de validité de la CB de l'utilisateur
     * @return String
     */
    public String getDateValiditeCarteBancaire() {
        return dateValiditeCarteBancaire;
    }

    /**
     * Définit la date de validité de la CB de l'utilisateur
     * @param dateValiditeCarteBancaire
     * @return Int
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
     * Retourne le RIB de l'utilisateur
     * @return String
     */
    public String getRib() {
        return rib;
    }

    /**
     * Définit le RIB de l'utilisateur
     * @param rib
     * @return Int
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
     * Retourne l'IBAN de l'utilisateur
     * @return String
     */
    public String getIban() {
        return iban;
    }

    /**
     * Définit l'IBAN de l'utilisateur
     * @param iban
     * @return Int
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
     * Retourne la date de création du compte de l'utilisateur
     * @return String
     */
    public String getDateCreation() {
        return dateCreation;
    }

    /**
     * Définit la date de création du compte de l'utilisateur
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
     * Retourne le login de l'utilisateur
     * @return String
     */
    public String getLogin() {
        return login;
    }

    /**
     * Définit le login de l'utilisateur
     * @param login
     * @return Int
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
     * Retourne le password de l'utilisateur
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Définit le password de l'utilisateur
     * @param password
     * @return Int
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
     * Retourne l'ID de la carte de l'utilisateur
     * @return Int
     */
    public int getFk_id_carte() {
        return fk_id_carte;
    }

    /**
     * Définit l'ID de la carte de l'utilisateur
     * @param fk_id_carte
     */
    public void setFk_id_carte(int fk_id_carte) {
        this.fk_id_carte = fk_id_carte;
    }

    /**
     * Retourne l'ID du vélo emprunté par l'utilisateur
     * @return Int
     */
    public int getFk_id_velo() {
        return fk_id_velo;
    }

    /**
     * Définit l'ID du vélo emprunté par l'utilisateur
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
     * Retourne une magnifique chaîne représentant l'objet de façon allégée
     * @return String
     */
    public String toStringLight(){
        return "Utilisateur "+this.id_utilisateur+" : "+this.prenom+" "+this.nom+", ne(e) le "+this.dateNaissance+", adresse : "+this.adresse+" "+this.codePostal+" "+this.ville+" compte cree le : "+this.dateCreation;
    }
    
    /**
     * Retourne une magnifique chaîne représentant les attributs confidentiels de l'objet
     * @return String
     */
    public String toStringSecret(){
        return "Utilisateur "+this.id_utilisateur+", numero CN : "+this.carteBancaire+", date de validite CB : "+this.dateValiditeCarteBancaire+", rib : "+this.rib+", iban : "+this.iban+", login : "+this.login+", password : "+this.password+".";
    }
    
}
