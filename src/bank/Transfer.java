
package bank;

import javax.swing.JOptionPane;

public class Transfer extends javax.swing.JFrame {
    MiniDatabase tf = new MiniDatabase();
    public Transfer() {
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

        bGtf1 = new Background.BGtf();
        jLabel3 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        lblNominal = new javax.swing.JLabel();
        txtNominal = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bGtf1.setBackground(new java.awt.Color(0, 0, 0));
        bGtf1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Blackpay ATM");

        lblNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("Silahkan Masukkan Nama");

        lblNominal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNominal.setForeground(new java.awt.Color(255, 255, 255));
        lblNominal.setText("Silahkan Masukkan Nominal");

        txtNominal.setBackground(new java.awt.Color(0, 0, 0));
        txtNominal.setForeground(new java.awt.Color(255, 255, 255));

        txtNama.setBackground(new java.awt.Color(0, 0, 0));
        txtNama.setForeground(new java.awt.Color(255, 255, 255));

        btnProses.setBackground(new java.awt.Color(0, 0, 0));
        btnProses.setForeground(new java.awt.Color(255, 255, 255));
        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bGtf1Layout = new javax.swing.GroupLayout(bGtf1);
        bGtf1.setLayout(bGtf1Layout);
        bGtf1Layout.setHorizontalGroup(
            bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGtf1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bGtf1Layout.createSequentialGroup()
                        .addGap(0, 216, Short.MAX_VALUE)
                        .addComponent(btnProses)
                        .addGap(28, 28, 28)
                        .addComponent(btnCancel))
                    .addGroup(bGtf1Layout.createSequentialGroup()
                        .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNominal)
                            .addComponent(txtNama)))
                    .addComponent(lblNominal))
                .addGap(30, 30, 30))
            .addGroup(bGtf1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bGtf1Layout.setVerticalGroup(
            bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bGtf1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNominal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNominal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(bGtf1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnCancel))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGtf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bGtf1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        String nama = txtNama.getText();
        int masukan = Integer.parseInt(txtNominal.getText());
        if (tf.saldo <= masukan) {
        JOptionPane.showMessageDialog(rootPane,"Maaf Saldo Anda Kurang !");
        int jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Lanjut?");
        switch (jawab)
        {
            case 0: JOptionPane.showMessageDialog(null, "Silahkan Masukan Nominal Kembali");
                return;
                
            case 1: JOptionPane.showMessageDialog(null, "Silahkan Isi Saldo Anda Terlebih Dahulu");
                new BankATM().show();
                dispose();
                break;
            case 2: JOptionPane.showMessageDialog(null, "Silahkan Pilih Menu Lain");
                new BankATM().show();
                dispose();
        }

        } else if (tf.saldo >= masukan) {
        JOptionPane.showMessageDialog(rootPane, "Transfer Berhasil Kepada Atas Nama: "+nama+ "\nSebesar: "+masukan+"\nSilahkan Cek Saldo Anda Kembali");
        }
        tf.hasil = tf.saldo - masukan;
        tf.saldo=tf.hasil;
        tf.answer = String.format(" %,.2f ", tf.hasil);
        
        new BankATM().show();
        this.dispose();
    }//GEN-LAST:event_btnProsesActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new BankATM().show();
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transfer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transfer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BGtf bGtf1;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNominal;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNominal;
    // End of variables declaration//GEN-END:variables
}
