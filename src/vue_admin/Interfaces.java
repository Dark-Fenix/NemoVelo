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
    
    private static InterfaceAdminGestionUtilisateurs interGestionUsers = null;
    private static InterfaceAdminGestionBornes interGestionBornes = null;
    private static InterfaceAdminGestionComptes interGestionComptes = null;
    private static InterfaceAdminGestionCartes interGestionCartes = null;
    private static InterfaceAdminGestionVelos interGestionVelos = null;
    private static InterfaceAdminGestionStations interGestionStations = null;
    private static InterfaceAdminGestion interAdminGestion = null;

    public static InterfaceAdminGestion getInterAdminGestion() {
        if (interAdminGestion == null){
            interAdminGestion = new InterfaceAdminGestion();
        }
        return interAdminGestion;
    }

    public static void setInterAdminGestion(InterfaceAdminGestion a) {
        interAdminGestion = a;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionUtilisateurs getInterGestionUsers() {
        if (interGestionUsers == null){
            interGestionUsers = new InterfaceAdminGestionUtilisateurs();
        }
        return interGestionUsers;
    }

    /**
     *
     * @param interGestionUsers
     */
    public static void setInterGestionUsers(InterfaceAdminGestionUtilisateurs b) {
        interGestionUsers = b;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionBornes getInterGestionBornes() {
        if (interGestionBornes == null){
            interGestionBornes = new InterfaceAdminGestionBornes();
        }
        return interGestionBornes;
    }

    /**
     *
     * @param interGestionBornes
     */
    public static void setInterGestionBornes(InterfaceAdminGestionBornes c) {
        interGestionBornes = c;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionComptes getInterGestionComptes() {
        if (interGestionComptes == null){
            interGestionComptes = new InterfaceAdminGestionComptes();
        }
        return interGestionComptes;
    }

    /**
     *
     * @param interGestionComptes
     */
    public static void setInterGestionComptes(InterfaceAdminGestionComptes d) {
        interGestionComptes = d;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionCartes getInterGestionCartes() {
        if (interGestionCartes == null){
            interGestionCartes = new InterfaceAdminGestionCartes();
        }
        return interGestionCartes;
    }

    /**
     *
     * @param interGestionCartes
     */
    public static void setInterGestionCartes(InterfaceAdminGestionCartes e) {
        interGestionCartes = e;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionVelos getInterGestionVelos() {
        if (interGestionVelos == null){
            interGestionVelos = new InterfaceAdminGestionVelos();
        }
        return interGestionVelos;
    }

    /**
     *
     * @param interGestionVelos
     */
    public static void setInterGestionVelos(InterfaceAdminGestionVelos f) {
        interGestionVelos = f;
    }

    /**
     *
     * @return
     */
    public static InterfaceAdminGestionStations getInterGestionStations() {
        if (interGestionStations == null){
            interGestionStations = new InterfaceAdminGestionStations();
        }
        return interGestionStations;
    }

    /**
     *
     * @param interGestionStations
     */
    public static void setInterGestionStations(InterfaceAdminGestionStations g) {
        interGestionStations = g;
    }
    
    
}
