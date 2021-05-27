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
        jLabel1 = new javax.swing.JLabel();
        PanelDerecha = new javax.swing.JPanel();
        TextFieldUsuario = new javax.swing.JTextField();
        TextFieldPassword = new javax.swing.JPasswordField();
        JLabelUsuario = new javax.swing.JLabel();
        JLabelPassword = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JLabel();
        Registro = new javax.swing.JLabel();
        InicioSesion = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelIzquierda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jLabel1.setText("MyMedia");

        javax.swing.GroupLayout PanelIzquierdaLayout = new javax.swing.GroupLayout(PanelIzquierda);
        PanelIzquierda.setLayout(PanelIzquierdaLayout);
        PanelIzquierdaLayout.setHorizontalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        PanelIzquierdaLayout.setVerticalGroup(
            PanelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        PanelDerecha.setBackground(new java.awt.Color(186, 79, 84));
        PanelDerecha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextFieldUsuario.setBackground(new java.awt.Color(186, 79, 84));
        TextFieldUsuario.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsuarioActionPerformed(evt);
            }
        });
        PanelDerecha.add(TextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 274, 32));

        TextFieldPassword.setBackground(new java.awt.Color(186, 79, 84));
        TextFieldPassword.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TextFieldPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        PanelDerecha.add(TextFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 274, 32));

        JLabelUsuario.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JLabelUsuario.setText("Usuario");
        PanelDerecha.add(JLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 90, 40));

        JLabelPassword.setBackground(new java.awt.Color(255, 255, 255));
        JLabelPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        JLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        JLabelPassword.setText("Password");
        PanelDerecha.add(JLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 190, 50));

        BotonSalir.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 24)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });
        PanelDerecha.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 30, 40));

        Registro.setBackground(new java.awt.Color(186, 79, 84));
        Registro.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("    Registrarse");
        Registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });
        PanelDerecha.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 90, 40));

        InicioSesion.setBackground(new java.awt.Color(186, 79, 84));
        InicioSesion.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        InicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        InicioSesion.setText("  Iniciar Sesion");
        InicioSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        InicioSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioSesionMouseClicked(evt);
            }
        });
        PanelDerecha.add(InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 90, 40));

        jButton2.setBackground(new java.awt.Color(186, 79, 84));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelDerecha.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelIzquierda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsuarioActionPerformed

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonSalirMouseClicked

    private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
        //Ir a registro 
        this.setVisible(false);
        RegistroGUI reg = new RegistroGUI();
        reg.setVisible(true);
    }//GEN-LAST:event_RegistroMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void InicioSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioSesionMouseClicked
         DBConnectionJDBC conec = DBConnectionJDBC.getInstance();
         String usuario = TextFieldUsuario.getText();
         String contra = TextFieldPassword.getText();
        if(!conec.checkFreeUserName(usuario) && conec.checkPassword(usuario,contra)){
              this.setVisible(false);
              RegistroGUI reg = new RegistroGUI();
              reg.setVisible(true);
        }
    }//GEN-LAST:event_InicioSesionMouseClicked

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
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JLabel InicioSesion;
    private javax.swing.JLabel JLabelPassword;
    private javax.swing.JLabel JLabelUsuario;
    private javax.swing.JPanel PanelDerecha;
    private javax.swing.JPanel PanelIzquierda;
    private javax.swing.JLabel Registro;
    private javax.swing.JPasswordField TextFieldPassword;
    private javax.swing.JTextField TextFieldUsuario;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
