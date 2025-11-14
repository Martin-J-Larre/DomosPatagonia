
package controller;

/**
 *
 * @author martin
 */

import model.EmpleadoModel;

public class EmpleadoController {
    
    public void agregarEmpleadoGuia(String apellido, String nombre, int dni, int edad, String genero,
                                String telefono, String email, String area, String turno,
                                int id_guia_turismo, String especialidad, String temporada,
                                String camioneta, int domoAsignado) {
        try {
            EmpleadoModel.crearEmpleadoGuia(apellido, nombre, dni, edad, genero, telefono,
                email, area, turno, id_guia_turismo, especialidad, temporada, camioneta, domoAsignado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void agregarEmpleadoAdmin(String apellido, String nombre, int dni, int edad, String genero,
                                 String telefono, String email, String area, String turno,
                                 int id_usuario_administrador, String credenciales, String idiomas,
                                 String titulo, int domo_asignado, int huespedAsignado) {
    try {
        EmpleadoModel.crearEmpleadoAdmin(apellido, nombre, dni, edad, genero, telefono, email,
                area, turno, id_usuario_administrador, credenciales, idiomas, titulo, domo_asignado, huespedAsignado);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    

}
