/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;
import Config.ConfigGlobale;
import DAO.CarteDAO;
import classes.Carte;
import classes.Utilisateur;

/**
*
* @author Fenix
*/
public class EditionCarte extends javax.swing.JPanel {

    private Carte carte;
    private Utilisateur user = new Utilisateur();
    
    public EditionCarte(Carte carte) {
        this.carte = carte;
        for (Utilisateur u : ConfigGlobale.utilisateurs) {
            if(u.getFk_id_carte()==this.carte.getId_carte()){
                this.user = u;
                break;
            }
            else {
                this.user.setId_utilisateur(-1);
            }
        }
        initComponents();
        InitialisationEditionCarte(this.carte);
    }

    private void InitialisationEditionCarte(Carte carte){
        txtSerialNumber.setText(carte.getSerialNumber());
        txtProprio.setText(Integer.toString(user.getId_utilisateur()));
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
        txtSerialNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProprio = new javax.swing.JTextField();

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

        txtSerialNumber.setText("jTextField1");

        jLabel2.setText("Propriétaire");

        txtProprio.setEditable(false);
        txtProprio.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(boutonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider))
                    .addComponent(txtProprio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtProprio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonReset)
                    .addComponent(boutonSupprimer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonResetMouseClicked
        InitialisationEditionCarte(this.carte);
    }//GEN-LAST:event_boutonResetMouseClicked

    private void boutonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonSupprimerMouseClicked
        this.setVisible(false);
        CarteDAO.deleteCarte(this.carte);
        ConfigGlobale.cartes.remove(this.carte);
        InterfaceAdminGestion.tools.getInterGestionCartes().RemplissageListeCartes();
    }//GEN-LAST:event_boutonSupprimerMouseClicked

    private void boutonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonValiderMouseClicked
        this.carte.setSerialNumber(txtSerialNumber.getText());
        if(!ConfigGlobale.cartes.contains(this.carte)){
            CarteDAO.insertCarte(this.carte);
            ConfigGlobale.cartes.add(this.carte);
        }
        else {
            CarteDAO.updateCarte(this.carte);
        }
    }//GEN-LAST:event_boutonValiderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtProprio;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
