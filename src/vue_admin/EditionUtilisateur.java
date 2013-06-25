/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;
import Config.ConfigGlobale;
import classes.Utilisateur;

/**
 *
 * @author HallerCasagrande-F
 */
public class EditionUtilisateur extends javax.swing.JPanel {

    /**
     * Creates new form EditionUtilisateur
     */
    /*public EditionUtilisateur() {
        initComponents();
    }*/
    
    private Utilisateur user;
    
    public EditionUtilisateur(Utilisateur user) {
        this.user = user;
        initComponents();
        InitialisationEditionUser(this.user);
    }

    private void InitialisationEditionUser(Utilisateur user){
        txtNom.setText(user.getNom());
        txtPrenom.setText(user.getPrenom());
        txtAdresse.setText(user.getAdresse());
        txtCodePostal.setText(user.getCodePostal());
        txtVille.setText(user.getVille());
        txtDateNaissance.setText(user.getDateNaissance());
        txtUsername.setText(user.getLogin());
        txtPassword.setText(user.getPassword());
        txtCarteBancaire.setText(user.getCarteBancaire());
        txtDateValiditeCB.setText(user.getDateValiditeCarteBancaire());
        txtRIB.setText(user.getRib());
        txtIBAN.setText(user.getIban());
        txtCarteUtilisateur.setText(String.valueOf(user.getFk_id_carte()));
        txtVelo.setText(String.valueOf(user.getFk_id_velo()));
        txtDateCreation.setText(user.getDateCreation());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        txtDateNaissance = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtCodePostal = new javax.swing.JTextField();
        txtCarteBancaire = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDateValiditeCB = new javax.swing.JTextField();
        txtRIB = new javax.swing.JTextField();
        txtIBAN = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtCarteUtilisateur = new javax.swing.JTextField();
        txtVelo = new javax.swing.JTextField();
        txtDateCreation = new javax.swing.JLabel();

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

        jLabel1.setText("Nom");

        jLabel2.setText("Prénom");

        jLabel3.setText("Adresse");

        jLabel4.setText("Code Postal");

        jLabel5.setText("Ville");

        jLabel6.setText("Date de naissance");

        txtNom.setText("jTextField1");

        txtPrenom.setText("jTextField2");

        txtAdresse.setText("jTextField3");
        txtAdresse.setAutoscrolls(false);
        txtAdresse.setMaximumSize(new java.awt.Dimension(129, 30));
        txtAdresse.setMinimumSize(new java.awt.Dimension(129, 30));
        txtAdresse.setPreferredSize(new java.awt.Dimension(129, 30));

        txtDateNaissance.setText("jTextField4");

        txtVille.setText("jTextField5");

        txtCodePostal.setText("jTextField6");

        txtCarteBancaire.setText("jTextField7");

        jLabel7.setText("Carte bancaire");

        jLabel8.setText("Date de validité CB");

        jLabel9.setText("RIB");

        jLabel10.setText("IBAN");

        jLabel11.setText("Date de création de l'utilisateur :");

        jLabel12.setText("Username");

        jLabel13.setText("Password");

        jLabel14.setText("Carte utilisateur");

        jLabel15.setText("Vélo loué");

        txtDateValiditeCB.setText("jTextField8");

        txtRIB.setText("jTextField10");

        txtIBAN.setText("jTextField11");

        txtUsername.setText("jTextField12");

        txtPassword.setText("jTextField13");

        txtCarteUtilisateur.setText("jTextField14");

        txtVelo.setText("jTextField15");

        txtDateCreation.setText("jLabel16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVille)
                    .addComponent(txtPrenom)
                    .addComponent(txtNom)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodePostal)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boutonSupprimer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boutonValider)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarteUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateValiditeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCarteBancaire, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateCreation))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRIB)
                                    .addComponent(txtIBAN))))
                        .addContainerGap(83, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCarteBancaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDateValiditeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRIB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodePostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDateNaissance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtDateCreation)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtCarteUtilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtVelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonValider)
                    .addComponent(boutonReset)
                    .addComponent(boutonSupprimer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boutonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonResetMouseClicked
        InitialisationEditionUser(this.user);
    }//GEN-LAST:event_boutonResetMouseClicked

    private void boutonSupprimerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonSupprimerMouseClicked
        ConfigGlobale.utilisateurs.remove(this.user);
        // Refaire ça au propre, c'est moche...
        this.setVisible(false);
    }//GEN-LAST:event_boutonSupprimerMouseClicked

    private void boutonValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonValiderMouseClicked
        this.user.setNom(txtNom.getText());
        this.user.setPrenom(txtPrenom.getText());
        this.user.setAdresse(txtAdresse.getText());
        this.user.setCodePostal(txtCodePostal.getText());
        this.user.setVille(txtVille.getText());
        this.user.setDateNaissance(txtDateNaissance.getText());
        this.user.setLogin(txtUsername.getText());
        this.user.setPassword(txtPassword.getText());
        this.user.setCarteBancaire(txtCarteBancaire.getText());
        this.user.setDateValiditeCarteBancaire(txtCarteBancaire.getText());
        this.user.setRib(txtRIB.getText());
        this.user.setIban(txtIBAN.getText());
        this.user.setFk_id_carte(Integer.parseInt(txtCarteUtilisateur.getText()));
        this.user.setFk_id_velo(Integer.parseInt(txtVelo.getText()));
        if(!ConfigGlobale.utilisateurs.contains(this.user)){
            ConfigGlobale.utilisateurs.add(this.user);
            //this.user.setId_utilisateur(ConfigGlobale.utilisateurs.indexOf(this.user));
        }
    }//GEN-LAST:event_boutonValiderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonReset;
    private javax.swing.JButton boutonSupprimer;
    private javax.swing.JButton boutonValider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCarteBancaire;
    private javax.swing.JTextField txtCarteUtilisateur;
    private javax.swing.JTextField txtCodePostal;
    private javax.swing.JLabel txtDateCreation;
    private javax.swing.JTextField txtDateNaissance;
    private javax.swing.JTextField txtDateValiditeCB;
    private javax.swing.JTextField txtIBAN;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtRIB;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtVelo;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
