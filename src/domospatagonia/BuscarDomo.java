
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
public class BuscarDomo extends JFrame implements ActionListener{
    JButton volverBtn, buscarBtn;
    JComboBox tipoDeCamaCB;
    JCheckBox disponibleCheckBox;
    
    //FakeData Domo
    // Data to be displayed in the JTable
    String[][] data = {
            { "5", "Dispoible", "Limpio", "King", "1000" },
            { "10", "Ocupado", "Desordenado", "Queen", "900"},
            { "15", "Dispoible", "Limpio", "King", "1000" },
            { "12", "Ocupado", "Desordenado", "Queen", "900" }, 
            { "22", "Disponible", "Limpio", "Queen", "900" }, 
            { "38", "Ocupado", "Desordenado", "Queen", "900" }};
    
    // Column Names
    String[] columnNames = { "IdDomo", "Disponible", "estado limpieza", "Tipo de cama", "Precio" };

    public BuscarDomo() {
        
    // set Frame
    setBounds(200, 200, 1020, 584);
    setLayout(null);
    
    // Fuente
    Font fontPrincipal = new Font("Arial", Font.PLAIN, 12);
    
    // Titulo
    JLabel tituloLabel = new JLabel("Buscar Domo");
    tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
    tituloLabel.setBounds(400, 50, 1000, 40);
    add(tituloLabel);
    
    // Tipo de cama filter ---> cambiar a Camel case
    JLabel tipo_de_camaLabel = new JLabel("Tipo de cama");
    tipo_de_camaLabel.setFont(fontPrincipal);
    tipo_de_camaLabel.setBounds(50, 50, 200, 30);
    add(tipo_de_camaLabel);
    
    tipoDeCamaCB = new JComboBox(new String[] {"Queen", "King"});
    tipoDeCamaCB.setBounds(150, 50, 150, 30);
    add(tipoDeCamaCB);
    
    // disponible filter
    disponibleCheckBox = new JCheckBox("Solo Disponibles");
    disponibleCheckBox.setBounds(150, 100, 150, 30);
    add(disponibleCheckBox);
    
    //Tabla
    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    
    JTable table = new JTable(model);
    table.setFont(fontPrincipal);
    
    JScrollPane scrollPanel =  new JScrollPane(table);
    scrollPanel.setBounds(400, 100, 500, 200);
    
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
    volverBtn.setBounds(400, 350, 130, 30);
    volverBtn.setBackground(Color.decode("#3c5f4a"));
    volverBtn.setBorderPainted(false);
    volverBtn.setOpaque(true);
    volverBtn.setForeground(Color.decode("#939393"));
    volverBtn.addActionListener(this);
    add(volverBtn);
    setVisible(true);
    
    //  BTN Buscar
    buscarBtn = new JButton("Buscar");
    buscarBtn.setFont(fontPrincipal);
    buscarBtn.setBounds(600, 350, 130, 30);
    buscarBtn.setBackground(Color.decode("#3c5f4a"));
    buscarBtn.setBorderPainted(false);
    buscarBtn.setOpaque(true);
    buscarBtn.setForeground(Color.decode("#939393"));
    // buscarBtn.addActionListener(this);
    add(buscarBtn);
    setVisible(true);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Recepcion();
    }
    
    public static void main(String[] args) {
        new BuscarDomo();
    }
}
