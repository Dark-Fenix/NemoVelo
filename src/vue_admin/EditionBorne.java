/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;
import Config.ConfigGlobale;
import DAO.BorneDAO;
import classes.Borne;
import classes.Station;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import vue_user_borne.JGoogleMapEditorPan;

/**
 *
 * @author HallerCasagrande-F
 */
public class EditionBorne extends javax.swing.JPanel {

    /**
     * Creates new form EditionUtilisateur
     */
    /*public EditionUtilisateur() {
        initComponents();
    }*/
    
    private Borne borne;
    private Station station;
    
    public EditionBorne(Borne borne) {
        this.borne = borne;
        for (Station s : ConfigGlobale.stations) {
            if(s.getId_station()==this.borne.getFk_id_station()){
                this.station = s;
                break;
            }
        }
        initComponents();
        InitialisationEditionBorne(this.borne);
    }

    private void InitialisationEditionBorne(Borne borne){
        txtSerialNumber.setText(borne.getSerialNumber());
        txtEtat.setText(borne.getEtat());
        txtBorne.setText(String.valueOf(borne.getFk_id_station()));
        try {
            JGoogleMapEditorPan googleMap = new JGoogleMapEditorPan();
            googleMap.showCoordinate(station.getLatitude(), station.getLongitude(), 215, 200);
            swapPanel(panelGoogleMap, googleMap);
        }
        catch (Exception ex) {
            Logger.getLogger(InterfaceAdminGestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
        txtBorne = new javax.swing.JTextField();
        panelGoogleMap = new javax.swing.JPanel();

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

        jLabel4.setText("Attaché à la station");

        txtSerialNumber.setText("jTextField1");

        txtEtat.setText("jTextField2");

        txtBorne.setText("jTextField6");

        panelGoogleMap.setLayout(new javax.swing.BoxLayout(panelGoogleMap, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBorne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEtat, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(txtSerialNumber))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider))
                    .addComponent(panelGoogleMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 83, Short.MAX_VALUE))
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
                            .addComponent(txtBorne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        InitialisationEditionBorne(this.borne);
    }//GEN-LAST:event_boutonResetMouseClicked

    private void boutonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonSupprimerMouseClicked
        ConfigGlobale.bornes.remove(this.borne);
        BorneDAO.deleteBorne(this.borne);
        // Refaire ça au propre, c'est moche...
        this.setVisible(false);
    }//GEN-LAST:event_boutonSupprimerMouseClicked

    private void boutonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonValiderMouseClicked
        this.borne.setSerialNumber(txtSerialNumber.getText());
        this.borne.setEtat(txtEtat.getText());
        this.borne.setFk_id_station(Integer.parseInt(txtBorne.getText()));
        if(!ConfigGlobale.bornes.contains(this.borne)){
            BorneDAO.insertBorne(this.borne);
            ConfigGlobale.bornes.add(this.borne);
        }
        else {
            BorneDAO.updateBorne(this.borne);
        }
    }//GEN-LAST:event_boutonValiderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelGoogleMap;
    private javax.swing.JTextField txtBorne;
    private javax.swing.JTextField txtEtat;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
