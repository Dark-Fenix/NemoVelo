/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

/**
*
* @author Aurelie
*/
public class ControleurLouerVelo {

    /**
     *
     */
    public Fenetre allView;
    /**
     *
     */
    public LouerVelo fntrLV;
    
    /**
     *
     * @param aThis
     */
    public ControleurLouerVelo(Fenetre aThis) {
        allView = aThis;
        fntrLV = new LouerVelo(this);
    }
    
    
    /**
     *
     */
    public void launchView(){
        fntrLV.setEnabled(true);
        fntrLV.setVisible(true);
    }
    
    /**
     *
     */
    public void hideView(){
        fntrLV.setEnabled(false);
        fntrLV.setVisible(false);
    }

    /**
     *
     */
    public void RendrePerformed() {
        allView.getRendre().launchView();
        hideView();
    }

    /**
     *
     */
    public void AccueilPerformed() {
        allView.getHome().launchView();
        hideView();
    }
}
