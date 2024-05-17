package com.mycompany.proyectofinalremesa.GUI;


import java.time.LocalDate;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson
 */
public class InternalTasa extends javax.swing.JInternalFrame {

    public InternalTasa() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        LocalDate date = LocalDate.now();

        int year = date.getYear();
        int dia = date.getDayOfMonth();
        int month = date.getMonthValue();

        String[] meses
                = {
                    "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                    "Octubre", "Noviembre", "Diciembre"
                };

        fecha.setText("Ultima Actualizacion: " + dia + " de " + meses[month - 1] + " del año " + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        background1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        euroVenta = new javax.swing.JLabel();
        dolarCompra = new javax.swing.JLabel();
        dolarVenta = new javax.swing.JLabel();
        euroCompra = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        fecha = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\IconoApp.png")); // NOI18N
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ENVIO DE REMESAS");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, -1));

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 42)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setText("TASAS DE CAMBIO");
        background1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 152, 410, 70));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel2.setText("Venta");
        background1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DOLAR");
        background1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 50));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("EURO");
        background1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 32)); // NOI18N
        jLabel5.setText("Compra");
        background1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));
        background1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 222, 480, 20));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        background1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 302, 480, 20));

        euroVenta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        euroVenta.setText("62.50");
        background1.add(euroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 100, 40));

        dolarCompra.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dolarCompra.setText("58.20");
        background1.add(dolarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 100, 40));

        dolarVenta.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        dolarVenta.setText("59.00");
        background1.add(dolarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 100, 40));

        euroCompra.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        euroCompra.setText("60.00");
        background1.add(euroCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 430, 100, 40));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        background1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 402, 480, 70));

        fecha.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("Ultima Actualizacion: {dia}  del mes [month - 1]  del anio year");
        background1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 400, 20));

        background.add(background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 580));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void obtenerMontos() {
        String dc = dolarCompra.getText();
        String dv = dolarVenta.getText();
        String ec = euroCompra.getText();
        String ev = euroVenta.getText();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel background1;
    private javax.swing.JLabel dolarCompra;
    private javax.swing.JLabel dolarVenta;
    private javax.swing.JLabel euroCompra;
    private javax.swing.JLabel euroVenta;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
