package controller;

import model.EmpleadoInicioModel;
import model.EmpleadoAdminModel;

public class EmpleadoAdminController{

    public boolean guardarEmpleadoCompleto(
        String apellido, String nombre, int dni, int edad, String genero,
        String telefono, String email, String area_trabajo, String turno,
       String credencial, String idiomas, String titulo, String domo_asignado
    ) {
        // 1ro se guarda los datos de empleado
        EmpleadoInicioModel empleado = new EmpleadoInicioModel(apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno);
        int empleadoId = empleado.createEmpleado();

        // SI NO SE CREA emplado no retorna el id entonces es falso y fail
        if (empleadoId == -1) return false;

        // 2do se cargan las dos tablas desde el boton en el panel 2
        EmpleadoAdminModel empleadoAdmin = new EmpleadoAdminModel(credencial, idiomas, titulo, domo_asignado, empleadoId);
        return empleadoAdmin.crearEmpleadoAdmin();
    }
}