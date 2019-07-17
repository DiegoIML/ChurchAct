package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Diego y Bryan
 */
public class VentanaConexion extends JPanel {
 private JPasswordField jpfContraseñaPsql;
 private JTextField jtfUsuarioPsql , jtfPuerto;
 private JLabel   jlTituloConexion , jlPuerto , jlUsuarioPsql , jlContraseñaPsql;
 private JButton jbActualizar;
 
 public VentanaConexion() {
       jlTituloConexion = new JLabel("Cambiar datos de conexión");
       jlTituloConexion.setFont( new Font("Arial Black" , Font.BOLD , 20));
       jlPuerto = new JLabel("Puerto : ");
       jlPuerto.setFont(new Font("Arial Black" , Font.BOLD  , 13));
       jlUsuarioPsql = new JLabel("Usuario : ");
       jlUsuarioPsql.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jlContraseñaPsql = new JLabel("Contraseña : ");
       jlContraseñaPsql.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jtfPuerto = new JTextField(10);
       jtfPuerto.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jtfUsuarioPsql = new JTextField(10);
       jtfUsuarioPsql.setFont(new Font("Arial Black" , Font.BOLD , 13));
       jpfContraseñaPsql = new JPasswordField(10);
       jpfContraseñaPsql.setFont( new Font("Arial Black" , Font.BOLD ,13));
       jbActualizar = new JButton("Actualizar");
       jbActualizar.setFont( new Font("Arial Black" , Font.BOLD , 13));
       jbActualizar.setIcon(new ImageIcon( getClass().getClassLoader().getResource("Imagenes/postgresql.png")) );
       jbActualizar.setBackground( new Color(230, 214, 144));
       crearLayout();
 }
 
 public void crearLayout() {
      setLayout( new GridBagLayout());
      agregarJLTituloConexion();
      agregarJLPuerto();
      agregarJLUsuarioPsql();
      agregarJLContraseñaPsql();
      agregarJTFPuerto();
      agregarJTFUsuarioPsql();
      agregarJPFContraseñaPsql();
      agregarJBActualizar();
      setBackground( new Color(231,235,218));
 }
 
   private void agregarJLTituloConexion() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridheight = 1;
    gbc.gridwidth  = 2;
    gbc.anchor = GridBagConstraints.CENTER;
    gbc.weighty = 1.0;
    add(jlTituloConexion , gbc);
   }
   
   private void agregarJLPuerto() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.EAST;
    add(jlPuerto , gbc);
   }
   
   private void agregarJLUsuarioPsql() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.EAST;
    add(jlUsuarioPsql , gbc);
   }
   
   private void agregarJLContraseñaPsql() {
   GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.EAST;
    gbc.weighty = 1.0;
    add(jlContraseñaPsql , gbc);
   }
   
   private void agregarJTFPuerto() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 2;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.weighty = 1.0;
    add(jtfPuerto , gbc);
   
   }
   
   private void agregarJTFUsuarioPsql() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 4;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.weighty = 1.0;
    add(jtfUsuarioPsql , gbc);
   }
   
   private void agregarJPFContraseñaPsql() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 6;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.weighty = 1.0;
    add(jpfContraseñaPsql , gbc);
   }
   
   private void agregarJBActualizar() {
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 8;
    gbc.gridheight = 1;
    gbc.gridwidth  = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.weighty = 1.0;
    add(jbActualizar , gbc);
   }    
   
 
}
