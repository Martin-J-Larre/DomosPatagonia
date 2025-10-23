
package domospatagonia;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author martin
 */
public class Domo extends JFrame implements ActionListener{
    JTextField idDomoTextField, tipoDeCamaTextField, amenitiesTextField, serviciosTextField, precioTextField;
    JComboBox disponibleComboBox;
    JRadioButton limpioRadioBtn, desordenadoRadioBtn;
    JButton enviarBtn, cancelarBtn;
    
    
    
            
            
    public Domo() {
        setLayout(null);
        setBounds(200, 200, 1020, 584);
        
        // Fuente
        Font fontPrincipal = new Font("Arial", Font.BOLD, 14);
        
        // TODO: Agregar Titulo
        JLabel texto = new JLabel("Agregar Domo");
        texto.setFont(new Font("Arial", Font.BOLD, 18));
        texto.setBounds(450, 10, 400, 50);
        add(texto);
        
        // Nro ID DOMO
        JLabel idDomoLabel = new JLabel("Número ID");
        idDomoLabel.setFont(fontPrincipal);
        idDomoLabel.setBounds(360, 80, 200, 30);
        add(idDomoLabel);
        
        idDomoTextField = new JTextField();
        idDomoTextField.setBounds(500, 80, 200, 30);
        add(idDomoTextField);
        
        
        // Nro ID DOMO
        JLabel tipoDeCamaLabel = new JLabel("Tipo de cama");
        tipoDeCamaLabel.setFont(fontPrincipal);
        tipoDeCamaLabel.setBounds(360, 110, 200, 30);
        add(tipoDeCamaLabel);
        
        tipoDeCamaTextField = new JTextField();
        tipoDeCamaTextField.setBounds(500, 110, 200, 30);
        add(tipoDeCamaTextField);
        
        // Disponibilidad
        JLabel disponibilidadLabel = new JLabel("Disponibilidad");
        disponibilidadLabel.setBounds(360, 140, 220, 30);
        disponibilidadLabel.setFont(fontPrincipal);
        add(disponibilidadLabel);
        
        String estados[] = {"Disponible", "Ocupado"};
        disponibleComboBox = new JComboBox(estados);
        disponibleComboBox.setBounds(500, 140, 200, 30);
        add(disponibleComboBox);
        
        // Amenities
        JLabel amenitiesLabel = new JLabel("Amenities");
        amenitiesLabel.setFont(fontPrincipal);
        amenitiesLabel.setBounds(360, 170, 200, 30);
        add(amenitiesLabel);
        
        amenitiesTextField = new JTextField();
        amenitiesTextField.setBounds(500, 170, 200, 30);
        add(amenitiesTextField);
        
        
        // Servicios
        JLabel serviciosLabel = new JLabel("Servicios");
        serviciosLabel.setFont(fontPrincipal);
        serviciosLabel.setBounds(360, 200, 200, 30);
        add(serviciosLabel);
        
        serviciosTextField = new JTextField();
        serviciosTextField.setBounds(500, 200, 200, 30);
        add(serviciosTextField);
        
        // Estado Limpieza
        JLabel estadoLimpiezaLabel = new JLabel("Estado Limpieza");
        estadoLimpiezaLabel.setBounds(360, 230, 220, 30);
        estadoLimpiezaLabel.setFont(fontPrincipal);
        add(estadoLimpiezaLabel);
        
        limpioRadioBtn = new JRadioButton("Limpio");
        limpioRadioBtn.setBounds(500, 230, 100, 30);
        limpioRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(limpioRadioBtn);
        
        desordenadoRadioBtn = new JRadioButton("Desordenado");
        desordenadoRadioBtn.setBounds(580, 230, 150, 30);
        desordenadoRadioBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        add(desordenadoRadioBtn);
        
        ButtonGroup bgLimpieza =  new ButtonGroup();
        bgLimpieza.add(limpioRadioBtn);
        bgLimpieza.add(desordenadoRadioBtn);
        
        // Precio 
        // ** ParseInt() **
        JLabel precioLabel = new JLabel("Precio");
        precioLabel.setFont(fontPrincipal);
        precioLabel.setBounds(360, 270, 200, 30);
        add(precioLabel);
        
        precioTextField = new JTextField();
        precioTextField.setBounds(500, 270, 200, 30);
        add(precioTextField);
        
        // BTN ENVIAR
        enviarBtn = new JButton("Enviar");
        enviarBtn.setFont(fontPrincipal);
        enviarBtn.setBounds(360, 330, 150, 30);
        enviarBtn.setBackground(Color.decode("#2c4536"));
        enviarBtn.setBorderPainted(false);
        enviarBtn.setOpaque(true);
        enviarBtn.setForeground(Color.WHITE);
        enviarBtn.addActionListener(this);
        add(enviarBtn);
        
        //  BTN CANCELAR
        cancelarBtn = new JButton("Cancelar");
        cancelarBtn.setFont(fontPrincipal);
        cancelarBtn.setBounds(550, 330, 150, 30);
        cancelarBtn.setBackground(Color.decode("#3c5f4a"));
        cancelarBtn.setBorderPainted(false);
        cancelarBtn.setOpaque(true);
        cancelarBtn.setForeground(Color.decode("#939393"));
        cancelarBtn.addActionListener(this);
        add(cancelarBtn);
        
        //TODO: MAYBE AGREGAR IMAGENES DINAMICAMENTE desde input
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == enviarBtn) {
            // limpioRadioBtn, desordenadoRadioBtn
            String idDomo = idDomoTextField.getText();
            String tipoDeCama = tipoDeCamaTextField.getText();
            String amenities = amenitiesTextField.getText();
            String servicios = serviciosTextField.getText();
            String Precio = precioTextField.getText();
            String disponible = (String) disponibleComboBox.getSelectedItem();
            
            String estadoLimpieza = null;
        
            if (limpioRadioBtn.isSelected()) {
                estadoLimpieza = "Limpio";
             } else if(desordenadoRadioBtn.isSelected()){
                 estadoLimpieza = "Desordenado";
                }
                // else "Mandar un alerta selecionar un radio Btn
                
            try {
                // Logica BBDD Supongo, pronto sabremos
                JOptionPane.showMessageDialog(null,"Nuevo Domo agregrado exitosamente");
                
                setVisible(false);
                
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            setVisible(false);
        }
    
    }
    
    public static void main(String[] args) {
        new Domo();
    }
}
