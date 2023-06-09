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
public class ReporteDos extends javax.swing.JPanel {

    /**
     * Creates new form ReporteDos
     * @param usuario
     * @param contrasena
     */
    public ReporteDos(String usuario,String contrasena) {
        initComponents();
        try(Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zoobd", usuario, contrasena)){
            String subsql1 ="(SELECT COUNT(nombre) FROM zoobd.mamiferos) AS Mamiferos,";
            String subsql2 ="(SELECT COUNT(nombre) FROM zoobd.reptiles) AS Reptiles,";
            String subsql3 ="(SELECT COUNT(nombre) FROM zoobd.aves) AS Aves,";
            String subsql4 ="(SELECT COUNT(nombre) FROM zoobd.peces) AS Peces,";
            String subsql5 ="(SELECT COUNT(nombre) FROM zoobd.anfibios) AS Anfibios,";
            String subsql6 ="(SELECT COUNT(nombre) FROM zoobd.artropodos) AS Artropodos,";
            String subsql7 ="(SELECT COUNT(nombre) FROM zoobd.celentereos) AS Celentereos,";
            String subsql8 ="(SELECT COUNT(nombre) FROM zoobd.moluscos) AS Moluscos,";
            String subsql9 ="(SELECT COUNT(nombre) FROM zoobd.poriferos) AS Poriferos,";
            String subsql10 ="(SELECT COUNT(nombre) FROM zoobd.gusanos) AS Gusanos,";
            String subsql11 ="(SELECT COUNT(nombre) FROM zoobd.equinodermos) AS Equinodermos;";
            String sql="SELECT "+subsql1+subsql2+subsql3+subsql4+subsql5+subsql6+subsql7+subsql8+subsql9+subsql10+subsql11;
            
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            DefaultTableModel tp = (DefaultTableModel) TB.getModel();
            if(rs.next()){
                int total=0;
                int invertebrados=0;
                int vertebrados=0;
                for (int i=1;i<12;i++){
                    total+=rs.getInt(i);
                    if(i<6){
                        vertebrados+=rs.getInt(i);
                    }
                    else{
                        invertebrados+=rs.getInt(i);
                    }
                    
                }
                System.out.println(vertebrados);
                tp.addRow( new Object[] {"mamiferos", Integer.toString(rs.getInt(1)*100/ total) + "%" });
                tp.addRow( new Object[] {"aves", Integer.toString(rs.getInt(2)*100/ total) + "%" });
                tp.addRow( new Object[] {"reptiles", Integer.toString(rs.getInt(3)*100/ total) + "%" });
                tp.addRow( new Object[] {"peces", Integer.toString(rs.getInt(4)*100/ total) + "%" });
                tp.addRow( new Object[] {"anfibios", Integer.toString(rs.getInt(5)*100/ total) + "%" });
                tp.addRow( new Object[] {"artropodos", Integer.toString(rs.getInt(6)*100/ total) + "%" });
                tp.addRow( new Object[] {"celentereos", Integer.toString(rs.getInt(7)*100/ total) + "%" });
                tp.addRow( new Object[] {"moluscos", Integer.toString(rs.getInt(8)*100/ total) + "%" });
                tp.addRow( new Object[] {"poriferos", Integer.toString(rs.getInt(9)*100/ total) + "%" });
                tp.addRow( new Object[] {"gusanos", Integer.toString(rs.getInt(10)*100/ total) + "%" });
                tp.addRow( new Object[] {"equinodermos", Integer.toString(rs.getInt(11)*100/ total) + "%" });
                tp.addRow( new Object[] {"Vertebrados", Integer.toString(vertebrados*100/ total) + "%" });
                tp.addRow( new Object[] {"Invertebrados", Integer.toString(invertebrados*100/ total) + "%" });
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB = new javax.swing.JTable();

        jLabel1.setText("Porcentajes de animales por grupo");

        TB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grupo", "Porcentaje"
            }
        ));
        jScrollPane2.setViewportView(TB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
