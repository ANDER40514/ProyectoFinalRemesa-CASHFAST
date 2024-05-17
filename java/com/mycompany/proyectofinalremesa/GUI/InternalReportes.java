package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.implementsInterface.DAOEnvioRemesaImpl;
import com.mycompany.proyectofinalremesa.implementsInterface.DAOTasaCambioImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOEnvioRemesa;
import com.mycompany.proyectofinalremesa.interfaces.DAOTasaCambio;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson
 */
public class InternalReportes extends javax.swing.JInternalFrame {

//    public String nombreArchivo;
//    public String extensionArchivo = ".csv";
//    public int contador = 1;
//    public String nombreCompletoArchivo = nombreArchivo + "(" + contador + ")" + extensionArchivo;
    public InternalReportes() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        btnDescargarTxt = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        selectFile = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btnExportar1 = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDescargarTxt.setBackground(new java.awt.Color(153, 153, 153));
        btnDescargarTxt.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnDescargarTxt.setForeground(new java.awt.Color(255, 255, 255));
        btnDescargarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-file.png"))); // NOI18N
        btnDescargarTxt.setText("DescargarTxT");
        btnDescargarTxt.setBorder(null);
        btnDescargarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDescargarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDescargarTxtMouseClicked(evt);
            }
        });
        btnDescargarTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarTxtActionPerformed(evt);
            }
        });
        background.add(btnDescargarTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 160, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\IconoApp.png")); // NOI18N
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, 550));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Selecciona el Reporte a Exportar");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 300, 30));

        selectFile.setBackground(new java.awt.Color(255, 255, 255));
        selectFile.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        selectFile.setForeground(new java.awt.Color(0, 0, 0));
        selectFile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar....", "Reporte de Envios", "Reporte de Tasas" }));
        selectFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectFileActionPerformed(evt);
            }
        });
        selectFile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectFileKeyPressed(evt);
            }
        });
        background.add(selectFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 220, 40));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 370, -1));

        btnExportar1.setBackground(new java.awt.Color(0, 204, 51));
        btnExportar1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnExportar1.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-file.png"))); // NOI18N
        btnExportar1.setText("Exportar");
        btnExportar1.setBorder(null);
        btnExportar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportar1MouseClicked(evt);
            }
        });
        btnExportar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportar1ActionPerformed(evt);
            }
        });
        background.add(btnExportar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 50));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescargarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDescargarTxtMouseClicked
        // EVENTO CUANDO EL USUARIO LE DE CLICK A EXPORTAR
        int seleccionadoFile = selectFile.getSelectedIndex(); // Obtener el índice seleccionado

        char[] valores = {' ', 'A', 'B'}; // Mapeo de valores según el índice seleccionado

        char aux = ' '; // Valor por defecto

        if (seleccionadoFile >= 1 && seleccionadoFile <= 2) {
            aux = valores[seleccionadoFile]; // Obtener el valor correspondiente del array
        } else {
            JOptionPane.showMessageDialog(null, "Índice de rol seleccionado no válido.");
            return; //Parar la ejecucion del btn 

        }
    }//GEN-LAST:event_btnDescargarTxtMouseClicked

    private void btnDescargarTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarTxtActionPerformed
        int seleccionadoArchivo = selectFile.getSelectedIndex(); // Obtener el índice seleccionado

        /*
            Indice -> 1 = Reporte de Envios
            Indice -> 2 = Reporte de Tasas
         */
        switch (selectFile.getSelectedIndex()) {
            case 0 ->
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un indice valido\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);

            case 1 -> // Reporte de Envios
                fileEnvioTXT();

            case 2 -> // Reporte de Tasas
                fileTasaTXT();
            default ->
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Generar el Archivo \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDescargarTxtActionPerformed

    private void selectFileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectFileKeyPressed
        // Guardar el evento cuando el usuario presione Enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnDescargarTxt.doClick();
        }    }//GEN-LAST:event_selectFileKeyPressed

    private void btnExportar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportar1MouseClicked
        // EVENTO CUANDO EL USUARIO LE DE CLICK A EXPORTAR
//        int seleccionadoFile = selectFile.getSelectedIndex(); // Obtener el índice seleccionado
//
//        char[] valores = {' ', 'A', 'B'}; // Mapeo de valores según el índice seleccionado
//
//        char aux = ' '; // Valor por defecto
//
//        if (seleccionadoFile >= 1 && seleccionadoFile <= 2) {
//            aux = valores[seleccionadoFile]; // Obtener el valor correspondiente del array
//        } else {
//            JOptionPane.showMessageDialog(null, "Índice de rol seleccionado no válido.");
//            return; //Parar la ejecucion del btn 
//        }

    }//GEN-LAST:event_btnExportar1MouseClicked

    private void btnExportar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportar1ActionPerformed
        int seleccionadoArchivo = selectFile.getSelectedIndex(); // Obtener el índice seleccionado

        /*
            Indice -> 1 = Reporte de Envios
            Indice -> 2 = Reporte de Tasas
         */
        switch (selectFile.getSelectedIndex()) {
            case 0 ->
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un indice valido\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);

            case 1 -> // Reporte de Envios
                fileEnvioCSV();

            case 2 -> // Reporte de Tasas
                fileEnvioTXT();
            default ->
                javax.swing.JOptionPane.showMessageDialog(this, "Error al Generar el Archivo \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_btnExportar1ActionPerformed

    private void selectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectFileActionPerformed

    private void fileTasaCSV() {
        DAOTasaCambio dao = new DAOTasaCambioImpl();

        dao.generarArchivoCSV();
        javax.swing.JOptionPane.showMessageDialog(this, "Archivo Generado Satisfactoriamente. \n", "INFO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    private void fileTasaTXT() {
        DAOTasaCambio dao = new DAOTasaCambioImpl();

        dao.generarArchivoTXT();
        javax.swing.JOptionPane.showMessageDialog(this, "Archivo Generado Satisfactoriamente. \n", "INFO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    private void fileEnvioCSV() {
        DAOEnvioRemesa dao = new DAOEnvioRemesaImpl();

        dao.generarArchivoCSV();
        javax.swing.JOptionPane.showMessageDialog(this, "Archivo Generado Satisfactoriamente. \n", "INFO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }

    private void fileEnvioTXT() {
        DAOEnvioRemesa dao = new DAOEnvioRemesaImpl();

        dao.generarArchivoTXT();
        javax.swing.JOptionPane.showMessageDialog(this, "Archivo Generado Satisfactoriamente. \n", "INFO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnDescargarTxt;
    private javax.swing.JButton btnExportar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> selectFile;
    // End of variables declaration//GEN-END:variables
}
