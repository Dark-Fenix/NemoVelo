/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import javax.swing.table.DefaultTableModel;

/**
*
* @author Aurelie
*/
public class ControleurStationVoisine {
    /**
     *
     */
    public Fenetre allView;
    /**
     *
     */
    public StationVoisine fntrSV;

    /**
     *
     * @param aThis
     */
    public ControleurStationVoisine(Fenetre aThis) {
        allView = aThis;
        fntrSV = new StationVoisine(this);
    }
    
    /**
     *
     */
    public void launchView(){
        fntrSV.setEnabled(true);
        fntrSV.setVisible(true);
    }
    
    /**
     *
     */
    public void hideView(){
        fntrSV.setEnabled(false);
        fntrSV.setVisible(false);
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

    /**
     *
     */
    public void LouerPerformed() {
        allView.getLouer().launchView();
        hideView();
    }
    
    /**
     *
     * @param nomBorne
     * @param nbVeloDispo
     * @param nbBorneDispo
     */
    public void addLine(String nomBorne, String nbVeloDispo , String nbBorneDispo){
        DefaultTableModel mod = fntrSV.getTabl();
        mod.addRow(new String[]{"Carré D'art","9","8"});
    }
}
