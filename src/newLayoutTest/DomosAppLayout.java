package newLayoutTest;

import domospatagonia.Huesped;
import domospatagonia.ListarDomos;
import domospatagonia.Recepcion;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author martin
 */
public class DomosAppLayout {
    
    public static void main(String[] args) {
        
        VentanaPrincipal ventanaPrincipal1 = new VentanaPrincipal();
        
        ventanaPrincipal1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal1.setVisible(true);
    }
    
}

class VentanaPrincipal extends JFrame{
    
    public VentanaPrincipal(){
        setTitle("Primer Test");
        setBounds(300, 300, 700, 500);
        
        Panel_uno panel1 = new Panel_uno();
//        Panel_dos panel2 = new Panel_dos();
//        
//        add(panel1, BorderLayout.EAST);
//        add(panel2, BorderLayout.WEST);
        
        
    }
    

}



class Panel_uno extends JPanel implements ActionListener{
    
    JButton btn1;
    JButton btn2;
    public Panel_uno(){
        setLayout(null);
        setBounds(300, 300, 700, 500);
        setBackground(Color.red);
        
        btn1 = new JButton("Boton 1");
        btn2 = new JButton("Boton 2");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        add(btn1);
        add(btn2);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  
    }
    
    
    
}

class Panel_dos extends JPanel {
    JButton btn3;
    JButton btn4;
    
    public Panel_dos(){
        setLayout(new FlowLayout());
        
        setBackground(Color.blue);
        
        btn3 = new JButton("Boton 3");
        btn4 = new JButton("Boton 4");
        add(btn3);
        add(btn4);
        
    }
}

class Panel_tres extends JPanel {
    JButton btn5;
    JButton btn6;
    
    public Panel_tres(){
        setLayout(new FlowLayout());
        
        setBackground(Color.GREEN);
        
        btn5 = new JButton("Boton 5");
        btn6 = new JButton("Boton 6"); 
        
        add(btn5);
        add(btn6);
        
    }
}



