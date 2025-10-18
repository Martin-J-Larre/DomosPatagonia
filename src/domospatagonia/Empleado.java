
package domospatagonia;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author martin
 */
public class Empleado extends JFrame{

    public Empleado() {
        // Set Frame
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // ### Datos empleado ###
        
        // Nombre
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(60, 30, 120, 30);
        nombreLabel.setFont(fontPrincipal);
        add(nombreLabel);
        
        JTextField nombreTextField = new JTextField();
        nombreTextField.setBounds(130, 30, 150, 30);
        add(nombreTextField);
        
        // Apellido
        JLabel apellidoLabel = new JLabel("Apellido");
        apellidoLabel.setBounds(60, 70, 120, 30);
        apellidoLabel.setFont(fontPrincipal);
        add(apellidoLabel);
        
        JTextField apellidoTextField = new JTextField();
        apellidoTextField.setBounds(130, 70, 150, 30);
        add(apellidoTextField);
        
        // DNI
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel dniLabel = new JLabel("DNI");
        dniLabel.setBounds(60, 110, 120, 30);
        dniLabel.setFont(fontPrincipal);
        add(dniLabel);
        
        JTextField dniTextField = new JTextField();
        dniTextField.setBounds(130, 110, 150, 30);
        add(dniTextField);
        
        // Edad
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel edadLabel = new JLabel("Edad");
        edadLabel.setBounds(60, 150, 120, 30);
        edadLabel.setFont(fontPrincipal);
        add(edadLabel);
        
        JTextField edadTextField = new JTextField();
        edadTextField.setBounds(130, 150, 150, 30);
        add(edadTextField);
        
        // Genero
        JLabel generoLabel = new JLabel("Genero");
        generoLabel.setBounds(60, 190, 120, 30);
        generoLabel.setFont(fontPrincipal);
        add(generoLabel);
        
        JRadioButton masculinoRadioBtn = new JRadioButton("Hombre");
        masculinoRadioBtn.setBounds(130, 190, 90, 30);
        masculinoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(masculinoRadioBtn);
        
        JRadioButton femeninoRadioBtn = new JRadioButton("Mujer");
        femeninoRadioBtn.setBounds(210, 190, 75, 30);
        femeninoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(femeninoRadioBtn);
        
         // Telefono
        JLabel telefonoLabel = new JLabel("Telefono");
        telefonoLabel.setBounds(60, 230, 120, 30);
        telefonoLabel.setFont(fontPrincipal);
        add(telefonoLabel);
        
        JTextField telefonoTextField = new JTextField();
        telefonoTextField.setBounds(130, 230, 150, 30);
        add(telefonoTextField);
        
        // Area
        JLabel areaLabel = new JLabel("Area");
        areaLabel.setBounds(60, 270, 120, 30);
        areaLabel.setFont(fontPrincipal);
        add(areaLabel);
        
        String areas[] = {"Empleado Administrador", "Empleado Limpieza", "Guía Turismo"};
        JComboBox areaComboBox = new JComboBox(areas);
        areaComboBox.setBounds(130, 270, 150, 30);
        add(areaComboBox);
        
        // Turno
        JLabel turnoLabel = new JLabel("Turno");
        turnoLabel.setBounds(60, 310, 120, 30);
        turnoLabel.setFont(fontPrincipal);
        add(turnoLabel);
        
        JTextField turnoTextField = new JTextField();
        turnoTextField.setBounds(130, 310, 150, 30);
        add(turnoTextField);
        
        // Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(60, 350, 120, 30);
        emailLabel.setFont(fontPrincipal);
        add(emailLabel);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(130, 350, 150, 30);
        add(emailTextField);
        
        
        // Btn Enviar
        JButton enviarBtn = new JButton("Inicio Sesión");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(130, 410, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        add(enviarBtn);
        
        
        
        
        
        
        setVisible(true);
                
    }
    
    public static void main(String[] args) {
        new Empleado();
    }
    
}
