package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoAdminDAO {

    public List<ListarEmpleadoAdminModel> listarEmpleadoAdmin(String filtroNombre, String filtroApellido, String filtroIdiomas) {
        Conexion conexion = new Conexion();
        
        List<ListarEmpleadoAdminModel> lista = new ArrayList<>();

        String query =
                "SELECT ua.id_usuario_administrador, ua.credencial, ua.idiomas, ua.titulo, " +
                "       e.nombre, e.apellido " +
                "FROM usuario_administrador ua " +
                "JOIN empleado e ON ua.id_empleado = e.id_empleado " +
                "WHERE 1=1";

        // FILTROS
        if (filtroNombre != null && !filtroNombre.isEmpty()) {
            query += " AND e.nombre LIKE ?";
        }
        if (filtroApellido != null && !filtroApellido.isEmpty()) {
            query += " AND e.apellido LIKE ?";
        }
        if (filtroIdiomas != null && !filtroIdiomas.isEmpty()) {
            query += " AND ua.idiomas LIKE ?";
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
            if (filtroIdiomas != null && !filtroIdiomas.isEmpty()) {
                pst.setString(index++, "%" + filtroIdiomas + "%");
            }

            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                ListarEmpleadoAdminModel leam = new ListarEmpleadoAdminModel(
                    rs.getInt("id_usuario_administrador"),
                    rs.getString("credencial"),
                    rs.getString("idiomas"),
                    rs.getString("titulo"),
                    rs.getString("nombre"),
                    rs.getString("apellido")
                );
                lista.add(leam);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
