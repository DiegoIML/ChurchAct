package Vista;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Diego
 */
public class VentanaLogin extends JFrame {
 private JPasswordField jpfContraseña;
 private JTextField jtfUsuario;
 private JLabel  jlUsuario , jlContraseña , jlTitulo , jlImagen;
 private JPanel jpUsuario , jpContraseña , jpContenedor;
 
    public VentanaLogin () {
       setTitle("Ventana de Inicio");
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       iniciarComponentes();
       crearLayout();
       setVisible(true);
    }
    
    
    
    private void iniciarComponentes() {
       ////////////////////////////////////////////////////////////////////////////
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
       jpUsuario = new JPanel();
       jpContraseña = new JPanel();
       jpContenedor = new JPanel();
       /////////////////////////////////////////////////////////////////////////
    }
    
    
    /**
        Método que permite disponer los componentes para la GUI login.
     */
    private void crearLayout () {
      jpContenedor.setBackground(Color.CYAN);
      jpContenedor.setLayout (new GridBagLayout());
      agregarJLTitulo();
      agregarJLImagen();
      agregarJLUsuario();
      agregarJLContraseña();
      agregarJTFUsuario();
      agregarJPFContraseña();
      add(jpContenedor);
    }
   
    //metodo que agrega al layout el jlTitulo.
   private void agregarJLTitulo() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 1;
      gbc.gridheight = 1;
      gbc.gridwidth = 2;
      gbc.anchor = GridBagConstraints.CENTER;
      gbc.weighty = 1.0;
      jpContenedor.add(jlTitulo , gbc);
   }
    
   //metodo que agregar al layout el jlImagen
   private void agregarJLImagen(){
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 2;
      gbc.gridheight = 2;
      gbc.gridwidth  = 2;
      gbc.weighty = 1.0;
      gbc.fill= GridBagConstraints.BOTH;
      jpContenedor.add(jlImagen , gbc);
   }
   
   //metodo que agrega al layout el jlUsuario
   private void agregarJLUsuario() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 4;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.SOUTH;
      gbc.weighty = 1.0;
      jpContenedor.add(jlUsuario , gbc);
   }
   
   //metodo que agrega al layout el jlContraseña 
   private void agregarJLContraseña() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 1;
      gbc.gridy = 5;
      gbc.gridheight = 1;
      gbc.gridwidth = 1;
      gbc.anchor = GridBagConstraints.NORTH;
      gbc.weighty = 1.0;
      jpContenedor.add(jlContraseña , gbc);
   }
   
   //metodo que agrega al layout el jtfUsuario
   private void agregarJTFUsuario() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 2;
      gbc.gridy = 4;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.SOUTH;
      gbc.weighty = 1.0;
      jpContenedor.add(jtfUsuario , gbc);
   }
   
   //metodo que agrega al layout el jpfContraseña 
   private void agregarJPFContraseña () {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 2;
      gbc.gridy = 5;
      gbc.gridheight = 1;
      gbc.gridwidth  = 1;
      gbc.anchor = GridBagConstraints.NORTH;
      gbc.weighty = 1.0;
      jpContenedor.add(jpfContraseña , gbc);
   }
   
 
    
}

