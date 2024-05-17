package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.implementsInterface.DAOConsultaRemesaImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOConsultaRemesa;
import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

public class InternalConsultar extends javax.swing.JInternalFrame {

    private String nom;
    private String ape;
    private String ce;

    public InternalConsultar() {
        inicio();
    }

    public InternalConsultar(String nom, String ape, String ce) {
        this.nom = nom;
        this.ape = ape;
        this.ce = ce;
        inicio();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCe() {
        return ce;
    }

    public void setCe(String ce) {
        this.ce = ce;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRemesa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

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

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MIS REMESAS");
        contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 310, 60));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setMaximumSize(new java.awt.Dimension(61, 19));
        btnEliminar.setMinimumSize(new java.awt.Dimension(61, 19));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        contenedor.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 110, 40));

        btnRetirar.setBackground(new java.awt.Color(0, 255, 51));
        btnRetirar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("RETIRAR");
        btnRetirar.setBorder(null);
        btnRetirar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        contenedor.add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 110, 40));

        tablaRemesa.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablaRemesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NombreRemitente", "Monto", "NombreDestinatario", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRemesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaRemesaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRemesa);

        contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 520, 250));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.add(jPanel2);

        contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\Avion64px.png")); // NOI18N
        contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.add(jPanel4);

        contenedor.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 20, 90));

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        contenedor.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 20, 90));

        background.add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 520, 490));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        DAOConsultaRemesa dao = new DAOConsultaRemesaImpl();
        DefaultTableModel model = (DefaultTableModel) tablaRemesa.getModel();

        // -1 cuando el usuario no a selecciono nada
        if (tablaRemesa.getSelectedRow() > - 1) {
            for (int i : tablaRemesa.getSelectedRows()) {
                try {

                    String datoObtenido = (String) tablaRemesa.getValueAt(i, 4); // Obtener el valor del campo Descripcion

                    if (datoObtenido.equals("Aprobado")) {
                        int a = JOptionPane.YES_NO_OPTION;
                        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea eliminar una Remesa Aprobada?", "ELIMINAR", a);

                        if (resultado == 1) {
                            break;
                        } else {
                            dao.eliminarRemesas((int) tablaRemesa.getValueAt(i, 0));
                        }
                    }

                    model.removeRow(i);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            model.fireTableDataChanged();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un registro\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        DAOConsultaRemesa dao = new DAOConsultaRemesaImpl();
        DefaultTableModel model = (DefaultTableModel) tablaRemesa.getModel();

        if (tablaRemesa.getSelectedRow() > -1) {
            int[] selectedRows = tablaRemesa.getSelectedRows();
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                int rowIndex = selectedRows[i];
                try {
                    int idRemesa = (int) tablaRemesa.getValueAt(rowIndex, 0); // Obtener el valor ID que tiene esa fila
                    String descRemesa = (String) tablaRemesa.getValueAt(rowIndex, 4); // Obtener el valor de descricpion

                    switch (descRemesa) {
                        case "Retirado":
                            javax.swing.JOptionPane.showMessageDialog(this, "El registro seleccionado ya ha sido retirado\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                            break;
                        case "Pendiente":
                            javax.swing.JOptionPane.showMessageDialog(this, "La Remesa no se encuentra disponible para su retiro\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                            break;
                        case "En Proceso":
                            javax.swing.JOptionPane.showMessageDialog(this, "La Remesa no se encuentra disponible para su retiro\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                            break;
                        default:
                            dao.actualizarRemesas(idRemesa);
                            // Actualizar los datos en el modelo de la tabla
                            model.setValueAt("Retirado", rowIndex, 4); // 4 es el índice de la columna de descripción
                            break;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            // Notificar al modelo de la tabla que los datos han cambiado
            model.fireTableDataChanged();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un registro\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRetirarActionPerformed

    private void tablaRemesaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaRemesaKeyPressed
   if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRetirar.doClick();
        }
    }//GEN-LAST:event_tablaRemesaKeyPressed

    public void cargarTransaction() {
        EnvioRemesa remesa = new EnvioRemesa();
        DAOConsultaRemesa consulta = new DAOConsultaRemesaImpl();

        String n = getNom();
        String a = getApe();

        //CAMBIAR ESE DATO POR UN CONSTRUCTOR
        //  String id = txtID.getText().trim();
        try {
            List<EnvioRemesa> remesas = consulta.listar(n, a);

            DefaultTableModel model = (DefaultTableModel) tablaRemesa.getModel();

            remesas.forEach(u -> model.addRow(new Object[]{u.getId_Envio(), u.getNombreRemitente(), u.getMonto(), u.getNombreDestinatario(), u.getEstatusDescripcion()}));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void inicio() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
        cargarTransaction();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRemesa;
    // End of variables declaration//GEN-END:variables
}
