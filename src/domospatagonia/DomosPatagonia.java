
package domospatagonia;

import view.VentanaInicioView;
import view.InicioSesionView;
import model.InicioSesionDAO;
import controller.InicioSesionController;

public class DomosPatagonia {
    public static void main(String[] args) {
        VentanaInicioView bienvenida = new VentanaInicioView();
        bienvenida.setVisible(true);

        bienvenida.addIngresarListener(e -> {
            bienvenida.dispose();
            InicioSesionView inicioSesion = new InicioSesionView();
            InicioSesionDAO dao = new InicioSesionDAO();
            InicioSesionController controlador = new InicioSesionController(inicioSesion, dao);
            controlador.iniciar();
        });
    }
}