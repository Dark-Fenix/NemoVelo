/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_user_borne;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class StationVoisine extends javax.swing.JFrame {

    public ControleurStationVoisine ctrlSV;

    public StationVoisine() {
        initComponents();
    }
    public StationVoisine(ControleurStationVoisine aThis) {
        initComponents();
        ctrlSV = aThis;
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

        LabelImageNemoVelo1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ButtonLouer = new javax.swing.JButton();
        ButtonRendre = new javax.swing.JButton();
        ButtonAccueil = new javax.swing.JButton();
        LabelMenu = new javax.swing.JLabel();
        LabelImageNemoVelo = new javax.swing.JLabel();
        LabelGooglemap = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableRecap = new javax.swing.JTable();
        LabelBienvenue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nemo velo");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        LabelImageNemoVelo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vue_user_borne/velonemo.JPG"))); // NOI18N
        getContentPane().add(LabelImageNemoVelo1);
        LabelImageNemoVelo1.setBounds(10, 10, 185, 72);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        ButtonLouer.setText("Louer un vélo");
        ButtonLouer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLouerActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonLouer);
        ButtonLouer.setBounds(20, 40, 162, 70);

        ButtonRendre.setText("Rendre un vélo");
        ButtonRendre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRendreActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRendre);
        ButtonRendre.setBounds(20, 110, 162, 70);
        ButtonRendre.getAccessibleContext().setAccessibleName("Rendre un velo");

        ButtonAccueil.setText("Accueil");
        ButtonAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAccueilActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAccueil);
        ButtonAccueil.setBounds(20, 180, 162, 70);

        LabelMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelMenu.setForeground(new java.awt.Color(136, 212, 29));
        LabelMenu.setText("Menu");
        jPanel1.add(LabelMenu);
        LabelMenu.setBounds(77, 13, 38, 17);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 110, 198, 268);
        getContentPane().add(LabelImageNemoVelo);
        LabelImageNemoVelo.setBounds(10, 83, 0, 0);
        getContentPane().add(LabelGooglemap);
        LabelGooglemap.setBounds(672, 247, 0, 0);

        TableRecap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Borne", "Vélo Dispo", "Borne Dispo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableRecap);
        TableRecap.getColumnModel().getColumn(0).setResizable(false);
        TableRecap.getColumnModel().getColumn(1).setResizable(false);
        TableRecap.getColumnModel().getColumn(2).setResizable(false);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 110, 360, 270);

        LabelBienvenue.setBackground(new java.awt.Color(255, 255, 255));
        LabelBienvenue.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelBienvenue.setForeground(new java.awt.Color(136, 212, 29));
        LabelBienvenue.setText("Près d'ici...");
        LabelBienvenue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LabelBienvenue);
        LabelBienvenue.setBounds(330, 20, 210, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRendreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRendreActionPerformed
        ctrlSV.RendrePerformed();
    }//GEN-LAST:event_ButtonRendreActionPerformed

    private void ButtonAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAccueilActionPerformed
       ctrlSV.AccueilPerformed();
    }//GEN-LAST:event_ButtonAccueilActionPerformed

    private void ButtonLouerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLouerActionPerformed
        ctrlSV.LouerPerformed();
    }//GEN-LAST:event_ButtonLouerActionPerformed

    public DefaultTableModel getTabl(){
        return (DefaultTableModel) TableRecap.getModel();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAccueil;
    private javax.swing.JButton ButtonLouer;
    private javax.swing.JButton ButtonRendre;
    private javax.swing.JLabel LabelBienvenue;
    private javax.swing.JLabel LabelGooglemap;
    private javax.swing.JLabel LabelImageNemoVelo;
    private javax.swing.JLabel LabelImageNemoVelo1;
    private javax.swing.JLabel LabelMenu;
    private javax.swing.JTable TableRecap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
