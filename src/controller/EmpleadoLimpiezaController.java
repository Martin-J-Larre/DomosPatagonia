package controller;

import model.EmpleadoInicioModel;
import model.EmpleadoModel;

public class EmpleadoLimpiezaController {

    public boolean guardarEmpleadoCompleto(
        String apellido, String nombre, int dni, int edad, String genero,
        String telefono, String email, String area_trabajo, String turno,
       String horario_de_jornada, int horario_entrada, int horario_salida, String dias_de_jornda, int salario
    ) {
        // 1ro se guarda los datos de empleado
        EmpleadoInicioModel empleado = new model.EmpleadoInicioModel(apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno);
        int empleadoId = empleado.createEmpleado();

        // sI NO SE CREA emplado no retorna el id entonces es falso y fail
        if (empleadoId == -1) return false;

        // 2do se guardan los datos del empleado de limpieza (En el caso que sea de limpieza el emplado)
        // se cargan las dos tablas desde el boton en el panel 2
        EmpleadoModel empleadoLimpieza = new EmpleadoModel( horario_de_jornada, horario_entrada, horario_salida, dias_de_jornda, salario, empleadoId);
        return empleadoLimpieza.crearEmpleadoLimpieza();
    }
}
