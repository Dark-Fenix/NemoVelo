/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;


/**
 *
 * @author HallerCasagrande-F
 */
public class Tools {
    
    private InterfaceAdminGestionUtilisateurs interGestionUsers = new InterfaceAdminGestionUtilisateurs();
    private InterfaceAdminGestionBornes interGestionBornes = new InterfaceAdminGestionBornes();
    private InterfaceAdminGestionComptes interGestionComptes = new InterfaceAdminGestionComptes();
    private InterfaceAdminGestionCartes interGestionCartes = new InterfaceAdminGestionCartes();
    private InterfaceAdminGestionVelos interGestionVelos = new InterfaceAdminGestionVelos();
    private InterfaceAdminGestionStations interGestionStations = new InterfaceAdminGestionStations();

    public InterfaceAdminGestionUtilisateurs getInterGestionUsers() {
        return interGestionUsers;
    }

    public void setInterGestionUsers(InterfaceAdminGestionUtilisateurs interGestionUsers) {
        this.interGestionUsers = interGestionUsers;
    }

    public InterfaceAdminGestionBornes getInterGestionBornes() {
        return interGestionBornes;
    }

    public void setInterGestionBornes(InterfaceAdminGestionBornes interGestionBornes) {
        this.interGestionBornes = interGestionBornes;
    }

    public InterfaceAdminGestionComptes getInterGestionComptes() {
        return interGestionComptes;
    }

    public void setInterGestionComptes(InterfaceAdminGestionComptes interGestionComptes) {
        this.interGestionComptes = interGestionComptes;
    }

    public InterfaceAdminGestionCartes getInterGestionCartes() {
        return interGestionCartes;
    }

    public void setInterGestionCartes(InterfaceAdminGestionCartes interGestionCartes) {
        this.interGestionCartes = interGestionCartes;
    }

    public InterfaceAdminGestionVelos getInterGestionVelos() {
        return interGestionVelos;
    }

    public void setInterGestionVelos(InterfaceAdminGestionVelos interGestionVelos) {
        this.interGestionVelos = interGestionVelos;
    }

    public InterfaceAdminGestionStations getInterGestionStations() {
        return interGestionStations;
    }

    public void setInterGestionStations(InterfaceAdminGestionStations interGestionStations) {
        this.interGestionStations = interGestionStations;
    }
    
    
}
