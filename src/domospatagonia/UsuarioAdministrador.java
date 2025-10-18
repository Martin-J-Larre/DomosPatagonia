/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domospatagonia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author martin
 */
public class UsuarioAdministrador extends JFrame implements ActionListener{
    JTextField usuarioAdminTextField, credencialTextField, idiomasTextField, tituloTextField, domoAsignadoTextField;
    JButton enviarBtn, cancelarBtn;
    
    public UsuarioAdministrador() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // TODO: Agregar Titulo
        
        // Nro Usuario Admin 
        JLabel usuarioAdminLabel = new JLabel("Usuario Admin Nro");
        usuarioAdminLabel.setFont(fontPrincipal);
        usuarioAdminLabel.setBounds(60, 30, 200, 30);
        add(usuarioAdminLabel);
        
        usuarioAdminTextField = new JTextField();
        usuarioAdminTextField.setBounds(200, 30, 200, 30);
        add(usuarioAdminTextField);
        
        
        // Credencial
        JLabel credencialLabel = new JLabel("Credencial");
        credencialLabel.setFont(fontPrincipal);
        credencialLabel.setBounds(60, 70, 200, 30);
        add(credencialLabel);
        
        credencialTextField = new JTextField();
        credencialTextField.setBounds(200, 70, 200, 30);
        add(credencialTextField);
        
        // Idiomas
        JLabel idiomasLabel = new JLabel("Idiomas");
        idiomasLabel.setBounds(60, 110, 220, 30);
        idiomasLabel.setFont(fontPrincipal);
        add(idiomasLabel);
        
        idiomasTextField = new JTextField();
        idiomasTextField.setBounds(200, 110, 200, 30);
        add(idiomasTextField);
      
        
        // Titulo
        JLabel tituloLabel = new JLabel("Camioneta");
        tituloLabel.setFont(fontPrincipal);
        tituloLabel.setBounds(60, 150, 200, 30);
        add(tituloLabel);
        
        tituloTextField = new JTextField();
        tituloTextField.setBounds(200, 150, 200, 30);
        add(tituloTextField);
        
        // Domo Asignado
        // ** ParseInt() **
        JLabel domoAsignadoLabel = new JLabel("Domo Asignado");
        domoAsignadoLabel.setFont(fontPrincipal);
        domoAsignadoLabel.setBounds(60, 190, 200, 30);
        add(domoAsignadoLabel);
        
        domoAsignadoTextField = new JTextField();
        domoAsignadoTextField.setBounds(200, 190, 200, 30);
        add(domoAsignadoTextField);
        
        // BTN ENVIAR
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(60, 240, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        //  BTN CANCELAR
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(fontPrincipal);
        cancelarBtn.setBounds(250, 240, 150, 30);
        cancelarBtn.setBackground(Color.decode("#3c5f4a"));
        cancelarBtn.setBorderPainted(false);
        cancelarBtn.setOpaque(true);
        cancelarBtn.setForeground(Color.decode("#939393"));
        cancelarBtn.addActionListener(this);
        add(cancelarBtn);
        
        
        setVisible(true);
    }
    
        @Override
    public void actionPerformed(ActionEvent ae) {
     
        if (ae.getSource() == enviarBtn) {
            
            String numUsuarioAdmin = usuarioAdminTextField.getText();
            String credencial = credencialTextField.getText();
            String idiomas = idiomasTextField.getText();
            String domoAsignado = domoAsignadoTextField.getText();
            String titulo = tituloTextField.getText();
            
        
            try {
                // Logica BBDD Supongo, pronto sabremos
                JOptionPane.showMessageDialog(null,"Nuevo Usuario Admin agregrado exitosamente");
                
                setVisible(false);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    
    }
    
    
    public static void main(String[] args) {
        new UsuarioAdministrador();
    }
    
}
