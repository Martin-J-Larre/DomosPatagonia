/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author martin
 */

public class DomoModel {

    // Método para insertar Check-In en la base de datos
    public void crearCheckin(String nombre, String apellido, String dni, String genero,
                               String direccion, String provincia, String pais,
                               boolean checkInStatus, boolean checkOutStatus, double deposito) {

        String sql = "INSERT INTO huesped (nombre, apellido, dni, genero, direccion, provincia, pais, checkin_status, checkout_status, deposito) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        Conexion conexion = new Conexion();
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
            ps.setDouble(10, deposito);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar Check-In: " + e.getMessage());
        }
    }
}
