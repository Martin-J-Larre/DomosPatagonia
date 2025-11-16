package model;

public class ListarEmpleadoAdminModel {

    private int idUsuarioAdmin;
    private String credencial;
    private String idiomas;
    private String titulo;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    
    
    // Constructores
    public ListarEmpleadoAdminModel(){}
    
    public ListarEmpleadoAdminModel(int idUsuarioAdmin, String credencial, String idiomas, String titulo, String nombreEmpleado, String apellidoEmpleado){
    this.idUsuarioAdmin =  idUsuarioAdmin;
    this.credencial = credencial;
    this.idiomas = idiomas;
    this.titulo = titulo;
    this.nombreEmpleado = nombreEmpleado;
    this.apellidoEmpleado = apellidoEmpleado;
    }

    // Getters y setters
    public int getIdUsuarioAdmin() { return idUsuarioAdmin; }
    public void setIdUsuarioAdmin(int idUsuarioAdmin) { this.idUsuarioAdmin = idUsuarioAdmin; }

    public String getCredencial() { return credencial; }
    public void setCredencial(String credencial) { this.credencial = credencial; }

    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getNombreEmpleado() { return nombreEmpleado; }
    public void setNombreEmpleado(String nombreEmpleado) { this.nombreEmpleado = nombreEmpleado; }

    public String getApellidoEmpleado() { return apellidoEmpleado; }
    public void setApellidoEmpleado(String apellidoEmpleado) { this.apellidoEmpleado = apellidoEmpleado; }
}
