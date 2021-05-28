package logingui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.access.*;
import db.*;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMedia");
        setForeground(java.awt.Color.black);

        PanelIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        PanelIzquierda.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomymedia.png"))); // NOI18N

        javax.swing.GroupLayout PanelIzquierdaLayout = new javax.swing.GroupLayout(PanelIzquierda);
        PanelIzquierda.setLayout(PanelIzquierdaLayout);
        PanelIzquierdaLayout.setHorizontalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        PanelIzquierdaLayout.setVerticalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
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

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addComponent(JLabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistroLayout.createSequentialGroup()
                    .addGap(0, 114, Short.MAX_VALUE)
                    .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 404, Short.MAX_VALUE)))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(TextCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(JLabelUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 282, Short.MAX_VALUE))
            .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistroLayout.createSequentialGroup()
                    .addGap(0, 114, Short.MAX_VALUE)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addComponent(TextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(JLabelPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(TextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JLabelPassword3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelRegistroLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(TextConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 117, Short.MAX_VALUE)))
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

        BotonSalir1.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        BotonSalir1.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir1.setText("  X");
        BotonSalir1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalir1MouseClicked(evt);
            }
        });
        PanelInicioSesion.add(BotonSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 45, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_user_24px.png"))); // NOI18N
        PanelInicioSesion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 40, 30));

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
                    .addGap(0, 96, Short.MAX_VALUE)
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
        
            //Haria falta un metodo para saber si el usuario y el correo son de la misma persona
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
        System.exit(0);
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
       
       if(conec.checkFreeUserName(user) && conec.checkFreeEmail(correo) && password.equals(passwordConfirm)){
            User usuario = new User(user, correo, password);
            
            conec.addUser(usuario);
                //Crear un nuevo usario 
                //Insertar Usuario en la base de datos  
       }else{
           
       }
    }//GEN-LAST:event_jButton1MouseClicked

    private void TextCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCorreoActionPerformed

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
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JLabel JLabelPassword2;
    private javax.swing.JLabel JLabelPassword3;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JLabel JLabelUsuario1;
    private javax.swing.JLabel MensajeError;
    private javax.swing.JPanel PanelInicioSesion;
    private javax.swing.JPanel PanelIzquierda;
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JPasswordField TextConfirm;
    private javax.swing.JTextField TextCorreo;
    private javax.swing.JPasswordField TextFieldPassword;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
