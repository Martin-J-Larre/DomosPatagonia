
package model;

import java.sql.*;

public class EmpleadoInicioModel {
    private String apellido, nombre, genero, telefono, email, area, turno;
    private int edad, dni;
    
    
    public EmpleadoInicioModel(String apellido, String nombre, int dni, int edad, String genero, String telefono, String email, String area, String turno) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.genero = genero;
        this.telefono = telefono;
        this.email = email;
        this.area = area;
        this.turno = turno;
    }
    
    public int createEmpleado() {
        Conexion conexion = new Conexion();
        String query = "INSERT INTO empleado (apellido, nombre, dni, edad, genero, telefono, email, area, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {

            ps.setString(1, apellido);
            ps.setString(2, nombre);
            ps.setInt(3, dni);
            ps.setInt(4, edad);
            ps.setString(5, genero);
            ps.setString(6, telefono);
            ps.setString(7, email);
            ps.setString(8, area);
            ps.setString(9, turno);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1); // Devuelve el ID generado

        } catch (SQLException e) {
            System.out.println("Error al guardar empleado: " + e.getMessage());
        }
        return -1;
    }
}
