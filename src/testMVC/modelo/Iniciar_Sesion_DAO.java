package modelo;

import java.sql.*;
/**
 *
 * @author martin
 */
public class Iniciar_Sesion_DAO {
    
     public boolean validarLogin(Iniciar_Sesion_model user) {
         
         try {
             Conexion c = new Conexion();
             String query = "SELECT * FROM iniciar_secion WHERE usuario = " + user.getUsuario()+ " AND " + " contrasenia = " + user.getContrasenia();
             ResultSet res = c.stat.executeQuery(query);
             return res.next();
             
         } catch (Exception e) {
             e.printStackTrace();
            return false;
         }
    }
}
