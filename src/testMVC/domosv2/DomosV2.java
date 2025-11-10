
package domosv2;

import controlador.Iniciar_Sesion_controller;
import modelo.Iniciar_Sesion_DAO;
import vista.Iniciar_Sesion_view;

public class DomosV2 {

    
    public static void main(String[] args) {
        Iniciar_Sesion_view vista = new Iniciar_Sesion_view();
        Iniciar_Sesion_DAO dao = new Iniciar_Sesion_DAO();
        new Iniciar_Sesion_controller(vista, dao);
    }
    
}
