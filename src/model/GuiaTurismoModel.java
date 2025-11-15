package model;

public class GuiaTurismoModel {

    private int idGuia;
    private String nombre;
    private String apellido;
    private int dni;
    private String especialidad;
    private String temporada;
    private String camioneta;
    private int domoAsignado;

    public GuiaTurismoModel() {}

    public GuiaTurismoModel(int idGuia, String nombre, String apellido, int dni, String especialidad, String temporada, String camioneta, int domoAsignado) {
        this.idGuia = idGuia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.especialidad = especialidad;
        this.temporada = temporada;
        this.camioneta = camioneta;
        this.domoAsignado = domoAsignado;
    }

    // Getters y Setters
    public int getIdGuia() { return idGuia; }
    public void setIdGuia(int idGuia) { this.idGuia = idGuia; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDni() { return dni; }
    public void setDni(int dni) { this.dni = dni; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getTemporada() { return temporada; }
    public void setTemporada(String temporada) { this.temporada = temporada; }

    public String getCamioneta() { return camioneta; }
    public void setCamioneta(String camioneta) { this.camioneta = camioneta; }

    public int getDomoAsignado() { return domoAsignado; }
    
    public void setDomoAsignado(int domoAsignado) { this.domoAsignado = domoAsignado; }
}