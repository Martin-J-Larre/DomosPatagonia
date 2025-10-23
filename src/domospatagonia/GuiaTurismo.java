/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domospatagonia;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author martin
 */
// Sacar el guia del menu y conectarlo con el formulario de empleado
// Asi tambien el empleado de limpieza
// Empleado
//       EmpleadoLimpieza
//       EmpleadoAdmisnitrativo
//       Guia Turismo

public class GuiaTurismo extends JFrame implements ActionListener{
    
    JTextField numGuiaTextField, especialidadTextField , camionetaTextField, domoAsignadoTextField;
    JComboBox temporadaComboBox;
    JButton enviarBtn, cancelarBtn;
    
          
    public GuiaTurismo() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // TODO: Agregar Titulo
        JLabel texto = new JLabel("Agregar Guía Turismo");
        texto.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setBounds(400, 10, 400, 50);
        add(texto);
        
        // Nro guía Turismo 
        JLabel numGuiaLabel = new JLabel("Guía Turismo Nro");
        numGuiaLabel.setFont(fontPrincipal);
        numGuiaLabel.setBounds(360, 80, 200, 30);
        add(numGuiaLabel);
        
        numGuiaTextField = new JTextField();
        numGuiaTextField.setBounds(500, 80, 200, 30);
        add(numGuiaTextField);
        
        
        // Especialidad
        JLabel especialidadLabel = new JLabel("Especialidad");
        especialidadLabel.setFont(fontPrincipal);
        especialidadLabel.setBounds(360, 120, 200, 30);
        add(especialidadLabel);
        
        especialidadTextField = new JTextField();
        especialidadTextField.setBounds(500, 120, 200, 30);
        add(especialidadTextField);
        
        // Temporada
        JLabel temporadaLabel = new JLabel("Temporada");
        temporadaLabel.setBounds(360, 160, 220, 30);
        temporadaLabel.setFont(fontPrincipal);
        add(temporadaLabel);
        
        String estaciones[] = {"Verano", "Otoño", "Primavera", "Invierno"};
        temporadaComboBox = new JComboBox(estaciones);
        temporadaComboBox.setBounds(500, 160, 200, 30);
        add(temporadaComboBox);
        
        // Camioneta
        JLabel camionetaLabel = new JLabel("Camioneta");
        camionetaLabel.setFont(fontPrincipal);
        camionetaLabel.setBounds(360, 200, 200, 30);
        add(camionetaLabel);
        
        camionetaTextField = new JTextField();
        camionetaTextField.setBounds(500, 200, 200, 30);
        add(camionetaTextField);
        
        // Domo Asignado
        // ** ParseInt() **
        JLabel domoAsignadoLabel = new JLabel("Domo Asignado");
        domoAsignadoLabel.setFont(fontPrincipal);
        domoAsignadoLabel.setBounds(360, 240, 200, 30);
        add(domoAsignadoLabel);
        
        domoAsignadoTextField = new JTextField();
        domoAsignadoTextField.setBounds(500, 240, 200, 30);
        add(domoAsignadoTextField);
        
        // BTN ENVIAR
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(360, 290, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        //  BTN CANCELAR
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(fontPrincipal);
        cancelarBtn.setBounds(550, 290, 150, 30);
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
            
            String numGuia = numGuiaTextField.getText();
            String especialidad = especialidadTextField.getText();
            String camioneta = camionetaTextField.getText();
            String domoAsignado = domoAsignadoTextField.getText();
           
            String temporada = (String) temporadaComboBox.getSelectedItem();
            
        
            try {
                // Logica BBDD Supongo, pronto sabremos
                JOptionPane.showMessageDialog(null,"Nuevo Guí Turismo agregrado exitosamente");
                
                setVisible(false);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    
    }
    
    public static void main(String[] args) {
        new GuiaTurismo();
    }
}
