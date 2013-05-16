
package classes;

/**
 *
 * @author HallerCasagrande-F
 */
public class Utilisateur {
    
    private int id_utilisateur = 0;
    private String carteIdentite = "";
    private String prenom = "";
    private String nom = "";
    private String dateNaissance = "";
    private String adresse = "";
    private String codePostal = "";
    private String ville = "";
    private String carteBancaire = "";
    private String dateValiditeCarteBancaire = "";
    private String rib = "";
    private String iban = "";
    private String dateCreation = "";
    private String login = "";
    private String password = "";
    private int fk_id_carte = -1;
    private int fk_id_velo = -1;
    
    public Utilisateur(){
    }

    public Utilisateur(int id_utilisateur, String carteIdentite, String prenom, String nom, String dateNaissance, String adresse, String codePostal, String ville, String carteBancaire, String dateValiditeCarteBancaire, String rib, String iban, String dateCreation, String login, String password, int fk_id_carte, int fk_id_velo){
        this.id_utilisateur = id_utilisateur;
        this.carteIdentite = carteIdentite;
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

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public String getCarteIdentite() {
        return carteIdentite;
    }

    public void setCarteIdentite(String carteIdentite) {
        this.carteIdentite = carteIdentite;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCarteBancaire() {
        return carteBancaire;
    }

    public void setCarteBancaire(String carteBancaire) {
        this.carteBancaire = carteBancaire;
    }

    public String getDateValiditeCarteBancaire() {
        return dateValiditeCarteBancaire;
    }

    public void setDateValiditeCarteBancaire(String dateValiditeCarteBancaire) {
        this.dateValiditeCarteBancaire = dateValiditeCarteBancaire;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
}
