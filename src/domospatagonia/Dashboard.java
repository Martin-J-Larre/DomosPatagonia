
package domospatagonia;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author martin
 */
public class Dashboard extends JFrame {

    public Dashboard() {
        setBounds(200, 200, 1020, 584);
        setLayout(null);
        
//        // Crear Layout
//        GridLayout gridLayout = new GridLayout(1, 1);
//        setLayout(gridLayout);
//        
//        JPanel panel = new JPanel(null);
//        panel.setBackground(new Color(10, 20, 30));
//        panel.setBounds(0, 0, 500, 100);
//        
        
        // Logo
        ImageIcon logoImg = new ImageIcon(ClassLoader.getSystemResource("img/logo.png"));
        JLabel logo = new JLabel(logoImg);
        logo.setBounds(0, 0, 280, 149);
        add(logo);
  
        
        // Frase bienvenido usuario
        JLabel textBienvenida = new JLabel("Bienvenido Usuario Fulano");
        textBienvenida.setBounds(400, 50, 400, 50);
        textBienvenida.setFont(new Font("Arial", Font.BOLD, 26));
        
        // Menu recepcion/admin
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(400, 200, 400,30);
        add(menuBar);
        
        JMenu menuComplejoDomo = new JMenu("Complejo Domo");
        menuBar.add(menuComplejoDomo);
        
        JMenuItem recepcion = new JMenuItem("Recepción");
        menuComplejoDomo.add(recepcion);
        
        JMenu menuAdmin = new JMenu("Admin");
        menuBar.add(menuAdmin);
         
        JMenuItem empleado = new JMenuItem("Empleado");
        menuAdmin.add(empleado);
        
        JMenuItem guiaTirismo = new JMenuItem("Guia Turismo");
        menuAdmin.add(guiaTirismo);
        
        JMenuItem domos = new JMenuItem("Domos");
        menuAdmin.add(domos);
                
                
                
        add(textBienvenida);    

    setVisible(true);
    }
    
    public static void main(String[] args) {
        new Dashboard();
    }
}
