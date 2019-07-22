package Vista;


import Controlador.EventoActualizarIngresos;
import Controlador.EventoActualizarReunion;
import Controlador.EventoEliminarReunion;
import Controlador.EventoIngresarExcel;
import Controlador.EventoIngresarReuniones;
import Controlador.EventoInsertarReunion;
import Modelo.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author Diego y Bryan
 */
public class VentanaUsuario extends JFrame {
    private Conexion conexionBD;
    private JLabel jlTituloUsuario , jlDinero , jlTituloDinero;
    private JTable jtReuniones;
    private JButton jbOptimizar , jbEliminar , jbActualizar , jbInsertar , jbInsertarHorario , jbActualizarDinero , jbDescargar;
    private JTabbedPane jtpContenedor;
    private JPanel jpUsuario , jp1Vertical , jp2Horizontal , jp3Horizontal ,jp4Horizontal , jp5Vertical , jp6Vertical , jpDatos;
    private JTextField jtfDinero;
    private JScrollPane jspBarra;
    /**
     * Método constructor que inicia la ventana.
     * @param conexion
     */
    public VentanaUsuario() {
       //this.conexion = conexion;
       setTitle("Ventana de Usuario");
       setSize(1000,900);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setIconImage(new ImageIcon( getClass().getClassLoader().getResource("Imagenes/IconoIglesia.png")).getImage());
       iniciarComponentes();
       crearLayout();
       setVisible(true);
    }
    
    /**
     * Método para crear los objetos de la clase y llamar los métodos que son requeridos.
     */
    private void iniciarComponentes() {
       jlTituloUsuario = new JLabel("ChurchActs Ventana de Usuario.");
       jlTituloUsuario.setFont(new Font( "Arial Black" , Font.BOLD , 30));
       jp1Vertical = new JPanel();
       jp1Vertical.setBackground( new Color(92,105,138));
       jp2Horizontal = new JPanel();
       jp2Horizontal.setBackground( new Color(92,105,138));
       jp3Horizontal = new JPanel();
       jp3Horizontal.setBackground( new Color(92,105,138) );
       jp4Horizontal = new JPanel();
       jp4Horizontal.setBackground( new Color(92,105,138) );
       jp5Vertical = new JPanel();
       jp5Vertical.setBackground( new Color(92,105,138) );
       jp6Vertical = new JPanel();
       jp6Vertical.setBackground( new Color(92,105,138));
       
       
       jtReuniones = new JTable() { 
          @Override
          public boolean isCellEditable(int filaIndice , int colIndice) {
            return false;
          }
       };
       
       jtReuniones.setBackground(new Color(230 , 214, 144) );
       jtReuniones.setFont( new Font("Arial Black" , Font.BOLD , 15));
       jspBarra=new JScrollPane();
       jspBarra.setViewportView(jtReuniones);
       jtReuniones.setVisible(false);
       jbOptimizar = new JButton(" Optimizar");
       jbOptimizar.setFont(new Font("Arial Black" , Font.BOLD , 15));
       jbOptimizar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbOptimizar.png")));
       jbOptimizar.setBackground(new Color (230, 214, 144));
       jbEliminar = new JButton(" Eliminar");
       jbEliminar.setFont(new Font("Arial Black" ,  Font.BOLD , 15));
       jbEliminar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbEliminar.png")));
       jbEliminar.setBackground(new Color (230, 214, 144));
       jbActualizar  = new JButton(" Actualizar");
       jbActualizar.setFont( new Font("Arial Black" , Font.BOLD  , 15));
       jbActualizar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbActualizar.png")));
       jbActualizar.setBackground(new Color (230, 214, 144));
       jbInsertar = new JButton(" Insertar");
       jbInsertar.setFont( new Font("Arial Black" , Font.BOLD , 15));   
       jbInsertar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbInsertar.png")));
       jbInsertar.setBackground(new Color (230, 214, 144));
       jbInsertarHorario = new JButton(" Insertar Reuniones");
       jbInsertarHorario.setFont( new Font("Arial Black" , Font.BOLD , 15));   
       jbInsertarHorario.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbInsertarHorario.png")));
       jbInsertarHorario.setBackground(new Color (230, 214, 144));
       jlDinero = new JLabel(" ");
       jlDinero.setFont(new Font("Arial Black" , Font.BOLD , 15));
       jlTituloDinero = new JLabel("Dinero Actual");
       jlTituloDinero.setFont( new Font("Arial Black" , Font.BOLD , 30));
       jtfDinero = new JTextField(10); 
       jtfDinero.setFont( new Font("Arial Black" , Font.BOLD , 15));
       jbActualizarDinero = new JButton(" Actualizar");
       jbActualizarDinero.setFont( new Font("Arial Black", Font.BOLD , 15));
       jbActualizarDinero.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbDinero.png")));
       jbActualizarDinero.setBackground( new Color(230 , 214 , 144));
       jbDescargar = new JButton(" Descargar");
       jbDescargar.setFont( new Font("Arial Black" , Font.BOLD , 15));
       jbDescargar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbDescargar.png")));
       jbInsertar.addActionListener( new EventoInsertarReunion(this, jtReuniones));
       jbActualizar.addActionListener( new EventoActualizarReunion(this));
       //jbInsertarHorario.addActionListener( new EventoIngresarReuniones(jtReuniones , this));
       jbInsertarHorario.addActionListener( new EventoIngresarExcel(jtReuniones , this));
       jbActualizarDinero.addActionListener( new EventoActualizarIngresos(jtfDinero , jlDinero));
       jbEliminar.addActionListener( new EventoEliminarReunion(jtReuniones));
      // jbDescargar.setIcon( new ImageIcon(getClass().getClassLoader().getResource("Imagenes/jbInsertarHorario.png")));
       jbDescargar.setBackground(new Color (230, 214, 144));
       jtpContenedor = new JTabbedPane();
       jpUsuario = new JPanel();
       jpDatos = new JPanel();
       jpDatos.setBackground( new Color(92,105,138) );
    }
    
    
     /**
     * Método que permite disponer los componentes para la GUI usuario.
     * @author Diego y Bryan
     */
    
    private void crearLayout() {
      jpUsuario.setLayout( new GridBagLayout());
      jpDatos.setLayout( new GridBagLayout());
      jpUsuario.setBackground( new Color(92,105,138)  );
      jtpContenedor.setFont(new Font("Arial Black" , Font.BOLD , 13));
      jtpContenedor.addTab("Usuario" , jpUsuario);
      jtpContenedor.addTab("Datos" , jpDatos);
      agregarJBActualizar();
      agregarJBEliminar();
      agregarJBInsertar();
      agregarJBInsertarHorario();
      agregarJBOptimizar();
      agregarJBDescargar();
      agregarJLDinero();
      agregarJLTituloUsuario();
      agregarJP1Vertical();
      agregarJP2Horizontal();
      agregarJP3Horizontal();
      agregarJP4Horizontal();
      agregarJP5Vertical();
      agregarJP6Vertical();
      agregarJSPBarra();
      agregarJLTituloDinero();
      agregarJTFDinero();
      agregarJBActualizarDinero();
      add(jtpContenedor);
    }
    
    /**
     * Método que agrega al gridbaglayout el jlTituloUsuario. 
     * @author : Diego y Bryan. 
     */
    private void agregarJLTituloUsuario() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 0;
      gbc.gridheight = 1;
      gbc.gridwidth =  7;
      jpUsuario.add(jlTituloUsuario , gbc);
    }
    /**
     * Método que agrega al gridbaglayout el jspBarra con la jtReuniones.
     */
    private void agregarJSPBarra() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridheight = 5;
        gbc.gridwidth =  3;
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jspBarra ,gbc);
    }
    /**
     *  Método que agrega al gridBagLayout el jbDescargar
     */
    private void agregarJBDescargar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 8;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jbDescargar ,gbc);
    }
    
    
    /**
     *  Método que agrega al gridBagLayout el jbOptimizar.
     */
    private void agregarJBOptimizar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jbOptimizar ,gbc);
    }
    /**
     * Método que agrega al gridBagLayout el jbEliminar.
     */
    private void agregarJBEliminar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jbEliminar ,gbc);
    }
    /**
     * Método que agrega al gridBagLayout el jbActualizar
     */
    private void agregarJBActualizar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 4;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        //gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jbActualizar ,gbc);
    }
    /**
     *  Método que agrega al gridBagLayout el jbInsertar
     */
    private void agregarJBInsertar() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 2;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0;
        //gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jbInsertar ,gbc);
    }
    
    private void agregarJP1Vertical() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp1Vertical ,gbc);    
    }
    
    private void agregarJP2Horizontal() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 1;
        gbc.gridwidth =  7;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp2Horizontal ,gbc);    
    }
    
     private void agregarJP3Horizontal() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridheight = 1;
        gbc.gridwidth =  4;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp3Horizontal ,gbc);    
    }
     
    private void agregarJP4Horizontal() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridheight = 1;
        gbc.gridwidth =  7;
        gbc.weightx = 1.0; 
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp4Horizontal ,gbc);    
    }
    
    private void agregarJP5Vertical() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp5Vertical ,gbc);    
    }
    
    private void agregarJP6Vertical() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 2;
        gbc.gridheight = 7;
        gbc.gridwidth =  1;
        gbc.weighty = 1.0; 
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        jpUsuario.add(jp6Vertical ,gbc);    
    }
    
    private void agregarJBInsertarHorario() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        jpUsuario.add(jbInsertarHorario ,gbc);
    }
    
    private void agregarJLDinero() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridheight = 1;
        gbc.gridwidth =  1;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        jpUsuario.add(jlDinero ,gbc);
    }
    
    //VENTANA DATOS.
    private void agregarJLTituloDinero() {
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.gridx = 1;
       gbc.gridy = 0;
       gbc.gridheight = 1;
       gbc.gridwidth =  3;
       gbc.weightx = 1.0;
       gbc.fill = GridBagConstraints.VERTICAL;
       jpDatos.add(jlTituloDinero ,gbc);
    }
    
    private void agregarJTFDinero() {
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.gridx = 1;
       gbc.gridy = 2;
       gbc.gridheight = 1;
       gbc.gridwidth  = 1;
       gbc.anchor = GridBagConstraints.CENTER;
       gbc.weightx = 1.0;
       gbc.weighty = 1.0;
       jpDatos.add(jtfDinero ,gbc);
    }
    
    private void agregarJBActualizarDinero() {
       GridBagConstraints gbc = new GridBagConstraints();
       gbc.gridx = 3;
       gbc.gridy = 2;
       gbc.gridheight = 1;
       gbc.gridwidth =  1;
       gbc.anchor = GridBagConstraints.WEST;
       gbc.weightx = 1.0;
       gbc.weighty = 1.0;
       jpDatos.add(jbActualizarDinero ,gbc);
    }
    
}
