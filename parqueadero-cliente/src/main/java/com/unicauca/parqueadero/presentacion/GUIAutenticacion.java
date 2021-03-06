/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;

import com.unicauca.parqeuadero.transversal.Comunicacion;
import com.unicauca.parqueadero.cliente.Usuario;
import com.unicauca.parqueadero.cliente.UsuarioController;


/**
 *
 * @author danie
 */
public class GUIAutenticacion extends javax.swing.JFrame {

    
    UsuarioController cUsuario = new UsuarioController();

    /**
     * Creates new form GUIAutenticacion
     */
    public GUIAutenticacion() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlSur = new javax.swing.JPanel();
        btnAceptar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlCentro = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        lblTitulo.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 102, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Iniciar Sesión");
        getContentPane().add(lblTitulo, java.awt.BorderLayout.PAGE_START);

        btnAceptar.setBackground(new java.awt.Color(102, 102, 255));
        btnAceptar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        pnlSur.add(btnAceptar);

        btnCerrar.setBackground(new java.awt.Color(102, 102, 255));
        btnCerrar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSur.add(btnCerrar);

        getContentPane().add(pnlSur, java.awt.BorderLayout.PAGE_END);

        pnlCentro.setLayout(new java.awt.GridLayout(2, 2));

        lblUsuario.setBackground(new java.awt.Color(102, 255, 51));
        lblUsuario.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuario: ");
        pnlCentro.add(lblUsuario);
        pnlCentro.add(txtUsuario);

        lblPassword.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Contraseña: ");
        pnlCentro.add(lblPassword);
        pnlCentro.add(txtPassword);

        getContentPane().add(pnlCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String email = txtUsuario.getText();
        String password = txtPassword.getText();

        System.out.println(email);
        System.out.println(password);
        
        
          try {
             //Usuario us = cUsuario.buscarUsuarioPorEmail("ader148@hotmail.com");
             
             Usuario us = cUsuario.buscarUsuarioPorEmail(email);
             
             
                
             if (us.getPassword().equals(password)) {
              
                 //guardamos el id del parqueadero
                int idParqueadero = us.getParqueadero_id();
              
                GUIMenuPrincipal ins = new GUIMenuPrincipal(idParqueadero);
                
                 System.out.println("este es el id del parqueadero del usuario");
                 System.out.println(idParqueadero);
             
                ins.setExtendedState(MAXIMIZED_BOTH);
                ins.setVisible(true);
             }else{
                 //System.out.println("contraseña incorrrecta");
                 Comunicacion.mensajeError("El usuario o la contraseña no son adecuados, intente de nuevo", "Ingreso");
             }
             
          }
          catch(Exception e) {
              System.out.println("salio el error ");
              Comunicacion.mensajeError("El usuario o la contraseña no son adecuados, intente de nuevo", "Ingreso");
          }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAutenticacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAutenticacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCentro;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
