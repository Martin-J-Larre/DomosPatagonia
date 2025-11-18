
package view;

import controller.PanelListarDomoController;
import controller.PanelListarGuiaTurismoController;
import controller.PanelListarEmpleadosAdminController;
import controller.PanelListarEmpleadosController;
import controller.PanelListarHuespedesController;

import view.domos.*;

import javax.swing.*;
import java.awt.*;

public class PanelAdministrarDomos extends JPanel {

    public PanelAdministrarDomos() {

        setLayout(new BorderLayout());

        // CardLayout principal
        CardLayout clPanel = new CardLayout();
        JPanel panelDerecho = new JPanel(clPanel);

        // Paneles
        PanelDomoInicio panelInicio = new PanelDomoInicio(clPanel, panelDerecho);
        PanelCrearDomo panelCrearDomo = new PanelCrearDomo(clPanel, panelDerecho);
        PanelCheckin panelCheckin = new PanelCheckin(clPanel, panelDerecho);
        PanelListarDomos panelListarDomos = new PanelListarDomos(clPanel, panelDerecho);
        PanelListarHuespedes panelListarHuespedes = new PanelListarHuespedes(clPanel, panelDerecho);
        PanelListarGuiasTurismo panelListarGuias = new PanelListarGuiasTurismo(clPanel, panelDerecho);
        PanelListarEmpleados panelListarEmpleados = new PanelListarEmpleados(clPanel, panelDerecho);
        PanelListarEmpleadosAdmin panelListarEmpleadosAdmin = new PanelListarEmpleadosAdmin(clPanel, panelDerecho);
        PanelCheckout panelCheckout = new PanelCheckout(clPanel, panelDerecho);

        // Controladores
        new PanelListarDomoController(panelListarDomos);
        new PanelListarHuespedesController(panelListarHuespedes);
        new PanelListarGuiaTurismoController(panelListarGuias);
        new PanelListarEmpleadosController(panelListarEmpleados);
        new PanelListarEmpleadosAdminController(panelListarEmpleadosAdmin);

        // Agregar paneles al CardLayout
        panelDerecho.add(panelInicio, "inicio");
        panelDerecho.add(panelCrearDomo, "crearDomo");
        panelDerecho.add(panelCheckin, "checkin");
        panelDerecho.add(panelListarDomos, "listarDomos");
        panelDerecho.add(panelListarHuespedes, "listarHuespedes");
        panelDerecho.add(panelListarGuias, "listarGuias");
        panelDerecho.add(panelListarEmpleados, "listarEmpleados");
        panelDerecho.add(panelListarEmpleadosAdmin, "listarEmpleadosAdmin");
        panelDerecho.add(panelCheckout, "checkout");

        // Menú Izquierdo
        JPanel menuIzquierdo = new JPanel(new BorderLayout());
        menuIzquierdo.setPreferredSize(new Dimension(250, 0));
        menuIzquierdo.setBackground(new Color(230, 230, 230));

        JLabel lblMenu = new JLabel("Menú Domos", SwingConstants.CENTER);
        lblMenu.setFont(new Font("Arial", Font.BOLD, 14));
        lblMenu.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        menuIzquierdo.add(lblMenu, BorderLayout.NORTH);

        JPanel botonesMenu = new JPanel(new GridLayout(10, 1, 5, 5));

        // Botones del menú con sus paneles 
        String[][] opciones = {
                {"Inicio", "inicio"},
                {"Crear Domo", "crearDomo"},
                {"Check-In", "checkin"},
                {"Listar Domos", "listarDomos"},
                {"Listar Huespedes", "listarHuespedes"},
                {"Listar Guías Turismo", "listarGuias"},
                {"Listar Empleados", "listarEmpleados"},
                {"Listar Empleados Admin", "listarEmpleadosAdmin"},
                {"Checkout", "checkout"}
        };

        for (String[] opcion : opciones) {
            JButton btn = new JButton(opcion[0]);
            btn.addActionListener(e -> clPanel.show(panelDerecho, opcion[1]));
            botonesMenu.add(btn);
        }

        menuIzquierdo.add(botonesMenu, BorderLayout.CENTER);

        // Mostrar por defecto
        clPanel.show(panelDerecho, "inicio");

        add(menuIzquierdo, BorderLayout.WEST);
        add(panelDerecho, BorderLayout.CENTER);
    }
}
