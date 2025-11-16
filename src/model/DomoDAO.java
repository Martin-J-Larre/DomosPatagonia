
package model;

import model.BuscarDomosModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Arrglar los filtros solo anda con todos

public class DomoDAO {
    Conexion conexion = new Conexion();
    
    public List<BuscarDomosModel> obtenerDomos(String tipoCama, boolean soloDisponibles) {
        List<BuscarDomosModel> lista = new ArrayList<>();

        String query = "SELECT * FROM domo WHERE 1=1";

        if (tipoCama != null && !tipoCama.equals("Todos")) {
            query += " AND tipo_de_cama = ?";
        }

        if (soloDisponibles) {
            query += " AND disponibilidad = 'Disponible'";
        }

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(query)) {

            int index = 1;
            if (tipoCama != null && !tipoCama.equals("Todos")) {
                ps.setString(index++, tipoCama);
            }

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BuscarDomosModel d = new BuscarDomosModel(
                        rs.getInt("id_domo"),
                        rs.getString("disponibilidad"),
                        rs.getString("limpieza_status"),
                        rs.getDouble("precio"),
                        rs.getString("tipo_de_cama"),
                        rs.getString("amenities"),
                        rs.getString("servicios")
                );
                lista.add(d);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
