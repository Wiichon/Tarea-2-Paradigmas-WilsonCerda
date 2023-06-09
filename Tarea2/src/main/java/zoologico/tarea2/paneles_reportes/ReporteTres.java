/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package zoologico.tarea2.paneles_reportes;

import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReportePoriferos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteGusanos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteCelentereos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteEquinodermos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteMoluscos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReportePeces;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteArtropodos;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteReptiles;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteAnfibios;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteAves;
import zoologico.tarea2.paneles_reportes.reporte_tres_paneles.TablaReporteMamifero;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Wilson
 */
public class ReporteTres extends javax.swing.JPanel {

    public String usuario;
    public String contrasena;
    /**
     * Creates new form ReporteTres
     * @param usuario
     * @param contrasena
     */
    public ReporteTres(String usuario,String contrasena) {
        initComponents();
        this.usuario=usuario;
        this.contrasena=contrasena;
    }
    private void mostrarPanel(JPanel p){
        p.setSize(394,162);
        p.setLocation(0,0);
        
        panelCambiante.removeAll();
        panelCambiante.add(p,BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMamiferos = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botonAnfibios = new javax.swing.JButton();
        botonArtropodos = new javax.swing.JButton();
        botonCelentereos = new javax.swing.JButton();
        botonMoluscos = new javax.swing.JButton();
        botonPoriferos = new javax.swing.JButton();
        botonGusanos = new javax.swing.JButton();
        botonEquinodermos = new javax.swing.JButton();
        panelCambiante = new javax.swing.JPanel();

        botonMamiferos.setText("Mamiferos");
        botonMamiferos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMamiferosActionPerformed(evt);
            }
        });

        jButton2.setText("Aves");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Peces");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Reptiles");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        botonAnfibios.setText("Anfibios");
        botonAnfibios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnfibiosActionPerformed(evt);
            }
        });

        botonArtropodos.setText("Artropodos");
        botonArtropodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArtropodosActionPerformed(evt);
            }
        });

        botonCelentereos.setText("Celentereos");
        botonCelentereos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCelentereosActionPerformed(evt);
            }
        });

        botonMoluscos.setText("Moluscos");
        botonMoluscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMoluscosActionPerformed(evt);
            }
        });

        botonPoriferos.setText("Poriferos");
        botonPoriferos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPoriferosActionPerformed(evt);
            }
        });

        botonGusanos.setText("Gusanos");
        botonGusanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGusanosActionPerformed(evt);
            }
        });

        botonEquinodermos.setText("Equinodermos");
        botonEquinodermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEquinodermosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCambianteLayout = new javax.swing.GroupLayout(panelCambiante);
        panelCambiante.setLayout(panelCambianteLayout);
        panelCambianteLayout.setHorizontalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCambianteLayout.setVerticalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 162, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonMamiferos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonAnfibios)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonArtropodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonCelentereos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonMoluscos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonPoriferos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGusanos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonEquinodermos)))
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addComponent(panelCambiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMamiferos)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnfibios)
                    .addComponent(botonArtropodos)
                    .addComponent(botonCelentereos)
                    .addComponent(botonMoluscos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPoriferos)
                    .addComponent(botonGusanos)
                    .addComponent(botonEquinodermos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCambiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMamiferosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMamiferosActionPerformed
       mostrarPanel(new TablaReporteMamifero(usuario,contrasena));
    }//GEN-LAST:event_botonMamiferosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mostrarPanel(new TablaReporteAves(usuario,contrasena));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        mostrarPanel(new TablaReporteReptiles(usuario,contrasena));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mostrarPanel(new TablaReportePeces(usuario,contrasena));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonAnfibiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnfibiosActionPerformed
        mostrarPanel(new TablaReporteAnfibios(usuario,contrasena));
    }//GEN-LAST:event_botonAnfibiosActionPerformed

    private void botonArtropodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArtropodosActionPerformed
        mostrarPanel(new TablaReporteArtropodos(usuario,contrasena));
    }//GEN-LAST:event_botonArtropodosActionPerformed

    private void botonCelentereosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCelentereosActionPerformed
        mostrarPanel(new TablaReporteCelentereos(usuario,contrasena));
    }//GEN-LAST:event_botonCelentereosActionPerformed

    private void botonMoluscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMoluscosActionPerformed
        mostrarPanel(new TablaReporteMoluscos(usuario,contrasena));
    }//GEN-LAST:event_botonMoluscosActionPerformed

    private void botonPoriferosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPoriferosActionPerformed
        mostrarPanel(new TablaReportePoriferos(usuario,contrasena));
    }//GEN-LAST:event_botonPoriferosActionPerformed

    private void botonGusanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGusanosActionPerformed
        mostrarPanel(new TablaReporteGusanos(usuario,contrasena));
    }//GEN-LAST:event_botonGusanosActionPerformed

    private void botonEquinodermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEquinodermosActionPerformed
        mostrarPanel(new TablaReporteEquinodermos(usuario,contrasena));
    }//GEN-LAST:event_botonEquinodermosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnfibios;
    private javax.swing.JButton botonArtropodos;
    private javax.swing.JButton botonCelentereos;
    private javax.swing.JButton botonEquinodermos;
    private javax.swing.JButton botonGusanos;
    private javax.swing.JButton botonMamiferos;
    private javax.swing.JButton botonMoluscos;
    private javax.swing.JButton botonPoriferos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel panelCambiante;
    // End of variables declaration//GEN-END:variables
}
