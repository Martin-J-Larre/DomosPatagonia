
package domospatagonia;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author martin
 */
public class Checkout extends JFrame implements ActionListener{
    JTextField huespedIdTextField, depositoTextField, adeudadoTextField, totalTextField;
    Choice huespedNombreC, huespedApellidoC;
    JLabel checkinFecha, checkoutFecha;
    JButton volverBtn, pagarBtn;
    
    
    public Checkout() {
        
        //TOD0: Agregar Titulo /  Hacer una clase o algo para no repetir BTN tantas veces.
        
        // set Frame TODO: Hacer una función desde un archivo helper funtion y llamarla
        // como se hace en React, pero primero investigar como lo hacer con MVC en Java
        // Ver e investigar como funciona Solid en Java
        setLayout(null);
        setBounds(200, 200, 1020, 584);
            // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        
        // Huesped Nombre
        JLabel huespedNombreLabel = new JLabel("Nombre");
        huespedNombreLabel.setFont(fontPrincipal);
        huespedNombreLabel.setBounds(400, 30, 100, 30);
        add (huespedNombreLabel);
    
        huespedNombreC = new Choice();
        // Traer los ids de la BBDD y insertarlos aca some way
        huespedNombreC.add("Horacio");
        huespedNombreC.add("Jose");
        huespedNombreC.add("Ricardo");
        huespedNombreC.add("Mengano");
        huespedNombreC.setBounds(500, 30, 200, 30);
        add(huespedNombreC);
        
        // Huesped Apellido
        JLabel apellidoLabel = new JLabel("Apellido");
        apellidoLabel.setFont(fontPrincipal);
        apellidoLabel.setBounds(400, 70, 100, 30);
        add (apellidoLabel);
    
        huespedApellidoC = new Choice();
        // Traer los ids de la BBDD y insertarlos aca some way
        huespedApellidoC.add("10");
        huespedApellidoC.add("28");
        huespedApellidoC.add("50");
        huespedApellidoC.add("78");
        huespedApellidoC.setBounds(500, 70, 200, 30);
        add(huespedApellidoC);
        
        
        // Huesped Id
        JLabel huespedIdLabel = new JLabel("Huesped ID");
        huespedIdLabel.setFont(fontPrincipal);
        huespedIdLabel.setBounds(400, 110, 100, 30);
        add (huespedIdLabel);
        
        // Buscar cambiar a un Jlabel como en checkin
        huespedIdTextField = new JTextField();
        huespedIdTextField.setBounds(500, 110, 200, 30);
        add(huespedIdTextField);
        
        // checkin ---->
        // Traer la fecha de BBDD
        Date fecha = new Date();
    
        JLabel checkinLabel = new JLabel("Checkin");
        checkinLabel.setFont(fontPrincipal);
        checkinLabel.setBounds(400, 150, 200, 30);
        add(checkinLabel);
    
        checkinFecha = new JLabel("" + fecha);
        checkinFecha.setFont(fontPrincipal);
        checkinFecha.setBounds(500, 150, 200, 30);
         add(checkinFecha);
        
        // Deposito
        JLabel depositoLabel = new JLabel("Deposito");
        depositoLabel.setFont(fontPrincipal);
        depositoLabel.setBounds(400, 190, 200, 30);
        add(depositoLabel);
    
        depositoTextField = new JTextField();
        depositoTextField.setBounds(500, 190, 200, 30);
        add(depositoTextField);
       
        // Adeudado
        JLabel adeudadoLabel = new JLabel("Adeudado");
        adeudadoLabel.setFont(fontPrincipal);
        adeudadoLabel.setBounds(400, 230, 200, 30);
        add(adeudadoLabel);
    
        adeudadoTextField = new JTextField();
        adeudadoTextField.setBounds(500, 230, 200, 30);
        add(adeudadoTextField);
        
        // Total
        JLabel totalLabel = new JLabel("Total");
        totalLabel.setFont(fontPrincipal);
        totalLabel.setBounds(400, 260, 200, 30);
        add(totalLabel);
    
        totalTextField = new JTextField();
        totalTextField.setBounds(500, 260, 200, 30);
        add(totalTextField);
   
      
        // checkout ---->
        // Time stamp y ir a pagar
        // Date fecha = new Date();
    
        JLabel checkoutLabel = new JLabel("Checkout");
        checkoutLabel.setFont(fontPrincipal);
        checkoutLabel.setBounds(400, 300, 200, 30);
        add(checkoutLabel);
    
        checkoutFecha = new JLabel("" + fecha);
        checkoutFecha.setFont(fontPrincipal);
        checkoutFecha.setBounds(500, 300, 200, 30);
        
        //  BTN Volver
        volverBtn = new JButton("Volver");
        volverBtn.setFont(fontPrincipal);
        volverBtn.setBounds(400, 340, 130, 30);
        volverBtn.setBackground(Color.decode("#3c5f4a"));
        volverBtn.setBorderPainted(false);
        volverBtn.setOpaque(true);
        volverBtn.setForeground(Color.decode("#939393"));
        volverBtn.addActionListener(this);
        add(volverBtn);
        setVisible(true);
    
        //  BTN Buscar
        pagarBtn = new JButton("Pagar");
        pagarBtn.setFont(fontPrincipal);
        pagarBtn.setBounds(600, 340, 130, 30);
        pagarBtn.setBackground(Color.decode("#3c5f4a"));
        pagarBtn.setBorderPainted(false);
        pagarBtn.setOpaque(true);
        pagarBtn.setForeground(Color.decode("#939393"));
        // buscarBtn.addActionListener(this);
        add(pagarBtn);
        setVisible(true);
            add(checkoutFecha);
            
            setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
     if (ae.getSource() == pagarBtn) {
            
         // Ir a interfaz pagar o solo y despues simular pago exitoso
         // mandar la data en un recibo con leyenda pagada para imprimir
   
        } else if (ae.getSource() == volverBtn) {
            setVisible(false);
            new Recepcion();
        }
    }
    
    public static void main(String[] args) {
        
        new Checkout();
    }
}
