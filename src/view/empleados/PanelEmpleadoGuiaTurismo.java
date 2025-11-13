package view.empleados;

import javax.swing.*;
import java.awt.*;
import controller.EmpleadoController;

public class PanelEmpleadoGuiaTurismo extends JPanel {

    private JTextField numGuiaTextField, especialidadTextField, camionetaTextField, domoAsignadoTextField;
    private JComboBox<String> temporadaComboBox;
    private JButton enviarBtn, volverBtn;
    

    public PanelEmpleadoGuiaTurismo(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Agregar Guía de Turismo", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Jpanel con grid para el form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // TextFiels
        numGuiaTextField = new JTextField(20);
        especialidadTextField = new JTextField(20);

        // JComboBox parav temporada
        String[] estaciones = {"Verano", "Otoño", "Primavera", "Invierno"};
        temporadaComboBox = new JComboBox<>(estaciones);
        temporadaComboBox.setPreferredSize(new Dimension(220, 25));

        camionetaTextField = new JTextField(20);
        domoAsignadoTextField = new JTextField(20);

        // Text JLbs
        String[] jlbs = {
            "ID Guía Turismo",
            "Especialidad",
            "Temporada",
            "Camioneta",
            "Domo Asignado"
        };

        // TextFileds
        Component[] TextFileds = {
            numGuiaTextField,
            especialidadTextField,
            temporadaComboBox,
            camionetaTextField,
            domoAsignadoTextField
        };
        
        // Iterar e ir insertando en las columnas
        for (int i = 0; i < jlbs.length; i++) {
            gbc.gridx = 0; gbc.gridy = i;
            formPanel.add(new JLabel(jlbs[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(TextFileds[i], gbc);
        }

        add(formPanel, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(Color.WHITE);

        enviarBtn = new JButton("Enviar");
        volverBtn = new JButton("Volver al formulario Empleado");

        // Escucha el evento en el botón "Volver" y vuelve al form empleado principal
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));

        // Escucha del botón "Enviar" → guarda datos en BBDD para Empleado
        enviarBtn.addActionListener(e -> {
            try {
                // Estos datos los traemos desde el formulario agregar Empleados en el PanelEmpleadoInicio
                String nombre = PanelEmpleadoInicio.nombreTextField.getText();
                String apellido = PanelEmpleadoInicio.apellidoTextField.getText();
                int dni = Integer.parseInt(PanelEmpleadoInicio.dniTextField.getText());
                int edad = Integer.parseInt(PanelEmpleadoInicio.edadTextField.getText());
                String genero = PanelEmpleadoInicio.getGeneroSeleccionado();
                String telefono = PanelEmpleadoInicio.telefonoTextField.getText();
                String email = PanelEmpleadoInicio.emailTextField.getText();
                String area = PanelEmpleadoInicio.getAreaSeleccionada();
                String turno = PanelEmpleadoInicio.turnoTextField.getText();

                // Estos datos los agregamos desde el formulario agregar Guía Turismo
                int numGuia = Integer.parseInt(numGuiaTextField.getText());
                String especialidad = especialidadTextField.getText();
                String temporada = (String) temporadaComboBox.getSelectedItem();
                String camioneta = camionetaTextField.getText();
                int domoAsignado = Integer.parseInt(domoAsignadoTextField.getText());

                // LLamar al metodo en el controller para guardar en BBDD
                EmpleadoController controller = new EmpleadoController();
                controller.agregarEmpleadoGuia(apellido, nombre, dni, edad, genero, telefono, email, area, turno,
                        numGuia, especialidad, temporada, camioneta, domoAsignado);

                JOptionPane.showMessageDialog(this, "Empleado Guía Turismo agregado correctamente.");
                limpiarCampos();
                PanelEmpleadoInicio.resetCampos();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
            }
        });

        panelBotones.add(enviarBtn);
        panelBotones.add(volverBtn);

        add(panelBotones, BorderLayout.SOUTH);
    }

    private void limpiarCampos() {
        numGuiaTextField.setText("");
        especialidadTextField.setText("");
        temporadaComboBox.setSelectedIndex(0);
        camionetaTextField.setText("");
        domoAsignadoTextField.setText("");
    }
}
