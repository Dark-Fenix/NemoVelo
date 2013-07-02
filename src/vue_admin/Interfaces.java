/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;


/**
 *
 * @author HallerCasagrande-F
 */
public class Interfaces {
    
    private InterfaceAdminGestionUtilisateurs interGestionUsers = new InterfaceAdminGestionUtilisateurs();
    private InterfaceAdminGestionBornes interGestionBornes = new InterfaceAdminGestionBornes();
    private InterfaceAdminGestionComptes interGestionComptes = new InterfaceAdminGestionComptes();
    private InterfaceAdminGestionCartes interGestionCartes = new InterfaceAdminGestionCartes();
    private InterfaceAdminGestionVelos interGestionVelos = new InterfaceAdminGestionVelos();
    private InterfaceAdminGestionStations interGestionStations = new InterfaceAdminGestionStations();

    /**
     *
     * @return
     */
    public InterfaceAdminGestionUtilisateurs getInterGestionUsers() {
        return interGestionUsers;
    }

    /**
     *
     * @param interGestionUsers
     */
    public void setInterGestionUsers(InterfaceAdminGestionUtilisateurs interGestionUsers) {
        this.interGestionUsers = interGestionUsers;
    }

    /**
     *
     * @return
     */
    public InterfaceAdminGestionBornes getInterGestionBornes() {
        return interGestionBornes;
    }

    /**
     *
     * @param interGestionBornes
     */
    public void setInterGestionBornes(InterfaceAdminGestionBornes interGestionBornes) {
        this.interGestionBornes = interGestionBornes;
    }

    /**
     *
     * @return
     */
    public InterfaceAdminGestionComptes getInterGestionComptes() {
        return interGestionComptes;
    }

    /**
     *
     * @param interGestionComptes
     */
    public void setInterGestionComptes(InterfaceAdminGestionComptes interGestionComptes) {
        this.interGestionComptes = interGestionComptes;
    }

    /**
     *
     * @return
     */
    public InterfaceAdminGestionCartes getInterGestionCartes() {
        return interGestionCartes;
    }

    /**
     *
     * @param interGestionCartes
     */
    public void setInterGestionCartes(InterfaceAdminGestionCartes interGestionCartes) {
        this.interGestionCartes = interGestionCartes;
    }

    /**
     *
     * @return
     */
    public InterfaceAdminGestionVelos getInterGestionVelos() {
        return interGestionVelos;
    }

    /**
     *
     * @param interGestionVelos
     */
    public void setInterGestionVelos(InterfaceAdminGestionVelos interGestionVelos) {
        this.interGestionVelos = interGestionVelos;
    }

    /**
     *
     * @return
     */
    public InterfaceAdminGestionStations getInterGestionStations() {
        return interGestionStations;
    }

    /**
     *
     * @param interGestionStations
     */
    public void setInterGestionStations(InterfaceAdminGestionStations interGestionStations) {
        this.interGestionStations = interGestionStations;
    }
    
    
}
