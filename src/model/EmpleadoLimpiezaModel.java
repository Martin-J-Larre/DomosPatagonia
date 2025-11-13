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
    
    // Todo: Metodo para guia, refactorizar este archivo para que sea solo empleados y poner todos los metodos aquí
    
    public static void crearEmpleadoGuia(String apellido, String nombre, int dni, int edad, String genero,
                                       String telefono, String email, String area, String turno,
                                       int id_guia_turismo, String especialidad, String temporada,
                                       String camioneta, int domo_asignado) throws SQLException {
    String queryEmpleado = "INSERT INTO empleados (apellido, nombre, dni, edad, genero, telefono, email, area, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String queryGuia = "INSERT INTO guia_turismo (id_guia_turismo, especialidad, temporada, camioneta, domo_asignado) VALUES (?, ?, ?, ?, ?)";

    Conexion conexion = new Conexion();
    try (Connection conn = conexion.conectar();
         PreparedStatement ps1 = conn.prepareStatement(queryEmpleado);
         PreparedStatement ps2 = conn.prepareStatement(queryGuia)) {

        conn.setAutoCommit(false);

        // Guardar datos generales
        ps1.setString(1, apellido);
        ps1.setString(2, nombre);
        ps1.setInt(3, dni);
        ps1.setInt(4, edad);
        ps1.setString(5, genero);
        ps1.setString(6, telefono);
        ps1.setString(7, email);
        ps1.setString(8, area);
        ps1.setString(9, turno);
        ps1.executeUpdate();

        // Guardar datos específicos del guía
        ps2.setInt(1, id_guia_turismo);
        ps2.setString(2, especialidad);
        ps2.setString(3, temporada);
        ps2.setString(4, camioneta);
        ps2.setInt(5, domo_asignado);
        ps2.executeUpdate();

        conn.commit();
    }
}

    
    
}
