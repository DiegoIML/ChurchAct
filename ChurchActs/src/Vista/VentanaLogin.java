package Vista;
import Controlador.EventoLoginUsuario;
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
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
/**
 *
 * @author Diego y Bryan
 */
public class VentanaLogin extends JFrame {
 private Conexion conexion;   
 private JPasswordField jpfContraseña ;
 private JTextField jtfUsuario ;
 private JLabel  jlUsuario , jlContraseña , jlTitulo , jlImagen;
 private JPanel jpLogin , jpConexion;
 private JTabbedPane jtpContenedor;
 private JButton jbIngresar;
   
   /**
    *  Método contructor para iniciar el JFrame.
    *   @author Diego y Bryan
    */
    public VentanaLogin () {
       setTitle("Ventana de Inicio");
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       iniciarComponentes();
       crearLayout();
       setVisible(true);
    }
    /**
     *  Método para crear los objetos de la clase y llamar los métodos que son requeridos.
     *  @author Diego y Bryan
     */
    private void iniciarComponentes() {
       ////////////////////////////////////////////////////////////////////////////
       conexion = new Conexion();
       Font fuentetxt = new Font("Arial Black" , Font.BOLD , 20);
       jlTitulo = new JLabel("ChurchActs-Login");
       jlTitulo.setFont(fuentetxt);
       jlImagen = new JLabel();
       jlImagen.setIcon( new ImageIcon( getClass().getClassLoader().getResource("Imagenes/IconoVaron.png")));
       jlUsuario = new JLabel("Usuario : ");
       jlUsuario.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jlContraseña = new JLabel("Contraseña : ");
       jlContraseña.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jtfUsuario = new JTextField(12);
       jtfUsuario.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jpfContraseña = new JPasswordField(12);
       jpfContraseña.setFont( new Font("Arial Black" , Font.BOLD ,13));
       jbIngresar = new JButton("Ingresar");
       jbIngresar.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jbIngresar.setBackground( new Color(230, 214, 144));
       jbIngresar.setIcon( new ImageIcon( getClass().getClassLoader().getResource("Imagenes/jbIngresar.png")) );
       jbIngresar.addActionListener( new EventoLoginUsuario( conexion, jtfUsuario.getText(), String.valueOf(jpfContraseña.getPassword())  ) );
 
       jtpContenedor = new JTabbedPane();
       jpLogin = new JPanel();
       jpConexion = new VentanaConexion();
    }
    /**
     * Método que permite disponer los componentes para la GUI login.
     * @author Diego y Bryan
     */
    private void crearLayout () {
      //jtpContenedor.setBackground( new Color(92,105,138));
      
      jpLogin.setLayout (new GridBagLayout());
    
      agregarJLTitulo();
      agregarJLImagen();
      agregarJLUsuario();
      agregarJLContraseña();
      agregarJTFUsuario();
      agregarJPFContraseña();
      agregarJBIngresar();
      jpLogin.setBackground(new Color(231, 235, 218));
      jtpContenedor.setFont(new Font("Arial Black" , Font.BOLD , 13));
      jtpContenedor.addTab("Login" , jpLogin);
      jtpContenedor.addTab("Conexion" , jpConexion);
      //add(jtpLogin);
      ///jtpConexion.addTab("Conexion" , jpContenedor);
      add(jtpContenedor);
    }
   
    /**
     * Método que agrega al gridbaglayout el jlTitulo.
     *  @author Diego y Bryan
     */
   private void agregarJLTitulo() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 0;
      gbc.gridheight = 1;
      gbc.gridwidth = 2;
      gbc.anchor = GridBagConstraints.SOUTH;
      //gbc.weighty = 1.0;
      jpLogin.add(jlTitulo , gbc);
   }
    /**
     * Método que agrega al gridbaglayout el jlImagen.
     * @author Diego y Bryan
     */
   private void agregarJLImagen(){
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 2;
      gbc.gridheight = 2;
      gbc.gridwidth  = 2;
      gbc.weighty = 1.0;
      gbc.fill= GridBagConstraints.BOTH;
      jpLogin.add(jlImagen , gbc);
   }
   /**
    *  Método que agrega al gridbaglayout el jlUsuario.
    *  @author Diego y Bryan
    */
   private void agregarJLUsuario() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 4;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.EAST;
      gbc.weighty = 1.0;
      jpLogin.add(jlUsuario , gbc);
   }
   /**
    *  Método que agrega al gridbaglayout el jlContraseña.
    *  @author Diego y Bryan
    */
   private void agregarJLContraseña() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 6;
      gbc.gridheight = 1;
      gbc.gridwidth = 1;
      gbc.anchor = GridBagConstraints.EAST;
      gbc.weighty = 1.0;
      jpLogin.add(jlContraseña , gbc);
   }
   /**
    *  Método que agrega al gridbaglayout el jtfUsuario.
    *   @author Diego y Bryan
    */
   private void agregarJTFUsuario() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 2;
      gbc.gridy = 4;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.CENTER;
      //gbc.weighty = 1.0;
      jpLogin.add(jtfUsuario , gbc);
   }
   /**
    *   Método que agrega al gridbaglayout el jpfContraseña.
    *   @author Diego y Bryan 
    */ 
   private void agregarJPFContraseña () {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 2;
      gbc.gridy = 6;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.weighty = 1.0;
      jpLogin.add(jpfContraseña , gbc);
   }
   /**
    * Método que agrega al gridbaglayout el jbIngresar.
    *  @author Diego y Bryan
    */
   private void agregarJBIngresar() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 8;
      gbc.gridheight = 1;
      gbc.gridwidth  = 2;
      gbc.anchor = GridBagConstraints.NORTH;
      gbc.weighty = 1.0;
      jpLogin.add(jbIngresar , gbc);
   
   }
   
}

