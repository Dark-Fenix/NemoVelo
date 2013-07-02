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

    /**
     * Retourne l'interface d'administration principale en la créant au besoin (initialisation)
     * @return InterfaceAdminGestion
     */
    public static InterfaceAdminGestion getInterAdminGestion() {
        if (interAdminGestion == null){
            interAdminGestion = new InterfaceAdminGestion();
        }
        return interAdminGestion;
    }

    /**
     * Définit l'interface d'administration principale comme celle fournie
     * @param interAdminGestion
     */
    public static void setInterAdminGestion(InterfaceAdminGestion a) {
        interAdminGestion = a;
    }

    /**
     * Retourne l'interface d'administration des utilisateurs en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionUtilisateurs
     */
    public static InterfaceAdminGestionUtilisateurs getInterGestionUsers() {
        if (interGestionUsers == null){
            interGestionUsers = new InterfaceAdminGestionUtilisateurs();
        }
        return interGestionUsers;
    }

    /**
     * Définit l'interface d'administration des utilisateurs comme celle fournie
     * @param interGestionUsers
     */
    public static void setInterGestionUsers(InterfaceAdminGestionUtilisateurs b) {
        interGestionUsers = b;
    }

    /**
     * Retourne l'interface d'administration des bornes en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionBornes
     */
    public static InterfaceAdminGestionBornes getInterGestionBornes() {
        if (interGestionBornes == null){
            interGestionBornes = new InterfaceAdminGestionBornes();
        }
        return interGestionBornes;
    }

    /**
     * Définit l'interface d'administration des bornes comme celle fournie
     * @param interGestionBornes
     */
    public static void setInterGestionBornes(InterfaceAdminGestionBornes c) {
        interGestionBornes = c;
    }

    /**
     * Retourne l'interface d'administration des comptes en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionComptes
     */
    public static InterfaceAdminGestionComptes getInterGestionComptes() {
        if (interGestionComptes == null){
            interGestionComptes = new InterfaceAdminGestionComptes();
        }
        return interGestionComptes;
    }

    /**
     * Définit l'interface d'administration des comptes comme celle fournie
     * @param interGestionComptes
     */
    public static void setInterGestionComptes(InterfaceAdminGestionComptes d) {
        interGestionComptes = d;
    }

    /** 
     * Retourne l'interface d'administration des cartes en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionCartes
     */
    public static InterfaceAdminGestionCartes getInterGestionCartes() {
        if (interGestionCartes == null){
            interGestionCartes = new InterfaceAdminGestionCartes();
        }
        return interGestionCartes;
    }

    /**
     * Définit l'interface d'administration des cartes comme celle fournie
     * @param interGestionCartes
     */
    public static void setInterGestionCartes(InterfaceAdminGestionCartes e) {
        interGestionCartes = e;
    }

    /**
     * Retourne l'interface d'administration des vélos en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionVelos
     */
    public static InterfaceAdminGestionVelos getInterGestionVelos() {
        if (interGestionVelos == null){
            interGestionVelos = new InterfaceAdminGestionVelos();
        }
        return interGestionVelos;
    }

    /**
     * Définit l'interface d'administration des vélos comme celle fournie
     * @param interGestionVelos
     */
    public static void setInterGestionVelos(InterfaceAdminGestionVelos f) {
        interGestionVelos = f;
    }

    /**
     * Retourne l'interface d'administration des stations en la créant au besoin (initialisation)
     * @return InterfaceAdminGestionStations
     */
    public static InterfaceAdminGestionStations getInterGestionStations() {
        if (interGestionStations == null){
            interGestionStations = new InterfaceAdminGestionStations();
        }
        return interGestionStations;
    }

    /**
     * Définit l'interface d'administration des stations comme celle fournie
     * @param interGestionStations
     */
    public static void setInterGestionStations(InterfaceAdminGestionStations g) {
        interGestionStations = g;
    }
    
    
}
