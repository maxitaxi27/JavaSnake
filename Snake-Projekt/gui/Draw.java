package gui;

import javax.swing.*;
import java.awt.*;


public class Draw extends JLabel{ //Zum Zeichnen
    
    protected void paintComponent (Graphics g){ //überschreibt JLabel-Methode um selber zeichnen zu können

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_OFF);

        //Zeichnen des Hintergrunds
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, Gui.width, Gui.height);

        repaint();
    }
}
