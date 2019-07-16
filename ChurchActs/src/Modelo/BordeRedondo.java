package Modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.Border;

/**
 *
 * @author Diego
 */
public class BordeRedondo implements Border{

    private int radio;

    public BordeRedondo(int radio) {
       // super.setText(nombre);
        this.radio = radio;
    }
    
    /*
    @Override
    public void paint(Graphics g) {
        g.fillRoundRect( this.getX() ,this.getY() ,  this.getWidth()-1,  this.getHeight()-1, radio, radio);
        repaint();
    }
    */
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor( new Color(234, 190, 63));
        g.drawRoundRect(x, y, width-1, height-1, radio, radio);
       
    }

    @Override
    public Insets getBorderInsets(Component cmpnt) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return new Insets(this.radio+1, this.radio+1, this.radio+2, this.radio); 
    }

    @Override
    public boolean isBorderOpaque() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return true;
    }
    
}
