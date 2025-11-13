/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author martin
 */

import model.EmpleadoLimpiezaModel;

public class EmpleadoController {
    
    public void agregarEmpleadoGuia(String apellido, String nombre, int dni, int edad, String genero,
                                String telefono, String email, String area, String turno,
                                int id_guia_turismo, String especialidad, String temporada,
                                String camioneta, int domoAsignado) {
    try {
        EmpleadoLimpiezaModel.crearEmpleadoGuia(apellido, nombre, dni, edad, genero, telefono,
                email, area, turno, id_guia_turismo, especialidad, temporada, camioneta, domoAsignado);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

}
