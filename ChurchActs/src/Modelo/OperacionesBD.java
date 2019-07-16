
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
       Connection conn = getConn();
       ArrayList<Usuario> lista  = new ArrayList<Usuario>();
       try {
                 String leerBD = "Select u.id , u.usuario , u.contraseña from usuarios as u where u.usuario values(?) ";
                 ps = conn.prepareStatement(leerBD);
                 ps.setString (1 , usuario  );
                 rs = ps.executeQuery();
                 while (rs != null) {
                      Usuario user  = new Usuario( rs.getInt(1) , rs.getString(2) , rs.getString(3));
                      lista.add(user);
                 }
                 conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null , "Ha ocurrido un error al conectarse con la Base de Datos." , "Error de Conexión" , JOptionPane.WARNING_MESSAGE);
               
            }
       return lista;
    }
    
    public boolean agregarUsuario ( Usuario usuario) {
       boolean exito = false;
       PreparedStatement ps;
       Connection conn = getConn();
       try {
                 String insertarBD = "insert into usuarios (id , usuario , contraseña) values  (?,?,?)"  ;
                 ps = conn.prepareStatement(insertarBD);
                 ps.setInt (1 ,  usuario.getId() );
                 ps.setString (2 , usuario.getNombre() );
                 ps.setString (3 , usuario.getContraseña());
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
