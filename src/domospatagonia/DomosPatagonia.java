
package domospatagonia;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author martin
 */
public class DomosPatagonia extends JFrame{

// Frame Inicio App DomosPatagonia
    // Constructor
    DomosPatagonia(){
        // Set Frame
        setSize(1020, 584);
        setLocation(200, 200);
        setLayout(null);
        
        // Set Image
        ImageIcon imageInicio = new ImageIcon(ClassLoader.getSystemResource("img/inicio-img.png"));
        JLabel image = new JLabel(imageInicio);
        image.setBounds(0, 0, 1020, 584);
        add(image);
        
        // Set Btn inicio
        JButton inicioBtn = new JButton("Inicio");
        inicioBtn.setBounds(435, 450, 150, 50);
        
        //@ Cambio de color btn no funciona en Mac investigar como hacerlo
        
        // inicioBtn.setBackground(Color.YELLOW);
        // inicioBtn.setOpaque(true);
        // inicioBtn.setBorderPainted(false);
        // inicioBtn.setForeground(Color.YELLOW);
 

        Font btnFont = new Font("Arial", Font.BOLD, 16);
        inicioBtn.setFont(btnFont);
        image.add(inicioBtn);
        
        
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new DomosPatagonia();
    }
    
}
