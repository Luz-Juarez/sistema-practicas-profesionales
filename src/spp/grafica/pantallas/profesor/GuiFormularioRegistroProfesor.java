/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas.profesor;

import spp.logicadenegocio.clasesdto.Profesor;
import spp.logicadenegocio.validacionesInsercion.ValidacionProfesor;

/**
 *
 * @author gomes
 */
public class GuiFormularioRegistroProfesor extends javax.swing.JFrame {
   
    public GuiFormularioRegistroProfesor() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        ingresaNombre = new javax.swing.JTextField();
        textoApellidos = new javax.swing.JLabel();
        ingresaApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ingresaNoPersonal = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        tituloFormulario = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        ingresaNombre.addActionListener(this::ingresaNombreActionPerformed);

        textoApellidos.setText("Apellidos del Profesor:");

        jLabel4.setText("Número de Personal:");

        ingresaNoPersonal.addActionListener(this::ingresaNoPersonalActionPerformed);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(this::botonRegistrarActionPerformed);

        tituloFormulario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloFormulario.setText("Registrar Profesor");

        textoNombre.setText("Nombre del Profesor: ");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(this::botonCancelarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonRegistrar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textoNombre, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ingresaNombre)
                                    .addComponent(ingresaApellidos)
                                    .addComponent(ingresaNoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(botonCancelar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(tituloFormulario)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(tituloFormulario)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellidos)
                    .addComponent(ingresaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(ingresaNoPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonCancelar))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        
        Profesor profesor = new Profesor();
        
        String nombre = ingresaNombre.getText();
        String apellidos = ingresaApellidos.getText();
        String noPersonal = ingresaNoPersonal.getText();
        
        if(nombre != null && apellidos != null && noPersonal != null ){
            
            profesor.setNombre(nombre);
            profesor.setApellidos(apellidos);
            profesor.setNumeroDePersonal(noPersonal);
            
        } 
      
        ValidacionProfesor validacion = new ValidacionProfesor();
        validacion.insertarProfesor(profesor);
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed
    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void ingresaNoPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNoPersonalActionPerformed
    }//GEN-LAST:event_ingresaNoPersonalActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextField ingresaApellidos;
    private javax.swing.JTextField ingresaNoPersonal;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel tituloFormulario;
    // End of variables declaration//GEN-END:variables
}
