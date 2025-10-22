
package domospatagonia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



// Plantear editar/eliminar desde una campo cada fila
/**
 *
 * @author martin
 */
public class ListarGuiaTurismo extends JFrame implements ActionListener{
    JButton volverBtn, buscarBtn;
    JComboBox especialidadCB, temporadaCB;
    JCheckBox disponibleCheckBox;
    
//    JTextField numGuiaTextField, camionetaTextField, domoAsignadoTextField;
//    JComboBox temporadaComboBox;

    
    
    //FakeData Domo
    // Data to be displayed in the JTable
    String[][] data = {
            { "5", "Montaña", "Jeep 4x4","Verano", "5" },
            { "10", "Lagos y Montañas", "RAM 4X4", "Invierno", "7"},
            { "15", "Parques Nacionales", "FORD F100", "Primavera/Verano","10"}
    };
    
    // Column Names
    String[] columnNames = { "IdGuia", "Especialidad", "Camioneta", "Temporada","Domo Asignado"};

    public ListarGuiaTurismo() {
        
    // set Frame
    setBounds(200, 200, 1020, 584);
    setLayout(null);
    
    // Fuente
    Font fontPrincipal = new Font("Arial", Font.PLAIN, 12);
    
    // Titulo
    JLabel tituloLabel = new JLabel("Lista Guía de Turismo");
    tituloLabel.setFont(new Font("Arial", Font.BOLD, 18));
    tituloLabel.setBounds(400, 50, 1000, 40);
    add(tituloLabel);
    
    // Especialidad filter 
    JLabel especialidadLabel = new JLabel("Especialidad");
    especialidadLabel.setFont(fontPrincipal);
    especialidadLabel.setBounds(50, 100, 200, 30);
    add(especialidadLabel);
    
    especialidadCB = new JComboBox(new String[] {"Montaña", "Lagos y Montañas", "Parques Nacionales"});
    especialidadCB.setBounds(150, 100, 150, 30);
    add(especialidadCB);
    
    // disponible filter
    JLabel temporadaLabel = new JLabel("Temporada");
    temporadaLabel.setFont(fontPrincipal);
    temporadaLabel.setBounds(50, 150, 200, 30);
    add(temporadaLabel);
    
    temporadaCB = new JComboBox(new String[] {"Verano", "Invierno", "Primavera", "Otoño", "Primavera/Verano", "Invierno/Otoño"});
    temporadaCB.setBounds(150, 150, 150, 30);
    add(temporadaCB);
    
    
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
    
     // BTN Buscar
    buscarBtn = new JButton("Buscar");
    buscarBtn.setFont(fontPrincipal);
    buscarBtn.setBounds(600, 350, 130, 30);
    buscarBtn.setBackground(Color.decode("#3c5f4a"));
    buscarBtn.setBorderPainted(false);
    buscarBtn.setOpaque(true);
    buscarBtn.setForeground(Color.decode("#939393"));
    buscarBtn.addActionListener(this);
    add(buscarBtn);
    setVisible(true);
    
    
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == buscarBtn) {
            // La maguia no esta disponible aquí yet

   
        } else if (ae.getSource() == volverBtn) {
            setVisible(false);
            new Recepcion();
        }

    }
    
    public static void main(String[] args) {
        new ListarGuiaTurismo();
    }
}

