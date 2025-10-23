
package domospatagonia;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author martin
 */
public class Empleado extends JFrame implements ActionListener{

    JTextField nombreTextField, apellidoTextField, dniTextField;
    JTextField edadTextField, telefonoTextField,turnoTextField,emailTextField;
    JRadioButton masculinoRadioBtn, femeninoRadioBtn;
    JComboBox areaComboBox;
    JButton enviarBtn, cancelarBtn;
            
    public Empleado() {
        // Set Frame
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // ### Datos empleado ###
                
        JLabel texto = new JLabel("Agregar Empleado");
        texto.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setBounds(400, 10, 400, 50);
        add(texto);
        
        // Nombre
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(360, 80, 200, 30);
        nombreLabel.setFont(fontPrincipal);
        add(nombreLabel);
        
        nombreTextField = new JTextField();
        nombreTextField.setBounds(430, 80, 200, 30);
        add(nombreTextField);
        
        // Apellido
        JLabel apellidoLabel = new JLabel("Apellido");
        apellidoLabel.setBounds(360, 120, 200, 30);
        apellidoLabel.setFont(fontPrincipal);
        add(apellidoLabel);
        
        apellidoTextField = new JTextField();
        apellidoTextField.setBounds(430, 120, 200, 30);
        add(apellidoTextField);
        
        // DNI
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel dniLabel = new JLabel("DNI");
        dniLabel.setBounds(360, 160, 200, 30);
        dniLabel.setFont(fontPrincipal);
        add(dniLabel);
        
        dniTextField = new JTextField();
        dniTextField.setBounds(430, 160, 200, 30);
        add(dniTextField);
        
        // Edad
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel edadLabel = new JLabel("Edad");
        edadLabel.setBounds(360, 200, 200, 30);
        edadLabel.setFont(fontPrincipal);
        add(edadLabel);
        
        edadTextField = new JTextField();
        edadTextField.setBounds(430, 200, 200, 30);
        add(edadTextField);
        
        // Genero
        JLabel generoLabel = new JLabel("Genero");
        generoLabel.setBounds(360, 2400, 120, 30);
        generoLabel.setFont(fontPrincipal);
        add(generoLabel);
        
        masculinoRadioBtn = new JRadioButton("Hombre");
        masculinoRadioBtn.setBounds(430, 240, 90, 30);
        masculinoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(masculinoRadioBtn);
        
        femeninoRadioBtn = new JRadioButton("Mujer");
        femeninoRadioBtn.setBounds(510, 240, 75, 30);
        femeninoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(femeninoRadioBtn);
        
        ButtonGroup bg =  new ButtonGroup();
        bg.add(masculinoRadioBtn);
        bg.add(femeninoRadioBtn);
        
         // Telefono
        JLabel telefonoLabel = new JLabel("Telefono");
        telefonoLabel.setBounds(360, 280, 200, 30);
        telefonoLabel.setFont(fontPrincipal);
        add(telefonoLabel);
        
        telefonoTextField = new JTextField();
        telefonoTextField.setBounds(430, 280, 200, 30);
        add(telefonoTextField);
        
        // Area
        JLabel areaLabel = new JLabel("Area");
        areaLabel.setBounds(360, 320, 200, 30);
        areaLabel.setFont(fontPrincipal);
        add(areaLabel);
        
        String areas[] = {"Empleado Administrador", "Empleado Limpieza", "Guía Turismo"};
        areaComboBox = new JComboBox(areas);
        areaComboBox.setBounds(430, 320, 200, 30);
        add(areaComboBox);
        
        // Turno
        JLabel turnoLabel = new JLabel("Turno");
        turnoLabel.setBounds(360, 360, 200, 30);
        turnoLabel.setFont(fontPrincipal);
        add(turnoLabel);
        
        turnoTextField = new JTextField();
        turnoTextField.setBounds(430, 360, 200, 30);
        add(turnoTextField);
        
        // Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(360, 400, 200, 30);
        emailLabel.setFont(fontPrincipal);
        add(emailLabel);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(430, 400, 200, 30);
        add(emailTextField);
        
        
        // Btn Enviar
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(new Font("Arial", Font.BOLD, 12));
        enviarBtn.setBounds(430, 460, 90, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        // AGREGAR btn cancelar
            //  BTN Volver
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(new Font("Arial", Font.BOLD, 12));
        cancelarBtn.setBounds(530, 460, 100, 30);
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
        String nombre = nombreTextField.getText();
        String apellido = apellidoTextField.getText();
        String dni = dniTextField.getText();
        String edad = edadTextField.getText();
        String telefono = telefonoTextField.getText();
        String turno = turnoTextField.getText();
        String email =  emailTextField.getText();
        
        String genero = null;
        
        if (masculinoRadioBtn.isSelected()) {
            genero = "Hombre";
        } else if(femeninoRadioBtn.isSelected()){
            genero = "Mujer";
        }
        // else "Mandar un alerta selecionar un radio Btn
        
        String area = (String) areaComboBox.getSelectedItem();
        
        try {
            // Aqui logica enviar a la bbdd
            JOptionPane.showMessageDialog(null,"Empleado guardado exitosamente");
            
            setVisible(false);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        } else if(ae.getSource() == cancelarBtn){
            setVisible(false);
            new Dashboard();
        }
    }
    
    public static void main(String[] args) {
        new Empleado();
    }
    
}
