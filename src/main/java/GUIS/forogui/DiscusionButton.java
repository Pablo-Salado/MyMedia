/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIS.forogui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author USUARIO
 */
public class DiscusionButton extends JButton implements ActionListener {
    
    public DiscusionButton(String s)
    {
        Dimension d = new Dimension(703,42);
        this.setText(s);
        this.setPreferredSize(d);
        this.setMaximumSize(d);
        this.setMinimumSize(d);
        this.addActionListener(new ActionListener()
    {
     @Override
    public void actionPerformed(ActionEvent e) {
       sText("owo");
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
