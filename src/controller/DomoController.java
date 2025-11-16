
package controller;


import model.DomoModel;

public class DomoController {

    private DomoModel model;

    public DomoController() {
        this.model = new DomoModel();
    }

    
    public void crearCheckin(String nombre, String apellido, String dni, String genero,
                               String direccion, String provincia, String pais,
                               String checkInStatus, String checkOutStatus, int deposito, int domoAsignado) {

        model.crearCheckin(nombre, apellido, dni, genero, direccion, provincia, pais,
                checkInStatus, checkOutStatus, deposito, domoAsignado);
    }
    
    
    
    public void crearDomo(String disponibilidad, String limpieza, String tipoDeCama, int precio,
                          String amenities, String servicios) {
        model.crearDomo( disponibilidad, limpieza, tipoDeCama, precio, amenities, servicios);
    }
    
   

}
