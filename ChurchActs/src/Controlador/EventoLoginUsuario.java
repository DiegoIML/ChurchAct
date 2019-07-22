package Controlador;

import Modelo.Conexion;
import Modelo.OperacionesBD;
import Modelo.Usuario;
import Vista.VentanaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author Diego y  Bryan
 */
public class EventoLoginUsuario implements ActionListener {
   private JTextField nombre; 
   private JPasswordField contraseña;
   private Conexion conexionBD;
   private JFrame ventanaLogin;
   
   public EventoLoginUsuario(Conexion conexionBD ,  JTextField nombre , JPasswordField contraseña , JFrame ventanaLogin) {
      this.nombre = nombre;
      this.contraseña = contraseña;
      this.ventanaLogin = ventanaLogin;
      this.conexionBD = conexionBD;
   }
   
   private boolean validarNombre() {
     if ( (nombre.getText()).length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo usuario es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     else if ( (nombre.getText()).length() > 10 ){
        JOptionPane.showMessageDialog(null , "El campo usuario debe tener hasta 10 caracteres" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
     }
     return true;
   }
   
   private boolean validarContraseña() {
     if ( (contraseña.getText()).length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo contraseña es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     else if ((contraseña.getText()).length() > 10) {
        JOptionPane.showMessageDialog(null , "El campo contraseña debe tener hasta 10 caracteres" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
     }
     return true;  
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if ( validarNombre() && validarContraseña()) {
          
                OperacionesBD operaciones = new OperacionesBD();
                operaciones.setDatosBD(conexionBD.getPuerto(), conexionBD.getUsuario(), conexionBD.getContraseña());
                ArrayList<Usuario> lista =  operaciones.listaUsuarios (nombre.getText());
       
           if (!lista.isEmpty()) {
                  Iterator<Usuario> it = lista.iterator();
                  while (it.hasNext()) {
                       if ( ((Usuario)it.next()).getContraseña().equals(contraseña.getText())) {
                           JOptionPane.showMessageDialog(null , "Ha podido entrar exitosamente." , "Inicio de Seción" , JOptionPane.INFORMATION_MESSAGE);
                           ventanaLogin.setVisible(false);
                           VentanaUsuario ventana = new VentanaUsuario();
                       }
                       else {
                           if (it.hasNext() == false) {
                                JOptionPane.showMessageDialog(null , "Se ha equivocado de contraseña." , "Inicio de Seción" , JOptionPane.WARNING_MESSAGE);
                           }
                       }
                  }
                  
           } else {
                    if ( operaciones.agregarUsuario( new Usuario( nombre.getText() , contraseña.getText()))) {
                         JOptionPane.showMessageDialog(null , "Se ha agregado exitosamente a la BD." , "Inicio de Seción" , JOptionPane.INFORMATION_MESSAGE);
                         ventanaLogin.setVisible(false);
                         VentanaUsuario ventana = new VentanaUsuario();
                    }
                    else  {
                        JOptionPane.showMessageDialog(null , "No se ha podido agregar exitosamente." , "Inicio de Seción" , JOptionPane.WARNING_MESSAGE);
                    }
           }
             
           }
         else {
           System.out.println("ERROR EN EL EVENTOLOGINUSUARIO");
          } 
       
    }
   
    
   
}
