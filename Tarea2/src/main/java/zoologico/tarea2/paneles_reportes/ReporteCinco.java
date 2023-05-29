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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wilson
 */
public class ReporteCinco extends javax.swing.JPanel {

    /**
     * Creates new form ReporteCinco
     * @param usuario
     * @param contrasena
     */
    public ReporteCinco(String usuario,String contrasena) {
        initComponents();
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoobd", usuario, contrasena)){
            String subsql1 ="(SELECT AVG(peso) FROM zoobd.mamiferos) AS Mamiferos,";
            String subsql2 ="(SELECT AVG(peso) FROM zoobd.reptiles) AS Reptiles,";
            String subsql3 ="(SELECT AVG(peso) FROM zoobd.aves) AS Aves,";
            String subsql4 ="(SELECT AVG(peso) FROM zoobd.peces) AS Peces,";
            String subsql5 ="(SELECT AVG(peso) FROM zoobd.anfibios) AS Anfibios,";
            String subsql6 ="(SELECT AVG(peso) FROM zoobd.artropodos) AS Artropodos,";
            String subsql7 ="(SELECT AVG(peso) FROM zoobd.celentereos) AS Celentereos,";
            String subsql8 ="(SELECT AVG(peso) FROM zoobd.moluscos) AS Moluscos,";
            String subsql9 ="(SELECT AVG(peso) FROM zoobd.poriferos) AS Poriferos,";
            String subsql10 ="(SELECT AVG(peso) FROM zoobd.gusanos) AS Gusanos,";
            String subsql11 ="(SELECT AVG(peso) FROM zoobd.equinodermos) AS Equinodermos;";
            String sql="SELECT "+subsql1+subsql2+subsql3+subsql4+subsql5+subsql6+subsql7+subsql8+subsql9+subsql10+subsql11;
            
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tp = (DefaultTableModel) TB.getModel();
            if(rs.next()){
                
                int invertebrados=0;
                int vertebrados=0;
                for (int i=1;i<12;i++){
                
                    if(i<6){
                        vertebrados+=rs.getInt(i);
                    }
                    else{
                        invertebrados+=rs.getInt(i);
                    }
                    
                }
                
                tp.addRow( new Object[] {"mamiferos", Integer.toString(rs.getInt(1)) + "K" });
                tp.addRow( new Object[] {"aves", Integer.toString(rs.getInt(2)) + "K" });
                tp.addRow( new Object[] {"reptiles", Integer.toString(rs.getInt(3) ) + "K" });
                tp.addRow( new Object[] {"peces", Integer.toString(rs.getInt(4)) + "K" });
                tp.addRow( new Object[] {"anfibios", Integer.toString(rs.getInt(5)) + "K" });
                tp.addRow( new Object[] {"artropodos", Integer.toString(rs.getInt(6)) + "K" });
                tp.addRow( new Object[] {"celentereos", Integer.toString(rs.getInt(7)) + "K" });
                tp.addRow( new Object[] {"moluscos", Integer.toString(rs.getInt(8)) + "K" });
                tp.addRow( new Object[] {"poriferos", Integer.toString(rs.getInt(9)) + "K" });
                tp.addRow( new Object[] {"gusanos", Integer.toString(rs.getInt(10)) + "K" });
                tp.addRow( new Object[] {"equinodermos", Integer.toString(rs.getInt(11)) + "K" });
                tp.addRow( new Object[] {"Vertebrados", Integer.toString(vertebrados/ 5) + "K" });
                tp.addRow( new Object[] {"Invertebrados", Integer.toString(invertebrados*100/ 5) + "K" });
            }
            c.close();
        }
        catch(SQLException ex){
            
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

        jScrollPane2 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();

        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grupo", "Peso"
            }
        ));
        jScrollPane2.setViewportView(TB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
