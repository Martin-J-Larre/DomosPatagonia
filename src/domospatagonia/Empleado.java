
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
    JButton enviarBtn;
            
    public Empleado() {
        // Set Frame
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // ### Datos empleado ###
        
        // Nombre
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(60, 30, 200, 30);
        nombreLabel.setFont(fontPrincipal);
        add(nombreLabel);
        
        nombreTextField = new JTextField();
        nombreTextField.setBounds(130, 30, 200, 30);
        add(nombreTextField);
        
        // Apellido
        JLabel apellidoLabel = new JLabel("Apellido");
        apellidoLabel.setBounds(60, 70, 200, 30);
        apellidoLabel.setFont(fontPrincipal);
        add(apellidoLabel);
        
        apellidoTextField = new JTextField();
        apellidoTextField.setBounds(130, 70, 200, 30);
        add(apellidoTextField);
        
        // DNI
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel dniLabel = new JLabel("DNI");
        dniLabel.setBounds(60, 110, 200, 30);
        dniLabel.setFont(fontPrincipal);
        add(dniLabel);
        
        dniTextField = new JTextField();
        dniTextField.setBounds(130, 110, 200, 30);
        add(dniTextField);
        
        // Edad
        //*********************************************
        //****  Parse int cuando hacemos .getText()
        JLabel edadLabel = new JLabel("Edad");
        edadLabel.setBounds(60, 150, 200, 30);
        edadLabel.setFont(fontPrincipal);
        add(edadLabel);
        
        edadTextField = new JTextField();
        edadTextField.setBounds(130, 150, 200, 30);
        add(edadTextField);
        
        // Genero
        JLabel generoLabel = new JLabel("Genero");
        generoLabel.setBounds(60, 190, 120, 30);
        generoLabel.setFont(fontPrincipal);
        add(generoLabel);
        
        masculinoRadioBtn = new JRadioButton("Hombre");
        masculinoRadioBtn.setBounds(130, 190, 90, 30);
        masculinoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(masculinoRadioBtn);
        
        femeninoRadioBtn = new JRadioButton("Mujer");
        femeninoRadioBtn.setBounds(210, 190, 75, 30);
        femeninoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(femeninoRadioBtn);
        
        ButtonGroup bg =  new ButtonGroup();
        bg.add(masculinoRadioBtn);
        bg.add(femeninoRadioBtn);
        
         // Telefono
        JLabel telefonoLabel = new JLabel("Telefono");
        telefonoLabel.setBounds(60, 230, 200, 30);
        telefonoLabel.setFont(fontPrincipal);
        add(telefonoLabel);
        
        telefonoTextField = new JTextField();
        telefonoTextField.setBounds(130, 230, 200, 30);
        add(telefonoTextField);
        
        // Area
        JLabel areaLabel = new JLabel("Area");
        areaLabel.setBounds(60, 270, 200, 30);
        areaLabel.setFont(fontPrincipal);
        add(areaLabel);
        
        String areas[] = {"Empleado Administrador", "Empleado Limpieza", "Guía Turismo"};
        areaComboBox = new JComboBox(areas);
        areaComboBox.setBounds(130, 270, 200, 30);
        add(areaComboBox);
        
        // Turno
        JLabel turnoLabel = new JLabel("Turno");
        turnoLabel.setBounds(60, 310, 200, 30);
        turnoLabel.setFont(fontPrincipal);
        add(turnoLabel);
        
        turnoTextField = new JTextField();
        turnoTextField.setBounds(130, 310, 200, 30);
        add(turnoTextField);
        
        // Email
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(60, 350, 200, 30);
        emailLabel.setFont(fontPrincipal);
        add(emailLabel);
        
        emailTextField = new JTextField();
        emailTextField.setBounds(130, 350, 200, 30);
        add(emailTextField);
        
        
        // Btn Enviar
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(130, 410, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        // AGREGAR btn cancelar
        
        
        
        
        
        setVisible(true);
                
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
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
    }
    
    public static void main(String[] args) {
        new Empleado();
    }
    
}
