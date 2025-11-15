package model;

import model.HuespedModel;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HuespedDAO {

    public List<HuespedModel> listarHuespedes(String filtroNombre, String filtroApellido) {
        Conexion conexion = new Conexion();
        
        List<HuespedModel> lista = new ArrayList<>();

        String query = "SELECT * FROM huesped WHERE 1=1";
        if (filtroNombre != null && !filtroNombre.isEmpty()) {
            query += " AND nombre LIKE ?";
        }
        if (filtroApellido != null && !filtroApellido.isEmpty()) {
            query += " AND apellido LIKE ?";
        }

        try (Connection conn = conexion.conectar();
             PreparedStatement pst = conn.prepareStatement(query)) {

            int index = 1;
            if (filtroNombre != null && !filtroNombre.isEmpty()) {
                pst.setString(index++, "%" + filtroNombre + "%");
            }
            if (filtroApellido != null && !filtroApellido.isEmpty()) {
                pst.setString(index++, "%" + filtroApellido + "%");
            }

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                HuespedModel h = new HuespedModel(
                        rs.getInt("id_huesped"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("genero"),
                        rs.getString("direccion"),
                        rs.getString("provincia"),
                        rs.getString("pais"),
                        rs.getBoolean("checkin_status"),
                        rs.getBoolean("checkout_status"),
                        rs.getDouble("deposito"),
                        rs.getInt("id_domo"),
                        rs.getInt("id_guia_turismo")
                );
                lista.add(h);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
