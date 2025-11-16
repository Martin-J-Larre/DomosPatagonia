package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GuiaTurismoDAO {
    Conexion conexion = new Conexion();

    public List<GuiaTurismoModel> listarGuias(String especialidad, String temporada) {
        List<GuiaTurismoModel> lista = new ArrayList<>();

        String sqlQuery = "SELECT g.id_guia_turismo, g.especialidad, g.temporada, g.camioneta, g.domo_asignado, " +
                     "e.nombre AS nombre_empleado, e.apellido AS apellido_empleado, e.dni AS dni_empleado " +
                     "FROM guia_turismo g " +
                     "INNER JOIN empleado e ON g.id_empleado = e.id_empleado " +
                     "WHERE 1=1";
        
        
        if (especialidad != null && !especialidad.equals("Todas")) {
            sqlQuery += " AND g.especialidad = ?";
        }
        if (temporada != null && !temporada.equals("Todas")) {
            sqlQuery += " AND g.temporada = ?";
        }

        try (Connection conn = conexion.conectar(); 
             PreparedStatement ps = conn.prepareStatement(sqlQuery)) {

            int index = 1;
            if (especialidad != null && !especialidad.equals("Todas")) {
                ps.setString(index++, especialidad);
            }
            if (temporada != null && !temporada.equals("Todas")) {
                ps.setString(index++, temporada);
            }

            ResultSet rs = ps.executeQuery();
            
            
            
            while (rs.next()) {
                GuiaTurismoModel g = new GuiaTurismoModel();
                g.setIdGuia(rs.getInt("id_guia_turismo"));
                g.setNombre(rs.getString("nombre_empleado")); // nombre desde tabla empleado
                g.setApellido(rs.getString("apellido_empleado")); // apellido desde tabla empleado
                g.setDni(rs.getInt("dni_empleado")); // dni desde tabla empleado
                g.setEspecialidad(rs.getString("especialidad"));
                g.setTemporada(rs.getString("temporada"));
                g.setCamioneta(rs.getString("camioneta"));
                g.setDomoAsignado(rs.getString("domo_asignado"));
                
                lista.add(g);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
//        for (GuiaTurismoModel item : lista) {
//            System.out.println("Item: " + item);
//        }
        
        return lista;
    }
}
