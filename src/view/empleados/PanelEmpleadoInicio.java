package view.empleados;
import javax.swing.*;
import java.awt.*;

public class PanelEmpleadoInicio extends JPanel {
    public PanelEmpleadoInicio() {
        setLayout(new BorderLayout());
        JLabel lbl = new JLabel("Aca va a ir el formuladio de empleados principal", SwingConstants.CENTER);
        lbl.setFont(new Font("Arial", Font.PLAIN, 16));
        add(lbl, BorderLayout.CENTER);
    }
}