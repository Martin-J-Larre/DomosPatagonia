package view.empleados;
import javax.swing.*;
import java.awt.*;

public class PanelEmpleadoAdmin extends JPanel {
    public PanelEmpleadoAdmin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        JLabel lbl = new JLabel("Formulario para agregar Usuario Admin", SwingConstants.CENTER);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        add(lbl, BorderLayout.CENTER);

        JButton btnVolver = new JButton("Volver al inicio");
        btnVolver.addActionListener(e -> cl.show(parent, "inicio"));
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnVolver);
        add(panelBoton, BorderLayout.SOUTH);
    }
}
