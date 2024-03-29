
package Controlador;

import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Modelo.Conexion;
import java.awt.event.ActionListener;
import javax.swing.JPasswordField;
/**
 *
 * @author Diego y Bryan
 */
public class EventoActualizarDatosBD implements ActionListener {
   private Conexion conexionBD;
   private JTextField campoPuerto;
   private JTextField campoUsuario;
   private JPasswordField campoContraseña;
   
   public EventoActualizarDatosBD (Conexion conexionBD , JTextField campoPuerto , JTextField campoUsuario , JPasswordField campoContraseña) {
        this.conexionBD = conexionBD;
        this.campoPuerto =  campoPuerto;
        this.campoUsuario = campoUsuario;
        this.campoContraseña = campoContraseña;       
   }

   public boolean comprobarCampoPuerto() {
      boolean correcto = false;
              String valor = campoPuerto.getText();
              if (!valor.isEmpty()) {
                  String regexp = "^\\d+$";
                  if (Pattern.matches(regexp , valor)) {
                     correcto = true;  
                  }
              } else  {
                   JOptionPane.showMessageDialog(null ,"El valor debe ser un número entero positivo mayor que cero.");
              }
       return  correcto;
   }
   
   public boolean comprobarCampoUsuario() {
     boolean correcto = false;
     String valor = campoUsuario.getText();
              if (!valor.isEmpty()) {
                     correcto = true;  
              } else  {
                   JOptionPane.showMessageDialog(null ,"No ha ingresado un valor en el campo de texto 'Usuario' ");
              }
     return correcto;
   }
   
   public boolean comprobarCampoContraseña(){
     boolean correcto = false;
     String valor = campoContraseña.getText();
              if (!valor.isEmpty()) {
                     correcto = true;  
              } else  {
                   JOptionPane.showMessageDialog(null ,"No ha ingresado un valor en el campo de texto 'Contraseña' ");
              }
     return correcto;
   }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (comprobarCampoPuerto() && comprobarCampoUsuario() && comprobarCampoContraseña()){
            conexionBD.setDatosBD(campoPuerto.getText(), campoUsuario.getText(), campoContraseña.getText());
            JOptionPane.showMessageDialog(null , "Los Datos han sido actualizados");
        }

    }
}
