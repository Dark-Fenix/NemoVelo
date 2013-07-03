/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

public class Home extends javax.swing.JFrame {

    public vue_user_borne.ControleurHome ctrlHome;

    public Home(ControleurHome aThis) {
        initComponents();
        ctrlHome = aThis;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelBienvenue = new javax.swing.JLabel();
        ButtonLouerHome = new javax.swing.JButton();
        ButtonRendreHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        LabelMenu = new javax.swing.JLabel();
        ButtonLouer = new javax.swing.JButton();
        ButtonRendre = new javax.swing.JButton();
        ButtonAccueil = new javax.swing.JButton();
        LabelImageNemoVelo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nemo velo");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        LabelBienvenue.setBackground(new java.awt.Color(255, 255, 255));
        LabelBienvenue.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelBienvenue.setForeground(new java.awt.Color(136, 212, 29));
        LabelBienvenue.setText("Bienvenue !");
        LabelBienvenue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelBienvenue);
        LabelBienvenue.setBounds(320, 20, 220, 50);

        ButtonLouerHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonLouerHome.setText("Louer un vélo");
        ButtonLouerHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLouerHomeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonLouerHome);
        ButtonLouerHome.setBounds(310, 110, 229, 106);

        ButtonRendreHome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonRendreHome.setText("Rendre un vélo");
        ButtonRendreHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRendreHomeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRendreHome);
        ButtonRendreHome.setBounds(310, 260, 229, 106);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        LabelMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMenu.setForeground(new java.awt.Color(136, 212, 29));
        LabelMenu.setText("Menu");
        jPanel1.add(LabelMenu);
        LabelMenu.setBounds(77, 13, 38, 17);

        ButtonLouer.setText("Louer un vélo");
        ButtonLouer.setEnabled(false);
        jPanel1.add(ButtonLouer);
        ButtonLouer.setBounds(20, 40, 162, 70);

        ButtonRendre.setText("Rendre un vélo");
        ButtonRendre.setEnabled(false);
        jPanel1.add(ButtonRendre);
        ButtonRendre.setBounds(20, 110, 162, 70);
        ButtonRendre.getAccessibleContext().setAccessibleName("Rendre un velo");

        ButtonAccueil.setText("Accueil");
        ButtonAccueil.setEnabled(false);
        jPanel1.add(ButtonAccueil);
        ButtonAccueil.setBounds(20, 180, 162, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 200, 260);

        LabelImageNemoVelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue_user_borne/velonemo.JPG"))); // NOI18N
        getContentPane().add(LabelImageNemoVelo);
        LabelImageNemoVelo.setBounds(10, 10, 185, 72);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRendreHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRendreHomeActionPerformed
        ctrlHome.rendrePerformed();
    }//GEN-LAST:event_ButtonRendreHomeActionPerformed

    private void ButtonLouerHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLouerHomeActionPerformed
        ctrlHome.louerPerformed();
    }//GEN-LAST:event_ButtonLouerHomeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAccueil;
    private javax.swing.JButton ButtonLouer;
    private javax.swing.JButton ButtonLouerHome;
    private javax.swing.JButton ButtonRendre;
    private javax.swing.JButton ButtonRendreHome;
    private javax.swing.JLabel LabelBienvenue;
    private javax.swing.JLabel LabelImageNemoVelo;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
