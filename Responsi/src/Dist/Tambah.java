/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dist;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;    
import javax.swing.*;

/**
 *
 * @author inter
 */
public class Tambah extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Tambah() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fieldNama = new javax.swing.JTextField();
        fieldUsia = new javax.swing.JTextField();
        fieldGaji = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("INPUT KARYAWAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("USIA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("GAJI");

        fieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNamaActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(102, 255, 0));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(255, 0, 0));
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(0, 0, 255));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(46, 46, 46)
                        .addComponent(fieldUsia))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(fieldNama))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldGaji)
                            .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldUsia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        fieldNama.setText("");
        fieldUsia.setText("");
        fieldGaji.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String nama = fieldNama.getText().toString().trim();
        String usia = fieldUsia.getText().toString().trim();
        String gaji = fieldGaji.getText().toString().trim();
        
        try{
            Connection c = Koneksi.getKoneksi();
            Statement s = c.createStatement(); 
            try{
                String sql = "INSERT INTO karyawan(Nama, Usia, Gaji)"
                        + "VALUES('"+nama+"', '"+usia+"', '"+gaji+"')";
                PreparedStatement p = c.prepareStatement(sql);
                p.executeUpdate(sql);
                p.close();
                JOptionPane.showMessageDialog(null, "Sukses menambahkan data!");
            }catch(SQLException e){
                System.out.println("Error");
            }
            s.close();
        }catch(Exception e){
            System.out.println("Check error");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu a = new Menu();
        a.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void fieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNamaActionPerformed

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
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tambah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tambah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField fieldGaji;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldUsia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
