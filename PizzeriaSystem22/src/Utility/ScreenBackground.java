/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author fabio
 */
public class ScreenBackground extends JDesktopPane{
    private Image img;
    
    public ScreenBackground (String img) {
        this.img = new ImageIcon(img).getImage();
    }  
    
    @Override
    public void paintComponent(Graphics g) {
        //Responsive screen
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    } 
}
