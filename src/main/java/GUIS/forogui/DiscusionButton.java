/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS.forogui;

import db.access.DBConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author USUARIO
 */
public class DiscusionButton extends JButton implements ActionListener {
    private String Discusion;
    private JFrame j;
    private DBConnection con;
    private String usuario;
    private int ID;
    public DiscusionButton(String texto,JFrame f,
            DBConnection connect,String usuario,int ID)
    {
        Dimension d = new Dimension(720,44);
        Discusion = texto;
        j = f;
        con = connect;
        this.setBackground(new Color(153,153,255));
        this.setOpaque(true);
        this.setForeground(Color.white);
        this.usuario = usuario;
        this.ID = ID;
        this.setText(texto);
        this.setPreferredSize(d);
        this.setMaximumSize(d);
        this.setMinimumSize(d);
        this.addActionListener(new ActionListener()
    {
     @Override
    public void actionPerformed(ActionEvent e) {
        DiscusionDialog dial = new DiscusionDialog(j,false,Discusion,con,usuario,ID);
        dial.setTitle(Discusion);
        dial.setLocationRelativeTo(null);
        dial.setFocusable(true);
        dial.requestFocus();
        dial.setVisible(true);
    }
    });
    }
    private void sText(String s)
    {
        this.setText(s);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
