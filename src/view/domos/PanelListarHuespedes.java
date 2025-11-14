package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarHuespedes extends JPanel {

    private JTable tablaHuespedes;
    private DefaultTableModel modeloTabla;

    private JTextField txtFiltroNombre;
    private JTextField txtFiltroApellido;
    private JButton btnBuscar;

    private String[] columnas = {
        "id_huesped", "nombre", "apellido", "dni", "genero", "direccion", "provincia", "pais",
        "checkin_status", "checkout_status", "deposito", "id_domo", "id_guia_turismo"
    };

    public PanelListarHuespedes(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        // Tabla
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaHuespedes = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaHuespedes);
        add(scroll, BorderLayout.CENTER);

        // Filtros
        JPanel panelFiltros = new JPanel(new FlowLayout(FlowLayout.LEFT));

        txtFiltroNombre = new JTextField(10);
        txtFiltroApellido = new JTextField(10);
        btnBuscar = new JButton("Buscar");

        panelFiltros.add(new JLabel("Nombre:"));
        panelFiltros.add(txtFiltroNombre);
        panelFiltros.add(new JLabel("Apellido:"));
        panelFiltros.add(txtFiltroApellido);
        panelFiltros.add(btnBuscar);

        add(panelFiltros, BorderLayout.SOUTH);
    }

    // Getters para controlador
    public JTable getTablaHuespedes() { return tablaHuespedes; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }
    public JTextField getTxtFiltroNombre() { return txtFiltroNombre; }
    public JTextField getTxtFiltroApellido() { return txtFiltroApellido; }
    public JButton getBtnBuscar() { return btnBuscar; }

    public String getFiltroNombre() { return txtFiltroNombre.getText().trim(); }
    public String getFiltroApellido() { return txtFiltroApellido.getText().trim(); }

    public void actualizarTabla(java.util.List<model.HuespedModel> lista) {
        modeloTabla.setRowCount(0);
        for (model.HuespedModel h : lista) {
            modeloTabla.addRow(new Object[]{
                h.getIdHuesped(),
                h.getNombre(),
                h.getApellido(),
                h.getDni(),
                h.getGenero(),
                h.getDireccion(),
                h.getProvincia(),
                h.getPais(),
                h.isCheckinStatus(),
                h.isCheckoutStatus(),
                h.getDeposito(),
                h.getIdDomo(),
                h.getIdGuiaTurismo()
            });
        }
    }
}
