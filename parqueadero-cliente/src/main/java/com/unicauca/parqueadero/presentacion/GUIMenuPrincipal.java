/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.presentacion;


import com.unicauca.parqueadero.cliente.Parqueadero;
import com.unicauca.parqueadero.cliente.ParqueaderoController;
import com.unicauca.parqueadero.cliente.UsuarioController;
import static java.awt.Frame.MAXIMIZED_BOTH;



/**
 *
 * @author danie
 */
public class GUIMenuPrincipal extends javax.swing.JFrame {
    
    ParqueaderoController cparqueadero = new ParqueaderoController();
    
   //Utilitarios objUtilitarios = new Utilitarios();
    
    //VehiculoTicketController CobjTickVeh = new VehiculoTicketController();
    
    //UsuarioController cUsuario = new UsuarioController();

    /**
     * Creates new form GUIMenuPrincipal
     * @param Idparqueadero
     */
    public GUIMenuPrincipal(int Idparqueadero) {
        
        System.out.println("id parqueadero en menu principal");
        System.out.println(Idparqueadero);
        
        //traemos el nombre del parqueadero para mostrarlo al cliente 
        Parqueadero parq = cparqueadero.BuscarParqueaderoPorId(Idparqueadero);
        
        System.out.println("este es el nombre del parqueadero");
        System.out.println(parq.getNombre());
        
        initComponents();
        
        nombreParqueadero.setText(parq.getNombre());
        
        //creamos el codigo de barras para probar
        
        //creamos objeto de la clase CodigoBarras
        //CodigoBarras objCod = new CodigoBarras();
        //objCod.crearPDF("AJS-425","86868766");
        
       //objUtilitarios.generarcodigoTicket();
       //CobjTickVeh.crearTicketVehiculo(6,6);
       
       //Usuario us = cUsuario.buscarUsuarioPorEmail("ader148@hotmail.com");
       
        //System.out.println("resultado busqueda usuario");
        //System.out.println(us.getNombres());
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskEscritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        nombreParqueadero = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuIngreso = new javax.swing.JMenuItem();
        mnuSalida = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido(a)");
        jPanel1.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        nombreParqueadero.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        nombreParqueadero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreParqueadero.setText("Parqueadero El Payanes");
        jPanel3.add(nombreParqueadero, java.awt.BorderLayout.PAGE_START);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Acceda a los menus de la barra lateral para realizar el ingreso y salida de vehículos del parqueadero");
        jPanel3.add(jLabel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.CENTER);

        dskEscritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dskEscritorioLayout = new javax.swing.GroupLayout(dskEscritorio);
        dskEscritorio.setLayout(dskEscritorioLayout);
        dskEscritorioLayout.setHorizontalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dskEscritorioLayout.setVerticalGroup(
            dskEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
        );

        mnuOpciones.setText("Opciones");

        mnuIngreso.setText("Ingreso de Vehículo");
        mnuIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresoActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuIngreso);

        mnuSalida.setText("Salida de Vehículo");
        mnuSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalidaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuSalida);
        mnuOpciones.add(jSeparator1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuSalir);

        jMenuBar1.add(mnuOpciones);

        jMenu2.setText("Informes");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Configuracion");
        jMenuBar1.add(jMenu3);

        mnuAyuda.setText("Ayuda");

        mnuAbout.setText("Acerca de");
        mnuAyuda.add(mnuAbout);

        jMenuBar1.add(mnuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresoActionPerformed
        // TODO add your handling code here:
        GUIEntrada ins = new GUIEntrada();
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_mnuIngresoActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalidaActionPerformed
        // TODO add your handling code here:
        GUISalida ins = new GUISalida();
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_mnuSalidaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIMenuPrincipal ins = new GUIMenuPrincipal(0);
                ins.setExtendedState(MAXIMIZED_BOTH);
                ins.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAbout;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuIngreso;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenuItem mnuSalida;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JLabel nombreParqueadero;
    // End of variables declaration//GEN-END:variables
}
