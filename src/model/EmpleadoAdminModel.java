
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoAdminModel {
    private String credencial;
     private String idiomas;
     private String titulo;
     private String domo_asignado;
     private int IDempleado;
     
     
    public EmpleadoAdminModel(String credencial, String idiomas, String titulo, String domo_asignado, int IDempleado) {
        this.credencial = credencial;
        this.idiomas = idiomas;
        this.titulo = titulo;
        this.domo_asignado = domo_asignado;
        this.IDempleado = IDempleado;
    }
     
        public boolean crearEmpleadoAdmin() {
        Conexion conexion = new Conexion();
        
        String query = "INSERT INTO usuario_administrador (credencial, idiomas, titulo, domo_asignado, id_empleado) VALUES (?, ?, ?, ?, ? )";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, credencial);
            ps.setString(2, idiomas);
            ps.setString(3, titulo);
            ps.setString(4, domo_asignado);
            ps.setInt(5, IDempleado);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar el empleado de Limpieza: " + e.getMessage());
            return false;
        }
        
        
        
    }
     
     
     
     
}
