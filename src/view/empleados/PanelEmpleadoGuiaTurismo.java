package view.empleados;

import javax.swing.*;
import java.awt.*;
import controller.EmpleadoGuiaTurimosController;

public class PanelEmpleadoGuiaTurismo extends JPanel {

    private JTextField especialidadTextField, camionetaTextField, domoAsignadoTextField;
    private JComboBox<String> temporadaComboBox;
    private JButton enviarBtn, volverBtn;
    

    public PanelEmpleadoGuiaTurismo(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Agregar Guía de Turismo", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(50, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Jpanel con grid para el form
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // TextFiels
        especialidadTextField = new JTextField(20);

        // JComboBox parav temporada
        String[] estaciones = {"Verano", "Otoño", "Primavera", "Invierno"};
        temporadaComboBox = new JComboBox<>(estaciones);
        temporadaComboBox.setPreferredSize(new Dimension(220, 25));

        camionetaTextField = new JTextField(20);
        domoAsignadoTextField = new JTextField(20);

        // Text JLbs
        String[] jlbs = {
            "Especialidad",
            "Temporada",
            "Camioneta",
            "Domo Asignado"
        };

        // TextFileds
        Component[] TextFileds = {
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
        panelBotones.add(enviarBtn);
        panelBotones.add(volverBtn);
        add(panelBotones, BorderLayout.SOUTH);
        
        
        
        EmpleadoGuiaTurimosController controller = new EmpleadoGuiaTurimosController();
        
        
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
                String area_trabajo = PanelEmpleadoInicio.getAreaSeleccionada();
                String turno = PanelEmpleadoInicio.turnoTextField.getText();

                // Estos datos los agregamos desde el formulario agregar Guía Turismo
                String especialidad = especialidadTextField.getText();
                String temporada = (String) temporadaComboBox.getSelectedItem();
                String camioneta = camionetaTextField.getText();
                String domoAsignado = domoAsignadoTextField.getText();

                boolean exito = controller.guardarEmpleadoCompleto(
                    apellido, nombre, dni, edad, genero, telefono, email, area_trabajo, turno, especialidad, temporada, camioneta, domoAsignado
                );
                
                if (exito) {
                    JOptionPane.showMessageDialog(this, "Empleado de Guía Turismo guardado correctamente.");
                    resetFormGuia(); // limpia el form del  crear EmpleadoLimpieza en este panel
                    resetFormEmpleado(); // limpia form crear/agregar empleado del PanelEmpleadoInicio
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar el empleado Gía Turismo.");
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
            }
        });
        
        // Escucha el evento en el botón "Volver" y vuelve al form empleado principal
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));

    }

    private void resetFormGuia() {
        especialidadTextField.setText("");
        temporadaComboBox.setSelectedIndex(0);
        camionetaTextField.setText("");
        domoAsignadoTextField.setText("");
    }
            private void resetFormEmpleado() {
        PanelEmpleadoInicio.resetCampos();
    } 
}
