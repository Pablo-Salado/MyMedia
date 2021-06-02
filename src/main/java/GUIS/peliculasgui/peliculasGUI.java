package GUIS.peliculasgui;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo Salado Cespedosa
 */

import PeliculasSeries.*;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class peliculasGUI extends javax.swing.JFrame {

    /**
     * Creates new form peliculasGUI
     */
    public peliculasGUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextoBuscador = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCaratula = new javax.swing.JLabel();
        jFechaEstreno = new javax.swing.JLabel();
        jDuracion = new javax.swing.JLabel();
        jProductora = new javax.swing.JLabel();
        jPuntuacion = new javax.swing.JLabel();
        jGenero = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        jSinopsis = new javax.swing.JLabel();
        jSalir = new javax.swing.JLabel();
        jMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyMedia");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logomymedia.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setBackground(new java.awt.Color(94, 99, 182));
        jLabel2.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(94, 99, 182));
        jLabel2.setText("MY ");

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(94, 99, 182));
        jLabel3.setText("MEDIA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(94, 99, 182));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buscador");

        jTextoBuscador.setBackground(new java.awt.Color(153, 153, 255));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_search_26px.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jCaratula.setBackground(new java.awt.Color(255, 255, 255));
        jCaratula.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCaratula.setForeground(new java.awt.Color(255, 255, 255));
        jCaratula.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jCaratula.setText("Car�tula:");
        jCaratula.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jCaratula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        jFechaEstreno.setBackground(new java.awt.Color(255, 255, 255));
        jFechaEstreno.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jFechaEstreno.setForeground(new java.awt.Color(255, 255, 255));
        jFechaEstreno.setText("Fecha de estreno:");

        jDuracion.setBackground(new java.awt.Color(255, 255, 255));
        jDuracion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jDuracion.setForeground(new java.awt.Color(255, 255, 255));
        jDuracion.setText("Duraci�n: ");

        jProductora.setBackground(new java.awt.Color(255, 255, 255));
        jProductora.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jProductora.setForeground(new java.awt.Color(255, 255, 255));
        jProductora.setText("Productora: ");

        jPuntuacion.setBackground(new java.awt.Color(255, 255, 255));
        jPuntuacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        jPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPuntuacion.setText("Puntuaci�n: ");
        jPuntuacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jGenero.setBackground(new java.awt.Color(255, 255, 255));
        jGenero.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jGenero.setForeground(new java.awt.Color(255, 255, 255));
        jGenero.setText("G�nero: ");

        jNombre.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jNombre.setForeground(new java.awt.Color(255, 255, 255));
        jNombre.setText("T�tulo:");

        jSinopsis.setBackground(new java.awt.Color(187, 187, 187));
        jSinopsis.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jSinopsis.setForeground(new java.awt.Color(255, 255, 255));
        jSinopsis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jSinopsis.setText("Sinopsis: ");
        jSinopsis.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jSinopsis.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jSinopsis.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jSalir.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jSalir.setForeground(new java.awt.Color(255, 255, 255));
        jSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSalir.setText("x");
        jSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSalirMouseClicked(evt);
            }
        });

        jMinimizar.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        jMinimizar.setForeground(new java.awt.Color(255, 255, 255));
        jMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMinimizar.setText("-");
        jMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jFechaEstreno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jGenero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPuntuacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jProductora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jCaratula, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextoBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCaratula, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFechaEstreno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDuracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProductora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPuntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jGenero)
                .addGap(497, 497, 497))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        ContenidoMultimedia cm = null;
        try {
            // TODO add your handling code here:
             cm = new ContenidoMultimedia(jTextoBuscador.getText());
        } catch (IOException ex) {
            Logger.getLogger(peliculasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jSinopsis.setText("<html> Sinopsis: " + cm.getArgumento() + "<html>");
        URL url = null;
        Image image = null;
        try {
            url = new URL(cm.getURLCaratula());
            image = ImageIO.read(url);
            image = image.getScaledInstance(jCaratula.getWidth(), jCaratula.getHeight(), Image.SCALE_SMOOTH);
            jCaratula.setIcon(new ImageIcon(image));
            jNombre.setText("<html> T�tulo: " + cm.getNombre() + "<html>");
            jFechaEstreno.setText("<html> Fecha de estreno: " + cm.getFechaEstreno() + "<html>");
            jDuracion.setText("<html> Duraci�n: " + cm.getDuracion() + " minutos <html>");
            jProductora.setText("<html> Productora: " + cm.getProductora()+ "<html>");
            jPuntuacion.setText("<html> Puntuaci�n: " + cm.getPuntuacion() + "<html>");
            jGenero.setText("<html> G�nero: " + cm.getGenero() + "<html>");
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(peliculasGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(peliculasGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jSalirMouseClicked

    private void jMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jMinimizarMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jCaratula;
    private javax.swing.JLabel jDuracion;
    private javax.swing.JLabel jFechaEstreno;
    private javax.swing.JLabel jGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMinimizar;
    private javax.swing.JLabel jNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jProductora;
    private javax.swing.JLabel jPuntuacion;
    private javax.swing.JLabel jSalir;
    private javax.swing.JLabel jSinopsis;
    private javax.swing.JTextField jTextoBuscador;
    // End of variables declaration//GEN-END:variables
}
