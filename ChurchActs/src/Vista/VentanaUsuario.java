package Vista;

import Modelo.BordeRedondo;
import Modelo.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

/**
 *
 * @author Diego y Bryan
 */
public class VentanaUsuario extends JFrame {
    private Conexion conexion;
    private JLabel jlTitulo;
    private JTable jtReuniones;
    private JButton jbOptimizar , jbEliminar , jbActualizar , jbInsertar;
    private JPanel jpContenedor;
    /**
     * Método constructor que inicia la ventana.
     * @param conexion
     */
    public VentanaUsuario() {
       //this.conexion = conexion;
       setTitle("Ventana de Usuario");
       setSize(1200,900);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       iniciarComponentes();
       crearLayout();
       setVisible(true);
    }
    
    /**
     * Método para crear los objetos de la clase y llamar los métodos que son requeridos.
     */
    private void iniciarComponentes() {
       jlTitulo = new JLabel("ChurchActs Ventana de Usuario.");
       jlTitulo.setFont(new Font( "Arial Black" , Font.BOLD , 30));
       jtReuniones = new JTable(40,20);
       jtReuniones.setBackground(new Color(233,227,206));
       jtReuniones.setFont( new Font("Arial Black" , Font.BOLD , 15));
       jbOptimizar = new JButton("Optimizar");
       jbOptimizar.setFont(new Font("Arial Black" , Font.BOLD , 15));
       jbOptimizar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbOptimizar.png")));
       jbOptimizar.setBackground(new Color (230, 214, 144));
       jbEliminar = new JButton("Eliminar");
       jbEliminar.setFont(new Font("Arial Black" ,  Font.BOLD , 15));
       jbEliminar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbEliminar.png")));
       jbEliminar.setBackground(new Color (230, 214, 144));
       jbActualizar  = new JButton("Actualizar");
       jbActualizar.setFont( new Font("Arial Black" , Font.BOLD  , 15));
       jbActualizar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbActualizar.png")));
       jbActualizar.setBackground(new Color (230, 214, 144));
       jbInsertar = new JButton("Insertar");
       jbInsertar.setFont( new Font("Arial Black" , Font.BOLD , 15));   
       jbInsertar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbInsertar.png")));
       jbInsertar.setBackground(new Color (230, 214, 144));
       jpContenedor = new JPanel();
    }
    
    
     /**
     * Método que permite disponer los componentes para la GUI usuario.
     * @author Diego y Bryan
     */
    
    private void crearLayout() {
      jpContenedor.setBackground( new Color(62,95,138));
      jpContenedor.setLayout (new GridBagLayout());
      agregarJLTitulo();
      agregarJTReuniones();
      agregarJBOptimizar();
      agregarJBEliminar();
      agregarJBActualizar();
      agregarJBInsertar();
      add(jpContenedor);
    }
    
    /**
     * Método que agrega al gridbaglayout el jlTitulo. 
     */
    private void agregarJLTitulo() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 0;
      gbc.gridheight = 1;
      gbc.gridwidth =  1;
      gbc.anchor = GridBagConstraints.SOUTH;
      //gbc.weighty = 1.0;
      jpContenedor.add(jlTitulo , gbc);
    }
    /**
     * Método que agrega al gridbaglayout el jlReuniones.
     */
    private void agregarJTReuniones() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 8;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jpContenedor.add(jtReuniones ,gbc);
    }
    /**
     *  Método que agrega al gridBagLayout el jbOptimizar.
     */
    private void agregarJBOptimizar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        //gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add(jbOptimizar ,gbc);
    }
    /**
     * Método que agrega al gridBagLayout el jbEliminar.
     */
    private void agregarJBEliminar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        //gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add(jbEliminar ,gbc);
    }
    /**
     * Método que agrega al gridBagLayout el jbActualizar
     */
    private void agregarJBActualizar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        //gbc.anchor = GridBagConstraints.CENTER;
        jpContenedor.add(jbActualizar ,gbc);
    }
    /**
     *  Método que agrega al gridBagLayout el jbInsertar
     */
    private void agregarJBInsertar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        //gbc.anchor = GridBagConstraints.CENTER;
        gbc.weighty = 1.0; 
        jpContenedor.add(jbInsertar ,gbc);
    }
    
    
}
