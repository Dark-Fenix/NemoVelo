/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;
import Config.ConfigGlobale;
import DAO.CompteDAO;
import classes.Compte;

/**
*
* @author Fenix
*/
public class EditionCompte extends javax.swing.JPanel {
    
    private Compte compte;
    
    /**
     * Initialise l'interface d'édition d'un compte
     * @param compte
     */
    public EditionCompte(Compte compte) {
        this.compte = compte;
        initComponents();
        InitialisationEditionCompte(this.compte);
    }

    /**
     * Initialise les champs d'édition et la Google Map
     * @param compte
     */
    private void InitialisationEditionCompte(Compte compte){
        txtTypeCompte.setText(compte.getTypeCompte());
        txtSolde.setText(String.valueOf(compte.getSolde()));
        txtPossesseur.setText(String.valueOf(compte.getFk_id_utilisateur()));
        txtDateCreationCompte.setText(compte.getDateCreation());
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTypeCompte = new javax.swing.JTextField();
        txtSolde = new javax.swing.JTextField();
        txtPossesseur = new javax.swing.JTextField();
        txtDateCreationCompte = new javax.swing.JLabel();

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

        jLabel1.setText("Type de compte");

        jLabel2.setText("Solde");

        jLabel3.setText("Possesseur");

        jLabel4.setText("Date de création du compte");

        txtTypeCompte.setText("jTextField1");

        txtSolde.setText("jTextField2");

        txtPossesseur.setText("jTextField3");

        txtDateCreationCompte.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSolde, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(txtTypeCompte)
                            .addComponent(txtPossesseur, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(boutonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider))
                    .addComponent(txtDateCreationCompte))
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTypeCompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSolde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPossesseur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDateCreationCompte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonReset)
                    .addComponent(boutonSupprimer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonResetMouseClicked
        InitialisationEditionCompte(this.compte);
    }//GEN-LAST:event_boutonResetMouseClicked

    private void boutonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonSupprimerMouseClicked
        this.setVisible(false);
        CompteDAO.deleteCompte(this.compte);
        ConfigGlobale.comptes.remove(this.compte);
        Interfaces.getInterGestionComptes().RemplissageListeComptes();
    }//GEN-LAST:event_boutonSupprimerMouseClicked

    private void boutonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonValiderMouseClicked
        this.compte.setTypeCompte(txtTypeCompte.getText());
        this.compte.setSolde(Double.parseDouble(txtSolde.getText()));
        this.compte.setFk_id_utilisateur(Integer.parseInt(txtPossesseur.getText()));
        if(!ConfigGlobale.comptes.contains(this.compte)){
            CompteDAO.insertCompte(this.compte);
            ConfigGlobale.comptes.add(this.compte);
        }
        else {
            CompteDAO.updateCompte(this.compte);
        }
    }//GEN-LAST:event_boutonValiderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtDateCreationCompte;
    private javax.swing.JTextField txtPossesseur;
    private javax.swing.JTextField txtSolde;
    private javax.swing.JTextField txtTypeCompte;
    // End of variables declaration//GEN-END:variables
}
