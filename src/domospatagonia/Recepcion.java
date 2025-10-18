package domospatagonia;


import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author martin
 */
public class Recepcion extends JFrame{
    JButton nuevoHuespedBtn, areaBtn, empleadosBtn, huespedesBtn, usuarioAdminBtn, checkoutBtn, actualizaStatusBtn, actualizarStatusDomoBtn, guiaTurismoBtn, buscarDomoBtn, salirBtn ;

    public Recepcion() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
         // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // Poner titulo
        // Nueveo Huésped btn
        nuevoHuespedBtn = new JButton("Nuevo Huesped");
        nuevoHuespedBtn.setFont(fontPrincipal);
        nuevoHuespedBtn.setBounds(20, 110, 150, 30);
        nuevoHuespedBtn.setBackground(Color.decode("#2c4536"));
        nuevoHuespedBtn.setBorderPainted(false);
        nuevoHuespedBtn.setOpaque(true);
        nuevoHuespedBtn.setForeground(Color.WHITE);
        // nuevoHuespedBtn.addActionListener(this);
        add(nuevoHuespedBtn);
             
        // Area btn
        areaBtn = new JButton("Area");
        areaBtn.setFont(fontPrincipal);
        areaBtn.setBounds(20, 150, 150, 30);
        areaBtn.setBackground(Color.decode("#2c4536"));
        areaBtn.setBorderPainted(false);
        areaBtn.setOpaque(true);
        areaBtn.setForeground(Color.WHITE);
        // nuevoHuespedBtn.addActionListener(this);
        add(areaBtn);
        setVisible(true);
        
        // Empleados btn
        empleadosBtn = new JButton("Empleados");
        empleadosBtn.setFont(fontPrincipal);
        empleadosBtn.setBounds(20, 190, 150, 30);
        empleadosBtn.setBackground(Color.decode("#2c4536"));
        empleadosBtn.setBorderPainted(false);
        empleadosBtn.setOpaque(true);
        empleadosBtn.setForeground(Color.WHITE);
        // nuevoHuespedBtn.addActionListener(this);
        add(empleadosBtn);
       
        // Huespedes btn
        huespedesBtn = new JButton("Huespedes");
        huespedesBtn.setFont(fontPrincipal);
        huespedesBtn.setBounds(20, 230, 150, 30);
        huespedesBtn.setBackground(Color.decode("#2c4536"));
        huespedesBtn.setBorderPainted(false);
        huespedesBtn.setOpaque(true);
        huespedesBtn.setForeground(Color.WHITE);
        // nuehuespedesBtn.addActionListener(this);
        add(huespedesBtn);
      
        // Usuario Admin btn
        usuarioAdminBtn = new JButton("Usuario Admin");
        usuarioAdminBtn.setFont(fontPrincipal);
        usuarioAdminBtn.setBounds(20, 270, 150, 30);
        usuarioAdminBtn.setBackground(Color.decode("#2c4536"));
        usuarioAdminBtn.setBorderPainted(false);
        usuarioAdminBtn.setOpaque(true);
        usuarioAdminBtn.setForeground(Color.WHITE);
        // nueusuarioAdminBtn.addActionListener(this);
        add(usuarioAdminBtn);
        
        // Checkout btn
        checkoutBtn = new JButton("Checkout");
        checkoutBtn.setFont(fontPrincipal);
        checkoutBtn.setBounds(20, 310, 150, 30);
        checkoutBtn.setBackground(Color.decode("#2c4536"));
        checkoutBtn.setBorderPainted(false);
        checkoutBtn.setOpaque(true);
        checkoutBtn.setForeground(Color.WHITE);
        // nuecheckoutBtn.addActionListener(this);
        add(checkoutBtn);
        
        //Actualizar estatus  btn
        actualizaStatusBtn = new JButton("Actualizar estatus");
        actualizaStatusBtn.setFont(fontPrincipal);
        actualizaStatusBtn.setBounds(20, 350, 150, 30);
        actualizaStatusBtn.setBackground(Color.decode("#2c4536"));
        actualizaStatusBtn.setBorderPainted(false);
        actualizaStatusBtn.setOpaque(true);
        actualizaStatusBtn.setForeground(Color.WHITE);
        // nueactualizaStatusBtn.addActionListener(this);
        add(actualizaStatusBtn);
        
        //Actualizar estatus domo btn
        actualizarStatusDomoBtn = new JButton("Actualizar estatus Domo");
        actualizarStatusDomoBtn.setFont(fontPrincipal);
        actualizarStatusDomoBtn.setBounds(20, 390, 150, 30);
        actualizarStatusDomoBtn.setBackground(Color.decode("#2c4536"));
        actualizarStatusDomoBtn.setBorderPainted(false);
        actualizarStatusDomoBtn.setOpaque(true);
        actualizarStatusDomoBtn.setForeground(Color.WHITE);
        // nueactualizarStatusDomoBtn.addActionListener(this);
        add(actualizarStatusDomoBtn);
  
        //Guia Turismo btn
        guiaTurismoBtn = new JButton("Guia Turismo");
        guiaTurismoBtn.setFont(fontPrincipal);
        guiaTurismoBtn.setBounds(20, 430, 150, 30);
        guiaTurismoBtn.setBackground(Color.decode("#2c4536"));
        guiaTurismoBtn.setBorderPainted(false);
        guiaTurismoBtn.setOpaque(true);
        guiaTurismoBtn.setForeground(Color.WHITE);
        // nueguiaTurismoBtn.addActionListener(this);
        add(guiaTurismoBtn);
        
        //Buscar Domo
        buscarDomoBtn = new JButton("Buscar Domo");
        buscarDomoBtn.setFont(fontPrincipal);
        buscarDomoBtn.setBounds(20, 470, 150, 30);
        buscarDomoBtn.setBackground(Color.decode("#2c4536"));
        buscarDomoBtn.setBorderPainted(false);
        buscarDomoBtn.setOpaque(true);
        buscarDomoBtn.setForeground(Color.WHITE);
        // nueguiaTurismoBtn.addActionListener(this);
        add(buscarDomoBtn);
        
        // Salir
        salirBtn = new JButton("Salir");
        salirBtn.setFont(fontPrincipal);
        salirBtn.setBounds(20, 510, 150, 30);
        salirBtn.setBackground(Color.decode("#2c4536"));
        salirBtn.setBorderPainted(false);
        salirBtn.setOpaque(true);
        salirBtn.setForeground(Color.WHITE);
        // nueguiaTurismoBtn.addActionListener(this);
        add(salirBtn);
        
        
        
        setVisible(true);
        
        
    }
    
    
    public static void main(String[] args) {
        new Recepcion();
    }
}
