package view;
import view.domos.*;
import javax.swing.*;
import java.awt.*;

public class PanelAdministrarDomos extends JPanel {
    public PanelAdministrarDomos() {
        setLayout(new BorderLayout());

        // CardLayout para la derecha
        CardLayout clPanel = new CardLayout();
        JPanel panelDerecho = new JPanel(clPanel);

        // Crear paneles 
//        PanelDomoInicio inicio = new PanelDomoInicio();
        PanelCheckin d1 = new PanelCheckin(clPanel, panelDerecho);
        PanelBuscarDomo d2 = new PanelBuscarDomo(clPanel, panelDerecho);
        PanelListarDomos d3 = new PanelListarDomos(clPanel, panelDerecho);
        PanelListarHuespedes d4 = new PanelListarHuespedes(clPanel, panelDerecho);
        PanelCheckout d5 = new PanelCheckout(clPanel, panelDerecho);
        PanelListarEmpleados d6 = new PanelListarEmpleados(clPanel, panelDerecho);
        PanelListarEmpleadosPorArea d7 = new PanelListarEmpleadosPorArea(clPanel, panelDerecho);
        PanelListarEmpleadosAdmin d8 = new PanelListarEmpleadosAdmin(clPanel, panelDerecho);
        PanelBuscarGuiaTurismo d9 = new PanelBuscarGuiaTurismo(clPanel, panelDerecho);
        PanelActualizarLimpiezaDomo d10 = new PanelActualizarLimpiezaDomo(clPanel, panelDerecho);

        // Añadir al  CardLayout
//        panelDerecho.add(inicio, "inicio");
        panelDerecho.add(d1, "panel1");
        panelDerecho.add(d2, "panel2");
        panelDerecho.add(d3, "panel3");
        panelDerecho.add(d4, "panel4");
        panelDerecho.add(d5, "panel5");
        panelDerecho.add(d6, "panel6");
        panelDerecho.add(d7, "panel7");
        panelDerecho.add(d8, "panel8");
        panelDerecho.add(d9, "panel9");
        panelDerecho.add(d10, "panel10");

        // Menú Izq
        JPanel menuIzquierdo = new JPanel(new BorderLayout());
        menuIzquierdo.setPreferredSize(new Dimension(250, 0));
        menuIzquierdo.setBackground(new Color(230, 230, 230));

        JLabel lblMenu = new JLabel("Menú Domos", SwingConstants.CENTER);
        lblMenu.setFont(new Font("Arial", Font.BOLD, 14));
        menuIzquierdo.add(lblMenu, BorderLayout.NORTH);

        JPanel botonesMenu = new JPanel(new GridLayout(10, 1, 5, 5));
        JButton[] botones = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botones[i] = new JButton("Domo " + (i + 1));
            final int index = i + 1;
            botones[i].addActionListener(e -> clPanel.show(panelDerecho, "panel" + index));
            botonesMenu.add(botones[i]);
        }
        menuIzquierdo.add(botonesMenu, BorderLayout.CENTER);

        // Panel que se carga primero
//        clPanel.show(panelDerecho, "inicio");

        add(menuIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.CENTER);
    }
}
