/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas.actividad;

/**
 *
 * @author Luz Fernanda H J
 */
public class GuiFormularioRegistroActividad extends javax.swing.JFrame {
    
    public GuiFormularioRegistroActividad() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formularioGenerarActividad = new javax.swing.JPanel();
        tituloFormulario = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        ingresaNombre = new javax.swing.JTextField();
        textoDescripcion = new javax.swing.JLabel();
        ingresaDescripcion = new javax.swing.JTextField();
        textoFechaLimite = new javax.swing.JLabel();
        ingresaFechaLimite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        formularioGenerarActividad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        tituloFormulario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tituloFormulario.setText("Generar Actividad");

        textoNombre.setText("Nombre de la actividad ");

        ingresaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaNombreActionPerformed(evt);
            }
        });

        textoDescripcion.setText("Descripción de la actividad");

        ingresaDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresaDescripcionActionPerformed(evt);
            }
        });

        textoFechaLimite.setText("Fecha limite");

        javax.swing.GroupLayout formularioGenerarActividadLayout = new javax.swing.GroupLayout(formularioGenerarActividad);
        formularioGenerarActividad.setLayout(formularioGenerarActividadLayout);
        formularioGenerarActividadLayout.setHorizontalGroup(
            formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioGenerarActividadLayout.createSequentialGroup()
                .addContainerGap(168, Short.MAX_VALUE)
                .addComponent(tituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
            .addGroup(formularioGenerarActividadLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoFechaLimite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ingresaNombre)
                    .addComponent(ingresaDescripcion)
                    .addComponent(ingresaFechaLimite, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        formularioGenerarActividadLayout.setVerticalGroup(
            formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioGenerarActividadLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(tituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresaDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(formularioGenerarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFechaLimite)
                    .addComponent(ingresaFechaLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(formularioGenerarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(formularioGenerarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaNombreActionPerformed
        
    }//GEN-LAST:event_ingresaNombreActionPerformed

    private void ingresaDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresaDescripcionActionPerformed
      
    }//GEN-LAST:event_ingresaDescripcionActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new GuiFormularioRegistroActividad().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel formularioGenerarActividad;
    private javax.swing.JTextField ingresaDescripcion;
    private javax.swing.JTextField ingresaFechaLimite;
    private javax.swing.JTextField ingresaNombre;
    private javax.swing.JLabel textoDescripcion;
    private javax.swing.JLabel textoFechaLimite;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel tituloFormulario;
    // End of variables declaration//GEN-END:variables
}
