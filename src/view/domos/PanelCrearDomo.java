package view.domos;

import javax.swing.*;
import java.awt.*;
import controller.DomoController;


public class PanelCrearDomo extends JPanel {

    private JTextField domoIdTextField,disponibilidadTextField, precioTextField, amenitiesTextField, serviciosTextField;
    private JComboBox<String> limpiezaComboBox;
    private JComboBox<String> tipoDeCamaComboBox;
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
        
        // Texts fiels/campos
        domoIdTextField = new JTextField(20);
        disponibilidadTextField = new JTextField(20);
        String[] limpiezaOpciones = {"Ordenado", "Desordenado"};
        limpiezaComboBox = new JComboBox<>(limpiezaOpciones);
        String[] camaOpciones = {"Standar", "King", "Queen"};
        tipoDeCamaComboBox = new JComboBox<>(camaOpciones);
        precioTextField = new JTextField(20);
        amenitiesTextField = new JTextField(20);
        serviciosTextField = new JTextField(20);

        String[] lbls = {"Domo Id", "Disponibilidad", "Limpieza Status", "Tipo de cama", "Precio", "Amenities", "Servicios"};
        Component[] TextFields = {domoIdTextField, disponibilidadTextField, limpiezaComboBox, tipoDeCamaComboBox, precioTextField, amenitiesTextField, serviciosTextField};

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
                int domoId = Integer.parseInt(domoIdTextField.getText());
                String disponibilidad = disponibilidadTextField.getText();
                String limpieza = (String) limpiezaComboBox.getSelectedItem();
                String tipoCama = (String) tipoDeCamaComboBox.getSelectedItem();
                int precio = Integer.parseInt(precioTextField.getText());
                String amenities = amenitiesTextField.getText();
                String servicios = serviciosTextField.getText();

                DomoController controller = new DomoController();
                controller.crearDomo(domoId, disponibilidad, limpieza, tipoCama, precio, amenities, servicios);

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
        domoIdTextField.setText("");
        disponibilidadTextField.setText("");
        limpiezaComboBox.setSelectedIndex(0);
        tipoDeCamaComboBox.setSelectedIndex(0);
        precioTextField.setText("");
        amenitiesTextField.setText("");
        serviciosTextField.setText("");
    }
}
