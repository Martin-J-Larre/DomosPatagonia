package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarEmpleados extends JPanel {

    private JTable tablaEmpleados;
    private DefaultTableModel modeloTabla;

    private JTextField txtFiltro;
    private JButton btnFiltrar;

    private String[] columnas = {
            "id_empleado",
            "apellido",
            "nombre",
            "dni",
            "edad",
            "genero",
            "telefono",
            "area",
            "turno",
            "email"
    };

    public PanelListarEmpleados(CardLayout cl, JPanel parent) {

        setLayout(new BorderLayout());

        // Titulo #### TODO: Agregar Titulo a las otros paneles con tabla
        JLabel titulo = new JLabel("Listar empleados");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo, BorderLayout.NORTH);

        // Tabla
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaEmpleados = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaEmpleados);

        add(scroll, BorderLayout.CENTER);

        // filtros
        JPanel panelFiltro = new JPanel(new FlowLayout(FlowLayout.LEFT));

        panelFiltro.add(new JLabel("Buscar por nombre/apellido:"));

        txtFiltro = new JTextField(20);
        panelFiltro.add(txtFiltro);

        btnFiltrar = new JButton("Filtrar");
        panelFiltro.add(btnFiltrar);

        add(panelFiltro, BorderLayout.SOUTH);
    }

    public JTable getTablaEmpleados() {
        return tablaEmpleados;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public JTextField getTxtFiltro() {
        return txtFiltro;
    }

    public JButton getBtnFiltrar() {
        return btnFiltrar;
    }
}

