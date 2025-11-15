package view.empleados;
import javax.swing.*;
import java.awt.*;
// Todo: Mejorar el diseño, colores y ancho de los campos, poner en Bold los textos
import controller.EmpleadoLimpiezaController;

public class PanelEmpleadoLimpieza extends JPanel {
    private JTextField horDeJornadaTextField, horDeEntradaTextField;
    private JTextField horDeSalidaTextField, diasJornadaTextField, salarioTextField;
    private JButton enviarBtn, volverBtn;
 

    public PanelEmpleadoLimpieza(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Agregar Empleado de Limpieza", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        // Creamos un borde
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel con Formulario usando GridBagLayout
        JPanel panelForm = new JPanel(new GridBagLayout());
        panelForm.setBackground(Color.WHITE);
        
        // Instancia GridBagConstraints y cargarle insets/anchor/fill
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(8, 8, 8, 8); // Padding
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Inicializar campos
        horDeJornadaTextField = new JTextField(20);
        horDeEntradaTextField = new JTextField(20);
        horDeSalidaTextField = new JTextField(20);
        diasJornadaTextField = new JTextField(20);
        salarioTextField = new JTextField(20);


        
        String[] lblsTexts = { "Horas de Jornada Semanal", "Hora de entrada", "Hora de salida", "Días de Jornada", "Salario"};
        JTextField[] textFiels = {horDeJornadaTextField, horDeEntradaTextField, horDeSalidaTextField, diasJornadaTextField, salarioTextField};
         
        
        for (int i = 0; i < lblsTexts.length; i++) {
            gbc.gridx = 0; gbc.gridy = i;
            panelForm.add(new JLabel(lblsTexts[i]), gbc);
            gbc.gridx = 1;
            panelForm.add(textFiels[i], gbc);
        }
        

        add(panelForm, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(Color.WHITE);
        enviarBtn = new JButton("Enviar");
        volverBtn = new JButton("Volver al inicio");
        panelBotones.add(enviarBtn);
        panelBotones.add(volverBtn);
        add(panelBotones, BorderLayout.SOUTH);
        
        
        
        EmpleadoLimpiezaController controller = new EmpleadoLimpiezaController();

        
        enviarBtn.addActionListener(e -> {
            try {
                // Estos datos los traemos desde el formulario agregar Empleados en el PanelEmpleadoInicio
                String apellido = PanelEmpleadoInicio.apellidoTextField.getText();
                String nombre = PanelEmpleadoInicio.nombreTextField.getText();
                int dni = Integer.parseInt(PanelEmpleadoInicio.dniTextField.getText());
                int edad = Integer.parseInt(PanelEmpleadoInicio.edadTextField.getText());
                String genero = PanelEmpleadoInicio.getGeneroSeleccionado();
                String telefono = PanelEmpleadoInicio.telefonoTextField.getText();
                String email = PanelEmpleadoInicio.emailTextField.getText();
                String area = PanelEmpleadoInicio.getAreaSeleccionada();
                String turno = PanelEmpleadoInicio.turnoTextField.getText();
                
                // Estos datos los agregamos desde el formulario agregar Empleado de limpieza de este panel
                String horario = horDeJornadaTextField.getText();
                int entrada = Integer.parseInt(horDeEntradaTextField.getText());
                int salida = Integer.parseInt(horDeSalidaTextField.getText());
                String dias = diasJornadaTextField.getText();
                int salario = Integer.parseInt(salarioTextField.getText());
                
                boolean exito = controller.guardarEmpleadoCompleto(
                    apellido, nombre, dni, edad, genero, telefono, email, area, turno, horario, entrada, salida, dias, salario
                );
                
                 if (exito) {
                    JOptionPane.showMessageDialog(this, "Empleado de limpieza guardado correctamente.");
                    resetFormEmpleadoLimpieza(); // limpia el form del  crear EmpleadoLimpieza en este panel
                    resetFormEmpleado(); // limpia form crear/agregar empleado del PanelEmpleadoInicio
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar el empleado.");
                }
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "⚠️ Error en los datos: " + ex.getMessage());
            }
        });
        
        // Boton para volver al formulario de crear/agregar empleado
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));
    }
    
        private void resetFormEmpleadoLimpieza() {
        horDeJornadaTextField.setText("");
        horDeEntradaTextField.setText("");
        horDeSalidaTextField.setText("");
        diasJornadaTextField.setText("");
        salarioTextField.setText("");
    
    }
        
        private void resetFormEmpleado() {
        PanelEmpleadoInicio.resetCampos();
    }    
}



