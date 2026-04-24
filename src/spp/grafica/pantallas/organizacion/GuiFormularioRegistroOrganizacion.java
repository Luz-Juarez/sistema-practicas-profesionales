/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas.organizacion;

import javax.swing.JOptionPane;
import spp.logicadenegocio.clasesdto.Organizacion;
import spp.logicadenegocio.validacionesInsercion.ValidacionOrganizacion;

/**
 *
 * @author gomes
 */
public class GuiFormularioRegistroOrganizacion extends javax.swing.JFrame {

    public GuiFormularioRegistroOrganizacion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloFormulario = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JLabel();
        ingresaDireccion = new javax.swing.JTextField();
        textoSector = new javax.swing.JLabel();
        opcionesSector = new javax.swing.JComboBox<>();
        ingresaNombre = new javax.swing.JTextField();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloFormulario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloFormulario.setText("Registrar Organización");

        textoNombre.setText("Nombre de la Organización:");

        textoDireccion.setText("Dirección de la Organización:");

        ingresaDireccion.addActionListener(this::ingresaDireccionActionPerformed);

        textoSector.setText("Sector de la Organización:");

        opcionesSector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Publico", "Privado", "Social" }));

        ingresaNombre.addActionListener(this::ingresaNombreActionPerformed);

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(this::botonRegistrarActionPerformed);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(this::botonCancelarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botonRegistrar)
                                .addComponent(textoSector, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ingresaDireccion)
                                    .addComponent(opcionesSector, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(botonCancelar)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoNombre)
                        .addGap(18, 18, 18)
                        .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloFormulario)
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloFormulario)
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDireccion)
                    .addComponent(ingresaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSector)
                    .addComponent(opcionesSector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrar)
                    .addComponent(botonCancelar))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed
    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void ingresaDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaDireccionActionPerformed
    }//GEN-LAST:event_ingresaDireccionActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        
        Organizacion organizacion = new Organizacion();
        
        String nombre = ingresaNombre.getText();
        String direccion = ingresaDireccion.getText();
      
        if(nombre != null && direccion != null){
            
            organizacion.setNombre(nombre);
            organizacion.setDireccion(direccion);
   
        } 
        
        if(opcionesSector.getSelectedIndex() == 0){
            
            JOptionPane.showMessageDialog(null, "Para continuar, seleccione un sector");
            
        }else{
            
             String sector = opcionesSector.getSelectedItem().toString();
             organizacion.setSector(sector);
             
        }
        
        ValidacionOrganizacion validacion = new ValidacionOrganizacion();
        validacion.insertarOrganizacion(organizacion);
        
    }//GEN-LAST:event_botonRegistrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new GuiFormularioRegistroOrganizacion().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JTextField ingresaDireccion;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> opcionesSector;
    private javax.swing.JLabel textoDireccion;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoSector;
    private javax.swing.JLabel tituloFormulario;
    // End of variables declaration//GEN-END:variables
}
