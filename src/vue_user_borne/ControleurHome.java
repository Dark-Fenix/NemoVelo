/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

public class ControleurHome {

    public Fenetre allView;
    public Home fntrHome;
    
    public ControleurHome(Fenetre aThis) {
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
        allView.getLouer().launchView();
        hideView();
    }

    public void rendrePerformed() {
        allView.getRendre().launchView();
        hideView();
    }
    
}
