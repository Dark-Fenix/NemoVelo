/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;
import Config.ConfigGlobale;
import DAO.StationDAO;
import classes.Station;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import Tools.JGoogleMapEditorPan;

/**
*
* @author Fenix
*/
public class EditionStation extends javax.swing.JPanel {

    private Station station;
    
    /**
     * Initialise l'interface d'édition d'une station
     * @param station
     */
    public EditionStation(Station station) {
        this.station = station;
        initComponents();
        InitialisationEditionStation(this.station);
    }

    /**
     * Initialise les champs d'édition et la Google Map
     * @param station
     */
    private void InitialisationEditionStation(Station station){
        txtSerialNumber.setText(station.getSerialNumber());
        txtEtat.setText(station.getEtat());
        txtLatitude.setText(station.getLatitude());
        txtLongitude.setText(station.getLongitude());
        try {
            JGoogleMapEditorPan googleMap = new JGoogleMapEditorPan();
            googleMap.showCoordinate(station.getLatitude(), station.getLongitude(), 215, 200);
            swapPanel(panelGoogleMap, googleMap);
        }
        catch (Exception ex) {
            Logger.getLogger(InterfaceAdminGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Fonction utilitaire pour palier aux problèmes de rafraichissement
     * @param panelDeBase
     * @param newPanel
     */
    public void swapPanel(JComponent panelDeBase, JComponent newPanel){
        panelDeBase.removeAll();
        panelDeBase.add(newPanel);
        revalidate();
        repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boutonValider = new javax.swing.JButton();
        boutonReset = new javax.swing.JButton();
        boutonSupprimer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        txtEtat = new javax.swing.JTextField();
        txtLatitude = new javax.swing.JTextField();
        panelGoogleMap = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtLongitude = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 204, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        boutonValider.setText("Valider");
        boutonValider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonValiderMouseClicked(evt);
            }
        });

        boutonReset.setText("Reset");
        boutonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonResetMouseClicked(evt);
            }
        });

        boutonSupprimer.setText("Supprimer");
        boutonSupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonSupprimerMouseClicked(evt);
            }
        });

        jLabel1.setText("Serial Number");

        jLabel2.setText("Etat");

        jLabel4.setText("Latitude");

        txtSerialNumber.setText("jTextField1");

        txtEtat.setText("jTextField2");

        txtLatitude.setText("jTextField6");

        panelGoogleMap.setLayout(new javax.swing.BoxLayout(panelGoogleMap, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setText("Longitude");

        txtLongitude.setText("jTextField6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLongitude, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEtat, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(txtSerialNumber)
                        .addComponent(txtLatitude)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider))
                    .addComponent(panelGoogleMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtEtat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtLongitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelGoogleMap, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonReset)
                    .addComponent(boutonSupprimer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonResetMouseClicked
        InitialisationEditionStation(this.station);
    }//GEN-LAST:event_boutonResetMouseClicked

    private void boutonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonSupprimerMouseClicked
        this.setVisible(false);
        StationDAO.deleteStation(this.station);
        ConfigGlobale.stations.remove(this.station);
        Interfaces.getInterGestionStations().RemplissageListeStations();
    }//GEN-LAST:event_boutonSupprimerMouseClicked

    private void boutonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonValiderMouseClicked
        this.station.setSerialNumber(txtSerialNumber.getText());
        this.station.setEtat(txtEtat.getText());
        this.station.setLatitude(txtLatitude.getText());
        this.station.setLongitude(txtLongitude.getText());
        if(!ConfigGlobale.stations.contains(this.station)){
            StationDAO.insertStation(this.station);
            ConfigGlobale.stations.add(this.station);
        }
        else {
            StationDAO.updateStation(this.station);
        }
    }//GEN-LAST:event_boutonValiderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelGoogleMap;
    private javax.swing.JTextField txtEtat;
    private javax.swing.JTextField txtLatitude;
    private javax.swing.JTextField txtLongitude;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
