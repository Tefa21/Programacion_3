/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TheVolts
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class Ingresp_empleado extends javax.swing.JFrame {

    /**
     * Creates new form Ingresp_empleado
     */
    public Ingresp_empleado() {
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

        btn_Ingreso_Login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcodigo_puesto = new javax.swing.JTextField();
        btn_Busqueda_Login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnombre_puesto = new javax.swing.JTextField();
        txtnombre_puesto1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcodigo_puesto1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLimpiar = new javax.swing.JButton();
        btn_Busqueda_Login2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Ingreso_Login.setText("Ingreso");
        btn_Ingreso_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ingreso_LoginActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo Puesto");

        btn_Busqueda_Login.setText("Buscar");
        btn_Busqueda_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busqueda_LoginActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Puesto");

        jLabel2.setText("Codigo Puesto");

        jLabel4.setText("Nombre Puesto");

        txtLimpiar.setText("Limpiar");
        txtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLimpiarActionPerformed(evt);
            }
        });

        btn_Busqueda_Login2.setText("Eliminar");
        btn_Busqueda_Login2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Busqueda_Login2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Ingreso_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btn_Busqueda_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(txtLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcodigo_puesto1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(txtnombre_puesto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31)
                .addComponent(btn_Busqueda_Login2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcodigo_puesto, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(txtnombre_puesto))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodigo_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Ingreso_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Busqueda_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Busqueda_Login2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcodigo_puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtnombre_puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Ingreso_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ingreso_LoginActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/umg", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into puesto values(?,?)");

            pst.setString(1, txtcodigo_puesto.getText().trim());
            pst.setString(2, txtnombre_puesto.getText().trim());

            pst.executeUpdate();
            txtcodigo_puesto.setText("");
            txtnombre_puesto.setText("");

            JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al acceder a la Base de Datos");
        }
 
    }//GEN-LAST:event_btn_Ingreso_LoginActionPerformed

    private void btn_Busqueda_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busqueda_LoginActionPerformed

        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/umg", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from puesto where codigo_puesto = ?");
            pst.setString(1, txtcodigo_puesto.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcodigo_puesto1.setText(rs.getString("codigo_puesto"));
                txtnombre_puesto1.setText(rs.getString("nombre_puesto"));
            } else {
                JOptionPane.showMessageDialog(null, "Puesto no Encontrado");
            }

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido Realizar la Busqueda");

        }
    }//GEN-LAST:event_btn_Busqueda_LoginActionPerformed

    private void txtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLimpiarActionPerformed


            txtcodigo_puesto.setText("");
            txtnombre_puesto.setText("");
            txtcodigo_puesto1.setText("");
            txtnombre_puesto1.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_txtLimpiarActionPerformed

    private void btn_Busqueda_Login2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Busqueda_Login2ActionPerformed

  try {
             Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/umg", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from puesto where codigo_puesto = ?");
            
            pst.setString(1, txtcodigo_puesto.getText().trim());
            pst.executeUpdate();
            
            txtcodigo_puesto.setText("");
            txtcodigo_puesto1.setText("");
            txtnombre_puesto1.setText("");
            
            
            JOptionPane.showMessageDialog(null, "Puesto Eliminado");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido Eliminar");
        }

        
    }//GEN-LAST:event_btn_Busqueda_Login2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresp_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresp_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresp_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresp_empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresp_empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Busqueda_Login;
    private javax.swing.JButton btn_Busqueda_Login2;
    private javax.swing.JButton btn_Ingreso_Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton txtLimpiar;
    private javax.swing.JTextField txtcodigo_puesto;
    private javax.swing.JTextField txtcodigo_puesto1;
    private javax.swing.JTextField txtnombre_puesto;
    private javax.swing.JTextField txtnombre_puesto1;
    // End of variables declaration//GEN-END:variables
}