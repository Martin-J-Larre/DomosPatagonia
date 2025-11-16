package model;

public class CheckoutModel {
    private int idHuesped;
    private String nombre;
    private String apellido;
    private int idDomo;
    private String checkoutStatus;

    public CheckoutModel(int idHuesped, String nombre, String apellido, int idDomo, String checkoutStatus) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.idDomo = idDomo;
        this.checkoutStatus = checkoutStatus;
    }

    // Getters
    public int getIdHuesped() { return idHuesped; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getIdDomo() { return idDomo; }
    public String getCheckoutStatus() { return checkoutStatus; }
}
