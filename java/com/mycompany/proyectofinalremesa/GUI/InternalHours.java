package com.mycompany.proyectofinalremesa.GUI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson
 */
public class InternalHours extends javax.swing.JInternalFrame {

    public InternalHours() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(243, 120, 61));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\IconoApp.png")); // NOI18N
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ENVIO DE REMESAS");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, -1));

        background1.setBackground(new java.awt.Color(243, 120, 61));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(14, 148, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconoApp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 85, 93));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 115, 420, 10));

        jLabel2.setFont(new java.awt.Font("Doppio One", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HORARIOS DE SERVICIO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 420, 32));

        jLabel3.setFont(new java.awt.Font("Doppio One", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Domingos: 8:00AM - 06:00PM");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Doppio One", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lunes a Viernes: 7:00AM - 11:00PM");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Doppio One", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sabados: 8:00AM - 08:00PM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        background1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 440, 380));

        background.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 600));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
