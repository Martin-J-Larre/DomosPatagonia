/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.*;

/**
 *
 * @author martin
 */
public class Conexion {
    
    Connection con;
    Statement stat;
    
    public Connection getConexion(){
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/domosPatagonia", "root", "");
            stat = con.createStatement();
            System.out.println("Conectado a la base de datos");
            
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return con;
    }
    
}
