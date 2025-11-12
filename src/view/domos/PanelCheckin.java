
package view.domos;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author martin
 */
public class PanelCheckin extends JPanel{
        public PanelCheckin(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());
        
        JLabel lbl = new JLabel("Panel Domo Checkin", SwingConstants.CENTER);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        add(lbl, BorderLayout.CENTER);

        JButton btnVolver = new JButton("Volver al inicio");
        btnVolver.addActionListener(e -> cl.show(parent, "inicio"));
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnVolver);
        add(panelBoton, BorderLayout.SOUTH);
    }
}
