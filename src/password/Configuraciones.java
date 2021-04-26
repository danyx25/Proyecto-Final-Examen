/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author danyx25
 */
public class Configuraciones extends javax.swing.JFrame{
  
    public Configuraciones() {
        
        initComponents();
        this.setLocationRelativeTo(null);
     
    }
    public boolean CambiarContraseña(){
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        String sql;
        //SENTENCIA SQL
        String a = txtContraseñaNueva.getText();
        String b = txtRepetirContraseña.getText();
        sql = "update Datos set Contraseña= '"+txtContraseñaNueva.getText()+"' where Contraseña='"+txtActual.getText()+"';";
        try {
            //ES UNA INSTANCIA DE LA CONEXION PREVIAMENTE CREADA
            Password conexion = new Password();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            JOptionPane.showMessageDialog(rootPane,"Contraseña cambiada con éxito");
            limpiar();
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
     public boolean EliminarCuenta(){
        boolean registrar = false;
        //INTEFAZ DE ACCESO A LA BASE DE DATOS
        Statement stm = null;
        //CONEXION CON LA BASE DE DATOS
        Connection con = null;
        String sql;
        //SENTENCIA SQl
        sql = "delete from Datos where Contraseña='"+txtEliminarCuenta.getText()+"';";
        try {
            //ES UNA INSTANCIA DE LA CONEXION PREVIAMENTE CREADA
            Password conexion = new Password();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            JOptionPane.showMessageDialog(rootPane,"Cuenta eliminada con éxito");
            limpiar();
            stm.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
    String contra;

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtContraseñaNueva = new javax.swing.JTextField();
        txtRepetirContraseña = new javax.swing.JTextField();
        btnComprobar = new javax.swing.JButton();
        txtActual = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEliminarCuenta = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtContraseñaActual = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(25, 24, 24));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña Actual:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña nueva:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Repita Nueva Contraseña:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtContraseñaNueva.setBackground(new java.awt.Color(25, 24, 24));
        txtContraseñaNueva.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseñaNueva.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel3.add(txtContraseñaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, -1));

        txtRepetirContraseña.setBackground(new java.awt.Color(25, 24, 24));
        txtRepetirContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtRepetirContraseña.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtRepetirContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepetirContraseñaFocusLost(evt);
            }
        });
        jPanel3.add(txtRepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 240, -1));

        btnComprobar.setBackground(new java.awt.Color(255, 50, 50));
        btnComprobar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnComprobar.setForeground(new java.awt.Color(255, 255, 255));
        btnComprobar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/imagenes/guardar (1).png"))); // NOI18N
        btnComprobar.setText("Guardar");
        btnComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprobarActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprobar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 50));

        txtActual.setBackground(new java.awt.Color(25, 24, 24));
        txtActual.setForeground(new java.awt.Color(255, 255, 255));
        txtActual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtActualFocusLost(evt);
            }
        });
        jPanel3.add(txtActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, -1));

        jTabbedPane1.addTab("Cambiar Contraseña", jPanel3);

        jPanel2.setBackground(new java.awt.Color(25, 24, 24));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese su Contraseña:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        txtEliminarCuenta.setBackground(new java.awt.Color(25, 24, 24));
        txtEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        txtEliminarCuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel2.add(txtEliminarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 98, 230, 30));

        btnEliminar.setBackground(new java.awt.Color(255, 50, 50));
        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/imagenes/eliminar (1).png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 60));

        jTabbedPane1.addTab("Eliminar Cuenta con Contraseña", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 660, 310));

        btnCerrarSesion.setBackground(new java.awt.Color(255, 50, 50));
        btnCerrarSesion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/imagenes/cerrar-sesion (1).png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, -1, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("x");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/password/imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        txtContraseñaActual.setBackground(new java.awt.Color(25, 24, 24));
        txtContraseñaActual.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseñaActual.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtContraseñaActual.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContraseñaActual.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtContraseñaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprobarActionPerformed
         if(!txtContraseñaNueva.getText().equals(txtRepetirContraseña.getText())){
            JOptionPane.showMessageDialog(rootPane,"ERROR - Las contraseñas no coinciden","ERROR", JOptionPane.ERROR_MESSAGE);
            txtContraseñaNueva.setText("");
            txtRepetirContraseña.setText("");
            txtContraseñaNueva.requestFocus();
        }else{
             txtContraseñaActual.setText(txtContraseñaNueva.getText());
             CambiarContraseña();
             
        }
        
    }//GEN-LAST:event_btnComprobarActionPerformed

    public void limpiar(){
        txtActual.setText("");
        txtContraseñaNueva.setText("");
        txtRepetirContraseña.setText("");
    }
    
    
    private void txtActualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtActualFocusLost
        if(!txtContraseñaActual.getText().equals(txtActual.getText())){
            JOptionPane.showMessageDialog(rootPane,"ERROR - Contrseña incorrecta.","ERROR", JOptionPane.ERROR_MESSAGE);
            txtActual.setText("");
            txtActual.requestFocus();
        }
    }//GEN-LAST:event_txtActualFocusLost

    private void txtRepetirContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaFocusLost
      
    }//GEN-LAST:event_txtRepetirContraseñaFocusLost

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        this.dispose();
        new Interfaz().setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE QUE DESEA SALIR?", "¿Cerrar?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirmar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(!txtContraseñaActual.getText().equals(txtEliminarCuenta.getText())){
           JOptionPane.showMessageDialog(rootPane,"ERROR - Contrseña incorrecta.","ERROR", JOptionPane.ERROR_MESSAGE); 
           txtEliminarCuenta.setText("");
           txtEliminarCuenta.requestFocus();
        }else{
            EliminarCuenta();
            this.dispose();
            new Interfaz().setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

   
    
   
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
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuraciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuraciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnComprobar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtActual;
    public javax.swing.JTextField txtContraseñaActual;
    private javax.swing.JTextField txtContraseñaNueva;
    private javax.swing.JTextField txtEliminarCuenta;
    private javax.swing.JTextField txtRepetirContraseña;
    // End of variables declaration//GEN-END:variables
}
