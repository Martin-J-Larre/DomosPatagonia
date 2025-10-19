
package domospatagonia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//###### Terminar Investigar mas sobre JTable y mejorar este modulo########



/**
 *
 * @author martin
 */
public class ListarEmpleados extends JFrame implements ActionListener{
    JButton volverBtn;
    
    //FakeData Domo
    // Data to be displayed in the JTable
    String[][] data = {
            { "55", "Juan", "Garcia", "3000000", "45", "Hombre", "123-123-456", "Guia Turismo", "Juancito@mail.com" },
            { "40", "Jose", "Piero", "3400098", "32", "Hombre", "123-567-234", "Empleado Limpieza", "Josecito@mail.com" }};
    
    // Column Names
    String[] columnNames = { "Id Empleado", "Nombre", "Apellido", "DNI", "Edad", "genero", "Teléfono", "Area", "Email" };

    public ListarEmpleados() {
        
    // set Frame
    setBounds(200, 200, 1020, 584);
    setLayout(null);
    
    
    // Fuente
    Font fontPrincipal = new Font("Arial", Font.PLAIN, 12);
    
    
    // inicializamos tabla
//    tabla = new JTable(data, columnNames);
//    tabla.setBounds(100, 100, 500, 400);
//    
//    add(tabla);

    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    
    JTable table = new JTable(model);
    table.setFont(fontPrincipal);
    
    JScrollPane scrollPanel =  new JScrollPane(table);
    scrollPanel.setBounds(10, 40, 1000, 400);
    
    add(scrollPanel);
    
    //Traer la data de la BBDD
//    try {
//            
//    } catch (Exception e) {
//    }
//    

    //  BTN Volver
    volverBtn = new JButton("Volver");
    volverBtn.setFont(fontPrincipal);
    volverBtn.setBounds(310, 450, 130, 30);
    volverBtn.setBackground(Color.decode("#3c5f4a"));
    volverBtn.setBorderPainted(false);
    volverBtn.setOpaque(true);
    volverBtn.setForeground(Color.decode("#939393"));
    volverBtn.addActionListener(this);
    add(volverBtn);
    setVisible(true);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Recepcion();
    }
    
    public static void main(String[] args) {
        new ListarEmpleados();
    }
}
