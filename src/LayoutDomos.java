
import javax.swing.JFrame;


/**
 *
 * @author martin
 * 
 * Test para el Layout de la App
 * 
 */
public class LayoutDomos {
    JFrame domosAppFrame;
    
    void crearLayout(){
        domosAppFrame = new JFrame();
        domosAppFrame.setTitle("Domos Patagonia");
        domosAppFrame.setSize(1020, 584);
        domosAppFrame.setLocationRelativeTo(null);
        domosAppFrame.setDefaultCloseOperation(domosAppFrame.EXIT_ON_CLOSE);
        domosAppFrame.setVisible(true);
    }
    
    public LayoutDomos() {
        crearLayout();
    }
   
}
