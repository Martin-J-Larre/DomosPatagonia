
package view;

import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionListener;

public class InicioSesionView extends JFrame{
    public JTextField usuarioTextField, contraseniaTextField;
    public JButton inicioSesionBtn, cancelarBtn;

    public InicioSesionView() {
         getContentPane().setBackground(Color.decode("#72b48c"));
        
        setLayout(null);
        
        Font allFont = new Font("Arial", Font.BOLD, 14);
        
        //#### Usuario ####
        
        // Label Usuario
        JLabel usuario = new JLabel("Usuario");
        usuario.setForeground(Color.WHITE);
        usuario.setFont(allFont);
        usuario.setBounds(50, 170, 100, 30);
        add(usuario);
        
        //Campo de texto Usuario
        usuarioTextField = new JTextField();
        usuarioTextField.setFont(allFont);
        usuarioTextField.setBounds(45, 190, 220, 30);
        add(usuarioTextField);
        
        
         //#### Contraseña ####
         
        // Label Contraseña
        JLabel contrasenia = new JLabel("Contraseña");
        contrasenia.setFont(allFont);
        contrasenia.setForeground(Color.WHITE);
        contrasenia.setBounds(50, 220, 100, 30);
        add(contrasenia);
        
        //Campo de texto Contraseña
        contraseniaTextField = new JTextField();
        contraseniaTextField.setFont(allFont);
        contraseniaTextField.setBounds(45, 240, 220, 30);
        add(contraseniaTextField);  
        
        //#### Botones ####
        
        // Btn inicio sesión
        inicioSesionBtn = new JButton("Inicio Sesión");
        inicioSesionBtn.setFont(allFont);
        inicioSesionBtn.setBounds(45, 290, 220, 35);
        inicioSesionBtn.setBackground(Color.decode("#2c4536"));
        inicioSesionBtn.setBorderPainted(false);
        inicioSesionBtn.setOpaque(true);
        inicioSesionBtn.setForeground(Color.WHITE);
        add(inicioSesionBtn);
        
        
        // Btn cancelar
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(allFont);
        cancelarBtn.setBounds(45, 335, 220, 35);
        cancelarBtn.setBackground(Color.decode("#3c5f4a"));
        cancelarBtn.setBorderPainted(false);
        cancelarBtn.setOpaque(true);
        cancelarBtn.setForeground(Color.decode("#939393"));
        add(cancelarBtn);
        
        // Logo
        ImageIcon logoImg = new ImageIcon(ClassLoader.getSystemResource("img/logo.png"));
        JLabel logo = new JLabel(logoImg);
        logo.setBounds(10, 10, 280, 149);
        add(logo);
        
        
        // Frame settings
        setBounds(500, 300, 300, 420);
        setVisible(true);
    }
    
    
    public void addInicioSesionListener(ActionListener listener) {
        inicioSesionBtn.addActionListener(listener);
        cancelarBtn.addActionListener(listener);
    }
}
