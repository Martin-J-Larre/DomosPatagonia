
package domospatagonia;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author martin
 */
public class Dashboard extends JFrame implements ActionListener{

    JButton salirBtn;
    
    public Dashboard() {
        setBounds(200, 200, 1020, 584);
        setLayout(null);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
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
        
        JMenuItem empleadoLimpieza = new JMenuItem("Agregar Empleado limpieza");
        empleadoLimpieza.addActionListener(this);
        menuAdmin.add(empleadoLimpieza);
        
        JMenuItem guiaTirismo = new JMenuItem("Agregar Guia Turismo");
        guiaTirismo.addActionListener(this);
        menuAdmin.add(guiaTirismo);
        
        JMenuItem usuarioAdmin = new JMenuItem("Agregar Usuario Administrador");
        usuarioAdmin.addActionListener(this);
        menuAdmin.add(usuarioAdmin);
        
        JMenuItem domos = new JMenuItem("Agregar Domos");
        domos.addActionListener(this);
        menuAdmin.add(domos);
        
        
        //Recepción
        JMenuBar menuBarRecepcion = new JMenuBar();
        menuBarRecepcion.setBounds(100, 270, 150,30);
        add(menuBarRecepcion);
        
        JMenu menuRecepcion = new JMenu("Admin Domos");
        menuBarRecepcion.add(menuRecepcion);
        
                
        JMenuItem recepcion = new JMenuItem("Recepción");
        recepcion.addActionListener(this);
        menuRecepcion.add(recepcion);
                   
        add(textBienvenida); 
        
        
        
        // Salir
        salirBtn = new JButton("Salir");
        salirBtn.setFont(fontPrincipal);
        salirBtn.setBounds(100, 340, 150, 30);
        salirBtn.setBackground(Color.decode("#2c4536"));
        salirBtn.setBorderPainted(false);
        salirBtn.setOpaque(true);
        salirBtn.setForeground(Color.WHITE);
        salirBtn.addActionListener(this);
        add(salirBtn);
        
        // Imagen por ahora
        ImageIcon image1  = new ImageIcon(ClassLoader.getSystemResource("img/interior-test-1.png"));
        Image image2 = image1.getImage().getScaledInstance(650, 470,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel lImage = new JLabel(image3);
        lImage.setBounds(350,100,650,430);
        add(lImage);

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
        } else if (ae.getActionCommand().equals("Agregar Empleado limpieza")){
            
            new EmpleadoLimpieza();
        } else if (ae.getActionCommand().equals("Agregar Usuario Administrador")){
            
            new UsuarioAdministrador();
        } else if (ae.getActionCommand().equals("Salir")){
            setVisible(false);
            new DomosPatagonia();
        }
}
    
    
    public static void main(String[] args) {
        new Dashboard();
    }
}
