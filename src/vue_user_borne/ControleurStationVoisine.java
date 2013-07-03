/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import javax.swing.table.DefaultTableModel;

public class ControleurStationVoisine {
    public ControleurStation allView;
    public StationVoisine fntrSV;

    public ControleurStationVoisine(ControleurStation aThis) {
        allView = aThis;
        fntrSV = new StationVoisine(this);
    }
    
    public void launchView(){
        fntrSV.setEnabled(true);
        fntrSV.setVisible(true);
    }
    
    public void hideView(){
        fntrSV.setEnabled(false);
        fntrSV.setVisible(false);
    }

    public void RendrePerformed() {
        allView.getRendre().launchView();
        hideView();
    }

    public void AccueilPerformed() {
        allView.getHome().launchView();
        hideView();
    }

    public void LouerPerformed() {
        allView.getLouer().launchView();
        hideView();
    }
    
    public void addLine(String nomBorne, String nbVeloDispo , String nbBorneDispo){
        DefaultTableModel mod = fntrSV.getTabl();
        mod.addRow(new String[]{"Carré D'art","9","8"});
    }
}
