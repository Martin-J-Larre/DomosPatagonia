package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VentanaInicioView extends JFrame {
    public JButton ingresarBtn;

    public VentanaInicioView() {
        setTitle("Domos Patagonia");
        setSize(1020, 584);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set Image
        ImageIcon imageInicio = new ImageIcon(ClassLoader.getSystemResource("img/inicio-img.png"));
        JLabel image = new JLabel(imageInicio);
        image.setBounds(0, 0, 1020, 584);
        add(image);

        // Set Btn inicio
        ingresarBtn = new JButton("Ingresar");
        ingresarBtn.setBounds(435, 450, 150, 50);
 

        Font btnFont = new Font("Arial", Font.BOLD, 16);
        ingresarBtn.setFont(btnFont);
        image.add(ingresarBtn);
        
        
        
        setVisible(true);
    }

    public void addIngresarListener(ActionListener listener) {
        ingresarBtn.addActionListener(listener);
    }
}

