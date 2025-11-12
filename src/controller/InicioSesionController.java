package controller;
import view.InicioSesionView;
import view.DashboardView;
import model.InicioSesionDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioSesionController {
    private InicioSesionView vista;
    private InicioSesionDAO modelo;

    public InicioSesionController(InicioSesionView vista, InicioSesionDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;

        this.vista.addInicioSesionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.usuarioTextField.getText();
                String contrasenia = vista.contraseniaTextField.getText();
                if (modelo.validarUsuario(usuario, contrasenia)) {
                    vista.dispose();
                    new DashboardController();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });
    }

    public void iniciar() {
        vista.setVisible(true);
    }
}
