/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.InicioSesionView;
import model.InicioSesionModel;

import javax.swing.*;

public class InicioSesionController {
    private InicioSesionView vista;

    public InicioSesionController() {
        vista = new InicioSesionView();

        vista.getInicioSesionBtn().addActionListener(e -> {
            String user = vista.getUsuario();
            String pass = vista.getContrasenia();

            InicioSesionModel usuario = new InicioSesionModel(user, pass);

            if (usuario.validar()) {
                vista.dispose();
                new DashboardController(usuario.getUsuario());
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
            }
        });

        vista.setVisible(true);
    }
}