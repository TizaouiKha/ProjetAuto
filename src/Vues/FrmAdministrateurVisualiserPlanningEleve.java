/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

import Controlers.CtrlLeçon;
import Entities.Leçon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author khaln
 */
public class FrmAdministrateurVisualiserPlanningEleve extends javax.swing.JFrame {

    DefaultMutableTreeNode racine;
    DefaultTreeModel model;
    DefaultMutableTreeNode Mois;
    DefaultMutableTreeNode Jour;
    DefaultMutableTreeNode Heure;
    DefaultMutableTreeNode Moniteur;
    DefaultMutableTreeNode Immatriculation;
    CtrlLeçon ctrlLeçon;
    public FrmAdministrateurVisualiserPlanningEleve() {
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

        lblCodeEleve = new javax.swing.JLabel();
        txtCodeEleve = new javax.swing.JTextField();
        btnVisualiser = new javax.swing.JButton();
        btnAnnuler = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        trVisualiserEleve = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodeEleve.setText("Code élève: ");

        btnVisualiser.setText("Visualiser");
        btnVisualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualiserActionPerformed(evt);
            }
        });

        btnAnnuler.setText("Annuler");

        jScrollPane1.setViewportView(trVisualiserEleve);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnVisualiser)
                        .addGap(35, 35, 35)
                        .addComponent(btnAnnuler))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblCodeEleve)
                        .addGap(38, 38, 38)
                        .addComponent(txtCodeEleve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodeEleve)
                    .addComponent(txtCodeEleve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisualiser)
                    .addComponent(btnAnnuler))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualiserActionPerformed
        // TODO add your handling code here:
        ctrlLeçon = new CtrlLeçon();
        racine.removeAllChildren();
        for(Leçon lecon : ctrlLeçon.getAllLeçonByIdEleve(Integer.parseInt(txtCodeEleve.getText()))){
            racine = new DefaultMutableTreeNode(lecon.getNomEleve());
            Mois = new DefaultMutableTreeNode(lecon.getMois());
            Jour = new DefaultMutableTreeNode(lecon.getJour());
            Heure = new DefaultMutableTreeNode(lecon.getHeure());
            Moniteur = new DefaultMutableTreeNode(lecon.getNomMoniteur());
            Immatriculation = new DefaultMutableTreeNode(lecon.getImmatriculation());
            Heure.add(Immatriculation);
            Heure.add(Moniteur);
            Jour.add(Heure);
            Mois.add(Jour);
            racine.add(Mois);
        }
        model=  new DefaultTreeModel(racine);
        trVisualiserEleve.setModel(model);
        
    }//GEN-LAST:event_btnVisualiserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        racine = new DefaultMutableTreeNode("Toutes les leçons");
        model = new DefaultTreeModel(racine);
        trVisualiserEleve.setModel(model);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserPlanningEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserPlanningEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserPlanningEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrateurVisualiserPlanningEleve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrateurVisualiserPlanningEleve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnVisualiser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodeEleve;
    private javax.swing.JTree trVisualiserEleve;
    private javax.swing.JTextField txtCodeEleve;
    // End of variables declaration//GEN-END:variables
}