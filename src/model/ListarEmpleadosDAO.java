package model;

import model.ListarEmpleadosModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ListarEmpleadosDAO {
    Conexion conexion = new Conexion();

    public List<ListarEmpleadosModel> listar(String filtro) {

        List<ListarEmpleadosModel> lista = new ArrayList<>();

        String sql =
                "SELECT id_empleado, apellido, nombre, dni, edad, genero, telefono, area_trabajo, turno, email " +
                "FROM empleado " +
                "WHERE apellido LIKE ? OR nombre LIKE ?";

        try (Connection conn = conexion.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, "%" + filtro + "%");
            ps.setString(2, "%" + filtro + "%");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ListarEmpleadosModel e = new ListarEmpleadosModel();
                e.setIdEmpleado(rs.getInt("id_empleado"));
                e.setApellido(rs.getString("apellido"));
                e.setNombre(rs.getString("nombre"));
                e.setDni(rs.getString("dni"));
                e.setEdad(rs.getInt("edad"));
                e.setGenero(rs.getString("genero"));
                e.setTelefono(rs.getString("telefono"));
                e.setArea(rs.getString("area_trabajo"));
                e.setTurno(rs.getString("turno"));
                e.setEmail(rs.getString("email"));

                lista.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
