
package controller;

import view.VentanaInicioView;

public class VentanaInicioController {
    private VentanaInicioView vista;

    public VentanaInicioController() {
        vista = new VentanaInicioView();
        vista.getIngresarBtn().addActionListener(e -> {
            vista.dispose();
        });
        vista.setVisible(true);
    }
}
