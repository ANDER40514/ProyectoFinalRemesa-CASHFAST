package com.mycompany.proyectofinalremesa.GUI;

import com.mycompany.proyectofinalremesa.implementsInterface.DAOClienteImpl;
import com.mycompany.proyectofinalremesa.implementsInterface.DAOUsuariosImpl;
import com.mycompany.proyectofinalremesa.interfaces.DAOCliente;
import com.mycompany.proyectofinalremesa.interfaces.DAOUsuarios;
import com.mycompany.proyectofinalremesa.logica.Cliente;
import com.mycompany.proyectofinalremesa.logica.Encriptacion;
import com.mycompany.proyectofinalremesa.logica.TextPrompt;
import com.mycompany.proyectofinalremesa.logica.Usuarios;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class WindowRegister extends javax.swing.JFrame {

    public WindowRegister() {
        initComponents();
        this.btnOcultar.setVisible(false);
        this.btnConfirmOcultar.setVisible(false);

        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/IconoApp.png")).getImage());

        // Agregando los PlaceHolder
        TextPrompt placeholder = new TextPrompt("Ingrese su Nombre", txtNombre);
        TextPrompt placeholder2 = new TextPrompt("Ingrese su Apellido", txtApellido);
        TextPrompt placeholder3 = new TextPrompt("Ingrese su Cedula", txtCedula);
        TextPrompt placeholder4 = new TextPrompt("Ingrese su Direccion", txtDireccion);
        TextPrompt placeholder5 = new TextPrompt("Ingrese su nombre de usuario", txtUser);
        TextPrompt placeholder6 = new TextPrompt("Ingrese su Contraseña", txtPassword);
        TextPrompt placeholder7 = new TextPrompt("Ingrese su Contraseña nuevamente", txtConfirmPass);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRetornar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        MInimizar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        selectPais = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        btnRegisterFinal = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        selectRol = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtConfirmPass = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        btnVer = new javax.swing.JLabel();
        btnOcultar = new javax.swing.JLabel();
        btnConfirmVer = new javax.swing.JLabel();
        btnConfirmOcultar = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        btnRefresh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 130, 40));

        btnRetornar.setForeground(new java.awt.Color(0, 0, 0));
        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-Retornar.png"))); // NOI18N
        btnRetornar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetornarMouseClicked(evt);
            }
        });
        jPanel2.add(btnRetornar, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 6, 40, 40));

        Salir.setForeground(new java.awt.Color(0, 0, 0));
        Salir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Cerrar.png")); // NOI18N
        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });
        jPanel2.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 30, 40));

        MInimizar.setForeground(new java.awt.Color(0, 0, 0));
        MInimizar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Icono-Minimizar.png")); // NOI18N
        MInimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MInimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MInimizarMouseClicked(evt);
            }
        });
        jPanel2.add(MInimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 40, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellido(s)");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, 38));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Nombre(s)");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 140, 30));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDireccionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel3.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 270, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
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
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 270, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Cedula");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 140, 30));

        txtCedula.setBackground(new java.awt.Color(255, 255, 255));
        txtCedula.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.setBorder(null);
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 270, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Direccion");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 110, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pais");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 60, 40));

        selectPais.setBackground(new java.awt.Color(255, 255, 255));
        selectPais.setForeground(new java.awt.Color(0, 0, 0));
        selectPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Republica Dominicana", "Estados Unidos", "Argentina", "Mexico", "Australia", "Alemania", "Rusia", "Puerto Rico", "Brasil", "Dubai", "Canada", "Chile", "China", "Cuba", "El Salvador", "Guatemala", "India", "Irak", "Suiza", "Venezuela", "Turquia" }));
        selectPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPaisActionPerformed(evt);
            }
        });
        selectPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectPaisKeyPressed(evt);
            }
        });
        jPanel3.add(selectPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 270, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 270, -1));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 332, 270, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 64, 330, 450));

        btnRegisterFinal.setBackground(new java.awt.Color(0, 0, 0));
        btnRegisterFinal.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnRegisterFinal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterFinal.setText("Register");
        btnRegisterFinal.setBorder(null);
        btnRegisterFinal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterFinalActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegisterFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 544, 310, 40));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setBorder(null);
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        jPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 270, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Contraseña");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 140, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 151, 239, 20));

        selectRol.setBackground(new java.awt.Color(255, 255, 255));
        selectRol.setForeground(new java.awt.Color(0, 0, 0));
        selectRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione....", "Administrador", "Usuario", "Invitado" }));
        selectRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRolActionPerformed(evt);
            }
        });
        jPanel4.add(selectRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 30));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Confirmar Contraseña");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 213, 30));

        txtConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        txtConfirmPass.setBorder(null);
        txtConfirmPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmPassKeyPressed(evt);
            }
        });
        jPanel4.add(txtConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 251, 239, 20));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Rol");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 50, 40));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-Visible.png"))); // NOI18N
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });
        jPanel4.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        btnOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-no-Visible.png"))); // NOI18N
        btnOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOcultarMouseClicked(evt);
            }
        });
        jPanel4.add(btnOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        btnConfirmVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-Visible.png"))); // NOI18N
        btnConfirmVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmVerMouseClicked(evt);
            }
        });
        jPanel4.add(btnConfirmVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        btnConfirmOcultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Icono-ojo-no-Visible.png"))); // NOI18N
        btnConfirmOcultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmOcultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmOcultarMouseClicked(evt);
            }
        });
        jPanel4.add(btnConfirmOcultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, 270, 30));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Usuario");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));
        jPanel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 240, 10));
        jPanel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, 240, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 380, 450));

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Refresh.png"))); // NOI18N
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRefreshMouseClicked(evt);
            }
        });
        jPanel1.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 550, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconoApp.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 544, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 40, 450));

        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 20, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectPaisActionPerformed
    }//GEN-LAST:event_selectPaisActionPerformed

    private void btnRegisterFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterFinalActionPerformed
        Encriptacion encriptacion = new Encriptacion();

        //Obtener texto de los campos
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula = txtCedula.getText();
        String direccion = txtDireccion.getText();
        String usuario = txtUser.getText();
        String contra = txtPassword.getText();
        String confirmContra = txtConfirmPass.getText();
        int rol = selectRol.getSelectedIndex();

        String contrasenaEncriptadaUsuario = encriptacion.MD5(contra);

        // El campo contra es diferente de ConfirmContra muestre esa alerta
        if (!contra.equals(confirmContra)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || usuario.isEmpty() || contra.isEmpty()
                || confirmContra.isEmpty() || rol == 0) {

            javax.swing.JOptionPane.showMessageDialog(this, "Favor completar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        int seleccionadoPais = selectPais.getSelectedIndex(); // Obtener el índice seleccionado
        int seleccionadoRol = selectRol.getSelectedIndex(); // Obtener el índice seleccionado

        char[] valores = {' ', 'A', 'U', 'I'}; // Mapeo de valores según el índice seleccionado

        char aux = ' '; // Valor por defecto

        if (seleccionadoRol >= 1 && seleccionadoRol <= 3) {
            aux = valores[seleccionadoRol]; // Obtener el valor correspondiente del array
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Indice de Rol no valido \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            return; //Parar la ejecucion del btn 

            // --------------------REVISAR EL ROL---------------------------------
        }

        String pais = selectPais.getItemAt(seleccionadoPais); //Obtener el valor del indice

        //Instanciando la clase
        Cliente client = new Cliente();

        //Setear los parametros
        client.setNombre(nombre);
        client.setApellido(apellido);
        client.setCedula(cedula);
        client.setDireccion(direccion);
        client.setPais(pais);

        client.setUser(usuario);
        client.setContra(contrasenaEncriptadaUsuario);
        client.setRol(aux);

        Usuarios user = new Usuarios();

        user.setNombreUsuario(usuario);
        user.setContra(contrasenaEncriptadaUsuario);
        user.setRol(aux);

        try {
            DAOUsuarios dao2 = new DAOUsuariosImpl();
            DAOCliente dao = new DAOClienteImpl();
            dao.registrar(client);
            dao2.registrar(user);
            JOptionPane.showMessageDialog(null, "Registrado Satisfactoriamente");
            limpiar();
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrio un Error al registrarse\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_btnRegisterFinalActionPerformed

    private void btnRetornarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetornarMouseClicked
        // Accion al usuario darle click a retornar
        WindowLoginUser wi = new WindowLoginUser();

        //Obtener texto de los campos
        int nombre = txtNombre.getText().trim().length();
        int apellido = txtApellido.getText().trim().length();
        int cedula = txtCedula.getText().trim().length();
        int direccion = txtDireccion.getText().trim().length();
        int usuario = txtUser.getText().trim().length();
        int contra = txtPassword.getText().trim().length();
        int confirmContra = txtConfirmPass.getText().trim().length();
        int rol = selectRol.getSelectedIndex();

        /*
        txtNombre.getText() -> Si el texto no esta vacio
        .trim() -> Eliminar espacios del getText
        .isEmpty() -> Metodo que retorna true si estra vacio 
         */
        if (nombre >= 1 || apellido >= 1 || cedula >= 1 || usuario >= 1 || contra >= 1 || confirmContra >= 1) {
            int a = JOptionPane.YES_NO_OPTION;
            int resultado = JOptionPane.showConfirmDialog(this, "Tienes cambios sin guardar, ¿Desea Salir?", "SALIR", a);
            // 0 -> Igual a la primera opcion selecionada (SI)
            if (resultado == 0) {
                wi.setVisible(true);
                wi.setLocationRelativeTo(null);

                //Ocultar el JFRAME ACTUAL
                this.setVisible(false);
            }
        } else {
            wi.setVisible(true);
            wi.setLocationRelativeTo(null);

            //Ocultar el JFRAME ACTUAL
            this.setVisible(false);
        }

    }//GEN-LAST:event_btnRetornarMouseClicked

    private void MInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInimizarMouseClicked
        this.setState(WindowRegister.ICONIFIED);
    }//GEN-LAST:event_MInimizarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;

        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "SALIR", a);

        // 0 -> Igual a la primera opcion selecionada (SI)
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRefreshMouseClicked
        limpiar();
    }//GEN-LAST:event_btnRefreshMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Evento cuando se presiona una tecla -> Limitar solo a letras
        char c = evt.getKeyChar();

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }

        // Limitar caracteres colocado por el usuario
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

        if (txtNombre.getText().length() >= 30) {
            // No permite escribir luego del caracter #11
            evt.consume();
            //Sonido que suena al pasar la longitud
            Toolkit.getDefaultToolkit().beep();
        }

        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ') && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        //Evento cuando se presiona una tecla -> Limitar solo a numeros
        char c = evt.getKeyChar();

        if ((c < '0' || c > '9') && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        // Limitar caracteres colocado por el usuario
        if (txtCedula.getText().length() >= 11) {
            // No permite escribir luego del caracter #11
            evt.consume();
            //Sonido que suena al pasar la longitud
            Toolkit.getDefaultToolkit().beep();
        }

     }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
     }//GEN-LAST:event_txtDireccionKeyTyped

    private void btnConfirmOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmOcultarMouseClicked
        // TODO add your handling code here:
        btnConfirmVer.setVisible(true); // Ocultar boton de Visualizar
        btnConfirmOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtConfirmPass.setEchoChar('*');
    }//GEN-LAST:event_btnConfirmOcultarMouseClicked

    private void btnConfirmVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmVerMouseClicked
        btnConfirmVer.setVisible(false); // Ocultar boton de Visualizar
        btnConfirmOcultar.setVisible(true); //Mostrar boton de Ocultar
        txtConfirmPass.setEchoChar((char) 0);
    }//GEN-LAST:event_btnConfirmVerMouseClicked

    private void btnOcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOcultarMouseClicked
        btnVer.setVisible(true); // Ocultar boton de Visualizar
        btnOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_btnOcultarMouseClicked

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
        btnVer.setVisible(false); // Ocultar boton de Visualizar
        btnOcultar.setVisible(true); //Mostrar boton de Ocultar
        txtPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_btnVerMouseClicked

    private void selectRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRolActionPerformed
    }//GEN-LAST:event_selectRolActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }

    }//GEN-LAST:event_txtNombreKeyPressed

    private void txtApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }
    }//GEN-LAST:event_txtApellidoKeyPressed

    private void txtCedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }
    }//GEN-LAST:event_txtCedulaKeyPressed

    private void txtDireccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }


    }//GEN-LAST:event_txtDireccionKeyPressed

    private void selectPaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectPaisKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }    }//GEN-LAST:event_selectPaisKeyPressed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtConfirmPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmPassKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            btnRegisterFinal.doClick();
        }
    }//GEN-LAST:event_txtConfirmPassKeyPressed

    private void limpiar() {

        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtDireccion.setText("");
        txtUser.setText("");
        txtPassword.setText("");
        txtConfirmPass.setText("");
        selectPais.setSelectedIndex(0);
        selectRol.setSelectedIndex(0);

        btnVer.setVisible(true); // Ocultar boton de Visualizar
        btnOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtPassword.setEchoChar('*');

        btnConfirmVer.setVisible(true); // Ocultar boton de Visualizar
        btnConfirmOcultar.setVisible(false); //Mostrar boton de Ocultar
        txtConfirmPass.setEchoChar('*');

        return;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MInimizar;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel btnConfirmOcultar;
    private javax.swing.JLabel btnConfirmVer;
    private javax.swing.JLabel btnOcultar;
    private javax.swing.JLabel btnRefresh;
    private javax.swing.JButton btnRegisterFinal;
    private javax.swing.JLabel btnRetornar;
    private javax.swing.JLabel btnVer;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> selectPais;
    private javax.swing.JComboBox<String> selectRol;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JPasswordField txtConfirmPass;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
