package view.domos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class PanelListarGuiasTurismo extends JPanel {

    private JTable tablaGuias;
    private DefaultTableModel modeloTabla;

    private JComboBox<String> comboEspecialidad;
    private JComboBox<String> comboTemporada;
    private JButton btnBuscar;

    private String[] columnas = {
        "id_guia", "nombre", "apellido", "dni", "especialidad", "temporada", "camioneta", "domo_asignado"
    };

    public PanelListarGuiasTurismo(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        // Tabla
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaGuias = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaGuias);
        add(scroll, BorderLayout.CENTER);

        // Filtros
        JPanel panelFiltros = new JPanel(new FlowLayout(FlowLayout.LEFT));

        comboEspecialidad = new JComboBox<>(new String[]{"Todas", "Montaña", "Lagos", "Parques Nacionales"});
        comboTemporada = new JComboBox<>(new String[]{"Todas", "Verano", "Otoño", "Primavera", "Invierno"});
        btnBuscar = new JButton("Buscar");

        panelFiltros.add(new JLabel("Especialidad"));
        panelFiltros.add(comboEspecialidad);
        panelFiltros.add(new JLabel("Temporada"));
        panelFiltros.add(comboTemporada);
        panelFiltros.add(btnBuscar);

        add(panelFiltros, BorderLayout.SOUTH);
    }

    // Getters para controlador
    public JTable getTablaGuias() { return tablaGuias; }
    public DefaultTableModel getModeloTabla() { return modeloTabla; }
    public JComboBox<String> getComboEspecialidad() { return comboEspecialidad; }
    public JComboBox<String> getComboTemporada() { return comboTemporada; }
    public JButton getBtnBuscar() { return btnBuscar; }

    public String getEspecialidadSeleccionada() { return (String) comboEspecialidad.getSelectedItem(); }
    public String getTemporadaSeleccionada() { return (String) comboTemporada.getSelectedItem(); }

    public void actualizarTabla(java.util.List<model.GuiaTurismoModel> lista) {
        modeloTabla.setRowCount(0);
        for (model.GuiaTurismoModel g : lista) {
            modeloTabla.addRow(new Object[]{
                g.getIdGuia(),
                g.getNombre(),
                g.getApellido(),
                g.getDni(),
                g.getEspecialidad(),
                g.getTemporada(),
                g.getCamioneta(),
                g.getDomoAsignado()
            });
        }
    }
}
