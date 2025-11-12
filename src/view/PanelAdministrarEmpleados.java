package view;

import view.empleados.*;
import javax.swing.*;
import java.awt.*;

public class PanelAdministrarEmpleados extends JPanel {

    public PanelAdministrarEmpleados() {
        setLayout(new BorderLayout());

        // CardLayout para el contenido derecho
        CardLayout cl = new CardLayout();
        JPanel panelDerecho = new JPanel(cl);

        // subpaneles
        PanelEmpleadoInicio inicio = new PanelEmpleadoInicio();
        PanelEmpleadoLimpieza limpieza = new PanelEmpleadoLimpieza(cl, panelDerecho);
        PanelEmpleadoGuiaTurismo guia = new PanelEmpleadoGuiaTurismo(cl, panelDerecho);
        PanelEmpleadoAdmin admin = new PanelEmpleadoAdmin(cl, panelDerecho);

        // Agregar al panel principal
        panelDerecho.add(inicio, "inicio");
        panelDerecho.add(limpieza, "limpieza");
        panelDerecho.add(guia, "guia");
        panelDerecho.add(admin, "admin");

        // Menu Izq
        JPanel menuIzquierdo = new JPanel(new BorderLayout());
        menuIzquierdo.setPreferredSize(new Dimension(250, 0));
        menuIzquierdo.setBackground(new Color(230, 230, 230));

        JLabel lblMenu = new JLabel("Empleados", SwingConstants.CENTER);
        lblMenu.setFont(new Font("Arial", Font.BOLD, 14));
        menuIzquierdo.add(lblMenu, BorderLayout.NORTH);

        JPanel botones = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton btnLimpieza = new JButton("Agregar empleado Limpieza");
        JButton btnGuia = new JButton("Agregar guía Turismo");
        JButton btnAdmin = new JButton("Agregar usuario Admin");

        botones.add(btnLimpieza);
        botones.add(btnGuia);
        botones.add(btnAdmin);
        menuIzquierdo.add(botones, BorderLayout.CENTER);

        // Listeners para cambiar los paneles
        btnLimpieza.addActionListener(e -> cl.show(panelDerecho, "limpieza"));
        btnGuia.addActionListener(e -> cl.show(panelDerecho, "guia"));
        btnAdmin.addActionListener(e -> cl.show(panelDerecho, "admin"));

        // Mostrar panel principal con fomulario empleado gral.
        cl.show(panelDerecho, "inicio");

        // Cargar todo
        add(menuIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.CENTER);
    }
}
