package com.mycompany.proyectofinalremesa.GUI;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame {
    
    private String nom;
    private String ape;
    private String ce;

    public Dashboard() {
        initComponents();
        inicioDashboard();
    }

    public Dashboard(String nom, String ape, String ce) {
        this.nom = nom;
        this.ape = ape;
        this.ce = ce;
        initComponents();
        inicioDashboard();
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
    

    public void inicioDashboard() {
        InternalHome pf = new InternalHome();

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("HOME");
        this.setIconImage(new ImageIcon(getClass().getResource("/imgs/IconoApp.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtHome = new javax.swing.JLabel();
        btn_returns = new javax.swing.JPanel();
        txtConsultar = new javax.swing.JLabel();
        btn_users = new javax.swing.JPanel();
        txtTasa = new javax.swing.JLabel();
        btn_books = new javax.swing.JPanel();
        txtReporte = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        txtHorario = new javax.swing.JLabel();
        btn_lends = new javax.swing.JPanel();
        txtEnvio = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnCerrarSesion = new javax.swing.JLabel();
        Nav = new javax.swing.JPanel();
        MInimizar = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        txtNav = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(117, 164, 127));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(117, 164, 127));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_prin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        txtHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHome.setForeground(new java.awt.Color(255, 255, 255));
        txtHome.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-home_icon.png")); // NOI18N
        txtHome.setText("Home");
        txtHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtHome.setIconTextGap(12);
        txtHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHomeMouseClicked(evt);
            }
        });
        btn_prin.add(txtHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 100, 40));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        btn_returns.setBackground(new java.awt.Color(117, 164, 127));
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_returnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_returnsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_returnsMousePressed(evt);
            }
        });
        btn_returns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtConsultar.setForeground(new java.awt.Color(255, 255, 255));
        txtConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-ConsultarEnvio.png"))); // NOI18N
        txtConsultar.setText("Consultar mis Remesas");
        txtConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtConsultar.setIconTextGap(12);
        txtConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConsultarMouseClicked(evt);
            }
        });
        btn_returns.add(txtConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 200, 40));

        Menu.add(btn_returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_users.setBackground(new java.awt.Color(117, 164, 127));
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usersMousePressed(evt);
            }
        });
        btn_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTasa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTasa.setForeground(new java.awt.Color(255, 255, 255));
        txtTasa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-Cash.png")); // NOI18N
        txtTasa.setText("Tasa de Cambio");
        txtTasa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTasa.setIconTextGap(12);
        txtTasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTasaMouseClicked(evt);
            }
        });
        btn_users.add(txtTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 30));

        Menu.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_books.setBackground(new java.awt.Color(117, 164, 127));
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_booksMousePressed(evt);
            }
        });
        btn_books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtReporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtReporte.setForeground(new java.awt.Color(255, 255, 255));
        txtReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-file.png"))); // NOI18N
        txtReporte.setText("Reportes");
        txtReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtReporte.setIconTextGap(12);
        txtReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReporteMouseClicked(evt);
            }
        });
        btn_books.add(txtReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 110, 40));

        Menu.add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        btn_reports.setBackground(new java.awt.Color(117, 164, 127));
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHorario.setForeground(new java.awt.Color(255, 255, 255));
        txtHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Calendar.png"))); // NOI18N
        txtHorario.setText("Horarios de Servicio");
        txtHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtHorario.setIconTextGap(12);
        txtHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHorarioMouseClicked(evt);
            }
        });
        btn_reports.add(txtHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        Menu.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        btn_lends.setBackground(new java.awt.Color(117, 164, 127));
        btn_lends.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_lends.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_lends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lendsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lendsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lendsMousePressed(evt);
            }
        });
        btn_lends.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEnvio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEnvio.setForeground(new java.awt.Color(255, 255, 255));
        txtEnvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-RealizarEnvio.png"))); // NOI18N
        txtEnvio.setText("Realizar Envio");
        txtEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEnvio.setIconTextGap(12);
        txtEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnvioMouseClicked(evt);
            }
        });
        btn_lends.add(txtEnvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 40));

        Menu.add(btn_lends, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/32px-Cash.png"))); // NOI18N
        app_name.setText("CASH FAST");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 50, 190, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 230, 20));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\Anderson\\OneDrive\\Documentos\\NetBeansProjects\\ProyectoFinalRemesa\\src\\main\\resources\\imgs\\32px-signout.png")); // NOI18N
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });
        Menu.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Nav.setBackground(new java.awt.Color(255, 255, 255));

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

        txtNav.setBackground(new java.awt.Color(0, 0, 0));
        txtNav.setFont(new java.awt.Font("Doppio One", 2, 24)); // NOI18N
        txtNav.setForeground(new java.awt.Color(0, 0, 0));
        txtNav.setText("textoNav");

        javax.swing.GroupLayout NavLayout = new javax.swing.GroupLayout(Nav);
        Nav.setLayout(NavLayout);
        NavLayout.setHorizontalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NavLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNav, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(MInimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addGap(14, 14, 14))
        );
        NavLayout.setVerticalGroup(
            NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(NavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NavLayout.createSequentialGroup()
                        .addComponent(MInimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(txtNav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(Nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 40));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 520, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered

    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited

    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed

    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseEntered

    }//GEN-LAST:event_btn_returnsMouseEntered

    private void btn_returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseExited

    }//GEN-LAST:event_btn_returnsMouseExited

    private void btn_returnsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMousePressed

    }//GEN-LAST:event_btn_returnsMousePressed

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered

    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited

    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_usersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMousePressed

    }//GEN-LAST:event_btn_usersMousePressed

    private void btn_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseEntered

    }//GEN-LAST:event_btn_booksMouseEntered

    private void btn_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseExited

    }//GEN-LAST:event_btn_booksMouseExited

    private void btn_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMousePressed

    }//GEN-LAST:event_btn_booksMousePressed

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered

    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited

    }//GEN-LAST:event_btn_reportsMouseExited

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed

    }//GEN-LAST:event_btn_reportsMousePressed

    private void btn_lendsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseEntered

    }//GEN-LAST:event_btn_lendsMouseEntered

    private void btn_lendsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseExited

    }//GEN-LAST:event_btn_lendsMouseExited

    private void btn_lendsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMousePressed

    }//GEN-LAST:event_btn_lendsMousePressed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        WindowLoginUser us = new WindowLoginUser();
        int a = JOptionPane.YES_NO_OPTION;

        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar sesion?", "Cerrar Sesion", a);

        // 0 -> Igual a la primera opcion selecionada (SI)
        if (resultado == 0) {
            us.setVisible(true);
            us.setLocationRelativeTo(null);

            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void MInimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MInimizarMouseClicked
        this.setState(WindowLoginUser.ICONIFIED);
    }//GEN-LAST:event_MInimizarMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int a = JOptionPane.YES_NO_OPTION;

        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea Salir y cerrar Sesion?", "SALIR DE LA APLICACION", a);

        // 0 -> Igual a la primera opcion selecionada (SI)
        if (resultado == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        // Evento cuando el mouse entra al panel (btn)

    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        //Evento cuando el mouse sale del panel (btn)
    }//GEN-LAST:event_SalirMouseExited

    private void txtHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHomeMouseClicked
        // TODO add your handling code here:
        InternalHome pf = new InternalHome();

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("HOME");
    }//GEN-LAST:event_txtHomeMouseClicked

    private void txtEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnvioMouseClicked
        String n = getNom();
        String a = getApe();
        String c = getCe();

        InternalEnvio pf = new InternalEnvio(n, a, c);

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("Realizar Envio");

    }//GEN-LAST:event_txtEnvioMouseClicked

    private void txtConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConsultarMouseClicked
        String n = getNom();
        String a = getApe();
        String c = getCe();
        
        InternalConsultar pf = new InternalConsultar(n,a,c);

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("Consulta De Mis Envios");

    }//GEN-LAST:event_txtConsultarMouseClicked

    private void txtTasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTasaMouseClicked
        InternalTasa pf = new InternalTasa();

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("Tasa de Cambio");

    }//GEN-LAST:event_txtTasaMouseClicked

    private void txtReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReporteMouseClicked
        InternalReportes pf = new InternalReportes();

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("Reportes CASH FAST");

    }//GEN-LAST:event_txtReporteMouseClicked

    private void txtHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHorarioMouseClicked
        InternalHours pf = new InternalHours();

        content.removeAll();
        content.add(pf).setVisible(true);

        txtNav.setText("Horarios De Servicios");

    }//GEN-LAST:event_txtHorarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MInimizar;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Nav;
    private javax.swing.JLabel Salir;
    private javax.swing.JLabel app_name;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JPanel btn_books;
    private javax.swing.JPanel btn_lends;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_returns;
    private javax.swing.JPanel btn_users;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtConsultar;
    private javax.swing.JLabel txtEnvio;
    private javax.swing.JLabel txtHome;
    private javax.swing.JLabel txtHorario;
    private javax.swing.JLabel txtNav;
    private javax.swing.JLabel txtReporte;
    private javax.swing.JLabel txtTasa;
    // End of variables declaration//GEN-END:variables
}
