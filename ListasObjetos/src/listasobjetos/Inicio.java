package listasobjetos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Sthefany Johana Campos Hernández
 * 0901-17-2452
 */

public class Inicio extends javax.swing.JFrame {
    
    Nodo Primero;
    int Dato;
    DefaultTableModel tabla = new DefaultTableModel();
    
    public Inicio() {
        initComponents();
        Tbl_Nodo.setModel(tabla);
        this.setLocationRelativeTo(null);
        tabla.addColumn("No. Nodo");
        tabla.addColumn("Información Nodo");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtDato = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Nodo = new javax.swing.JTable();
        BtnIngresar = new javax.swing.JButton();
        BtnMostrar = new javax.swing.JButton();
        BtnBorrarUltimo = new javax.swing.JButton();
        BtnBorrarPrimero = new javax.swing.JButton();
        BtnBorrarPosicion = new javax.swing.JButton();
        BtnBorrarDato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese Un Número");

        Tbl_Nodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_Nodo);

        BtnIngresar.setText("Ingresar");
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnMostrar.setText("Mostrar");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnBorrarUltimo.setText("Borrar Ultimo");
        BtnBorrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarUltimoActionPerformed(evt);
            }
        });

        BtnBorrarPrimero.setText("Borrar 1°");
        BtnBorrarPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarPrimeroActionPerformed(evt);
            }
        });

        BtnBorrarPosicion.setText("Borrar Posicion");
        BtnBorrarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarPosicionActionPerformed(evt);
            }
        });

        BtnBorrarDato.setText("Borrar Dato");
        BtnBorrarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarDatoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(TxtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnIngresar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrar))
                    .addComponent(BtnBorrarUltimo)
                    .addComponent(BtnBorrarPrimero)
                    .addComponent(BtnBorrarPosicion)
                    .addComponent(BtnBorrarDato))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresar)
                    .addComponent(BtnMostrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BtnBorrarUltimo)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBorrarPrimero)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBorrarPosicion)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBorrarDato)
                        .addContainerGap(127, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        Dato= Integer.parseInt(TxtDato.getText());
        InsertarEnPrimero(Dato);        
    }//GEN-LAST:event_BtnIngresarActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        Clear();
        Listar();       
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnBorrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarUltimoActionPerformed
        borrarUltimo();
    }//GEN-LAST:event_BtnBorrarUltimoActionPerformed

    private void BtnBorrarPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarPrimeroActionPerformed
        borrarPrimero();
    }//GEN-LAST:event_BtnBorrarPrimeroActionPerformed

    private void BtnBorrarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarPosicionActionPerformed
        Dato= Integer.parseInt(TxtDato.getText());
        borrarPosicion(Dato);
    }//GEN-LAST:event_BtnBorrarPosicionActionPerformed

    private void BtnBorrarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarDatoActionPerformed
        
        Dato= Integer.parseInt(TxtDato.getText());
        
        borrarDato(Dato);
    }//GEN-LAST:event_BtnBorrarDatoActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    public void InsertarEnPrimero(int Dato){
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
    }
    
    public void borrarPrimero(){
		Primero=Primero.Siguiente;
    }
    
    public void Listar(){
                String Data[] = new String[2];
                int Contador = 0;
		Nodo aux=Primero;
		while (aux!=null){
                        Contador = Contador + 1;
                        Data[0]= String.valueOf(Contador);
                        Data[1]= String.valueOf(aux.Info);
                        tabla.addRow(Data);
			aux=aux.Siguiente;
		}
    }
    
    public void borrarUltimo(){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null){
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
    }
    
    public void borrarPosicion(int pos){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int i=0;
		if (pos>0){
			while (i!=pos && actual.Siguiente != null){
				anterior=actual;
				actual=actual.Siguiente;
				i++;
				System.out.println("K       "+i);
			}
			anterior.Siguiente=actual.Siguiente;
		}
    }
    
    public void borrarDato(int Dato){
		Nodo anterior=Primero;
		Nodo actual=Primero;
                while (actual.Siguiente!=null){
                        if (actual.Info==Dato) {
                            anterior=actual;
                            actual=actual.Siguiente;
                        }			
		}
    }
    
    private void Clear(){
        while (tabla.getRowCount() > 0) {
               tabla.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarDato;
    private javax.swing.JButton BtnBorrarPosicion;
    private javax.swing.JButton BtnBorrarPrimero;
    private javax.swing.JButton BtnBorrarUltimo;
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JTable Tbl_Nodo;
    private javax.swing.JTextField TxtDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
