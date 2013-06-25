/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vue_admin;

import Config.*;
import classes.Compte;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import java.util.Iterator;

/**
 *
 * @author HallerCasagrande-F
 */
public class InterfaceAdminGestionComptes extends javax.swing.JPanel {

    /**
     * Creates new form InterfaceAdminGestionUtilisateurs
     */
    public InterfaceAdminGestionComptes() {
        initComponents();
        RemplissageListeComptes();
        listeComptes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                EditionCompte edition = new EditionCompte((Compte) listeComptes.getSelectedValue());
                swapPanel(panelEdition, edition);
            }
        });
    }


    public final void RemplissageListeComptes(){
        DefaultListModel liste = new DefaultListModel();
        for (Iterator<Compte> it = ConfigGlobale.comptes.iterator(); it.hasNext();) {
            Compte u = it.next();
            //liste.add(u.getId_compte(),u);
            liste.addElement(u);
        }
        listeComptes.setModel(liste);
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

        panelEdition = new javax.swing.JPanel();
        ascenceur = new javax.swing.JScrollPane();
        listeComptes = new javax.swing.JList();
        BoutonAjouter = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 153, 255));
        setPreferredSize(new java.awt.Dimension(800, 400));

        panelEdition.setLayout(new javax.swing.BoxLayout(panelEdition, javax.swing.BoxLayout.LINE_AXIS));

        listeComptes.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        ascenceur.setViewportView(listeComptes);

        BoutonAjouter.setText("Ajouter");
        BoutonAjouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BoutonAjouterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ascenceur, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BoutonAjouter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelEdition, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEdition, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BoutonAjouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ascenceur)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BoutonAjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BoutonAjouterMouseClicked
        EditionCompte edition = new EditionCompte(new Compte());
        swapPanel(panelEdition, edition);        // TODO add your handling code here:
    }//GEN-LAST:event_BoutonAjouterMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BoutonAjouter;
    private javax.swing.JScrollPane ascenceur;
    private javax.swing.JList listeComptes;
    private javax.swing.JPanel panelEdition;
    // End of variables declaration//GEN-END:variables
}
