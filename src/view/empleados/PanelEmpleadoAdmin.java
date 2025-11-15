package view.empleados;

import javax.swing.*;
import java.awt.*;
import controller.EmpleadoController;

public class PanelEmpleadoAdmin extends JPanel {

    private JTextField credencialTextField, idiomasTextField, tituloTextField, domoAsignadoTextField;
    private JButton enviarBtn, volverBtn;
  

    public PanelEmpleadoAdmin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Agregar Empleado Administrador", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel con grid para el formulario
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Crear TextFiels 
        credencialTextField = new JTextField(20);
        idiomasTextField = new JTextField(20);
        tituloTextField = new JTextField(20);
        domoAsignadoTextField = new JTextField(20);
     

        String[] lbls = {
            "Credenciales",
            "Idiomas",
            "Título",
            "Domo Asignado",
        };

        JTextField[] Textfiels = {
            credencialTextField,
            idiomasTextField,
            tituloTextField,
            domoAsignadoTextField,
        };

        for (int i = 0; i < lbls.length; i++) {
            gbc.gridx = 0; gbc.gridy = i;
            formPanel.add(new JLabel(lbls[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(Textfiels[i], gbc);
        }

        add(formPanel, BorderLayout.CENTER);

        // Panel inferior para los botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(Color.WHITE);

        enviarBtn = new JButton("Enviar");
        volverBtn = new JButton("Volver al formulario Empleado");

        // Escucha el evento en el botón "Volver" y regresa al form Empleado Inicio
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));

        // Escucha el evento en el botón "Enviar" captura los campos y usa el controllador para guardar los datos en Tabla empleado y empleado admin
        enviarBtn.addActionListener(e -> {
            try {
                // Datos generales del Panel Empleado
                String apellido = PanelEmpleadoInicio.apellidoTextField.getText();
                String nombre = PanelEmpleadoInicio.nombreTextField.getText();
                int dni = Integer.parseInt(PanelEmpleadoInicio.dniTextField.getText());
                int edad = Integer.parseInt(PanelEmpleadoInicio.edadTextField.getText());
                String genero = PanelEmpleadoInicio.getGeneroSeleccionado();
                String telefono = PanelEmpleadoInicio.telefonoTextField.getText();
                String email = PanelEmpleadoInicio.emailTextField.getText();
                String area = PanelEmpleadoInicio.getAreaSeleccionada();
                String turno = PanelEmpleadoInicio.turnoTextField.getText();

                // Datos  del administrador
                String credenciales = credencialTextField.getText();
                String idiomas = idiomasTextField.getText();
                String titulo = tituloTextField.getText();
                String domoAsignado = domoAsignadoTextField.getText();

                // Guardar en BD mediante el controlador
                EmpleadoController controller = new EmpleadoController();
                controller.agregarEmpleadoAdmin(apellido, nombre, dni, edad, genero, telefono, email, area, turno,
                        credenciales, idiomas, titulo, domoAsignado);

                JOptionPane.showMessageDialog(this, "Empleado Administrador agregado correctamente.");
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
        credencialTextField.setText("");
        idiomasTextField.setText("");
        tituloTextField.setText("");
        domoAsignadoTextField.setText("");
    }
}

