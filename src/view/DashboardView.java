package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DashboardView extends JFrame {
    public JButton btnPanel1 = new JButton("Administrar empleados");
    public JButton btnPanel2 = new JButton("Administrar domos");
    public JPanel panelContenido = new JPanel(new CardLayout());

    public DashboardView() {
        setTitle("Dashboard");
        setSize(1020, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Menu 
        JPanel panelSuperior = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panelSuperior.setBackground(Color.decode("#72b48c"));
        
        // Btn Menu
        panelSuperior.add(btnPanel1);
        panelSuperior.add(btnPanel2);
        
        // #ccffe0
        // Panel Administrar empleados
        PanelAdministrarEmpleados panelEmpleados = new PanelAdministrarEmpleados();
       

        // Panel Administrar domos 
        PanelAdministrarDomos panelDomos = new PanelAdministrarDomos();

        // Agregar ambos paneles al CardLayout
        panelContenido.add(panelEmpleados, "empleados");
        panelContenido.add(panelDomos, "domos");

        // Listener para cambiar entre paneles
        btnPanel1.addActionListener(e -> mostrarPanel("empleados"));
        btnPanel2.addActionListener(e -> mostrarPanel("domos"));

        // cargar primer panel
        CardLayout cl = (CardLayout) panelContenido.getLayout();
        cl.show(panelContenido, "empleados");

        // Agregar al frame 
        add(panelSuperior, BorderLayout.NORTH);
        add(panelContenido, BorderLayout.CENTER);
    }

    private void mostrarPanel(String nombre) {
        CardLayout cl = (CardLayout) panelContenido.getLayout();
        cl.show(panelContenido, nombre);
    }

    public void addMenuListeners(ActionListener listener) {
        btnPanel1.addActionListener(listener);
        btnPanel2.addActionListener(listener);
    }
}