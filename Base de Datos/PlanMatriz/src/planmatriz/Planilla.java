package planmatriz;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 * Nombre:  Sthefany Johana Campos Hernández
 * Carnet:  0901-17-2452
 */
public class Planilla extends javax.swing.JFrame {

    /**
     * VARIABLES
     */
    
    String[] Columnas = {"Departamento", "Nombre Empleado", "Sueldo Base", "Deducciones", "ISR" , "Recepciones", "Sueldo Líquido"};   
    String Nombre[]= new String[10];
    String Depa[]= new String[10];

    //FORMATO DECIMAL Y VARIABLES DE PLANILLA
    DecimalFormat Decimales = new DecimalFormat("####.##");
    double DblSueldoBase, DblDeducciones, DblPercepciones, DblSueldoLiquido;
    double ISR;
                
    public Planilla() {
        
        initComponents();
        setLocationRelativeTo(null);//COLOCAR PANTALLA EN EL CENTRO
        setDefaultCloseOperation(EXIT_ON_CLOSE);//HABILITAR LA OPCION DE CERRAR CON EL BOTON X DEL FORM
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablePlan1 = new javax.swing.JTable();
        BtnPlanilla = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablePlan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Departamento", "Nombre Empleado", "Sueldo Base", "ISR", "Total Deducciones", "Total Percepciones", "Sueldo Líquido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablePlan1);
        if (TablePlan1.getColumnModel().getColumnCount() > 0) {
            TablePlan1.getColumnModel().getColumn(0).setResizable(false);
            TablePlan1.getColumnModel().getColumn(1).setResizable(false);
            TablePlan1.getColumnModel().getColumn(2).setResizable(false);
            TablePlan1.getColumnModel().getColumn(3).setResizable(false);
            TablePlan1.getColumnModel().getColumn(4).setResizable(false);
            TablePlan1.getColumnModel().getColumn(5).setResizable(false);
            TablePlan1.getColumnModel().getColumn(6).setResizable(false);
        }

        BtnPlanilla.setText("INGRESAR PLANILLA");
        BtnPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPlanillaActionPerformed(evt);
            }
        });

        BtnSalir.setText("SALIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnPlanilla)
                        .addGap(186, 186, 186)
                        .addComponent(BtnSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnPlanilla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPlanillaActionPerformed
        Ingreso();//LLAMAR AL METODO
    }//GEN-LAST:event_BtnPlanillaActionPerformed

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
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Planilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Planilla().setVisible(true);
            }
        });
    }
    
    public void Ingreso(){
        //MODELO DE LA TABLA
        DefaultTableModel Modelo = (DefaultTableModel) TablePlan1.getModel();
        Modelo.setRowCount(10);
        Modelo.setColumnCount(6);
        Modelo.setColumnIdentifiers(Columnas);
        
        //INGRESO DE LOS DATOS
        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 7; j++) {
                //CONDICIONES SEGGUN LA POSICION
                if (j==0) {
                   Depa[i]=JOptionPane.showInputDialog("Ingrese El Departamento");
                   TablePlan1.setValueAt(Depa[i], i,j); 
                }
                if (j==1) {
                   Nombre[i]=JOptionPane.showInputDialog("Ingrese El Nombre");
                   TablePlan1.setValueAt(Nombre[i], i,j); 
                }
                if (j==2) {
                   ISR=0;
                   DblSueldoBase = 2600 +(double)(Math.random()*100000);
                   TablePlan1.setValueAt(Decimales.format(DblSueldoBase), i,j);
                   if (DblSueldoBase<=5000) {
                        ISR=DblSueldoBase*0.03;
                    }else if (DblSueldoBase<=10000) {
                        ISR=DblSueldoBase*0.05;
                    }else{
                        ISR=DblSueldoBase*0.1;
                    }
                }
                if (j==3) {
                   DblDeducciones = (300 +(double)(Math.random()*400))+ISR;
                   TablePlan1.setValueAt(Decimales.format(DblDeducciones), i,j);
                   
                }
                if (j==4) {
                   TablePlan1.setValueAt(Decimales.format(ISR), i,j);
                   
                }
                if (j==5) {
                   DblPercepciones = 300 +(double)(Math.random()*500);
                   TablePlan1.setValueAt(Decimales.format(DblPercepciones), i,j); 
                }
                if (j==6) {
                   DblSueldoLiquido = DblSueldoBase+DblPercepciones-DblDeducciones;
                   TablePlan1.setValueAt(Decimales.format(DblSueldoLiquido), i,j); 
                }
                
            }          
          
        }
        
        
    }
    
   //* public double ISR(double Sueldo, double ISR){
        //if (Sueldo<=5000) {
           // ISR=Sueldo*0.03;
       // }else if (Sueldo<=10000) {
           // ISR=Sueldo*0.05;
       // }else{
           // ISR=Sueldo*0.1;
       // }
       // return ISR;
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPlanilla;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JTable TablePlan1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
