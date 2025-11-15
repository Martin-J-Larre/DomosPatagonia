package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarEmpleadosAdmin extends JPanel {

    private JTable tablaAdmins;
    private DefaultTableModel modeloTabla;

    private JComboBox<String> comboIdiomas;
    private JTextField tituloTextField;
    private JButton btnFiltrar;

    private String[] columnas = {
            "ID Usuario Admin",
            "Credencial",
            "Idiomas",
            "Título",
            "Nombre",
            "Apellido"
    };

    public PanelListarEmpleadosAdmin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Listar Empleados Administradores");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo, BorderLayout.NORTH);

        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaAdmins = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaAdmins);

        add(scroll, BorderLayout.CENTER);

        // FILTRO
        JPanel filtros = new JPanel(new FlowLayout(FlowLayout.LEFT));

        filtros.add(new JLabel("Filtrar por título:"));
        tituloTextField = new JTextField(12);
        filtros.add(tituloTextField);

        filtros.add(new JLabel("Idioma:"));
        comboIdiomas = new JComboBox<>(new String[]{
                "Todos",
                "Inglés",
                "Francés",
                "Portugues",
                "Italiano",
                "Japones"
        });
        filtros.add(comboIdiomas);

        btnFiltrar = new JButton("Filtrar");
        filtros.add(btnFiltrar);

        add(filtros, BorderLayout.SOUTH);
    }

    public JTable getTablaAdmins(){ 
        return tablaAdmins; 
    }
    
    public DefaultTableModel getModeloTabla(){ 
        return modeloTabla; 
    }
    
    public JComboBox<String> getComboIdiomas(){ 
        return comboIdiomas; 
    }
    
    public JTextField getTxtTitulo(){ 
        return tituloTextField; 
    }
    
    public JButton getBtnFiltrar(){ 
        return btnFiltrar; 
    }
}
