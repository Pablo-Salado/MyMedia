/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS.forogui;

import db.access.DBConnection;
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
    public DiscusionButton(String texto,JFrame f, DBConnection connect,String usuario)
    {
        Dimension d = new Dimension(703,42);
        Discusion = texto;
        j = f;
        con = connect;
        this.usuario = usuario;
        this.setText(texto);
        this.setPreferredSize(d);
        this.setMaximumSize(d);
        this.setMinimumSize(d);
        this.addActionListener(new ActionListener()
    {
     @Override
    public void actionPerformed(ActionEvent e) {
        DiscusionDialog dial = new DiscusionDialog(j,false,Discusion,con,usuario);
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
