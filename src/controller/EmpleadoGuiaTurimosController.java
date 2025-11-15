
package controller;

import model.EmpleadoInicioModel;
import model.EmpleadoGuiaTurismoModel;

public class EmpleadoGuiaTurimosController {
     public boolean guardarEmpleadoCompleto(
        String apellido, String nombre, int dni, int edad, String genero,
        String telefono, String email, String area_trabajo, String turno,
        String especialidad, String temporada, String camioneta, String domo_asignado
    ) {
        // 1ro se guarda los datos de empleado
        EmpleadoInicioModel empleado = new model.EmpleadoInicioModel(apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno);
        int empleadoId = empleado.createEmpleado();

        // SI NO SE CREA emplado no retorna el id entonces es falso y fail
        if (empleadoId == -1) return false;

        // 2do se guardan los datos del empleado de limpieza (En el caso que sea de limpieza el emplado)
        // se cargan las dos tablas desde el boton en el panel 2
        EmpleadoGuiaTurismoModel empleadoGuiaTurismo = new EmpleadoGuiaTurismoModel(especialidad, temporada, camioneta, domo_asignado, empleadoId);
        return empleadoGuiaTurismo.crearEmpleadoGuia();
    }
}
