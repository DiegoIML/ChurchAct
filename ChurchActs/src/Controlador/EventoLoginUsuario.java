package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class EventoLoginUsuario implements ActionListener {
   private String nombre , contraseña;
   
   public EventoLoginUsuario( String nombre , String contraseña) {
      this.nombre = nombre;
      this.contraseña = contraseña;
   }
   
   private boolean validarNombre() {
     if ( nombre.length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo usuario es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     return true;
   }
   
   private boolean validarContraseña() {
     if ( nombre.length() == 0) {
        JOptionPane.showMessageDialog(null , "El campo contraseña es obligatorio" , "Error en un campo" , JOptionPane.WARNING_MESSAGE);
        return false;
     }
     return true;  
   }

    @Override
    public void actionPerformed(ActionEvent ae) {
         if ( validarNombre() && validarContraseña()) {
            //CONEXTARSE CON LA BD 
         }
    }
   
    
   
}
