package view.empleados;
import javax.swing.*;
import java.awt.*;
// Todo: Mejorar el diseño, colores y ancho de los campos, poner en Bold los textos

public class PanelEmpleadoLimpieza extends JPanel {
    private JTextField idEmpLimpTextField, horDeJornadaTextField, horDeEntradaTextField;
    private JTextField horDeSalidaTextField, diasJornadaTextField, salarioTextField;
    private JButton enviarBtn, volverBtn;
 

    public PanelEmpleadoLimpieza(CardLayout cl, JPanel parent) {
        // https://docs.oracle.com/javase/7/docs/api/java/awt/BorderLayout.html
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);

        // Título
        JLabel lblTitulo = new JLabel("Agregar Empleado de Limpieza", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
        
        // Creamos un borde
        // https://docs.oracle.com/javase/8/docs/api/javax/swing/BorderFactory.html
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblTitulo, BorderLayout.NORTH);

        // Panel con Formulario usando un grid (Como un Grid Layout???)
        // https://www.geeksforgeeks.org/java/java-awt-gridbaglayout-class/
        // https://docs.oracle.com/javase/8/docs/api/java/awt/GridBagConstraints.html
        JPanel panelForm = new JPanel(new GridBagLayout());
        panelForm.setBackground(Color.WHITE);
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.insets = new Insets(8, 8, 8, 8); // Padding??
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Inicializar campos
        idEmpLimpTextField = new JTextField(20);
        horDeJornadaTextField = new JTextField(20);
        horDeEntradaTextField = new JTextField(20);
        horDeSalidaTextField = new JTextField(20);
        diasJornadaTextField = new JTextField(20);
        salarioTextField = new JTextField(20);

        // Fila 1
        gbc.gridx = 0; gbc.gridy = 0;
        panelForm.add(new JLabel("Empleado Limpieza Nro:"), gbc);
        gbc.gridx = 1;
        panelForm.add(idEmpLimpTextField, gbc);

        // Fila 2
        gbc.gridx = 0; gbc.gridy = 1;
        panelForm.add(new JLabel("Horario Jornada:"), gbc);
        gbc.gridx = 1;
        panelForm.add(horDeJornadaTextField, gbc);

        // Fila 3
        gbc.gridx = 0; gbc.gridy = 2;
        panelForm.add(new JLabel("Hora de entrada:"), gbc);
        gbc.gridx = 1;
        panelForm.add(horDeEntradaTextField, gbc);

        // Fila 4
        gbc.gridx = 0; gbc.gridy = 3;
        panelForm.add(new JLabel("Hora de salida:"), gbc);
        gbc.gridx = 1;
        panelForm.add(diasJornadaTextField, gbc);

        // Fila 5
        gbc.gridx = 0; gbc.gridy = 4;
        panelForm.add(new JLabel("Días de Jornada:"), gbc);
        gbc.gridx = 1;
        panelForm.add(diasJornadaTextField, gbc);

        // Fila 6
        gbc.gridx = 0; gbc.gridy = 5;
        panelForm.add(new JLabel("Salario:"), gbc);
        gbc.gridx = 1;
        panelForm.add(salarioTextField, gbc);

        add(panelForm, BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBotones.setBackground(Color.WHITE);

        enviarBtn = new JButton("Enviar");
        volverBtn = new JButton("Volver al inicio");

        // Acción del botón volver ====> #### Este volvería al formulario Empleados!!!!! ######
        volverBtn.addActionListener(e -> cl.show(parent, "inicio"));

        // TODO: Hacer un metodo para que se maneje del controller y manejar el envio \a la BBDD por ahí.
        // Por Ahora simularlo así
        
        enviarBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Fake Datos enviados correctamente ");
        });

        panelBotones.add(enviarBtn);
        panelBotones.add(volverBtn);

        add(panelBotones, BorderLayout.SOUTH);
    }
}


// Ejemplo con BorderLayout or CardLayout
// 
// For JPanels using BorderLayout or CardLayout, 
// the add(Component comp, Object constraints) method is employed. 
// The constraints object will be specific to the layout manager.


//import javax.swing.*;
//import java.awt.*;
//
//public class PanelWithBorderLayout {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("BorderLayout Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//
//        JPanel panel = new JPanel(new BorderLayout()); // Set BorderLayout
//
//        JLabel northLabel = new JLabel("North", SwingConstants.CENTER);
//        JLabel southLabel = new JLabel("South", SwingConstants.CENTER);
//        JButton centerButton = new JButton("Center");
//
//        panel.add(northLabel, BorderLayout.NORTH); // Add with BorderLayout constraint
//        panel.add(southLabel, BorderLayout.SOUTH);
//        panel.add(centerButton, BorderLayout.CENTER);
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}



/// Ejemplo GridBagLayout
//
// For JPanels using GridBagLayout, a GridBagConstraints object is 
// used to define the constraints for each component.

//import javax.swing.*;
//import java.awt.*;
//
//public class PanelWithGridBagLayout {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("GridBagLayout Example");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(400, 300);
//
//        JPanel panel = new JPanel(new GridBagLayout()); // Set GridBagLayout
//
//        GridBagConstraints gbc = new GridBagConstraints();
//
//        // Component 1
//        JLabel label1 = new JLabel("Label 1:");
//        gbc.gridx = 0; // Column 0
//        gbc.gridy = 0; // Row 0
//        gbc.anchor = GridBagConstraints.WEST; // Align to the west
//        gbc.insets = new Insets(5, 5, 5, 5); // Padding
//        panel.add(label1, gbc);
//
//        // Component 2
//        JTextField textField1 = new JTextField(15);
//        gbc.gridx = 1; // Column 1
//        gbc.gridy = 0; // Row 0
//        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally
//        gbc.weightx = 1.0; // Give extra horizontal space
//        panel.add(textField1, gbc);
//
//        // Component 3
//        JButton button = new JButton("Submit");
//        gbc.gridx = 0; // Column 0
//        gbc.gridy = 1; // Row 1
//        gbc.gridwidth = 2; // Span two columns
//        gbc.anchor = GridBagConstraints.CENTER; // Center alignment
//        panel.add(button, gbc);
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}