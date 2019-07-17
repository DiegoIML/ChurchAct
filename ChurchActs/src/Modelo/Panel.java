
package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Diego
 */
public class Panel extends JPanel{
   private URL url;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Panel( URL url) {
     this.url = url;
    }
   
    @Override
    public void paint(Graphics g){
        Image imagen = new ImageIcon(url).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        //this.setOpaque(false);
        super.paint(g);
    }
}
