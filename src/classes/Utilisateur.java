
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
    
    public Utilisateur(){
    }

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
    
    public int getId_utilisateur() {
        return id_utilisateur;
    }

    // NE DOIT PAS ETRE UTILISE POUR NE PAS INTERFERER AVEC LA BDD
    /*public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }*/

    public String getPrenom() {
        return prenom;
    }

    public int setPrenom(String prenom) {
        if(prenom.length()>30){
            this.prenom = prenom;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getNom() {
        return nom;
    }

    public int setNom(String nom) {
        if(nom.length()>30){
            this.nom = nom;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public int setDateNaissance(String dateNaissance) {
        if(dateNaissance.matches(ConfigGlobale.regexValidationDate)){
            this.dateNaissance = dateNaissance;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getAdresse() {
        return adresse;
    }

    public int setAdresse(String adresse) {
        if(adresse.length()>100){
            this.adresse = adresse;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getCodePostal() {
        return codePostal;
    }

    public int setCodePostal(String codePostal) {
        if(codePostal.length()>5){
            this.codePostal = codePostal;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getVille() {
        return ville;
    }

    public int setVille(String ville) {
        if(ville.length()>30){
            this.ville = ville;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getCarteBancaire() {
        return carteBancaire;
    }

    public int setCarteBancaire(String carteBancaire) {
        if(carteBancaire.length()>16){
            this.carteBancaire = carteBancaire;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getDateValiditeCarteBancaire() {
        return dateValiditeCarteBancaire;
    }

    public int setDateValiditeCarteBancaire(String dateValiditeCarteBancaire) {
        if(dateValiditeCarteBancaire.matches(ConfigGlobale.regexValidationDate)){
            this.dateValiditeCarteBancaire = dateValiditeCarteBancaire;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getRib() {
        return rib;
    }

    public int setRib(String rib) {
        if(rib.length()>23){
            this.rib = rib;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getIban() {
        return iban;
    }

    public int setIban(String iban) {
        if(iban.length()>34){
            this.iban = iban;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public int setDateCreation(String dateCreation) {
        if(dateCreation.matches(ConfigGlobale.regexValidationDate)){
            this.dateCreation = dateCreation;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getLogin() {
        return login;
    }

    public int setLogin(String login) {
        if(login.length()>30){
            this.login = login;
            return 0;
        }
        else{
            return -1;
        }
    }

    public String getPassword() {
        return password;
    }

    public int setPassword(String password) {
        if(password.length()>30){
            this.password = password;
            return 0;
        }
        else{
            return -1;
        }
    }

    public int getFk_id_carte() {
        return fk_id_carte;
    }

    public void setFk_id_carte(int fk_id_carte) {
        this.fk_id_carte = fk_id_carte;
    }

    public int getFk_id_velo() {
        return fk_id_velo;
    }

    public void setFk_id_velo(int fk_id_velo) {
        this.fk_id_velo = fk_id_velo;
    }
    
    @Override
    public String toString(){
        return "Utilisateur "+this.id_utilisateur+" : "+this.prenom+" "+this.nom+", ne(e) le "+this.dateNaissance+", adresse : "+this.adresse+" "+this.codePostal+" "+this.ville+" compte cree le : "+this.dateCreation;
    }
    
    public String toStringSecret(){
        return "Utilisateur "+this.id_utilisateur+", numero CN : "+this.carteBancaire+", date de validite CB : "+this.dateValiditeCarteBancaire+", rib : "+this.rib+", iban : "+this.iban+", login : "+this.login+", password : "+this.password+".";
    }
    
}
