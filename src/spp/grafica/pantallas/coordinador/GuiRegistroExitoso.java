/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package spp.grafica.pantallas.coordinador;
import java.util.logging.Logger;

/**
 *
 * @author Luz Fernanda H J
 */
public class GuiRegistroExitoso extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(GuiRegistroExitoso.class.getName());

    public GuiRegistroExitoso() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensajeRegistroExitoso = new javax.swing.JPanel();
        textoRegistroExitoso = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mensajeRegistroExitoso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        textoRegistroExitoso.setText("Coordinador registrado correctamente");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mensajeRegistroExitosoLayout = new javax.swing.GroupLayout(mensajeRegistroExitoso);
        mensajeRegistroExitoso.setLayout(mensajeRegistroExitosoLayout);
        mensajeRegistroExitosoLayout.setHorizontalGroup(
            mensajeRegistroExitosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mensajeRegistroExitosoLayout.createSequentialGroup()
                .addGroup(mensajeRegistroExitosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mensajeRegistroExitosoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(textoRegistroExitoso))
                    .addGroup(mensajeRegistroExitosoLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(botonAceptar)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        mensajeRegistroExitosoLayout.setVerticalGroup(
            mensajeRegistroExitosoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mensajeRegistroExitosoLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(textoRegistroExitoso)
                .addGap(18, 18, 18)
                .addComponent(botonAceptar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(mensajeRegistroExitoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mensajeRegistroExitoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new GuiRegistroExitoso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JPanel mensajeRegistroExitoso;
    private javax.swing.JLabel textoRegistroExitoso;
    // End of variables declaration//GEN-END:variables
}
