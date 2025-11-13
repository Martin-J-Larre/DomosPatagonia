
package controller;

import model.DomoModel;

public class DomoController {

    private DomoModel model;

    public DomoController() {
        this.model = new DomoModel();
    }

    
    public void crearCheckin(String nombre, String apellido, String dni, String genero,
                               String direccion, String provincia, String pais,
                               boolean checkInStatus, boolean checkOutStatus, double deposito) {

        model.crearCheckin(nombre, apellido, dni, genero, direccion, provincia, pais,
                checkInStatus, checkOutStatus, deposito);
    }
}
