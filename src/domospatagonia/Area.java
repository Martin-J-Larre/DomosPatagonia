
package domospatagonia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

// Aqui tiene que haber un filtro de empleados por Area TODO!
/**
 *
 * @author martin
 */
public class Area extends JFrame implements ActionListener{
    JButton volverBtn;
    
    //FakeData Domo
    // Data to be displayed in the JTable
    String[][] data = {
            { "Limpieza", "10", "Hernan", "Fulano", },
            { "Admin", "16", "Juan", "Mengano"},
            { "Guia Turismo", "23", "Ricardo", "Lopez"}, 
            { "Limpieza", "7", "Jose", "Caciri"},
            { "Guia Tursmo", "38", "Pedro", "Di Maria"}, 
            };
    
    // Column Names
    String[] columnNames = { "Area", "Empleado Id", "Nombre", "Apellido" };

    public Area() {
        
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
    scrollPanel.setBounds(300, 40, 500, 400);
    
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
        new Area();
    }
}
