package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.implementsInterface.DAOEnvioRemesaImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOEnvioRemesa;
import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import com.mycompany.proyectofinalremesa.logica.TextPrompt;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Anderson
 */
public class InternalEnvio extends javax.swing.JInternalFrame {

    private String nom;
    private String ape;
    private String ce;

    public InternalEnvio() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        TextPrompt placeholder = new TextPrompt("Ingrese su Nombre", txtNombre);
        TextPrompt placeholder2 = new TextPrompt("Ingrese su Apellido", txtApellido);
        TextPrompt placeholder3 = new TextPrompt("Ingrese su Cedula", txtCedula);
        TextPrompt placeholder4 = new TextPrompt("Ingrese el Monto", txtMonto);
    }

    public InternalEnvio(String nom, String ape, String ce) {
        this.nom = nom;
        this.ape = ape;
        this.ce = ce;

        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);

        TextPrompt placeholder = new TextPrompt("Ingrese su Nombre", txtNombre);
        TextPrompt placeholder2 = new TextPrompt("Ingrese su Apellido", txtApellido);
        TextPrompt placeholder3 = new TextPrompt("Ingrese su Cedula", txtCedula);
        TextPrompt placeholder4 = new TextPrompt("Ingrese el Monto", txtMonto);

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
        jLabel1 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        selectMoneda = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setForeground(new java.awt.Color(0, 0, 0));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Moneda:");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 80, 20));

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));
        txtMonto.setForeground(new java.awt.Color(0, 0, 0));
        txtMonto.setBorder(null);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMontoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });
        background.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 230, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Nombre:");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Apellido:");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Cedula:");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 20));

        jLabel5.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Monto:");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 80, 20));

        btnLimpiar.setBackground(new java.awt.Color(255, 102, 0));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        btnLimpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLimpiarKeyPressed(evt);
            }
        });
        background.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 100, 30));

        btnEnviar.setBackground(new java.awt.Color(0, 204, 51));
        btnEnviar.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        background.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 100, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\IconoApp.png")); // NOI18N
        background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        background.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApellidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        background.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 230, -1));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setBorder(null);
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        background.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 230, -1));

        selectMoneda.setBackground(new java.awt.Color(255, 255, 255));
        selectMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "DOP", "USD", "EURO" }));
        selectMoneda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectMonedaActionPerformed(evt);
            }
        });
        selectMoneda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectMonedaKeyPressed(evt);
            }
        });
        background.add(selectMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 130, -1));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, -1));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 202, 230, 10));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 262, 230, 10));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 312, 230, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 300));

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

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ENVIO DE REMESAS");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 400, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 520, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Evento cuando se presiona una tecla -> Limitar solo a letras
        char c = evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (txtNombre.getText().length() >= 30) {
            // No permite escribir luego del caracter #11
            evt.consume();
            //Sonido que suena al pasar la longitud
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        //Evento cuando se presiona una tecla -> Limitar solo a letras
        char c = evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (txtApellido.getText().length() >= 30) {
            // No permite escribir luego del caracter #11
            evt.consume();
            //Sonido que suena al pasar la longitud
            Toolkit.getDefaultToolkit().beep();


        }    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        if (txtCedula.getText().length() >= 11) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_txtMontoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String cedula = txtCedula.getText().trim();
        int seleecionadaMoneda = selectMoneda.getSelectedIndex();


        String strMonto = txtMonto.getText(); // Monto en String
        double monto = Integer.parseInt(strMonto);
        double USD = 58.20;
        double EURO = 60.00;
        double equivalencia = 0;
        //System.out.println("EN DOLAR:" + monto * USD);
        //System.out.println("En Euro: " + monto * EURO);

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || monto == 0 || seleecionadaMoneda == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "Favor completar todos los campos \n", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }


        String[] listaMoneda = {" ", "DOP", "USD", "EURO"};
        String aux;
        aux = listaMoneda[seleecionadaMoneda]; // Obtener el valor correspondiente del array

        switch (seleecionadaMoneda) {
            case 0:
                javax.swing.JOptionPane.showMessageDialog(this, "Selecciona un Rol\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                break;
            case 1:
                aux = listaMoneda[seleecionadaMoneda]; // Obtener el valor correspondiente del array
                equivalencia = monto;
                break;
            case 2:
                equivalencia = monto * USD;
                aux = listaMoneda[seleecionadaMoneda]; // Obtener el valor correspondiente del array
                break;
            case 3:
                equivalencia = monto * EURO;
                aux = listaMoneda[seleecionadaMoneda]; // Obtener el valor correspondiente del array
                break;
            default:
                javax.swing.JOptionPane.showMessageDialog(this, "Indice de Rol no valido \n", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
                return; //
        }

        EnvioRemesa remesa = new EnvioRemesa();

        // Datos que Jalo del login        
        String nRemitente = getNom();
        String aRemitente = getApe();
        String cRemitente = getCe();

        remesa.setNombreRemitente(nRemitente);
        remesa.setApellidoRemitente(aRemitente);
        remesa.setCedulaRemitente(cRemitente);

        //Datos que ingresa el usuario en el form
        //System.out.println("Equivalencia:" + equivalencia);
        remesa.setNombreDestinatario(nombre);
        remesa.setApellidoDestinatario(apellido);
        remesa.setCedulaDestinatario(cedula);
        remesa.setMonto(equivalencia);
        remesa.setMoneda(aux);

        try {
            DAOEnvioRemesa envio = new DAOEnvioRemesaImpl();

            envio.enviarRemesa(remesa);
            JOptionPane.showMessageDialog(null, "Remesa creada Satisfactoriamente");
            limpiar();

            envio.generarFacturaPDF();
            JOptionPane.showMessageDialog(null, "Factura Generada Satisfactoriamente");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnEnviarActionPerformed

    private void selectMonedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectMonedaKeyPressed
        // Guardar el evento cuando el usuario presione Enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviar.doClick();
        }
    }//GEN-LAST:event_selectMonedaKeyPressed

    private void btnLimpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLimpiarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarKeyPressed

    private void selectMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectMonedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMonedaActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviar.doClick();
        }

    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviar.doClick();
        }

    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviar.doClick();
        }

    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtMontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnEnviar.doClick();
        }
    }//GEN-LAST:event_txtMontoKeyPressed

    private void limpiar() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtMonto.setText("");
        selectMoneda.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> selectMoneda;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
