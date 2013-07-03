/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

/**
*
* @author Aurélie
*/
public class ControleurHome {

    public ControleurStation allView;
    public Home fntrHome;
    
    public ControleurHome(ControleurStation aThis) {
        allView = aThis;
        fntrHome = new Home(this);
    }

    public void launchView(){
        fntrHome.setEnabled(true);
        fntrHome.setVisible(true);
    }
    
    public void hideView(){
        fntrHome.setEnabled(false);
        fntrHome.setVisible(false);
    }

    public void louerPerformed() {
        hideView();
        allView.getLouer().launchView();
    }

    public void rendrePerformed() {
        hideView();
        allView.getRendre().launchView();
    } 
}
