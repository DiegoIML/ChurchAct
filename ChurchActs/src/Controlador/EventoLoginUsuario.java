package Controlador;

import Modelo.Conexion;
import Modelo.OperacionesBD;
import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Diego y  Bryan
 */
public class EventoLoginUsuario implements ActionListener {
   private String nombre , contraseña;
   private Conexion conexionBD;
   
   public EventoLoginUsuario(Conexion conexionBD ,  String nombre , String contraseña) {
      this.nombre = nombre;
      this.contraseña = contraseña;
      this.conexionBD = conexionBD;
   }
   
   private boolean validarNombre() {
     if ( nombre.length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo usuario es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     else if (nombre.length() > 10 ){
        JOptionPane.showMessageDialog(null , "El campo usuario debe tener hasta 10 caracteres" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
     }
     return true;
   }
   
   private boolean validarContraseña() {
     if ( nombre.length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo contraseña es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     else if (nombre.length() > 10) {
        JOptionPane.showMessageDialog(null , "El campo contraseña debe tener hasta 10 caracteres" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
     }
     return true;  
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if ( validarNombre() && validarContraseña()) {
            //CONECTARSE CON LA BD.
           OperacionesBD operaciones = new OperacionesBD();
           operaciones.setDatosBD(conexionBD.getPuerto(), conexionBD.getUsuario(), conexionBD.getContraseña());
           ArrayList<Usuario> lista =  operaciones.listaUsuarios (nombre);
           //FALTA POR COMPLETAR LOS CAMPOS.
           if (lista != null) {
                for ( Usuario user : lista ) {
                   if ( user.getContraseña().equals(contraseña) ) {
                   JOptionPane.showMessageDialog(null , "Ha podido entrar exitosamente." , "Inicio de Seción" , JOptionPane.INFORMATION_MESSAGE);
                   //CAMBIAR DE GUI ->
                   }
                }
                JOptionPane.showMessageDialog(null , "Se ha equivocado de contraseña." , "Inicio de Seción" , JOptionPane.WARNING_MESSAGE);
           }
           
           //INGRESAR NUEVO USUARIO AL SISTEMA.
           
           }
       
    }
   
    
   
}
