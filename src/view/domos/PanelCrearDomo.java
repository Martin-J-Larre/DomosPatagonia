package view.domos;

import javax.swing.*;
import java.awt.*;
import controller.DomoController;

// *************************************** //
// Todo: 1 Array con opciones comboBox 
// 2 - método crearDomo en Domo controller
// 3 - método crearDomo en Domo Model
// 4 - Actualizar PanelDomo Admin
// *************************************** //

public class PanelCrearDomo extends JPanel {

    private JTextField disponibilidadTextField, precioTextField, amenitiesTextField, serviciosTextField;
    private JComboBox<String> limpiezaComboBox;
    private JButton enviarBtn, volverBtn;

    public PanelCrearDomo(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Crear Nuevo Domo", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 22));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel form con grid
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        disponibilidadTextField = new JTextField(20);
        String[] limpiezaOpciones = {"Ordenado", "Desordenado"};
        limpiezaComboBox = new JComboBox<>(limpiezaOpciones);
        precioTextField = new JTextField(20);
        amenitiesTextField = new JTextField(20);
        serviciosTextField = new JTextField(20);

        String[] lbls = {"Disponibilidad", "Limpieza Status", "Precio", "Amenities", "Servicios"};
        Component[] TextFields = {disponibilidadTextField, limpiezaComboBox, precioTextField, amenitiesTextField, serviciosTextField};

        for (int i = 0; i < lbls.length; i++) {
            gbc.gridx = 0; gbc.gridy = i;
            formPanel.add(new JLabel(lbls[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(TextFields[i], gbc);
        }

        add(formPanel, BorderLayout.CENTER);

        // Btns
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 15));
        buttonPanel.setBackground(Color.WHITE);

        enviarBtn = new JButton("Enviar");
        volverBtn = new JButton("Volver");

        // Escucha volver y va al Inicio Panel con la fotito
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));

        // Escucha enviar, captura data y va a controller y BBDD
        enviarBtn.addActionListener(e -> {
            try {
                String disponibilidad = disponibilidadTextField.getText();
                String limpieza = (String) limpiezaComboBox.getSelectedItem();
                int precio = Integer.parseInt(precioTextField.getText());
                String amenities = amenitiesTextField.getText();
                String servicios = serviciosTextField.getText();

                DomoController controller = new DomoController();
                controller.crearDomo(disponibilidad, limpieza, precio, amenities, servicios);

                JOptionPane.showMessageDialog(this, "Domo creado correctamente.");
                limpiarCampos();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al crear el domo: " + ex.getMessage());
            }
        });

        buttonPanel.add(enviarBtn);
        buttonPanel.add(volverBtn);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void limpiarCampos() {
        disponibilidadTextField.setText("");
        limpiezaComboBox.setSelectedIndex(0);
        precioTextField.setText("");
        amenitiesTextField.setText("");
        serviciosTextField.setText("");
    }
}
