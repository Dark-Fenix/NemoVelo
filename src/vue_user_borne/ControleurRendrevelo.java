/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

/**
*
* @author Aurelie
*/
public class ControleurRendrevelo {

    public Fenetre allView;
    public RendreVelo fntrRV;
    
    public ControleurRendrevelo(Fenetre aThis) {
        allView = aThis;
        fntrRV = new RendreVelo(this);
    }
    
    public void launchView(){
        fntrRV.setEnabled(true);
        fntrRV.setVisible(true);
    }
    
    public void hideView(){
        fntrRV.setEnabled(false);
        fntrRV.setVisible(false);
    }

    public void LouerPerformed() {
        allView.getLouer().launchView();
        hideView();
    }

    public void AccueilPerformed() {
        allView.getHome().launchView();
        hideView();
    }
}
