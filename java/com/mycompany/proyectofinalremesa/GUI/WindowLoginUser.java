package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.conexionBD.ConexionBD;
import com.mycompany.proyectofinalremesa.logica.TextPrompt;
import com.mycompany.proyectofinalremesa.implementsInterface.DAOClienteImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOCliente;
import com.mycompany.proyectofinalremesa.logica.Cliente;
import com.mycompany.proyectofinalremesa.logica.Encriptacion;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class WindowLoginUser extends javax.swing.JFrame {

    // Guardar las coordenadas del mouse
    int xMouse, yMouse;
    private String nom, ape, ce;

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

    public WindowLoginUser() {
        initComponents();

        TextPrompt placeholder = new TextPrompt("Ingresa el nombre de usuario", txtUser);
        TextPrompt place = new TextPrompt("Ingresa la contraseña", txtPassword);

        // Cuando inice el programa no se muestre el icon de ocultar
        this.btnOcultar.setVisible(false);

        // Seteando el icono de la aplicacion (Cambiando el icono de Java)
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/IconoApp.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnValidate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        MInimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnVer = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 146, 330, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 303, 319, 30));

        btnLogin.setBackground(new java.awt.Color(51, 255, 0));
        btnLogin.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(null);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 364, 310, 40));

        btnRegister.setBackground(new java.awt.Color(102, 102, 102));
        btnRegister.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.setBorder(null);
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 416, 310, 40));

        btnValidate.setBackground(new java.awt.Color(51, 51, 51));
        btnValidate.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnValidate.setForeground(new java.awt.Color(255, 255, 255));
        btnValidate.setText("Validate Transaction");
        btnValidate.setBorder(null);
        btnValidate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValidate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValidateMouseClicked(evt);
            }
        });
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });
        jPanel1.add(btnValidate, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 468, 310, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-IconAccount.png"))); // NOI18N
        jLabel1.setText("User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 72, 140, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-IconPassword.png"))); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 206, 150, 48));

        header.setBackground(new java.awt.Color(0, 204, 204));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" LOGIN ");

        MInimizar.setForeground(new java.awt.Color(0, 0, 0));
        MInimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Minimizar.png")); // NOI18N
        MInimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MInimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MInimizarMouseClicked(evt);
            }
        });

        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Cerrar.png")); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(559, 559, 559)
                .addComponent(MInimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addGap(758, 758, 758)
                    .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(MInimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 260, 319, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 120, 330, 20));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-Visible.png"))); // NOI18N
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });
        jPanel1.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, 50));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-no-Visible.png"))); // NOI18N
        btnOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        jPanel1.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, -1, -1));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Refresh.png"))); // NOI18N
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 303, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconoApp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        WindowRegister rg = new WindowRegister();

        rg.setVisible(true);
        rg.setLocationRelativeTo(null);

        //CODIGO PARA OCULTAR EL FORMULARIO PRESENTE
        this.setVisible(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed
        // TODO add your handling code here:
        WindowValidateTransation vt = new WindowValidateTransation();

        vt.setVisible(true);
        vt.setLocationRelativeTo(null);

        //CODIGO PARA OCULTAR EL FORMULARIO PRESENTE
        this.setVisible(false);
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnValidateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidateMouseClicked

    }//GEN-LAST:event_btnValidateMouseClicked

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        Encriptacion encriptacion = new Encriptacion();
        
        ConexionBD conexion = new ConexionBD();
        DAOCliente dao = new DAOClienteImpl();

        String validacionUno, validacionDos;
        validacionUno = txtUser.getText();
        String contraEncriptadaIngresada = encriptacion.MD5(txtPassword.getText());
        
        Cliente validacionUser = null;        
            
        try {
            validacionUser = dao.login(validacionUno, contraEncriptadaIngresada);

        } catch (Exception e) {
            System.out.println("Error al Acceder a la variable de User");
            e.printStackTrace();
        }

        if (validacionUno.equals("") || txtPassword.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Favor completar todos los campos \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return; // Retorne al mismo jpanel
        }

        if (validacionUser == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Los datos ingresados son erroneos", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            //   return;
        } else {
            String nom = validacionUser.getNombre();
            String ape = validacionUser.getApellido();
            String ce = validacionUser.getCedula();

            setNom(nom);
            setApe(ape);
            setCe(ce);

            Dashboard dh = new Dashboard(nom, ape, ce);
            dh.setVisible(true);
            dh.setLocationRelativeTo(null);

            //CODIGO PARA OCULTAR EL FORMULARIO PRESENTE
            this.setVisible(false);
        }
       

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked

    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        txtUser.setText("");
        txtPassword.setText("");

        btnVer.setVisible(true); // Ocultar boton de Visualizar
        btnOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtPassword.setEchoChar('*');

    }//GEN-LAST:event_btnRefreshMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;

        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir el programa", a);

        // 0 -> Igual a la primera opcion selecionada (SI)
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void MInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInimizarMouseClicked
        this.setState(WindowLoginUser.ICONIFIED);
    }//GEN-LAST:event_MInimizarMouseClicked

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
        btnVer.setVisible(false); // Ocultar boton de Visualizar
        btnOcultar.setVisible(true); //Mostrar boton de Ocultar
        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnVerMouseClicked

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        btnVer.setVisible(true); // Ocultar boton de Visualizar
        btnOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // Accion cuando el mouse se mantenga presionado
        //Obtener coordenadas
        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //Evento cuando se arrastra el mouse
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        // Evento cuando el mouse entra al panel (btn)
        Salir.setBackground(Color.red);
        Salir.setForeground(Color.white);

    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        //Evento cuando el mouse sale del panel (btn)
        Salir.setBackground(Color.white);
        Salir.setBackground(Color.black);
    }//GEN-LAST:event_SalirMouseExited

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // Guardar el evento cuando el usuario presione Enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        // Guardar el evento cuando el usuario presione Enter
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MInimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel btnVer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
