package domospatagonia;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author martin
 */
public class Recepcion extends JFrame implements ActionListener {
    JButton nuevoHuespedBtn, areaBtn, empleadosBtn, huespedesBtn, usuarioAdminBtn, checkoutBtn, actualizaStatusBtn, actualizarStatusDomoBtn, guiaTurismoBtn, domosBtn, salirBtn, buscarDomoBtn; ;

    public Recepcion() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
         // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // Poner titulo
        
        // Check in
        nuevoHuespedBtn = new JButton("Checkin");
        nuevoHuespedBtn.setFont(fontPrincipal);
        nuevoHuespedBtn.setBounds(20, 50, 200, 30);
        nuevoHuespedBtn.setBackground(Color.decode("#2c4536"));
        nuevoHuespedBtn.setBorderPainted(false);
        nuevoHuespedBtn.setOpaque(true);
        nuevoHuespedBtn.setForeground(Color.WHITE);
        nuevoHuespedBtn.addActionListener(this);
        add(nuevoHuespedBtn);
        
        // Buscar Domo
        buscarDomoBtn = new JButton("Buscar Domo");
        buscarDomoBtn.setFont(fontPrincipal);
        buscarDomoBtn.setBounds(20, 90, 200, 30);
        buscarDomoBtn.setBackground(Color.decode("#2c4536"));
        buscarDomoBtn.setBorderPainted(false);
        buscarDomoBtn.setOpaque(true);
        buscarDomoBtn.setForeground(Color.WHITE);
        buscarDomoBtn.addActionListener(this);
        add(buscarDomoBtn);
        
        //ListarDomo
        domosBtn = new JButton("Ver Domos");
        domosBtn.setFont(fontPrincipal);
        domosBtn.setBounds(20, 130, 200, 30);
        domosBtn.setBackground(Color.decode("#2c4536"));
        domosBtn.setBorderPainted(false);
        domosBtn.setOpaque(true);
        domosBtn.setForeground(Color.WHITE);
        domosBtn.addActionListener(this);
        add(domosBtn);
        
        // Ver Huespedes 
        huespedesBtn = new JButton("Ver Huéspedes");
        huespedesBtn.setFont(fontPrincipal);
        huespedesBtn.setBounds(20, 170, 200, 30);
        huespedesBtn.setBackground(Color.decode("#2c4536"));
        huespedesBtn.setBorderPainted(false);
        huespedesBtn.setOpaque(true);
        huespedesBtn.setForeground(Color.WHITE);
        huespedesBtn.addActionListener(this);
        add(huespedesBtn);
        
        // Checkout 
        checkoutBtn = new JButton("Checkout");
        checkoutBtn.setFont(fontPrincipal);
        checkoutBtn.setBounds(20, 210, 200, 30);
        checkoutBtn.setBackground(Color.decode("#2c4536"));
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setOpaque(true);
        checkoutBtn.setForeground(Color.WHITE);
        checkoutBtn.addActionListener(this);
        add(checkoutBtn);
             
        // Empleados btn
        empleadosBtn = new JButton("Ver Empleados");
        empleadosBtn.setFont(fontPrincipal);
        empleadosBtn.setBounds(20, 250, 200, 30);
        empleadosBtn.setBackground(Color.decode("#2c4536"));
        empleadosBtn.setBorderPainted(false);
        empleadosBtn.setOpaque(true);
        empleadosBtn.setForeground(Color.WHITE);
        empleadosBtn.addActionListener(this);
        add(empleadosBtn);
        
        
        // Empleados por Area 
        areaBtn = new JButton("Empleados por Area");
        areaBtn.setFont(fontPrincipal);
        areaBtn.setBounds(20, 290, 200, 30);
        areaBtn.setBackground(Color.decode("#2c4536"));
        areaBtn.setBorderPainted(false);
        areaBtn.setOpaque(true);
        areaBtn.setForeground(Color.WHITE);
        areaBtn.addActionListener(this);
        add(areaBtn);
        setVisible(true);
        
 
      
        // Usuario Admin 
        usuarioAdminBtn = new JButton("Ver Usuarios Admin");
        usuarioAdminBtn.setFont(fontPrincipal);
        usuarioAdminBtn.setBounds(20, 330, 200, 30);
        usuarioAdminBtn.setBackground(Color.decode("#2c4536"));
        usuarioAdminBtn.setBorderPainted(false);
        usuarioAdminBtn.setOpaque(true);
        usuarioAdminBtn.setForeground(Color.WHITE);
        usuarioAdminBtn.addActionListener(this);
        add(usuarioAdminBtn);
        

        // Guia Turismo btn
        guiaTurismoBtn = new JButton("Buscar Guia Turismo");
        guiaTurismoBtn.setFont(fontPrincipal);
        guiaTurismoBtn.setBounds(20, 370, 200, 30);
        guiaTurismoBtn.setBackground(Color.decode("#2c4536"));
        guiaTurismoBtn.setBorderPainted(false);
        guiaTurismoBtn.setOpaque(true);
        guiaTurismoBtn.setForeground(Color.WHITE);
        guiaTurismoBtn.addActionListener(this);
        add(guiaTurismoBtn);
        
        
        
        
        
        
//        // Actualizar estatus  Limpieza Domo y Empleado Limpieza 
//           Pensar en implementarlo en otra Gui
//        actualizaStatusBtn = new JButton("Actualizar estatus");
//        actualizaStatusBtn.setFont(fontPrincipal);
//        actualizaStatusBtn.setBounds(20, 410, 150, 30);
//        actualizaStatusBtn.setBackground(Color.decode("#2c4536"));
//        actualizaStatusBtn.setBorderPainted(false);
//        actualizaStatusBtn.setOpaque(true);
//        actualizaStatusBtn.setForeground(Color.WHITE);
//        // nueactualizaStatusBtn.addActionListener(this);
//        add(actualizaStatusBtn);
        
//        //Actualizar estatus domo disponible o no btn
//        actualizarStatusDomoBtn = new JButton("Actualizar estatus Domo");
//        actualizarStatusDomoBtn.setFont(fontPrincipal);
//        actualizarStatusDomoBtn.setBounds(20, 450, 150, 30);
//        actualizarStatusDomoBtn.setBackground(Color.decode("#2c4536"));
//        actualizarStatusDomoBtn.setBorderPainted(false);
//        actualizarStatusDomoBtn.setOpaque(true);
//        actualizarStatusDomoBtn.setForeground(Color.WHITE);
//        // nueactualizarStatusDomoBtn.addActionListener(this);
//        add(actualizarStatusDomoBtn);
  

        

        

        
        // Salir
        salirBtn = new JButton("Salir");
        salirBtn.setFont(fontPrincipal);
        salirBtn.setBounds(20, 410, 200, 30);
        salirBtn.setBackground(Color.decode("#2c4536"));
        salirBtn.setBorderPainted(false);
        salirBtn.setOpaque(true);
        salirBtn.setForeground(Color.WHITE);
        salirBtn.addActionListener(this);
        add(salirBtn);
        
        
        
        setVisible(true);
        
        
    }
    
        @Override
    public void actionPerformed(ActionEvent ae){
        // quizas Cambiar por un switch
            if (ae.getSource() == nuevoHuespedBtn) {
                setVisible(false);
                new Huesped();
            } else if (ae.getSource() == domosBtn) {
                setVisible(false);
                new ListarDomos();
            } else if (ae.getSource() == areaBtn) {
                setVisible(false);
                new Area();
            } else if (ae.getSource() == empleadosBtn) {
                setVisible(false);
                new ListarEmpleados();
            } else if (ae.getSource() == usuarioAdminBtn) {
                setVisible(false);
                new ListarUsuariosAdmin();
            } else if (ae.getSource() == huespedesBtn) {
                setVisible(false);
                new ListarHuespedes();
            }  else if (ae.getSource() == buscarDomoBtn) {
                setVisible(false);
                new BuscarDomo();
            }  else if (ae.getSource() == checkoutBtn) {
                setVisible(false);
                new Checkout();
            } else if (ae.getSource() == guiaTurismoBtn) {
                setVisible(false);
                new ListarGuiaTurismo();
            } else if (ae.getSource() == salirBtn) {
                setVisible(false);
                new Dashboard();
            }
    }
    
    
    public static void main(String[] args) {
        new Recepcion();
    }
}
