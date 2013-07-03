/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

/**
 *
 * @author Aurélie
 */
public class ControleurStation {
    
    private ControleurHome home;
    private ControleurLouerVelo louer;
    private ControleurRendrevelo rendre;
    private ControleurStationVoisine voisin;

    public ControleurStation(){
        home  = new ControleurHome(this);
        louer = new ControleurLouerVelo(this);
        rendre = new ControleurRendrevelo(this);
        voisin = new ControleurStationVoisine(this);
    }
    
    public void launch(){
        home.launchView();
    }

    public ControleurHome getHome() {
        return home;
    }

    public ControleurLouerVelo getLouer() {
        return louer;
    }

    public ControleurRendrevelo getRendre() {
        return rendre;
    }

    public ControleurStationVoisine getVoisin() {
        return voisin;
    }

}
