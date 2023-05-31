/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package zoologico.tarea2.paneles_reportes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilson
 */
public class ReporteCuatro extends javax.swing.JPanel {
    
    private final String usuario,contrasena;

    /**
     * @param usuario
     * @param contrasena
     */
    public ReporteCuatro(String usuario,String contrasena) {
        initComponents();
        this.usuario=usuario;
        this.contrasena = contrasena;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        animal = new javax.swing.JTextField();
        grupo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();

        jLabel1.setText("Ingrese animal que desea buscar");

        grupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mamiferos", "Aves", "Reptiles", "Anfibios", "Peces", "Antropodos", "Moluscos", "Equinodermos", "Gusanos", "Poriferos", "Celentereos" }));
        grupo.setToolTipText("");
        grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoActionPerformed(evt);
            }
        });

        jLabel2.setText("¿A que grupo pertenece?");

        jButton1.setText("Buscar>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "nombre", "peso", "color"
            }
        ));
        jScrollPane1.setViewportView(TB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(animal)
                            .addComponent(grupo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoobd", usuario, contrasena)) {
            
            List<String> columnas = new ArrayList<>();
            switch (grupo.getSelectedItem().toString()) {
                case "Mamiferos":
                    columnas.add("N°patas");
                    break;
                case "Aves":
                    columnas.add("N°Alas");
                    break;
                case "Peces":
                    columnas.add("N°Aletas");
                    columnas.add("Escamas");
                    break;
                case "Reptiles":
                    columnas.add("Tipo");
                    
                    break;
                case "Anfibios":
                    columnas.add("Piel");
                    break;
                case "Antropodos":
                    columnas.add("N°patas");
                    columnas.add("Anteans");
                    break;
                case "Moluscos":
                   columnas.add("Concha");
                    break;
                case "Celentereos":
                    columnas.add("Tentaculos");
                    break;
                case "Gusanos":
                    columnas.add("Cuerpo");
                    break;
                case "Equinodermos":
                    columnas.add("Tipo");
                    break;
                }
            PreparedStatement ps = c.prepareStatement("SELECT * FROM "+grupo.getSelectedItem().toString().toLowerCase() + " WHERE nombre ='"+animal.getText()+"'");
            ResultSet rs=ps.executeQuery();
            TB.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Id", "nombre", "peso", "color"
                }
            ));
            DefaultTableModel tp = (DefaultTableModel) TB.getModel();
            // Mientras existan filas en la tabla ,rs.next() avanzara
            for(String columna : columnas){
                tp.addColumn(columna);
            }
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
            System.out.println("ERROR  "+ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB;
    private javax.swing.JTextField animal;
    private javax.swing.JComboBox<String> grupo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}