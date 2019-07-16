
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Diego y Bryan
 */
public class VentanaIntermedia extends JFrame {
    private JLabel jlImagen , jlTitulo;
    private JButton jbAgregar , jbModificar , jbEliminar;
    private JPanel jpContenedor;
    
    public VentanaIntermedia () {
       setTitle("Ventana de Inicio");
       setSize(1300,600);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       iniciarComponentes();
       crearLayout();
       setVisible(true);
    }
    
    private void iniciarComponentes() {
      jlImagen = new JLabel();
      jlImagen.setIcon( new ImageIcon( getClass().getClassLoader().getResource("Imagenes/mapa.jpg")));
      jlTitulo = new JLabel("ChurchActs-Panel-Usuario");
      jlTitulo.setFont( new Font("Arial Black" , Font.BOLD , 20));
      jbAgregar = new JButton("Agregar");
      jbAgregar.setFont( new Font("Arial Black" , Font.BOLD , 14));
      jbAgregar.setIcon(new ImageIcon( getClass().getClassLoader().getResource("Imagenes/mas.png")));
      jbModificar = new JButton("Modificar");
      jbModificar.setFont(new Font("Arial Black" , Font.BOLD , 14));
      jbModificar.setIcon(new ImageIcon( getClass().getClassLoader().getResource("Imagenes/actualizar.png")));
      jbEliminar = new JButton("Eliminar");
      jbEliminar.setFont( new Font("Arial Black" , Font.BOLD , 14));
      jbEliminar.setIcon(new ImageIcon( getClass().getClassLoader().getResource("Imagenes/menos.png")) );
      jpContenedor = new JPanel();
    }
    
    private void crearLayout() {
      jpContenedor.setBackground(Color.CYAN);
      jpContenedor.setLayout (new GridBagLayout());
      agregarJLTitulo();
      agregarJLImagen();
      agregarJBAgregar();
      agregarJBModificar();
      agregarJBEliminar();
      add(jpContenedor);
    }
    
    //metodo para agregar jbImagen al layout 
    private void agregarJLImagen() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 1;
      gbc.gridwidth  = 4;
      gbc.gridheight = 4;
      gbc.weightx = 1.0;
      gbc.weighty = 1.0;
      gbc.fill= GridBagConstraints.BOTH;
      jpContenedor.add(jlImagen , gbc);
    }
    //metodo para agregar jlTitulo al layout
    private void agregarJLTitulo() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 2;
      gbc.gridy = 0;
      gbc.gridheight = 1;
      gbc.gridwidth = 3;
      //gbc.anchor = GridBagConstraints.CENTER;
      gbc.weightx = 1.0;
      jpContenedor.add(jlTitulo , gbc);
    }
    //metodo para agregar jbAgregar al layout
    private void agregarJBAgregar() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 4;
      gbc.gridy = 1;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.CENTER;
      jpContenedor.add(jbAgregar , gbc);
    }
    //metodo para agregar jbModificar al layout
    private void agregarJBModificar() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 4;
      gbc.gridy = 2;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.CENTER;
      jpContenedor.add(jbModificar , gbc);
    }
    //metodo para agregar jbEliminar al layout
    private void agregarJBEliminar() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 4;
      gbc.gridy = 3;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.CENTER;
      jpContenedor.add(jbEliminar , gbc);
    }
    
}
