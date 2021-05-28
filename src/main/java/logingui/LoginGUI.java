package logingui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.access.*;
import db.*;
import javax.swing.JFrame;
/**
 *
 * @author adrig
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginGUI() {
       
        initComponents(); 
        PanelRegistro.setVisible(false);
        MensajeError.setVisible(false);
        BORRAR.setVisible(false);
        errorTerminos.setVisible(false);
        errorCorreo.setVisible(false);
        errorUsuario.setVisible(false);
        errorPassword.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelIzquierda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelRegistro = new javax.swing.JPanel();
        JLabelPassword2 = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        JLabelPassword3 = new javax.swing.JLabel();
        TextUsuario = new javax.swing.JTextField();
        TextPassword = new javax.swing.JPasswordField();
        TextConfirm = new javax.swing.JPasswordField();
        JLabelUsuario1 = new javax.swing.JLabel();
        BotonSalir2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TextCorreo = new javax.swing.JTextField();
        MinimizarLabel = new javax.swing.JLabel();
        Termino_Condiciones = new javax.swing.JCheckBox();
        errorTerminos = new javax.swing.JLabel();
        errorCorreo = new javax.swing.JLabel();
        errorUsuario = new javax.swing.JLabel();
        errorPassword = new javax.swing.JLabel();
        PanelInicioSesion = new javax.swing.JPanel();
        TextFieldUsuario = new javax.swing.JTextField();
        TextFieldPassword = new javax.swing.JPasswordField();
        JLabelUsuario = new javax.swing.JLabel();
        JLabelPassword = new javax.swing.JLabel();
        BotonInicioSesion = new javax.swing.JButton();
        BotonRegistro = new javax.swing.JButton();
        MensajeError = new javax.swing.JLabel();
        BORRAR = new javax.swing.JLabel();
        BotonSalir1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonSalir3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMedia");
        setForeground(java.awt.Color.black);

        PanelIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        PanelIzquierda.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomymedia.png"))); // NOI18N

        javax.swing.GroupLayout PanelIzquierdaLayout = new javax.swing.GroupLayout(PanelIzquierda);
        PanelIzquierda.setLayout(PanelIzquierdaLayout);
        PanelIzquierdaLayout.setHorizontalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        PanelIzquierdaLayout.setVerticalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        PanelRegistro.setForeground(new java.awt.Color(0, 0, 255));

        JLabelPassword2.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPassword2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelPassword2.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPassword2.setText("Password");

        Correo.setBackground(new java.awt.Color(255, 255, 255));
        Correo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Correo.setForeground(new java.awt.Color(255, 255, 255));
        Correo.setText("Correo Electronico");

        JLabelPassword3.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPassword3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelPassword3.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPassword3.setText("Confirm Password");

        TextUsuario.setBackground(new java.awt.Color(153, 153, 255));
        TextUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TextUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUsuarioActionPerformed(evt);
            }
        });

        TextPassword.setBackground(new java.awt.Color(153, 153, 255));
        TextPassword.setForeground(new java.awt.Color(0, 0, 0));
        TextPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextPassword.setCaretColor(new java.awt.Color(255, 255, 255));

        TextConfirm.setBackground(new java.awt.Color(153, 153, 255));
        TextConfirm.setForeground(new java.awt.Color(0, 0, 0));
        TextConfirm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextConfirm.setCaretColor(new java.awt.Color(255, 255, 255));

        JLabelUsuario1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuario1.setText("Usuario");

        BotonSalir2.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        BotonSalir2.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir2.setText("  X");
        BotonSalir2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonSalir2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalir2MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setText("Registrarse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextCorreo.setBackground(new java.awt.Color(153, 153, 255));
        TextCorreo.setForeground(new java.awt.Color(0, 0, 0));
        TextCorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCorreoActionPerformed(evt);
            }
        });

        MinimizarLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        MinimizarLabel.setForeground(new java.awt.Color(255, 255, 255));
        MinimizarLabel.setText("   -");
        MinimizarLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MinimizarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarLabelMouseClicked(evt);
            }
        });

        Termino_Condiciones.setBackground(new java.awt.Color(153, 153, 255));
        Termino_Condiciones.setForeground(new java.awt.Color(0, 0, 0));
        Termino_Condiciones.setText("*Acepto los t�rminos y condiciones");
        Termino_Condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Termino_CondicionesActionPerformed(evt);
            }
        });

        errorTerminos.setForeground(new java.awt.Color(255, 0, 0));
        errorTerminos.setText("*Debe aceptar los t�rminos y condiciones para poder continuar con el registro.");

        errorCorreo.setForeground(new java.awt.Color(255, 0, 0));
        errorCorreo.setText("*El correo ya ha sido utilizado, inserte un correo v�lido");

        errorUsuario.setForeground(new java.awt.Color(255, 0, 0));
        errorUsuario.setText("*El usuario ya ha sido utilizado, inserte un usuario v�lido");

        errorPassword.setForeground(new java.awt.Color(255, 0, 0));
        errorPassword.setText("*Las contrase�as no coincide, int�ntelo de nuevo.");

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MinimizarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorPassword)
                            .addComponent(JLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errorUsuario)
                            .addComponent(errorCorreo)
                            .addComponent(errorTerminos)
                            .addComponent(Termino_Condiciones)
                            .addComponent(Correo)
                            .addComponent(JLabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 213, Short.MAX_VALUE))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelPassword2)
                            .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MinimizarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorUsuario)
                .addGap(34, 34, 34)
                .addComponent(JLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(errorPassword)
                .addGap(13, 13, 13)
                .addComponent(JLabelPassword3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(Termino_Condiciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTerminos)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        PanelInicioSesion.setBackground(new java.awt.Color(153, 153, 255));
        PanelInicioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldUsuario.setBackground(new java.awt.Color(153, 153, 255));
        TextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsuarioActionPerformed(evt);
            }
        });
        PanelInicioSesion.add(TextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 340, 32));

        TextFieldPassword.setBackground(new java.awt.Color(153, 153, 255));
        TextFieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextFieldPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.add(TextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 32));

        JLabelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuario.setText("Usuario");
        PanelInicioSesion.add(JLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, 40));

        JLabelPassword.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPassword.setText("Password");
        PanelInicioSesion.add(JLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 50));

        BotonInicioSesion.setBackground(new java.awt.Color(153, 153, 255));
        BotonInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicioSesion.setText("Iniciar Sesi�n");
        BotonInicioSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotonInicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonInicioSesionMouseClicked(evt);
            }
        });
        BotonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioSesionActionPerformed(evt);
            }
        });
        PanelInicioSesion.add(BotonInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 60));

        BotonRegistro.setBackground(new java.awt.Color(153, 153, 255));
        BotonRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistro.setText("Registrarse");
        BotonRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        BotonRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistroMouseClicked(evt);
            }
        });
        BotonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistroActionPerformed(evt);
            }
        });
        PanelInicioSesion.add(BotonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 130, 60));

        MensajeError.setBackground(new java.awt.Color(255, 255, 255));
        MensajeError.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        MensajeError.setForeground(new java.awt.Color(255, 0, 0));
        MensajeError.setText("*Los datos que se han introducido no son correctos");
        PanelInicioSesion.add(MensajeError, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 350, 120));

        BORRAR.setForeground(new java.awt.Color(0, 0, 0));
        BORRAR.setText("ESTO SALE SI INICIO SESION (BORRAR)");
        PanelInicioSesion.add(BORRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 290, 100));

        BotonSalir1.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        BotonSalir1.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir1.setText("  -");
        BotonSalir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalir1MouseClicked(evt);
            }
        });
        PanelInicioSesion.add(BotonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 0, 45, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_user_24px.png"))); // NOI18N
        PanelInicioSesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 30));

        BotonSalir3.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        BotonSalir3.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir3.setText("  X");
        BotonSalir3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonSalir3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalir3MouseClicked(evt);
            }
        });
        PanelInicioSesion.add(BotonSalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 45, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(PanelInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 76, Short.MAX_VALUE)
                    .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelInicioSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
            .addComponent(PanelIzquierda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(PanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsuarioActionPerformed

    private void BotonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRegistroActionPerformed

    //TODO
    //Poner un boton para volver para atras
    //Poner un boton para aceptar condiciones 
    //Cambiar los Jlabel por botones 
    //Mensajes de error.
    
    
    private void BotonRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistroMouseClicked
                //Ir a registro 
        PanelInicioSesion.setVisible(false);      
        PanelRegistro.setVisible(true);
            DBConnectionJDBC conec = DBConnectionJDBC.getInstance();                                             
    }//GEN-LAST:event_BotonRegistroMouseClicked

    private void BotonInicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonInicioSesionMouseClicked
        DBConnectionJDBC conec = DBConnectionJDBC.getInstance();
        //Verificar que no esta creado ya el usuario
        String user = TextFieldUsuario.getText();

        String password = TextFieldPassword.getText();
        if(!conec.checkFreeUserName(user)  && conec.checkPassword(user,password)){
            BORRAR.setVisible(true);
        }else{
            MensajeError.setVisible(true);
        }

    }//GEN-LAST:event_BotonInicioSesionMouseClicked

    private void BotonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonInicioSesionActionPerformed

    private void TextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUsuarioActionPerformed

    private void BotonSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalir1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_BotonSalir1MouseClicked

    private void BotonSalir2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalir2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalir2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       DBConnectionJDBC conec = DBConnectionJDBC.getInstance();
        String user = TextUsuario.getText();
       String correo = TextCorreo.getText();
       String password = TextPassword.getText();
       String passwordConfirm = TextConfirm.getText();
       
       if(conec.checkFreeUserName(user) && conec.checkFreeEmail(correo) && password.equals(passwordConfirm)&& !user.isEmpty() 
               && !correo.isEmpty() && !password.isEmpty() && !passwordConfirm.isEmpty() && Termino_Condiciones.isSelected()){
            User usuario = new User(user, correo, password);
            conec.addUser(usuario);
       }else{
           //Selecciono el error.
           
           if(!conec.checkFreeEmail(correo))
                    errorCorreo.setVisible(true);
           
           if(!conec.checkFreeUserName(user))
                   errorUsuario.setVisible(true);
            
           if(!password.equals(passwordConfirm))
                   errorPassword.setVisible(true);
           
           if(!Termino_Condiciones.isSelected())
                  errorTerminos.setVisible(true);
           
          
           
         
                   
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

    private void BotonSalir3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalir3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalir3MouseClicked

    private void MinimizarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarLabelMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizarLabelMouseClicked

    private void Termino_CondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Termino_CondicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Termino_CondicionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BORRAR;
    private javax.swing.JButton BotonInicioSesion;
    private javax.swing.JButton BotonRegistro;
    private javax.swing.JLabel BotonSalir1;
    private javax.swing.JLabel BotonSalir2;
    private javax.swing.JLabel BotonSalir3;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JLabel JLabelPassword2;
    private javax.swing.JLabel JLabelPassword3;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JLabel JLabelUsuario1;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JLabel MinimizarLabel;
    private javax.swing.JPanel PanelInicioSesion;
    private javax.swing.JPanel PanelIzquierda;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JCheckBox Termino_Condiciones;
    private javax.swing.JPasswordField TextConfirm;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JPasswordField TextFieldPassword;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel errorCorreo;
    private javax.swing.JLabel errorPassword;
    private javax.swing.JLabel errorTerminos;
    private javax.swing.JLabel errorUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
