package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarEmpleadosAdmin extends JPanel {

    // Tabla
    private JTable tablaAdmins;
    private DefaultTableModel modeloTabla;

    // FILTROS (DECLARACION)
    private JTextField txtFiltroNombre;
    private JTextField txtFiltroApellido;
    private JTextField txtFiltroIdioma;
    private JButton btnFiltrar;

    private String[] columnas = {
            "Nombre",
            "Apellido",
            "ID Usuario Admin",
            "Credencial",
            "Idiomas",
            "Título"
            
    };

    public PanelListarEmpleadosAdmin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        // Titulo
        JLabel titulo = new JLabel("Listar Empleados Administradores");
        titulo.setFont(new Font("Arial", Font.BOLD, 22));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(titulo, BorderLayout.NORTH);
        
        // Tabla
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaAdmins = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaAdmins);
        add(scroll, BorderLayout.CENTER);

        // Panel FILTROS
        JPanel filtros = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // crear TxtField y btn filtrar
        txtFiltroNombre = new JTextField(10);
        txtFiltroApellido = new JTextField(10);
        txtFiltroIdioma = new JTextField(10);
        btnFiltrar = new JButton("Filtrar");
        
        // Agregar al panel de filtros
        filtros.add(new JLabel("Nombre:"));
        filtros.add(txtFiltroNombre);
        
        filtros.add(new JLabel("Apellido:"));
        filtros.add(txtFiltroApellido);
        
        filtros.add(new JLabel("Idioma"));
        filtros.add(txtFiltroIdioma);
 
        filtros.add(btnFiltrar);
       
        // Agregar el panel filtro
        add(filtros, BorderLayout.SOUTH);
    }

    // Getters para contoller 

    public JTable getTablaAdmins() {
        return tablaAdmins;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public JTextField getTxtFiltroNombre() {
        return txtFiltroNombre;
    }

    public JTextField getTxtFiltroApellido() {
        return txtFiltroApellido;
    }

    public JTextField getTxtFiltroIdioma() {
        return txtFiltroIdioma;
    }

    public JButton getBtnFiltrar() {
        return btnFiltrar;
    }
    
    
    public String getFiltroNombre() { return txtFiltroNombre.getText().trim(); }
    public String getFiltroApellido() { return txtFiltroApellido.getText().trim(); }
    public String getFiltroIdiomas() { return txtFiltroIdioma.getText().trim(); }
    
    public void actualizarTabla(java.util.List<model.ListarEmpleadoAdminModel> lista) {
        modeloTabla.setRowCount(0);
        for (model.ListarEmpleadoAdminModel leam : lista) {
            modeloTabla.addRow(new Object[]{
                leam.getNombreEmpleado(),
                leam.getApellidoEmpleado(),
                leam.getIdUsuarioAdmin(),
                leam.getCredencial(),
                leam.getIdiomas(),
                leam.getTitulo()
            });
        }
    }
    
}
