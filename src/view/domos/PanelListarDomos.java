package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarDomos extends JPanel {

    private JTable tablaDomos;
    private DefaultTableModel modeloTabla;

    private JCheckBox chkSoloDisponibles;
    private JComboBox<String> comboTipoCama;
    private JButton btnBuscar;

    private String[] columnas = {
        "id", "disponibilidad", "limpieza status", "precio",
        "tipo de cama", "amenities", "servicios", "Empleadolimpieza"
    };

    public PanelListarDomos(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        // Tabla
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaDomos = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaDomos);
        add(scroll, BorderLayout.CENTER);

        // Filtros
        JPanel panelFiltros = new JPanel(new FlowLayout(FlowLayout.LEFT));

        chkSoloDisponibles = new JCheckBox("Solo disponibles");
        comboTipoCama = new JComboBox<>(new String[]{"Todos", "Standard", "Queen", "King"});
        btnBuscar = new JButton("Buscar");

        panelFiltros.add(new JLabel("Tipo de cama:"));
        panelFiltros.add(comboTipoCama);
        panelFiltros.add(chkSoloDisponibles);
        panelFiltros.add(btnBuscar);

        add(panelFiltros, BorderLayout.SOUTH);
    }

    // Getters para el controlador MVC
    public JTable getTablaDomos() { return tablaDomos; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }
    public JCheckBox getChkSoloDisponibles() { return chkSoloDisponibles; }
    public JComboBox<String> getComboTipoCama() { return comboTipoCama; }
    public JButton getBtnBuscar() { return btnBuscar; }

    public String getTipoCamaSeleccionada() { return (String) comboTipoCama.getSelectedItem(); }
    public boolean isSoloDisponiblesSeleccionado() { return chkSoloDisponibles.isSelected(); }

    public void actualizarTabla(java.util.List<model.BuscarDomosModel> lista) {
        modeloTabla.setRowCount(0);
        for (model.BuscarDomosModel d : lista) {
            modeloTabla.addRow(new Object[]{
                d.getIdDomo(),
                d.getDisponibilidad(),
                d.getLimpiezaStatus(),
                d.getPrecio(),
                d.getTipoDeCama(),
                d.getAmenities(),
                d.getServicios(),
                d.getIdEmpleadoLimpieza()
            });
        }
    }
}
