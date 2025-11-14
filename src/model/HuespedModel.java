package model;

public class HuespedModel {

    private int idHuesped;
    private String nombre;
    private String apellido;
    private String dni;
    private String genero;
    private String direccion;
    private String provincia;
    private String pais;
    private boolean checkinStatus;
    private boolean checkoutStatus;
    private double deposito;
    private int idDomo;
    private int idGuiaTurismo;

    public HuespedModel() {}

    public HuespedModel(int idHuesped, String nombre, String apellido, String dni, String genero,
                    String direccion, String provincia, String pais, boolean checkinStatus,
                    boolean checkoutStatus, double deposito, int idDomo, int idGuiaTurismo) {
        this.idHuesped = idHuesped;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.direccion = direccion;
        this.provincia = provincia;
        this.pais = pais;
        this.checkinStatus = checkinStatus;
        this.checkoutStatus = checkoutStatus;
        this.deposito = deposito;
        this.idDomo = idDomo;
        this.idGuiaTurismo = idGuiaTurismo;
    }

    // Getters y Setters
    public int getIdHuesped() { return idHuesped; }
    public void setIdHuesped(int idHuesped) { this.idHuesped = idHuesped; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public boolean isCheckinStatus() { return checkinStatus; }
    public void setCheckinStatus(boolean checkinStatus) { this.checkinStatus = checkinStatus; }

    public boolean isCheckoutStatus() { return checkoutStatus; }
    public void setCheckoutStatus(boolean checkoutStatus) { this.checkoutStatus = checkoutStatus; }

    public double getDeposito() { return deposito; }
    public void setDeposito(double deposito) { this.deposito = deposito; }

    public int getIdDomo() { return idDomo; }
    public void setIdDomo(int idDomo) { this.idDomo = idDomo; }

    public int getIdGuiaTurismo() { return idGuiaTurismo; }
    public void setIdGuiaTurismo(int idGuiaTurismo) { this.idGuiaTurismo = idGuiaTurismo; }
}
