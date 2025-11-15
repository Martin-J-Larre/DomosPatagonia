/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class EmpleadoGuiaTurismoModel {
    private String especialidad;
    private String temporada;
    private String camioneta;
    private String domo_asignado;
    private int IDempleado;
    
    // Constructor
    public EmpleadoGuiaTurismoModel( String especialidad, String temporada,String camioneta, String domo_asignado, int IDempleado){
        this.especialidad = especialidad;
        this.temporada = temporada;
        this.camioneta = camioneta;
        this.domo_asignado = domo_asignado;
        this.IDempleado = IDempleado;   
    }
    
    public boolean crearEmpleadoGuia() {
        Conexion conexion = new Conexion();
        
        String queryGuia = "INSERT INTO guia_turismo (especialidad, temporada, camioneta, domo_asignado, id_empleado) VALUES (?, ?, ?, ?, ?)";

    
        try (Connection conn = conexion.conectar();
            PreparedStatement ps = conn.prepareStatement(queryGuia)) {

            ps.setString(1, especialidad);
            ps.setString(2, temporada);
            ps.setString(3, camioneta);
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
