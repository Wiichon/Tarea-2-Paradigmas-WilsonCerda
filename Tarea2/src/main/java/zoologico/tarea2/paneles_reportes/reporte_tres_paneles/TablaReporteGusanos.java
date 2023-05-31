/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package zoologico.tarea2.paneles_reportes.reporte_tres_paneles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilson
 */
public class TablaReporteGusanos extends javax.swing.JPanel {

    /**
     * Creates new form TablaReportePeces
     * @param usuario
     * @param contrasena
     */
    public TablaReporteGusanos(String usuario,String contrasena) {
        initComponents();
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoobd", usuario, contrasena)) {
                PreparedStatement ps = c.prepareStatement("SELECT * FROM zoobd.gusanos;");
                ResultSet rs=ps.executeQuery();
                DefaultTableModel tp = (DefaultTableModel) TB.getModel();
                // Mientras existan filas en la tabla ,rs.next() avanzara
                while(rs.next()){
                    int len=rs.getMetaData().getColumnCount();
                    Object[]fila=new Object[len];
                    //Almacenas fila de RS en un arreglo
                    for(int i=0;i<len;i++){
                        fila[i]= rs.getObject(i+1);  
                    }
                    //Añadir fila
                    tp.addRow(fila);
                }
                c.close();
            } 
            catch (SQLException ex) {
                System.out.println("NO SE PUDO GENERAR CONEXION A BASE DE DATOS");
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();

        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Peso", "Color", "Cuerpo"
            }
        ));
        jScrollPane1.setViewportView(TB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}