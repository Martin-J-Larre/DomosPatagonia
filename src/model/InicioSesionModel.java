package model;

public class InicioSesionModel {
    private String usuario;
    private String contrasenia;

    public InicioSesionModel(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public boolean validar() {
        // Fake respuesta Api
        return usuario.equals("admin") && contrasenia.equals("1234");
    }

    public String getUsuario() {
        return usuario;
    }
}

