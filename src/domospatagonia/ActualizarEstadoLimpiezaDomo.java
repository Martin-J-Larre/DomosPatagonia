//
//package domospatagonia;
//
//import java.awt.Choice;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Date;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//
///**
// *
// * @author martin
// */
//// Por si el huesped pide limpiar el domo o para actulizar el Domo Analizar si sacar Huesped y manejar solo Info Domo
//// Esta clase analizarla bien y quizas eliminarla si actualizamos desde Listar domos con un icono editar !!!!
// *******************************************************************************
// -----Actualizar con hUESPED o Sin Huesped y Lo Actualiza Emplado Limpieza!!!! *
// *******************************************************************************
//
//public class ActualizarEstadoLimpiezaDomo extends JFrame implements ActionListener{
//    // Traer toda la data y mostarla en textfield como placeholder en HTML o otra forma
//    JTextField huespedIdTextField, huespedNombreTextField, huespedApellidoTextField, domoIdTextField;
//    Choice huespedNombreC, huespedApellidoC;
//    JLabel checkinFecha, checkoutFecha;
//    JButton volverBtn, actualizarBtn;
//    
//    
//    public ActualizarEstadoLimpiezaDomo() {
//      
//        setLayout(null);
//        setBounds(200, 200, 1020, 584);
//            // Fuente
//        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
//        
//        
//        // Huesped Nombre
//        JLabel huespedNombreLabel = new JLabel("Nombre");
//        huespedNombreLabel.setFont(fontPrincipal);
//        huespedNombreLabel.setBounds(400, 30, 100, 30);
//        add (huespedNombreLabel);
//        
//        huespedNombreTextField = new JTextField();
//        huespedNombreTextField.setBounds(500, 110, 200, 30);
//        add(huespedNombreTextField);
//    
//       
//        // Huesped Apellido
//        JLabel apellidoLabel = new JLabel("Apellido");
//        apellidoLabel.setFont(fontPrincipal);
//        apellidoLabel.setBounds(400, 70, 100, 30);
//        add (apellidoLabel);
//        
//        huespedApellidoTextField = new JTextField();
//        huespedApellidoTextField.setBounds(500, 110, 200, 30);
//        add(huespedApellidoTextField);
//            
//        
//        // Huesped Id
//        JLabel huespedIdLabel = new JLabel("Huesped ID");
//        huespedIdLabel.setFont(fontPrincipal);
//        huespedIdLabel.setBounds(400, 110, 100, 30);
//        add (huespedIdLabel);
//        
//        huespedIdTextField = new JTextField();
//        huespedIdTextField.setBounds(500, 110, 200, 30);
//        add(huespedIdTextField);
//        
//        // Huesped Id
//        JLabel domoIdLabel = new JLabel("Domo ID");
//        domoIdLabel.setFont(fontPrincipal);
//        domoIdLabel.setBounds(400, 110, 100, 30);
//        add (domoIdLabel);
//        
//        domoIdTextField = new JTextField();
//        domoIdTextField.setBounds(500, 110, 200, 30);
//        add(domoIdTextField);
//        
//        
//        
//      
//        //  BTN Volver
//        volverBtn = new JButton("Volver");
//        volverBtn.setFont(fontPrincipal);
//        volverBtn.setBounds(400, 340, 130, 30);
//        volverBtn.setBackground(Color.decode("#3c5f4a"));
//        volverBtn.setBorderPainted(false);
//        volverBtn.setOpaque(true);
//        volverBtn.setForeground(Color.decode("#939393"));
//        // volverBtn.addActionListener(this);
//        add(volverBtn);
//        setVisible(true);
//    
//        //  BTN Actualizar
//        actualizarBtn = new JButton("Actualizar");
//        actualizarBtn.setFont(fontPrincipal);
//        actualizarBtn.setBounds(600, 340, 130, 30);
//        actualizarBtn.setBackground(Color.decode("#3c5f4a"));
//        actualizarBtn.setBorderPainted(false);
//        actualizarBtn.setOpaque(true);
//        actualizarBtn.setForeground(Color.decode("#939393"));
//        // buscarBtn.addActionListener(this);
//        add(actualizarBtn);
//        
//        
//        setVisible(true);
//         
//            
//            setVisible(true);
//    }
//    
//    @Override
//    public void actionPerformed(ActionEvent ae){
//     if (ae.getSource() == actualizarBtn) {
//            
//
//   
//        } else if (ae.getSource() == volverBtn) {
//            setVisible(false);
//            new Recepcion();
//        }
//    }
//    
//    public static void main(String[] args) {
//        
//        new ActualizarEstadoLimpiezaDomo();
//    }
//}
