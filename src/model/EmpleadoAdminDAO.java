package model;

import model.ListarEmpleadoAdminModel;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoAdminDAO {
    Conexion conexion = new Conexion();

    public List<ListarEmpleadoAdminModel> listar(String filtroTitulo, String filtroIdioma) {

        List<ListarEmpleadoAdminModel> lista = new ArrayList<>();

        String sql =
                "SELECT ua.id_usuario_administrador, ua.credencial, ua.idiomas, ua.titulo, " +
                "       e.nombre, e.apellido " +
                "FROM usuario_administrador ua " +
                "JOIN empleado e ON ua.id_empleado = e.id_empleado " +
                "WHERE ua.titulo LIKE ? AND ua.idiomas LIKE ?";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + filtroTitulo + "%");
            ps.setString(2, "%" + filtroIdioma + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ListarEmpleadoAdminModel lea = new ListarEmpleadoAdminModel();

                lea.setIdUsuarioAdmin(rs.getInt("id_usuario_administrador"));
                lea.setCredencial(rs.getString("credencial"));
                lea.setIdiomas(rs.getString("idiomas"));
                lea.setTitulo(rs.getString("titulo"));
                lea.setNombreEmpleado(rs.getString("nombre"));
                lea.setApellidoEmpleado(rs.getString("apellido"));

                lista.add(lea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
