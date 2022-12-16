/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vues;

/**
 *
 * @author Rosca
 */
public class FrmModifInfoPerso extends javax.swing.JFrame {

    /**
     * Creates new form FrmModifInfoPerso
     */
    public FrmModifInfoPerso() {
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

        txtNomModifInfoPerso = new javax.swing.JTextField();
        txtPrenomModifInfoPerso = new javax.swing.JTextField();
        txtAdresseModifInfoPerso = new javax.swing.JTextField();
        txtCodePostalModifInfoPerso = new javax.swing.JTextField();
        txtVilleModifInfoPerso = new javax.swing.JTextField();
        txtTelephoneModifInfoPerso = new javax.swing.JTextField();
        txtLoginModifInfoPerso = new javax.swing.JTextField();
        txtMdpModifInfoPerso = new javax.swing.JTextField();
        btnModifierModifInfoPerso = new javax.swing.JButton();
        btnAnnulerModifInfoPerso = new javax.swing.JButton();
        lblNomModifInfoPerso = new javax.swing.JLabel();
        lblTitreModifInfoPerso = new javax.swing.JLabel();
        lblPrenomModifInfoPerso = new javax.swing.JLabel();
        lblSexeModifInfoPerso = new javax.swing.JLabel();
        lblDateDeNaissanceModifInfoPerso = new javax.swing.JLabel();
        lblAdresseModifInfoPerso = new javax.swing.JLabel();
        lblCodePostalModifInfoPerso = new javax.swing.JLabel();
        lblVilleModifInfoPerso = new javax.swing.JLabel();
        lblTelephoneModifInfoPerso = new javax.swing.JLabel();
        lblLoginModifInfoPerso = new javax.swing.JLabel();
        lblMdpModifInfoPerso = new javax.swing.JLabel();
        cboSexeModifInfoPerso = new javax.swing.JComboBox<>();
        jdcDateNaissModifInfoPerso = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTelephoneModifInfoPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneModifInfoPersoActionPerformed(evt);
            }
        });

        txtLoginModifInfoPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginModifInfoPersoActionPerformed(evt);
            }
        });

        txtMdpModifInfoPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpModifInfoPersoActionPerformed(evt);
            }
        });

        btnModifierModifInfoPerso.setText("Modifer");

        btnAnnulerModifInfoPerso.setText("Annuler");

        lblNomModifInfoPerso.setText("Nom :");

        lblTitreModifInfoPerso.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        lblTitreModifInfoPerso.setText("Modification des informations personnelles");

        lblPrenomModifInfoPerso.setText("Prenom :");

        lblSexeModifInfoPerso.setText("Sexe :");

        lblDateDeNaissanceModifInfoPerso.setText("Date de naissance :");

        lblAdresseModifInfoPerso.setText("Adresse :");

        lblCodePostalModifInfoPerso.setText("Code Postal :");

        lblVilleModifInfoPerso.setText("Ville :");

        lblTelephoneModifInfoPerso.setText("Téléphone :");

        lblLoginModifInfoPerso.setText("Login :");

        lblMdpModifInfoPerso.setText("Mdp :");

        cboSexeModifInfoPerso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homme", "Femme" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomModifInfoPerso)
                            .addComponent(lblPrenomModifInfoPerso)
                            .addComponent(lblSexeModifInfoPerso)
                            .addComponent(lblDateDeNaissanceModifInfoPerso)
                            .addComponent(lblAdresseModifInfoPerso)
                            .addComponent(lblCodePostalModifInfoPerso))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAdresseModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodePostalModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboSexeModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrenomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcDateNaissModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblLoginModifInfoPerso)
                                            .addComponent(lblTelephoneModifInfoPerso)
                                            .addComponent(lblMdpModifInfoPerso))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblVilleModifInfoPerso)
                                        .addGap(31, 31, 31)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVilleModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephoneModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoginModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMdpModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModifierModifInfoPerso)
                                .addGap(93, 93, 93)
                                .addComponent(btnAnnulerModifInfoPerso))))
                    .addComponent(lblTitreModifInfoPerso))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitreModifInfoPerso)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVilleModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNomModifInfoPerso)
                    .addComponent(lblVilleModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenomModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelephoneModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrenomModifInfoPerso)
                    .addComponent(lblTelephoneModifInfoPerso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexeModifInfoPerso)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLoginModifInfoPerso)
                                .addComponent(txtLoginModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cboSexeModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateNaissModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMdpModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDateDeNaissanceModifInfoPerso)
                        .addComponent(lblMdpModifInfoPerso)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresseModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdresseModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodePostalModifInfoPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodePostalModifInfoPerso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifierModifInfoPerso)
                    .addComponent(btnAnnulerModifInfoPerso))
                .addGap(83, 83, 83))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelephoneModifInfoPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneModifInfoPersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneModifInfoPersoActionPerformed

    private void txtLoginModifInfoPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginModifInfoPersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginModifInfoPersoActionPerformed

    private void txtMdpModifInfoPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpModifInfoPersoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpModifInfoPersoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmModifInfoPerso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmModifInfoPerso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnulerModifInfoPerso;
    private javax.swing.JButton btnModifierModifInfoPerso;
    private javax.swing.JComboBox<String> cboSexeModifInfoPerso;
    private com.toedter.calendar.JDateChooser jdcDateNaissModifInfoPerso;
    private javax.swing.JLabel lblAdresseModifInfoPerso;
    private javax.swing.JLabel lblCodePostalModifInfoPerso;
    private javax.swing.JLabel lblDateDeNaissanceModifInfoPerso;
    private javax.swing.JLabel lblLoginModifInfoPerso;
    private javax.swing.JLabel lblMdpModifInfoPerso;
    private javax.swing.JLabel lblNomModifInfoPerso;
    private javax.swing.JLabel lblPrenomModifInfoPerso;
    private javax.swing.JLabel lblSexeModifInfoPerso;
    private javax.swing.JLabel lblTelephoneModifInfoPerso;
    private javax.swing.JLabel lblTitreModifInfoPerso;
    private javax.swing.JLabel lblVilleModifInfoPerso;
    private javax.swing.JTextField txtAdresseModifInfoPerso;
    private javax.swing.JTextField txtCodePostalModifInfoPerso;
    private javax.swing.JTextField txtLoginModifInfoPerso;
    private javax.swing.JTextField txtMdpModifInfoPerso;
    private javax.swing.JTextField txtNomModifInfoPerso;
    private javax.swing.JTextField txtPrenomModifInfoPerso;
    private javax.swing.JTextField txtTelephoneModifInfoPerso;
    private javax.swing.JTextField txtVilleModifInfoPerso;
    // End of variables declaration//GEN-END:variables
}
