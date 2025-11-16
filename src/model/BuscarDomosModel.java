package model;

public class BuscarDomosModel{

    private int idDomo;
    private String disponibilidad;
    private String limpiezaStatus;
    private double precio;
    private String tipoDeCama;
    private String amenities;
    private String servicios;

    public BuscarDomosModel() {}

    public BuscarDomosModel(int idDomo, String disponibilidad, String limpiezaStatus, double precio,
                String tipoDeCama, String amenities, String servicios) {
        this.idDomo = idDomo;
        this.disponibilidad = disponibilidad;
        this.limpiezaStatus = limpiezaStatus;
        this.precio = precio;
        this.tipoDeCama = tipoDeCama;
        this.amenities = amenities;
        this.servicios = servicios;
    }

    // Getters y Setters con el autocompletado
    public int getIdDomo() { return idDomo; }
    public void setIdDomo(int idDomo) { this.idDomo = idDomo; }

    public String getDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(String disponibilidad) { this.disponibilidad = disponibilidad; }

    public String getLimpiezaStatus() { return limpiezaStatus; }
    public void setLimpiezaStatus(String limpiezaStatus) { this.limpiezaStatus = limpiezaStatus; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public String getTipoDeCama() { return tipoDeCama; }
    public void setTipoDeCama(String tipoDeCama) { this.tipoDeCama = tipoDeCama; }

    public String getAmenities() { return amenities; }
    public void setAmenities(String amenities) { this.amenities = amenities; }

    public String getServicios() { return servicios; }
    public void setServicios(String servicios) { this.servicios = servicios; }

}
