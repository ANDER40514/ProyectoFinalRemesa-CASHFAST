
package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.implementsInterface.DAOEnvioRemesaImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOEnvioRemesa;
import com.mycompany.proyectofinalremesa.logica.EnvioRemesa;
import com.mycompany.proyectofinalremesa.logica.TextPrompt;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class WindowValidateTransation extends javax.swing.JFrame {


    public WindowValidateTransation() {
        initComponents();
        
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/IconoApp.png")).getImage());
        
        TextPrompt placeholder = new TextPrompt("Ingrese el ID de la transaccion",txtID);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        btnValidar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        MInimizar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableID = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 0, 0));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });
        jPanel1.add(txtID);
        txtID.setBounds(260, 130, 280, 27);

        btnValidar.setBackground(new java.awt.Color(0, 0, 0));
        btnValidar.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnValidar.setForeground(new java.awt.Color(255, 255, 255));
        btnValidar.setText("Validar");
        btnValidar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidar);
        btnValidar.setBounds(240, 190, 320, 40);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Validate Transation");

        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-Retornar.png"))); // NOI18N
        btnRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetornarMouseClicked(evt);
            }
        });

        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Cerrar.png")); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        MInimizar.setForeground(new java.awt.Color(0, 0, 0));
        MInimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Minimizar.png")); // NOI18N
        MInimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MInimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MInimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnRetornar)
                .addGap(210, 210, 210)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(MInimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(MInimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(btnRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-2, -4, 810, 50);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingresa ID de la Transaccion");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(250, 80, 360, 32);

        TableID.setBackground(new java.awt.Color(204, 204, 204));
        TableID.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        TableID.setForeground(new java.awt.Color(0, 0, 0));
        TableID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "N. Remitente", "N. Destinatario", "StatusEnvio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableID);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(0, 280, 800, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconoApp.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 52, 70, 70);

        btnRefresh.setForeground(new java.awt.Color(0, 0, 0));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Refresh.png"))); // NOI18N
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(550, 130, 40, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        String inputId = txtID.getText();
        
        if (inputId.equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Favor completar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
           cargarTransaction();
        }

    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnRetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetornarMouseClicked
        WindowLoginUser wi = new WindowLoginUser();

        wi.setVisible(true);
        wi.setLocationRelativeTo(null);

        //CODIGO PARA OCULTAR EL FORMULARIO PRESENTE
        this.setVisible(false);
    }//GEN-LAST:event_btnRetornarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;

        int resultado = JOptionPane.showConfirmDialog(this,"¿Desea Salir?","SALIR",a);

        // 0 -> Igual a la primera opcion selecionada (SI)
        if (resultado == 0 ) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void MInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInimizarMouseClicked
        this.setState(WindowValidateTransation.ICONIFIED);
    }//GEN-LAST:event_MInimizarMouseClicked

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
       // EVENTO PARA CUANDO EL USUARIO ESCRIBA -> LIMITAR A SOLO NUMEROS
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9' && c != KeyEvent.VK_BACK_SPACE) 
        {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        

        if (txtID.getText().length() >= 4) {
            // No permite escribir luego del caracter #11
            evt.consume();
            //Sonido que suena al pasar la longitud
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        txtID.setText("");
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        // Guardar el evento cuando el usuario presione Enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnValidar.doClick();
        }
    }//GEN-LAST:event_txtIDKeyPressed

    public void cargarTransaction() {
        EnvioRemesa remesa = new EnvioRemesa(); 
        DAOEnvioRemesa dao = new DAOEnvioRemesaImpl();

        
        String id = txtID.getText().trim();
        int idParse = Integer.parseInt(id);
        System.out.println(idParse);
        
        try {
           
            List<EnvioRemesa> remesas = dao.validarTransacion(idParse);

            DefaultTableModel model = (DefaultTableModel) TableID.getModel();
                      
            remesas.forEach(u ->  model.addRow(new Object[] {u.getId_Envio(), u.getNombreRemitente(), u.getNombreDestinatario(), u.getEstatusDescripcion()}));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MInimizar;
    private javax.swing.JLabel Salir;
    public javax.swing.JTable TableID;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JLabel btnRetornar;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
