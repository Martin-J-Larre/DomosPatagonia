package view;

import javax.swing.*;
import java.awt.*;

public class DashboardView extends JFrame {
    private JPanel panelIzquierdo;
    private JPanel panelDerecho;

    public DashboardView(String usuario) {
        setTitle("Panel Principal - Usuario: " + usuario);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panelIzquierdo = new JPanel();
        panelIzquierdo.setBackground(new Color(220, 220, 250));
        panelIzquierdo.setPreferredSize(new Dimension(200, 0));
        panelIzquierdo.add(new JLabel("Menú"));

        panelDerecho = new JPanel(new BorderLayout());
        panelDerecho.add(new JLabel("Contenido principal", SwingConstants.CENTER), BorderLayout.CENTER);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelIzquierdo, panelDerecho);
        splitPane.setDividerLocation(200);
        splitPane.setDividerSize(5);

        add(splitPane);
    }
}
