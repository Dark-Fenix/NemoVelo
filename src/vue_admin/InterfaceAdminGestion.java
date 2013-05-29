/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;

import javax.swing.*;


    /**
 *
 * @author HallerCasagrande-F
 */
public class InterfaceAdminGestion extends javax.swing.JFrame {

    private JPanel current;
    private JPanel interfaceAdminGestionComptes = new InterfaceAdminGestionComptes();
    private JPanel interfaceAdminGestionUtilisateurs = new InterfaceAdminGestionUtilisateurs();
    /**
     * Creates new form InterfaceAdminGestion
     */
    public InterfaceAdminGestion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titreInterfaceGestion = new javax.swing.JLabel();
        menuBoutons = new javax.swing.JPanel();
        boutonUtilisateurs = new javax.swing.JButton();
        boutonComptes = new javax.swing.JButton();
        boutonCartes = new javax.swing.JButton();
        boutonStations = new javax.swing.JButton();
        boutonBornes = new javax.swing.JButton();
        boutonVelos = new javax.swing.JButton();
        panelFondInterfaceGestion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NemoVelo");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        titreInterfaceGestion.setBackground(new java.awt.Color(204, 255, 255));
        titreInterfaceGestion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titreInterfaceGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titreInterfaceGestion.setText("Interface de gestion NemoVelo");
        titreInterfaceGestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menuBoutons.setBackground(new java.awt.Color(51, 153, 255));

        boutonUtilisateurs.setText("Utilisateurs");
        boutonUtilisateurs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boutonUtilisateursMouseClicked(evt);
            }
        });

        boutonComptes.setText("Comptes");

        boutonCartes.setText("Cartes");

        boutonStations.setText("Stations");

        boutonBornes.setText("Bornes");

        boutonVelos.setText("Vélos");

        javax.swing.GroupLayout menuBoutonsLayout = new javax.swing.GroupLayout(menuBoutons);
        menuBoutons.setLayout(menuBoutonsLayout);
        menuBoutonsLayout.setHorizontalGroup(
            menuBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuBoutonsLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(boutonUtilisateurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonComptes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonCartes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonStations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonBornes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boutonVelos)
                .addGap(0, 137, Short.MAX_VALUE))
        );
        menuBoutonsLayout.setVerticalGroup(
            menuBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuBoutonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuBoutonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boutonUtilisateurs)
                    .addComponent(boutonComptes)
                    .addComponent(boutonCartes)
                    .addComponent(boutonStations)
                    .addComponent(boutonBornes)
                    .addComponent(boutonVelos))
                .addGap(19, 19, 19))
        );

        panelFondInterfaceGestion.setBackground(new java.awt.Color(102, 153, 255));
        panelFondInterfaceGestion.setPreferredSize(new java.awt.Dimension(0, 400));

        javax.swing.GroupLayout panelFondInterfaceGestionLayout = new javax.swing.GroupLayout(panelFondInterfaceGestion);
        panelFondInterfaceGestion.setLayout(panelFondInterfaceGestionLayout);
        panelFondInterfaceGestionLayout.setHorizontalGroup(
            panelFondInterfaceGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );
        panelFondInterfaceGestionLayout.setVerticalGroup(
            panelFondInterfaceGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titreInterfaceGestion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFondInterfaceGestion, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
            .addComponent(menuBoutons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titreInterfaceGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBoutons, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFondInterfaceGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boutonUtilisateursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boutonUtilisateursMouseClicked
        System.out.println("plop");
        if(current!=null){
            panelFondInterfaceGestion.remove(current);
        }
        current = interfaceAdminGestionUtilisateurs;
        panelFondInterfaceGestion.add(current);
        panelFondInterfaceGestion.validate();
    }//GEN-LAST:event_boutonUtilisateursMouseClicked
/**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAdminGestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAdminGestion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boutonBornes;
    private javax.swing.JButton boutonCartes;
    private javax.swing.JButton boutonComptes;
    private javax.swing.JButton boutonStations;
    private javax.swing.JButton boutonUtilisateurs;
    private javax.swing.JButton boutonVelos;
    private javax.swing.JPanel menuBoutons;
    private javax.swing.JPanel panelFondInterfaceGestion;
    private javax.swing.JLabel titreInterfaceGestion;
    // End of variables declaration//GEN-END:variables
}
