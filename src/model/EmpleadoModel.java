package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpleadoModel {
    private String horas_de_jornada_semana;
    private int horario_entrada;
    private int horario_salida;
    private String dias_de_jornada;
    private int salario;
    private int IDempleado;

    // Constructor
    public EmpleadoModel(String horas_de_jornada_semana, int horario_entrada, int horario_salida, String dias_de_jornada, int salario, int IDempleado) {
        this.horas_de_jornada_semana = horas_de_jornada_semana;
        this.horario_entrada = horario_entrada;
        this.horario_salida = horario_salida;
        this.dias_de_jornada = dias_de_jornada;
        this.salario = salario;
        this.IDempleado = IDempleado;
    }


    public boolean crearEmpleadoLimpieza() {
        Conexion conexion = new Conexion();
        
        String query = "INSERT INTO empleado_limpieza (horas_de_jornada_semana, horario_entrada, horario_salida, dias_de_jornada, salario, id_empleado) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, horas_de_jornada_semana);
            ps.setInt(2, horario_entrada);
            ps.setInt(3, horario_salida);
            ps.setString(4, dias_de_jornada);
            ps.setInt(5, salario);
            ps.setInt(6, IDempleado);

            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al guardar el empleado de Limpieza: " + e.getMessage());
            return false;
        }
        
        
        
    }
    
//    
//    
//    public static void crearEmpleadoGuia(String apellido, String nombre, int dni, int edad, String genero,
//                                       String telefono, String email, String area_trabajo, String turno,
//                                       String especialidad, String temporada,
//                                       String camioneta, int domo_asignado) throws SQLException {
//        String queryEmpleado = "INSERT INTO empleado (apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        String queryGuia = "INSERT INTO guia_turismo (especialidad, temporada, camioneta, domo_asignado) VALUES (?, ?, ?, ?)";
//
//        Conexion conexion = new Conexion();
//        try (Connection conn = conexion.conectar();
//            PreparedStatement ps1 = conn.prepareStatement(queryEmpleado);
//            PreparedStatement ps2 = conn.prepareStatement(queryGuia)) {
//
//            conn.setAutoCommit(false);
//
//            // Guardar datos tabla empleado
//            ps1.setString(1, apellido);
//            ps1.setString(2, nombre);
//            ps1.setInt(3, dni);
//            ps1.setInt(4, edad);
//            ps1.setString(5, genero);
//            ps1.setString(6, telefono);
//            ps1.setString(7, email);
//            ps1.setString(8, area_trabajo);
//            ps1.setString(9, turno);
//            ps1.executeUpdate();
//
//             // Guardar datos tabla del guía
//            ps2.setString(1, especialidad);
//            ps2.setString(2, temporada);
//            ps2.setString(3, camioneta);
//            ps2.setInt(4, domo_asignado);
//            
//            ps2.executeUpdate();
//
//            conn.commit();
//        }
//    }

    
//    public static void crearEmpleadoAdmin(String apellido, String nombre, int dni, int edad, String genero,
//                                        String telefono, String email, String area_trabajo, String turno, String credencial, String idiomas,
//                                        String titulo, String domo_asignado) throws SQLException {
//        String queryEmpleado = "INSERT INTO empleado (apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        String queryAdmin = "INSERT INTO usuario_administrador (credencial, idiomas, titulo, domo_asignado) VALUES (?, ?, ?, ?)";
//        
//        Conexion conexion = new Conexion();
//        try (Connection conn = conexion.conectar();
//            PreparedStatement ps1 = conn.prepareStatement(queryEmpleado);
//            PreparedStatement ps2 = conn.prepareStatement(queryAdmin)) {
//
//            conn.setAutoCommit(false);
//
//            // Guardar datos tabla del empleado
//            ps1.setString(1, apellido);
//            ps1.setString(2, nombre);
//            ps1.setInt(3, dni);
//            ps1.setInt(4, edad);
//            ps1.setString(5, genero);
//            ps1.setString(6, telefono);
//            ps1.setString(7, email);
//            ps1.setString(8, area_trabajo);
//            ps1.setString(9, turno);
//            ps1.executeUpdate();
//
//            // Guardar datos tablas del admin
//            ps2.setString(1, credencial);
//            ps2.setString(2, idiomas);
//            ps2.setString(3, titulo);
//            ps2.setString(4, domo_asignado);
//            ps2.executeUpdate();
//
//            conn.commit();
//        }
//    }

}
