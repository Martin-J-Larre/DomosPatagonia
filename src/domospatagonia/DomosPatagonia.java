
package domospatagonia;

import javax.swing.SwingUtilities;
import controller.VentanaInicioController;

public class DomosPatagonia {
    
    public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> {
            new VentanaInicioController();
        });
    }
    
}
