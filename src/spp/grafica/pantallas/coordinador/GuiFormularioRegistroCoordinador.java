/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas.coordinador;

import spp.logicadenegocio.clasesdto.Coordinador;
import spp.logicadenegocio.validacionesInsercion.ValidacionCoordinador;

/**
 *
 * @author Luz Fernanda H J
 */
public class GuiFormularioRegistroCoordinador extends javax.swing.JFrame {
    
    public GuiFormularioRegistroCoordinador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioCoordinador = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoApellidos = new javax.swing.JLabel();
        textoNumeroPersonal = new javax.swing.JLabel();
        ingresaNombre = new javax.swing.JTextField();
        ingresaApellidos = new javax.swing.JTextField();
        ingresaNumeroPersonal = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioCoordinador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Registro Coordinador");

        textoNombre.setText("Nombre del coordinador");

        textoApellidos.setText("Apellidos del coordinador");

        textoNumeroPersonal.setText("Número de personal del coordinador ");

        ingresaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNombreActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioCoordinadorLayout = new javax.swing.GroupLayout(formularioCoordinador);
        formularioCoordinador.setLayout(formularioCoordinadorLayout);
        formularioCoordinadorLayout.setHorizontalGroup(
            formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioCoordinadorLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(textoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textoNumeroPersonal))
                .addGap(40, 40, 40)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ingresaNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioCoordinadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(186, 186, 186))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioCoordinadorLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(botonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar)
                .addGap(116, 116, 116))
        );
        formularioCoordinadorLayout.setVerticalGroup(
            formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioCoordinadorLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoApellidos)
                    .addComponent(ingresaApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresaNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNumeroPersonal))
                .addGap(41, 41, 41)
                .addGroup(formularioCoordinadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonCancelar))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(formularioCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(formularioCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed
    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        
        Coordinador coordinador = new Coordinador();
        
        String nombre = ingresaNombre.getText();
        String apellidos = ingresaApellidos.getText();
        String numeroPersonal = ingresaNumeroPersonal.getText();
        
        if(nombre != null && apellidos != null && numeroPersonal != null){
            
            coordinador.setNombre(nombre);
            coordinador.setApellidos(apellidos);
            coordinador.setNumeroDePersonal(numeroPersonal);
            
        }
        
        ValidacionCoordinador validacion = new ValidacionCoordinador();
        validacion.insertarCoordinador(coordinador);
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JPanel formularioCoordinador;
    private javax.swing.JTextField ingresaApellidos;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JTextField ingresaNumeroPersonal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoNumeroPersonal;
    // End of variables declaration//GEN-END:variables
}
