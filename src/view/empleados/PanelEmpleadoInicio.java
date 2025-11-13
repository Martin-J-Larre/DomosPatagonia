package view.empleados;
import javax.swing.*;
import java.awt.*;

public class PanelEmpleadoInicio extends JPanel {
    public static JTextField nombreTextField, apellidoTextField, dniTextField, edadTextField, telefonoTextField,turnoTextField,emailTextField;
    public static JRadioButton masculinoRadioBtn, femeninoRadioBtn;
    public static JComboBox<String> areaComboBox;
    
    public PanelEmpleadoInicio() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        // Titulo
        JLabel lblTitulo = new JLabel("Agregar Empleado", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);
        
        // Panel con el grid 
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // JTextFiels
        nombreTextField = new JTextField(20);
        apellidoTextField = new JTextField(20);
        dniTextField = new JTextField(20);
        edadTextField = new JTextField(20);
        telefonoTextField = new JTextField(20);
        emailTextField = new JTextField(20);
        turnoTextField = new JTextField(20);

        // Radio buttons para genero
        masculinoRadioBtn = new JRadioButton("Masculino");
        femeninoRadioBtn = new JRadioButton("Femenino");
        masculinoRadioBtn.setBackground(Color.WHITE);
        femeninoRadioBtn.setBackground(Color.WHITE);

        ButtonGroup grupoGenero = new ButtonGroup();
        grupoGenero.add(masculinoRadioBtn);
        grupoGenero.add(femeninoRadioBtn);

        JPanel panelGenero = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        panelGenero.setBackground(Color.WHITE);
        panelGenero.add(masculinoRadioBtn);
        panelGenero.add(femeninoRadioBtn);

        // JComboBox para ares
        String[] areas = {"Empleado Administrador", "Empleado Limpieza", "Guía Turismo"};
        areaComboBox = new JComboBox<>(areas);
        areaComboBox.setPreferredSize(new Dimension(220, 25));

        // 🔹 Etiquetas y componentes
        String[] lbls = {"Nombre:","Apellido:" , "DNI:", "Edad:", "Género:", "Teléfono:", "Email:", "Área:", "Turno:"};
        Component[] textFiels = {
            nombreTextField, apellidoTextField, dniTextField, edadTextField,
            panelGenero, telefonoTextField, emailTextField, areaComboBox, turnoTextField
        };

        for (int i = 0; i < lbls.length; i++) {
            gbc.gridx = 0; gbc.gridy = i;
            formPanel.add(new JLabel(lbls[i]), gbc);
            gbc.gridx = 1;
            formPanel.add(textFiels[i], gbc);
        }

        add(formPanel, BorderLayout.CENTER);
    }

    // Método para obtener el género seleccionado
    public static String getGeneroSeleccionado() {
        if (masculinoRadioBtn.isSelected()) return "Masculino";
        if (femeninoRadioBtn.isSelected()) return "Femenino";
        return "";
    }

    // Método para obtener el área seleccionada
    public static String getAreaSeleccionada() {
        return (String) areaComboBox.getSelectedItem();
    }

    // 🔹 Método para limpiar los campos
    public static void resetCampos() {
        apellidoTextField.setText("");
        nombreTextField.setText("");
        dniTextField.setText("");
        edadTextField.setText("");
        telefonoTextField.setText("");
        emailTextField.setText("");
        turnoTextField.setText("");
        masculinoRadioBtn.setSelected(false);
        femeninoRadioBtn.setSelected(false);
        areaComboBox.setSelectedIndex(0);
    }
}
