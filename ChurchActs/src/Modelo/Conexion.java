package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego y Bryan
 */

public class Conexion {
    private Connection conn = null;
    private String puerto = "5434";
    private String usuario = "postgres";
    private String contraseña = "diego";
    protected String urlBaseDatos =  "jdbc:postgresql://localhost:" + puerto + "/ChurchActs";
    
    
      public void setDatosBD ( String puerto , String usuario , String contraseña ) {
       this.puerto = puerto;
       this.usuario = usuario;
       this.contraseña = contraseña;
    }   
    
      
       public Connection getConexion(){
            try {  
              Class.forName("org.postgresql.Driver");
              conn = DriverManager.getConnection(this.urlBaseDatos, this.usuario , this.contraseña);
              //Statement st = conn.createStatement();
            }
            catch(SQLException e) {
               System.out.println("Ocurrio un error : "+e.getMessage());
               System.err.println(e);
            } catch (ClassNotFoundException ex) {
              Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return conn;
    }

       
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUrlBaseDatos() {
        return urlBaseDatos;
    }

    public void setUrlBaseDatos(String urlBaseDatos) {
        this.urlBaseDatos = urlBaseDatos;
    }
    
    
}
