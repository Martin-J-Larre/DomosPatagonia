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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author martin
 */
public class EmpleadoLimpieza extends JFrame implements ActionListener{
    
    JTextField idEmpLimpTextField, horDeJornadaTextField, horDeEntradaTextField;
    JTextField horDeSalidaTextField, diasJornadaTextField, salarioTextField;
    JButton enviarBtn, cancelarBtn;
    
    
        public EmpleadoLimpieza() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // TODO: Agregar Titulo
        
        // Nro Empleado Limpieza 
        JLabel idEmpLimpLabel = new JLabel("Empleado Limpieza Nro");
        idEmpLimpLabel.setFont(fontPrincipal);
        idEmpLimpLabel.setBounds(60, 30, 200, 30);
        add(idEmpLimpLabel);
        
        idEmpLimpTextField = new JTextField();
        idEmpLimpTextField.setBounds(230, 30, 200, 30);
        add(idEmpLimpTextField);
        
        
        // Horario (Cantidad Horas) de Jornada --> Horas por día que trabaja, arreglar en BBDD Y DEMASES 
        JLabel horDeJornadaLabel = new JLabel("Horario Jornada");
        horDeJornadaLabel.setFont(fontPrincipal);
        horDeJornadaLabel.setBounds(60, 70, 200, 30);
        add( horDeJornadaLabel);
        
        horDeJornadaTextField = new JTextField();
        horDeJornadaTextField.setBounds(230, 70, 200, 30);
        add(horDeJornadaTextField);
        
        // Hora de horDeEntrada
        JLabel horDeEntradaLabel = new JLabel("Idiomas");
        horDeEntradaLabel.setBounds(60, 110, 220, 30);
        horDeEntradaLabel.setFont(fontPrincipal);
        add(horDeEntradaLabel);
        
        horDeEntradaTextField = new JTextField();
        horDeEntradaTextField.setBounds(230, 110, 200, 30);
        add(horDeEntradaTextField);
      
        
        // Hora de salida
        JLabel horDeSalidaLabel = new JLabel("Horario Salida");
        horDeSalidaLabel.setFont(fontPrincipal);
        horDeSalidaLabel.setBounds(60, 150, 200, 30);
        add(horDeSalidaLabel);
        
        horDeSalidaTextField = new JTextField();
        horDeSalidaTextField.setBounds(230, 150, 200, 30);
        add(horDeSalidaTextField);
        
        // Días de jornada
        JLabel diasJornadaLabel = new JLabel("Días de Jornada");
        diasJornadaLabel.setFont(fontPrincipal);
        diasJornadaLabel.setBounds(60, 190, 200, 30);
        add(diasJornadaLabel);
        
        diasJornadaTextField = new JTextField();
        diasJornadaTextField.setBounds(230, 190, 200, 30);
        add(diasJornadaTextField);
        
        
        // Salario
        // ** ParseInt() **
        JLabel salarioLabel = new JLabel("Salario");
        salarioLabel.setFont(fontPrincipal);
        salarioLabel.setBounds(60, 230, 200, 30);
        add(salarioLabel);
        
        salarioTextField = new JTextField();
        salarioTextField.setBounds(230, 230, 200, 30);
        add(salarioTextField);
        
        // BTN ENVIAR
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(60, 270, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        //  BTN CANCELAR
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(fontPrincipal);
        cancelarBtn.setBounds(250, 270, 150, 30);
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
            
            String idEmpleadoLimpieza = idEmpLimpTextField.getText();
            String horarioJornada = horDeJornadaTextField.getText();
            String horarioEntrada = horDeEntradaTextField.getText();
            String horarioSalida = horDeSalidaTextField.getText();
            String diasDeJornada = diasJornadaTextField.getText();
            String salario = salarioTextField.getText();
        
            try {
                // Logica BBDD Supongo, pronto sabremos
                JOptionPane.showMessageDialog(null,"Nuevo empleado limpieza agregrado exitosamente");
                
                setVisible(false);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    
    }
        
    public static void main(String[] args) {
        new EmpleadoLimpieza();
    }
}
