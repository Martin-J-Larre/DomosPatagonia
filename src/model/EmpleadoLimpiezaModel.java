package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoLimpiezaModel {
    private int id_empleado_limpieza;
    private String horario_de_jornada;
    private int horario_entrada;
    private int horario_salida;
    private String dias_de_jornda;
    private int salario;

    // Constructor
    public EmpleadoLimpiezaModel(int id_empleado_limpieza, String horario_de_jornada, int horario_entrada, int horario_salida, String dias_de_jornda, int salario) {
        this.id_empleado_limpieza = id_empleado_limpieza;
        this.horario_de_jornada = horario_de_jornada;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
        this.dias_de_jornda = dias_de_jornda;
        this.salario = salario;
    }

    // Método para insertar en la BBDD
    public boolean crearEmpleadoLimpieza() {
        Conexion conexion = new Conexion();
        
        String query = "INSERT INTO empleado_limpieza (id_empleado_limpieza, horario_de_jornada, horario_entrada, horario_salida, dias_de_jornda, salario) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setInt(1, id_empleado_limpieza);
            ps.setString(2, horario_de_jornada);
            ps.setInt(3, horario_entrada);
            ps.setInt(4, horario_salida);
            ps.setString(5, dias_de_jornda);
            ps.setInt(6, salario);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar el empleado de Limpieza: " + e.getMessage());
            return false;
        }
    }
}
