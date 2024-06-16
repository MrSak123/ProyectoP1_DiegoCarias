/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author djcar
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuario() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bAtras2 = new javax.swing.JButton();
        bListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/OIP.jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuarios");

        bAdd.setBackground(new java.awt.Color(128, 128, 128));
        bAdd.setText("LISTAR");

        bAtras2.setBackground(new java.awt.Color(128, 128, 128));
        bAtras2.setText("ATRAS");
        bAtras2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bAtras2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bAtras2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bAtras2MouseExited(evt);
            }
        });
        bAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtras2ActionPerformed(evt);
            }
        });

        bListar.setBackground(new java.awt.Color(128, 128, 128));
        bListar.setText("ADD");
        bListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(bListar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(bAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bListar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 262, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_bAtras2ActionPerformed

    private void bAtras2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseEntered
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#8B0000"));
    }//GEN-LAST:event_bAtras2MouseEntered

    private void bAtras2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseClicked
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#FF0000"));
    }//GEN-LAST:event_bAtras2MouseClicked

    private void bAtras2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseExited
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_bAtras2MouseExited

    private void bListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarActionPerformed
        // TODO add your handling code here:
        Add a = new Add ();
        a.setVisible(true);
        a.setLocationRelativeTo(null);
    }//GEN-LAST:event_bListarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bAtras2;
    private javax.swing.JButton bListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}