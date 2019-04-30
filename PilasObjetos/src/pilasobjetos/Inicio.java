package pilasobjetos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Sthefany Johana Campos Hernández
 * 0901-17-2452
 */

public class Inicio extends javax.swing.JFrame {

    Nodo cabeza=null; //Se Declara Una variable Nodo iniciandola en Null
    int longitud=0; //Variable Integer para la longitud del nodo
    DefaultTableModel tabla = new DefaultTableModel(); //Declarar el modelo de la Tabla
    
    public Inicio() {
        initComponents();
        Tbl_Nodo.setModel(tabla); //Se agrega el modelo a la JTable
        this.setLocationRelativeTo(null); //Posición del JFrame en el Centro de la pantalla
        tabla.addColumn("No. Nodo"); //Declaramos Las columnas de La Tabla
        tabla.addColumn("Título");
        tabla.addColumn("Autor");
        tabla.addColumn("ISBN");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMostrar = new javax.swing.JButton();
        BtnIngresoFinal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Nodo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BtnBorrarUltimo = new javax.swing.JButton();
        TxtTitulo = new javax.swing.JTextField();
        TxtAutor = new javax.swing.JTextField();
        TxtISBN = new javax.swing.JTextField();
        BtnMostrarTop = new javax.swing.JButton();
        BtnBorrarPila = new javax.swing.JButton();
        BtnVaLle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnMostrar.setText("MOSTRAR");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        BtnIngresoFinal.setText("Ingreso PUSH");
        BtnIngresoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresoFinalActionPerformed(evt);
            }
        });

        Tbl_Nodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tbl_Nodo);

        jLabel1.setText("Título Del Libro");

        jLabel2.setText("Autor");

        jLabel3.setText("ISBN");

        BtnBorrarUltimo.setText("Borrar PULL");
        BtnBorrarUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarUltimoActionPerformed(evt);
            }
        });

        BtnMostrarTop.setText("Mostrar TOP");
        BtnMostrarTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarTopActionPerformed(evt);
            }
        });

        BtnBorrarPila.setText("Borrar PILA");
        BtnBorrarPila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarPilaActionPerformed(evt);
            }
        });

        BtnVaLle.setText("Vacia o Llena");
        BtnVaLle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVaLleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(TxtAutor)
                            .addComponent(TxtISBN))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnIngresoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(BtnBorrarUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnBorrarPila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnVaLle, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnMostrarTop, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnIngresoFinal)
                    .addComponent(BtnBorrarPila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBorrarUltimo)
                    .addComponent(BtnVaLle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnMostrarTop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        ClearTabla(); //Método ClearTabla donde se Limpia la tabla cada que se vaya a mostrar
        Listar(); //Método InsertarPrincipio Mandamos la Variabe tipo Libro
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void BtnIngresoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresoFinalActionPerformed
        String StrTitulo, StrAutor, StrISBN; //Declaración de variables String para los campos del Libro
        StrTitulo = TxtTitulo.getText(); //Obtenemos el valor del TextField y se lo asignamos a la variable String
        StrAutor = TxtAutor.getText();
        StrISBN = TxtISBN.getText();
        Libro Nuevo = new Libro(StrTitulo, StrAutor, StrISBN); //Agregamos los String a la Estructura Libro
        insertarFinal(Nuevo); //Método InsertarFinal Mandamos la Variabe tipo Libro
    }//GEN-LAST:event_BtnIngresoFinalActionPerformed

    private void BtnBorrarUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarUltimoActionPerformed
        eliminarUltimo(); //Método EliminarUltimo
    }//GEN-LAST:event_BtnBorrarUltimoActionPerformed

    private void BtnMostrarTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarTopActionPerformed
        ClearTabla();
        ListarTOP();
    }//GEN-LAST:event_BtnMostrarTopActionPerformed

    private void BtnBorrarPilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarPilaActionPerformed
        cabeza=null;
        JOptionPane.showMessageDialog(rootPane,"PILA BORRADA");
        ClearTabla();
    }//GEN-LAST:event_BtnBorrarPilaActionPerformed

    private void BtnVaLleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVaLleActionPerformed
        if (cabeza==null) {
            JOptionPane.showMessageDialog(rootPane,"PILA Vacia");
        }else{
            JOptionPane.showMessageDialog(rootPane,"PILA Llena");
        }
    }//GEN-LAST:event_BtnVaLleActionPerformed

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
    
    public void insertarFinal(Libro libro) {
		Nodo nodo=new Nodo(libro);
		if (cabeza==null){
                    cabeza=nodo;
		}else{
                    Nodo puntero=cabeza;
                    while (puntero.siguiente!=null) {
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=nodo;
		}
		longitud++;
	}
    public void eliminarUltimo() {
            if (cabeza!= null) {
                if (cabeza.siguiente==null) {
                    cabeza=null;  
                    longitud--;
                } else {
                    Nodo puntero=cabeza;
                    while (puntero.siguiente.siguiente!=null) {                    
                        puntero=puntero.siguiente;
                    }
                    puntero.siguiente=null;
                    longitud--;
                }
            }
        }
    public void Listar(){
                String Data[] = new String[4];
                int Contador = 0;
		Nodo aux=cabeza;
		while (aux!=null){
                        Data[0]= String.valueOf(Contador);
                        Data[1]= String.valueOf(aux.libro.titulo);
                        Data[2]= String.valueOf(aux.libro.autor);
                        Data[3]= String.valueOf(aux.libro.isbn);
                        tabla.addRow(Data);
			aux=aux.siguiente;
                        Contador = Contador + 1;
		}
    }
    public void ListarTOP(){
                String Data[] = new String[4];
                int Contador = 0;
		Nodo aux=cabeza;
		while (aux!=null){
                        Data[0]= String.valueOf(Contador);
                        Data[1]= String.valueOf(aux.libro.titulo);
                        Data[2]= String.valueOf(aux.libro.autor);
                        Data[3]= String.valueOf(aux.libro.isbn);
			aux=aux.siguiente;
                        Contador = Contador + 1;
		}
                tabla.addRow(Data);
    }
    private void ClearTabla(){
        while (tabla.getRowCount() > 0) {
               tabla.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBorrarPila;
    private javax.swing.JButton BtnBorrarUltimo;
    private javax.swing.JButton BtnIngresoFinal;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JButton BtnMostrarTop;
    private javax.swing.JButton BtnVaLle;
    private javax.swing.JTable Tbl_Nodo;
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtISBN;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
