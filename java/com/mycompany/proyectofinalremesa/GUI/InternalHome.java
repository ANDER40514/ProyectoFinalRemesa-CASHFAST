
package com.mycompany.proyectofinalremesa.GUI;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson
 */
public class InternalHome extends javax.swing.JInternalFrame {


    
    public InternalHome() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(243, 120, 61));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(14, 148, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconoApp.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 36, -1, 84));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 163, 312, 10));

        jLabel2.setFont(new java.awt.Font("Doppio One", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME  TO CASH FAST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 191, 310, 32));

        jLabel3.setFont(new java.awt.Font("Doppio One", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estudiante: Anderson Castillo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Doppio One", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Proyecto Final Java");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 182, -1));

        jLabel5.setFont(new java.awt.Font("Doppio One", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Matricula: 100631535");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 200, -1));

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 400, 370));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
