
package domospatagonia;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author martin
 */
public class Dashboard extends JFrame implements ActionListener{

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
        // Pensar bien como implementar el menu del dashboard
        // por un lado tiene que estar el menejo de empleados, donde se divide en
        // los tipos de empleados (3 areas/ el empleado administrador/ el de limpieza y Guia de turismo)
        // Por otro lado el del manejo de domos, limpieza y servicios.
        // por otro lado la recepcion de los huespedes con checkin check out y asignacion de guia T.
        // ****** Volver a implementar el Dashboard *****
        
        
        //Menu Admin
        JMenuBar menuBarAdmin = new JMenuBar();
        menuBarAdmin.setBounds(100, 200, 150,30);
        add(menuBarAdmin);
        
        JMenu menuAdmin = new JMenu("Admin");
        menuBarAdmin.add(menuAdmin);
        
        JMenuItem empleado = new JMenuItem("Agregar Empleado");
        empleado.addActionListener(this);
        menuAdmin.add(empleado);
        
        JMenuItem guiaTirismo = new JMenuItem("Agregar Guia Turismo");
        guiaTirismo.addActionListener(this);
        menuAdmin.add(guiaTirismo);
        
        JMenuItem domos = new JMenuItem("Agregar Domos");
        domos.addActionListener(this);
        menuAdmin.add(domos);
        
        
        //Recepción
        JMenuBar menuBarRecepcion = new JMenuBar();
        menuBarRecepcion.setBounds(100, 240, 150,30);
        add(menuBarRecepcion);
        
        JMenu menuRecepcion = new JMenu("Admin Domos");
        menuBarRecepcion.add(menuRecepcion);
        
        JMenuItem manejoDomos = new JMenuItem("Manejo xxx");
        manejoDomos.addActionListener(this);
        menuRecepcion.add(manejoDomos);
                
        JMenuItem recepcion = new JMenuItem("Recepción");
        recepcion.addActionListener(this);
        menuRecepcion.add(recepcion);
                   
        add(textBienvenida);    

    setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Agregar Empleado")) {
            new Empleado();
        } else if(ae.getActionCommand().equals("Agregar Domos")){
            new Domo();
            // Todo lo referido a empleados agregar disparar desde area en form empleado
            // Cambiar menu dashboard
        } else if (ae.getActionCommand().equals("Agregar Guia Turismo")){
            new GuiaTurismo();
        } else if (ae.getActionCommand().equals("Recepción")){
            new Recepcion();
        }
}
    
    
    public static void main(String[] args) {
        new Dashboard();
    }
}
