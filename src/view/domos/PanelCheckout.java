package view.domos;

import model.CheckoutDAO;
import model.CheckoutModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class PanelCheckout extends JPanel {

    private JTextField txtBuscarNombre;
    private JButton btnBuscar;
    private JTable tablaHuespedes;
    private DefaultTableModel modeloTabla;
    private JComboBox<String> comboCheckout;
    private JButton btnActualizarCheckout;

    private CheckoutDAO dao;

    public PanelCheckout(CardLayout cl, JPanel parent) {
        dao = new CheckoutDAO();

        setLayout(new BorderLayout());

        // Panel superior: Buscador
        JPanel panelBuscar = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBuscar.add(new JLabel("Buscar por nombre:"));
        txtBuscarNombre = new JTextField(15);
        panelBuscar.add(txtBuscarNombre);
        btnBuscar = new JButton("Buscar");
        panelBuscar.add(btnBuscar);
        add(panelBuscar, BorderLayout.NORTH);

        // Tabla
        String[] columnas = {"ID", "Nombre", "Apellido", "Domo Asignado", "Checkout"};
        modeloTabla = new DefaultTableModel(columnas,0);
        tablaHuespedes = new JTable(modeloTabla);
        JScrollPane scroll = new JScrollPane(tablaHuespedes);
        add(scroll, BorderLayout.CENTER);

        // Panel inferior: Combo y botón actualizar
        JPanel panelInferior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        comboCheckout = new JComboBox<>(new String[]{"Pendiente", "Realizado"});
        panelInferior.add(new JLabel("Estado Checkout:"));
        panelInferior.add(comboCheckout);

        btnActualizarCheckout = new JButton("Actualizar Checkout");
        panelInferior.add(btnActualizarCheckout);
        add(panelInferior, BorderLayout.SOUTH);

        // Listeners
        btnBuscar.addActionListener(e -> buscarHuesped());
        btnActualizarCheckout.addActionListener(e -> actualizarCheckout());
    }

    private void buscarHuesped() {
        String nombre = txtBuscarNombre.getText().trim();
        List<CheckoutModel> lista = dao.buscarHuespedPorNombre(nombre);

        modeloTabla.setRowCount(0);
        for(CheckoutModel h : lista) {
            modeloTabla.addRow(new Object[]{
                h.getIdHuesped(),
                h.getNombre(),
                h.getApellido(),
                h.getIdDomo(),
                h.getCheckoutStatus()
            });
        }
    }

    private void actualizarCheckout() {
        int fila = tablaHuespedes.getSelectedRow();
        if(fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un huésped para actualizar.");
            return;
        }

        int idHuesped = (int) modeloTabla.getValueAt(fila,0);
        String nuevoEstado = comboCheckout.getSelectedItem().toString();

        if(nuevoEstado.equals("Realizado")) {
            dao.actualizarCheckout(idHuesped);

            // Actualizar tabla
            modeloTabla.setValueAt("Realizado", fila, 4);

            // Mostrar fecha
            String fecha = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
            JOptionPane.showMessageDialog(this, "Checkout realizado el: " + fecha);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione 'Realizado' para actualizar el checkout.");
        }
    }
}
