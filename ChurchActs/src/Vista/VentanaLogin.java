package Vista;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
 private JLabel  jlUsuario , jlContraseña;
 private JPanel jpUsuario , jpContraseña , jpContenedor;
 
    public VentanaLogin () {
       setTitle("Ventana de Inicio");
       setSize(500,500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       iniciarComponentes();
       //colocarComponentes();
       setVisible(true);
    }
    
    
    
    private void iniciarComponentes() {
       ////////////////////////////////////////////////////////////////////////////
       jlUsuario = new JLabel("Usuario : ");
       jlContraseña = new JLabel("Contraseña : ");
       jtfUsuario = new JTextField(12);
       jpfContraseña = new JPasswordField(12);
       jpUsuario = new JPanel();
       jpContraseña = new JPanel();
       jpContenedor = new JPanel();
       /////////////////////////////////////////////////////////////////////////
    }
    
    
    
    
    
    
    /*
    private void colocarComponentes() {        
       jpContenedor.setBackground(Color.CYAN); 
       jpContenedor.setLayout( new BorderLayout());
       //////////////////////////////////////////////////////////////////////
       jpUsuario.add(jlUsuario);
       jpUsuario.add(jtfUsuario);
       jpContraseña.add(jlContraseña);
       jpContraseña.add(jpfContraseña);
       ///////////////////////////////////////////////////////////////////////
       JPanel jp = new JPanel(); 
       jp.setLayout(new GridLayout(2,1));
       jp.add(jpUsuario);
       jp.add(jpContraseña);
       /////////////////////////////////////////////////////////////////////////
       jpContenedor.add( jp , BorderLayout.CENTER);
       add(jpContenedor);
    }
     */
    
}

