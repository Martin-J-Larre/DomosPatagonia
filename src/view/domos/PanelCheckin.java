package view.domos;

import javax.swing.*;
import java.awt.*;
import controller.DomoController;

public class PanelCheckin extends JPanel {

    private JTextField nombreTextField, apellidoTextFiel, dniTextField, direccionTextField, provinciaTextField, paisTextField, depositoTextField, domoAsignadoTxtField, guiaAsignadoTxtFiel;
    private JRadioButton masculinoRadioBtn, femeninoRadioBtn;
    private JCheckBox checkInStatus, checkOutStatus;
    private JButton btnVolver, btnEnviar;

    public PanelCheckin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Formulario de Check-In", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 10, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel principal
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Creacion JTextFiels
        nombreTextField = new JTextField(20);
        apellidoTextFiel = new JTextField(20);
        dniTextField = new JTextField(20);
        direccionTextField = new JTextField(20);
        provinciaTextField = new JTextField(20);
        paisTextField = new JTextField(20);
        depositoTextField = new JTextField(20);
        domoAsignadoTxtField = new JTextField(20);
        guiaAsignadoTxtFiel = new JTextField(20);

        // Array para llenar las filas con los TextFiels y Lbls
        String[] Lbls = {"Nombre", "Apellido", "DNI", "Dirección", "Provincia", "País", "Depósito", "Domo Asignado", "Guía Asignado"};
        JTextField[] TextFiels = {nombreTextField, apellidoTextFiel, dniTextField, direccionTextField, provinciaTextField, paisTextField, depositoTextField, domoAsignadoTxtField, guiaAsignadoTxtFiel};

        // Agregar TextFiels a las  con un loop
        int fila = 0;
        for (int i = 0; i < Lbls.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = fila;
            formPanel.add(new JLabel(Lbls[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(TextFiels[i], gbc);
            fila++;
        }

        // Género con radio buttons
        masculinoRadioBtn = new JRadioButton("Masculino");
        femeninoRadioBtn = new JRadioButton("Femenino");
        ButtonGroup generoGroup = new ButtonGroup();
        generoGroup.add(masculinoRadioBtn);
        generoGroup.add(femeninoRadioBtn);

        masculinoRadioBtn.setBackground(Color.WHITE);
        femeninoRadioBtn.setBackground(Color.WHITE);

        JPanel generoPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
        generoPanel.setBackground(Color.WHITE);
        generoPanel.add(masculinoRadioBtn);
        generoPanel.add(femeninoRadioBtn);

        gbc.gridx = 0;
        gbc.gridy = fila;
        formPanel.add(new JLabel("Género:"), gbc);
        gbc.gridx = 1;
        formPanel.add(generoPanel, gbc);
        fila++;

        // Estados de check-in y check-out con checkBox
        checkInStatus = new JCheckBox("Check-In Realizado");
        checkOutStatus = new JCheckBox("Check-Out Realizado");
        checkInStatus.setBackground(Color.WHITE);
        checkOutStatus.setBackground(Color.WHITE);

        JCheckBox[] estados = {checkInStatus, checkOutStatus};
        String[] lblsEstado = {"Estado Check-In:", "Estado Check-Out:"};

        for (int i = 0; i < estados.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = fila;
            formPanel.add(new JLabel(lblsEstado[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(estados[i], gbc);
            fila++;
        }

        add(formPanel, BorderLayout.CENTER);

        // Panel para Botones inferiores
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 15));
        buttonPanel.setBackground(Color.WHITE);

        btnEnviar = new JButton("Enviar");
        btnVolver = new JButton("Volver al inicio");

        // Volver al inicio (Panel con foto de domos)
        btnVolver.addActionListener(e -> cl.show(parent, "inicio"));

        // Dispara la captura de la data y la envia a la bbdd con el controller
        btnEnviar.addActionListener(e -> {
            try {
                String nombre = nombreTextField.getText();
                String apellido = apellidoTextFiel.getText();
                String dni = dniTextField.getText();
                String genero = masculinoRadioBtn.isSelected() ? "Masculino" :
                                (femeninoRadioBtn.isSelected() ? "Femenino" : "No especificado");
                String direccion = direccionTextField.getText();
                String provincia = provinciaTextField.getText();
                String pais = paisTextField.getText();
                boolean checkIn = checkInStatus.isSelected();
                boolean checkOut = checkOutStatus.isSelected();
                int deposito = Integer.parseInt(depositoTextField.getText());
                int domoAsignado = Integer.parseInt(domoAsignadoTxtField.getText());
                int guiaAsignado = Integer.parseInt(guiaAsignadoTxtFiel.getText());

                DomoController domoController = new DomoController();
                domoController.crearCheckin(nombre, apellido, dni, genero, direccion, provincia, pais, checkIn, checkOut, deposito, domoAsignado, guiaAsignado);

                JOptionPane.showMessageDialog(this, "Check-In guardado correctamente.");
                resetearCampos();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
            }
        });

        buttonPanel.add(btnEnviar);
        buttonPanel.add(btnVolver);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void resetearCampos() {
        nombreTextField.setText("");
        apellidoTextFiel.setText("");
        dniTextField.setText("");
        direccionTextField.setText("");
        provinciaTextField.setText("");
        paisTextField.setText("");
        depositoTextField.setText("");
        masculinoRadioBtn.setSelected(false);
        femeninoRadioBtn.setSelected(false);
        checkInStatus.setSelected(false);
        checkOutStatus.setSelected(false);
        domoAsignadoTxtField.setText("");
        guiaAsignadoTxtFiel.setText("");
    }
}
