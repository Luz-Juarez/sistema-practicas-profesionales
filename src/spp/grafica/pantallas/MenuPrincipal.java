/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas;

import spp.grafica.pantallas.coordinador.GuiFormularioRegistroCoordinador;
import spp.grafica.pantallas.organizacion.GuiFormularioRegistroOrganizacion;
import spp.grafica.pantallas.practicante.GuiFormularioRegistroPracticante;
import spp.grafica.pantallas.profesor.GuiFormularioRegistroProfesor;

/**
 *
 * @author Luz Fernanda H J
 */
public class MenuPrincipal extends javax.swing.JFrame {
   
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guiMenuPrincipal = new javax.swing.JPanel();
        tituloMenuPrincipal = new javax.swing.JLabel();
        botonAgregarPracticante = new javax.swing.JButton();
        botonAgregarCoordinador = new javax.swing.JButton();
        botonAgregarProfesor = new javax.swing.JButton();
        botonAgregarOrganizacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guiMenuPrincipal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        tituloMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloMenuPrincipal.setText("Menu Principal");

        botonAgregarPracticante.setText("Agregar Practicante");
        botonAgregarPracticante.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        botonAgregarPracticante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPracticanteActionPerformed(evt);
            }
        });

        botonAgregarCoordinador.setText("Agregar Coordinador");
        botonAgregarCoordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCoordinadorActionPerformed(evt);
            }
        });

        botonAgregarProfesor.setText("Agregar Profesor");
        botonAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProfesorActionPerformed(evt);
            }
        });

        botonAgregarOrganizacion.setText("Agregar Organización");
        botonAgregarOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarOrganizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guiMenuPrincipalLayout = new javax.swing.GroupLayout(guiMenuPrincipal);
        guiMenuPrincipal.setLayout(guiMenuPrincipalLayout);
        guiMenuPrincipalLayout.setHorizontalGroup(
            guiMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMenuPrincipalLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(guiMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(guiMenuPrincipalLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(tituloMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonAgregarOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(guiMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonAgregarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregarCoordinador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregarPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        guiMenuPrincipalLayout.setVerticalGroup(
            guiMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guiMenuPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tituloMenuPrincipal)
                .addGap(40, 40, 40)
                .addComponent(botonAgregarPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAgregarOrganizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(guiMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(guiMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarPracticanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPracticanteActionPerformed
        GuiFormularioRegistroPracticante formulario = new GuiFormularioRegistroPracticante();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonAgregarPracticanteActionPerformed

    private void botonAgregarCoordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCoordinadorActionPerformed
        GuiFormularioRegistroCoordinador formulario = new GuiFormularioRegistroCoordinador();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonAgregarCoordinadorActionPerformed

    private void botonAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProfesorActionPerformed
        GuiFormularioRegistroProfesor formulario = new GuiFormularioRegistroProfesor();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonAgregarProfesorActionPerformed

    private void botonAgregarOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarOrganizacionActionPerformed
        GuiFormularioRegistroOrganizacion formulario = new GuiFormularioRegistroOrganizacion();
        formulario.setVisible(true);
    }//GEN-LAST:event_botonAgregarOrganizacionActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new MenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCoordinador;
    private javax.swing.JButton botonAgregarOrganizacion;
    private javax.swing.JButton botonAgregarPracticante;
    private javax.swing.JButton botonAgregarProfesor;
    private javax.swing.JPanel guiMenuPrincipal;
    private javax.swing.JLabel tituloMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
