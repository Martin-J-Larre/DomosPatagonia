/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domospatagonia;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author martin
 */
//TODO: Cambiar clase for el nombre checkin o solo en GUI
public class Huesped extends JFrame implements ActionListener{
    
    JTextField nombreTextField, apellidoTextFiel, dniTextField, direccionTextField, provinciaTextField, paisTextField, depositoTextField, checkoutTextField;
    JRadioButton hombreRadioBtn, mujerRadioBtn;
    JButton enviarBtn, volverBtn;
    JLabel checkinFecha;
    
    
    public Huesped() {
        
    // set Frame
    setLayout(null);
    setBounds(200, 200, 1020, 584);
    
    // Fuente
    Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
    
    JLabel texto = new JLabel("Agregar Huésped");
    texto.setFont(new Font("Arial", Font.BOLD, 18));
    texto.setBounds(400, 10, 400, 50);
    add(texto);
   
    // nombre
    JLabel nombreLabel = new JLabel("Nombre");
    nombreLabel.setFont(fontPrincipal);
    nombreLabel.setBounds(360, 80, 200, 30);
    add(nombreLabel);
    
    nombreTextField = new JTextField();
    nombreTextField.setBounds(440, 80, 200, 30);
    add(nombreTextField);
    
    // apellido
    JLabel apellidoLabel = new JLabel("Apellido");
    apellidoLabel.setFont(fontPrincipal);
    apellidoLabel.setBounds(360, 120, 200, 30);
    add(apellidoLabel);
    
    apellidoTextFiel = new JTextField();
    apellidoTextFiel.setBounds(440, 120, 200, 30);
    add(apellidoTextFiel);
    
    // DNI
    JLabel dniLabel = new JLabel("DNI");
    dniLabel.setFont(fontPrincipal);
    dniLabel.setBounds(360, 160, 200, 30);
    add(dniLabel);
    
    dniTextField = new JTextField();
    dniTextField.setBounds(440, 160, 200, 30);
    add(dniTextField);
    
    
    // Genero ----->
    JLabel generoLabel = new JLabel("Genero");
    generoLabel.setBounds(360, 200, 120, 30);
    generoLabel.setFont(fontPrincipal);
    add(generoLabel);
        
    hombreRadioBtn = new JRadioButton("Hombre");
    hombreRadioBtn.setBounds(450, 200, 90, 30);
    hombreRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
    add(hombreRadioBtn);
        
    mujerRadioBtn = new JRadioButton("Mujer");
    mujerRadioBtn.setBounds(530, 200, 75, 30);
    mujerRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
    add(mujerRadioBtn);
        
    ButtonGroup bg =  new ButtonGroup();
    bg.add(hombreRadioBtn);
    bg.add(mujerRadioBtn);
    
    // Dirección
    JLabel direccionLabel = new JLabel("Dirección");
    direccionLabel.setFont(fontPrincipal);
    direccionLabel.setBounds(360, 240, 200, 30);
    add(direccionLabel);
    
    direccionTextField = new JTextField();
    direccionTextField.setBounds(440, 240, 200, 30);
    add(direccionTextField);
    
    
    // Provincia
    JLabel provinciaLabel = new JLabel("Provincia");
    provinciaLabel.setFont(fontPrincipal);
    provinciaLabel.setBounds(360, 280, 200, 30);
    add(provinciaLabel);
    
    provinciaTextField = new JTextField();
    provinciaTextField.setBounds(440, 280, 200, 30);
    add(provinciaTextField);
    
    // País
    JLabel paisLabel = new JLabel("País");
    paisLabel.setFont(fontPrincipal);
    paisLabel.setBounds(360, 320, 200, 30);
    add(paisLabel);
    
    paisTextField = new JTextField();
    paisTextField.setBounds(440, 320, 200, 30);
    add(paisTextField);
    
    // checkin ---->
    Date fecha = new Date();
    
    JLabel checkinLabel = new JLabel("Checkin");
    checkinLabel.setFont(fontPrincipal);
    checkinLabel.setBounds(360, 360, 200, 30);
    add(checkinLabel);
    
    //  TODO: Ponerlo desde un placeholder en un TJTextFiled
    checkinFecha = new JLabel("" + fecha);
    checkinFecha.setFont(fontPrincipal);
    checkinFecha.setBounds(440, 360, 200, 30);
    add(checkinFecha);
    
    // checkout ---->
    // Dejarlo desabilitado/ Habilitarlo y agregar stamp 
    // con un metodo en checkout btn Recepcion GUI
    JLabel checkoutLabel = new JLabel("Checkout");
    checkoutLabel.setFont(fontPrincipal);
    checkoutLabel.setBounds(360, 400, 200, 30);
    add(checkoutLabel);
    
    //Desabilitar checkoutTextField
    //TODO: Poner un placeholder como en HTML que diga No check out o similar
    checkoutTextField = new JTextField();
    checkoutTextField.setBounds(440, 400, 200, 30);
    checkoutTextField.setEditable(false);
    checkoutTextField.setHighlighter(null);
    add(checkoutTextField);
    
    // Deposito
    JLabel depositoLabel = new JLabel("Deposito");
    depositoLabel.setFont(fontPrincipal);
    depositoLabel.setBounds(360, 440, 200, 30);
    add(depositoLabel);
    
    depositoTextField = new JTextField();
    depositoTextField.setBounds(440, 440, 200, 30);
    add(depositoTextField);
    
    //********* BTNs
    // BTN ENVIAR
    enviarBtn = new JButton("Enviar");
    enviarBtn.setFont(fontPrincipal);
    enviarBtn.setBounds(360, 480, 130, 30);
    enviarBtn.setBackground(Color.decode("#2c4536"));
    enviarBtn.setBorderPainted(false);
    enviarBtn.setOpaque(true);
    enviarBtn.setForeground(Color.WHITE);
    enviarBtn.addActionListener(this);
    add(enviarBtn);
        
    //  BTN Volver
    volverBtn = new JButton("Volver");
    volverBtn.setFont(fontPrincipal);
    volverBtn.setBounds(510, 480, 130, 30);
    volverBtn.setBackground(Color.decode("#3c5f4a"));
    volverBtn.setBorderPainted(false);
    volverBtn.setOpaque(true);
    volverBtn.setForeground(Color.decode("#939393"));
    volverBtn.addActionListener(this);
    add(volverBtn);
    
    setVisible(true);
    
    
    }
    
  
    public void actionPerformed(ActionEvent ae){
        
        if (ae.getSource() == enviarBtn) {
            String nombre = nombreTextField.getText();
            String apellido = apellidoTextFiel.getText();
            String dni = dniTextField.getText();
            String direccion = direccionTextField.getText();
            String provincia = provinciaTextField.getText();
            String pais = paisTextField.getText();
            String deposito = depositoTextField.getText();
            String checkin = checkinFecha.getText();
            
            String genero = null;
        
            if (hombreRadioBtn.isSelected()) {
                genero = "Hombre";
            } else if(mujerRadioBtn.isSelected()){
                genero = "Mujer";
            } // else "Mandar un alerta selecionar un radio Btn
            
            
            try {
                // Manejo envio de data al la BBDD
                
                JOptionPane.showMessageDialog(null,"Nuevo Huésped exitosamente agregado");
                setVisible(false);
                new Recepcion();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else if (ae.getSource() == volverBtn) {
            setVisible(false);
            new Recepcion();
        }
    }
    
    
    public static void main(String[] args) {
        new Huesped();
    }
}
