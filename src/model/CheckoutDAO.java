package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CheckoutDAO {
    private Conexion conexion = new Conexion();

    public List<CheckoutModel> buscarHuespedPorNombre(String nombre) {
        List<CheckoutModel> lista = new ArrayList<>();
        String sql = "SELECT id_huesped, nombre, apellido, id_domo, checkout_status FROM huesped WHERE nombre LIKE ?";
        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new CheckoutModel(
                    rs.getInt("id_huesped"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getInt("id_domo"),
                    rs.getString("checkout_status")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void actualizarCheckout(int idHuesped) {
        String sql = "UPDATE huesped SET checkout_status = 'Realizado', fecha_checkout = CURDATE() WHERE id_huesped = ?";
        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idHuesped);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
