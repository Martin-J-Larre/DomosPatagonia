
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
    
        public void crearDomo(int id_domo, String disponibilidad, String limpieza, int precio,
                          String amenities, String servicios) {
        model.crearDomo(id_domo, disponibilidad, limpieza, precio, amenities, servicios);
    }
}
