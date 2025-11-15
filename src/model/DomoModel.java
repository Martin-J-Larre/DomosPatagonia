
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author martin
 */

public class DomoModel {
    Conexion conexion = new Conexion();
    
    
    public void crearCheckin(String nombre, String apellido, String dni, String genero,
                               String direccion, String provincia, String pais,
                               boolean checkInStatus, boolean checkOutStatus, int deposito, int domoAsignado, int GuiaAsignado) {

        String sql = "INSERT INTO huesped (nombre, apellido, dni, genero, direccion, provincia, pais, checkin_status, checkout_status, deposito, id_domo, id_guia_turismo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        
        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, dni);
            ps.setString(4, genero);
            ps.setString(5, direccion);
            ps.setString(6, provincia);
            ps.setString(7, pais);
            ps.setBoolean(8, checkInStatus);
            ps.setBoolean(9, checkOutStatus);
            ps.setInt(10, deposito);
            ps.setInt(11, domoAsignado);
            ps.setInt(12, domoAsignado);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar Check-In: " + e.getMessage());
        }
    }
    
    // add tipo_de_cama
    public void crearDomo(String disponibilidad, String limpieza, String tipo_de_cama, int precio,
                          String amenities, String servicios) {
        String sql = "INSERT INTO domo (disponibilidad, limpieza_status, precio, tipo_de_cama, amenities, servicios) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, disponibilidad);
            ps.setString(2, limpieza);
            ps.setInt(3, precio);
            ps.setString(4, tipo_de_cama);      
            ps.setString(5, amenities);
            ps.setString(6, servicios);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Error al crear domo: " + e.getMessage());
        }
    }
    
}
