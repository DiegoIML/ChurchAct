
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego y Bryan
 */
public class OperacionesBD extends Conexion{
    //Método que devuelve un ArrayList Usuario con los campos encontrados.
    public ArrayList<Usuario> listaUsuarios ( String usuario) {
       PreparedStatement ps;
       ResultSet rs;
       Connection conn = getConexion();
       ArrayList<Usuario> lista  = new ArrayList<>();
       try {
                 String leerBD = "Select u.id , u.nombre , u.contraseña from usuarios as u where u.nombre = ?";
                 ps = conn.prepareStatement(leerBD);
                 ps.setString (1 , usuario  );
                 rs = ps.executeQuery();
                 
                 while (rs.next()) {
                      int id  = rs.getInt(1);
                      String nombre = rs.getString(2);
                      String contraseña = rs.getString(3);
                      Usuario user  = new Usuario( id , nombre , contraseña);
                      lista.add(user);
                 }
                 conn.close();
                 //return lista;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null , "Ha ocurrido un error al conectarse con la Base de Datos XD." , "Error de Conexión" , JOptionPane.WARNING_MESSAGE);
               System.out.println("Error: ");
               e.printStackTrace();
            }
       return lista;
    }
    
    public boolean agregarUsuario ( Usuario usuario) {
       boolean exito = false;
       PreparedStatement ps;
       Connection conn = getConexion();
       try {
                 String insertarBD = "insert into usuarios (nombre , contraseña) values  (?,?)"  ;
                 ps = conn.prepareStatement(insertarBD);
                 ps.setString (1 , usuario.getNombre() );
                 ps.setString (2 , usuario.getContraseña());
                 int res = ps.executeUpdate();
                 if (res > 0) {
                        JOptionPane.showMessageDialog(null , "Se ha podido agregar exitosamente." , "Agregar usuario" , JOptionPane.INFORMATION_MESSAGE);
                        exito = true;
                 }
                 else  {
                       JOptionPane.showMessageDialog(null , "No se ha podido agregar exitosamente." , "Agregar usuario" , JOptionPane.WARNING_MESSAGE);
                 }
                 conn.close();
       }
       catch (Exception e) {
             JOptionPane.showMessageDialog(null , "Ha ocurrido un error con la Base de Datos.." , "Agregar usuario" , JOptionPane.WARNING_MESSAGE);
       }
       return exito;
    }
}
