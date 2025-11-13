package controller;

import model.EmpleadoInicioModel;
import model.EmpleadoLimpiezaModel;

public class EmpleadoLimpiezaController {

    public boolean guardarEmpleadoCompleto(
        String apellido, String nombre, int dni, int edad, String genero,
        String telefono, String email, String area, String turno,
        int id_empleado_limpieza, String horario_de_jornada, int horario_entrada, int horario_salida, String dias_de_jornda, int salario
    ) {
        // 1ro se guarda los datos de empleado
        EmpleadoInicioModel empleado = new model.EmpleadoInicioModel(apellido, nombre, dni, edad, genero, telefono, email, area, turno);
        int empleadoId = empleado.createEmpleado();

        // sI NO SE CREA emplado no retorna el id entonces es falso y fail
        if (empleadoId == -1) return false;

        // 2do se guardan los datos del empleado de limpieza (En el caso que sea de limpieza el emplado)
        // se cargan las dos tablas desde el boton en el panel 2
        EmpleadoLimpiezaModel empleadoLimpieza = new EmpleadoLimpiezaModel(id_empleado_limpieza, horario_de_jornada, horario_entrada, horario_salida, dias_de_jornda, salario);
        return empleadoLimpieza.crearEmpleadoLimpieza();
    }
}
