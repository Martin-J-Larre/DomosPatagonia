package view.domos;
import javax.swing.*;
import java.awt.*;

public class PanelDomoInicio extends JPanel {
    public PanelDomoInicio() {
        setLayout(new BorderLayout());
        JLabel lbl = new JLabel("Selecciona un domo del menú a la izquierda", SwingConstants.CENTER);
        lbl.setFont(new Font("Arial", Font.PLAIN, 16));
        add(lbl, BorderLayout.CENTER);
    }
}