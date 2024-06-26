/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package igu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import logica.Juegos;
import logica.Metodos;
import logica.Usuarios;


/**
 *
 * @author djcar
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
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
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bAtras2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaUsuario = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        descuento = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/OIP.jpeg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuarios");

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

        txtAreaUsuario.setColumns(20);
        txtAreaUsuario.setRows(5);
        jScrollPane2.setViewportView(txtAreaUsuario);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAtras2)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout usuarioFrameLayout = new javax.swing.GroupLayout(usuarioFrame.getContentPane());
        usuarioFrame.getContentPane().setLayout(usuarioFrameLayout);
        usuarioFrameLayout.setHorizontalGroup(
            usuarioFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        usuarioFrameLayout.setVerticalGroup(
            usuarioFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/Imagen1.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 255, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Game Point");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 206, -1));

        descuento.setText("Juego Random");
        descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentoActionPerformed(evt);
            }
        });
        jPanel2.add(descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 630, 110, 20));

        b1.setBackground(new java.awt.Color(128, 128, 128));
        b1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b1.setText("Inicio");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b1MouseExited(evt);
            }
        });
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 150, 50));

        b2.setBackground(new java.awt.Color(128, 128, 128));
        b2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        b2.setText("Devolver");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b2MouseExited(evt);
            }
        });
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 150, 50));

        b3.setBackground(new java.awt.Color(128, 128, 128));
        b3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        b3.setText("Prestar");
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                b3MousePressed(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 150, 50));

        b4.setBackground(new java.awt.Color(128, 128, 128));
        b4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        b4.setText("Usuarios");
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b4MouseExited(evt);
            }
        });
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 150, 50));

        b5.setBackground(new java.awt.Color(128, 128, 128));
        b5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        b5.setText("Juegos");
        b5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b5MouseExited(evt);
            }
        });
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel2.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 500, 150, 50));

        b6.setBackground(new java.awt.Color(128, 128, 128));
        b6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        b6.setText("Cerrar Sesion");
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b6MouseExited(evt);
            }
        });
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel2.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 150, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/igu/OIP.jpeg"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------------------------------------Funciones-----------------------------------------------------------------------------------------------
    Metodos m = new Metodos();
    int cont = 0;
    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Juegos: \n"+m.mostrarJuegos());
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
       
       Usuarios u  = new Usuarios("","",0);
       ArrayList<Usuarios> usuarios = u.llenar();
       
       usuarioFrame.pack();
       usuarioFrame.setVisible(true);
       usuarioFrame.setLocationRelativeTo(null);
       setVisible(false);
        
       txtAreaUsuario.setEditable(false);
       txtAreaUsuario.append(usuarios.toString());
       
       
       
    }//GEN-LAST:event_b4ActionPerformed
    public static int contador = 0, contador2  = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0, contador7 = 0, contador8 = 0, contador9 = 0;
    
    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        Metodos m = new Metodos();
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: \n"+m.mostrarJuegos()));
        
        //m.elegirJuego(posicion);
        
        
        ArrayList<String> prestar = new ArrayList();
        prestar.add(m.elegirJuego(posicion));
        for (int i = 0; i < prestar.size(); i++) {
            if(prestar.get(i).equalsIgnoreCase("1. The Legend of Zelda: Breath of the Wild")){
                contador++;
                if(contador > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("2. Super Mario Odyssey")){
                contador2++;
                if(contador2 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("3. Minecraft")){
                contador3++;
                if(contador3 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("4. Fortnite")){
                contador4++;
                if(contador4 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
            }
            }
            if(prestar.get(i).equals("5. Among Us")){
                contador5++;
                if(contador5 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("6. Call of Duty")){
                contador6++;
                if(contador6 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("7. Animal Crossing: New Horizons")){
                contador7++;
                if(contador7 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("8. Halo Infinite")){
                contador8++;
                if(contador8 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            if(prestar.get(i).equals("8. Halo Infinite")){
                contador9++;
                if(contador9 > 1){
                JOptionPane.showMessageDialog(null,"Ese Juego ya esta Prestado");
                }
            }
            
        }
        
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        
        if(cont != 0){
           JOptionPane.showMessageDialog(null,"Se Han Devuelto todos los juegos");
           cont = 0;
           contador = 0; contador2  = 0; contador3 = 0; contador4 = 0; contador5 = 0; contador6 = 0; contador7 = 0; contador8 = 0; contador9 = 0;
        }else{
           JOptionPane.showMessageDialog(null,"Debe tener un juego prestado");
        }
        
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
       Inicio inicio = new Inicio();
       inicio.setVisible(true);
       inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_b1ActionPerformed

    private void b6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseEntered
        // TODO add your handling code here:
        b6.setBackground(Color.decode("#FF0000"));
    }//GEN-LAST:event_b6MouseEntered

    private void b6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseExited
        // TODO add your handling code here:
        b6.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b6MouseExited

    private void b1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseEntered
        // TODO add your handling code here:
        b1.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_b1MouseEntered

    private void b1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseExited
        // TODO add your handling code here:
        b1.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b1MouseExited

    private void b2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseExited
        // TODO add your handling code here:
        b2.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b2MouseExited

    private void b2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseEntered
        // TODO add your handling code here:
        b2.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_b2MouseEntered

    private void b3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseEntered
        // TODO add your handling code here:
        b3.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_b3MouseEntered

    private void b3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseExited
        // TODO add your handling code here:
        b3.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b3MouseExited

    private void b5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseEntered
        // TODO add your handling code here:
        b5.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_b5MouseEntered

    private void b5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseExited
        // TODO add your handling code here:
        b5.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b5MouseExited

    private void b4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseEntered
        // TODO add your handling code here:
        b4.setBackground(Color.decode("#C0C0C0"));
    }//GEN-LAST:event_b4MouseEntered

    private void b4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseExited
        // TODO add your handling code here:
        b4.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_b4MouseExited

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
        // TODO add your handling code here:
        cont++;
    }//GEN-LAST:event_b3MouseClicked

    private void b3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MousePressed
        // TODO add your handling code here:
        cont++;
    }//GEN-LAST:event_b3MousePressed

    private void bAtras2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseClicked
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#FF0000"));
    }//GEN-LAST:event_bAtras2MouseClicked

    private void bAtras2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseEntered
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#8B0000"));
    }//GEN-LAST:event_bAtras2MouseEntered

    private void bAtras2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bAtras2MouseExited
        // TODO add your handling code here:
        bAtras2.setBackground(Color.decode("#808080"));
    }//GEN-LAST:event_bAtras2MouseExited

    private void bAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtras2ActionPerformed
        // TODO add your handling code here:
        usuarioFrame.setVisible(false);
        setVisible(true);
    }//GEN-LAST:event_bAtras2ActionPerformed

    private void descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoActionPerformed
        // TODO add your handling code here:
        Random random = new Random();
        int numero = random.nextInt(0,1);
        int contadorRnd = 0;
        if(contadorRnd == 0){
                if(numero == 1){
                JOptionPane.showMessageDialog(null, "Usted Gano un Juego!!!!!");
                int juego = random.nextInt(1,9);
                if(juego == 1){
                    contador++;
                    if(contador > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 2){
                    contador2++;
                    if(contador2 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 3){
                    contador3++;
                    if(contador3 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 4){
                    contador4++;
                    if(contador4 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 5){
                    contador5++;
                    if(contador5 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 6){
                    contador6++;
                    if(contador6 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 7){
                    contador7++;
                    if(contador7 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 8){
                    contador8++;
                    if(contador8 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
                if(juego == 9){
                    contador9++;
                    if(contador9 > 1){
                        JOptionPane.showMessageDialog(null, "Usted tuvo mala suerte este juego ya lo tiene");
                    }
                }
            }
            contadorRnd++;
        }else{
            JOptionPane.showMessageDialog(null, "Solo se puede una vez cada cierto tiempo. Vuelva Pronto");
        }
    }//GEN-LAST:event_descuentoActionPerformed

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton bAtras2;
    private javax.swing.JButton descuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaUsuario;
    private javax.swing.JFrame usuarioFrame;
    // End of variables declaration//GEN-END:variables
}
