//package view;
//import controller.PanelBuscarDomoController;
//import controller.PanelBuscarGuiaTurismoController;
//import controller.PanelListarEmpleadosController;
//import controller.PanelListarHuespedesController;
//import view.domos.*;
//import javax.swing.*;
//import java.awt.*;
//
//public class PanelAdministrarDomos extends JPanel {
//    public PanelAdministrarDomos() {
//        setLayout(new BorderLayout());
//
//        // CardLayout para la derecha
//        CardLayout clPanel = new CardLayout();
//        JPanel panelDerecho = new JPanel(clPanel);
//        
// 
//        // Crear paneles 
//        PanelDomoInicio panelInicio = new PanelDomoInicio(clPanel, panelDerecho);
//        PanelCrearDomo panelCrearDomo = new PanelCrearDomo(clPanel, panelDerecho);
//        PanelCheckin panelCheckin = new PanelCheckin(clPanel, panelDerecho);
//        PanelListarDomos panelBuscar = new PanelListarDomos(clPanel, panelDerecho);
//        PanelListarHuespedes paneListarHuespedes = new PanelListarHuespedes(clPanel, panelDerecho);
//        PanelListarGuiasTurismo panelBuscarGuia = new PanelListarGuiasTurismo(clPanel, panelDerecho);
//        PanelListarEmpleados panelListarEmpleados = new PanelListarEmpleados(clPanel, panelDerecho);
//        
//        PanelCheckout d5 = new PanelCheckout(clPanel, panelDerecho);
//        
//        
//        PanelListarEmpleadosAdmin d8 = new PanelListarEmpleadosAdmin(clPanel, panelDerecho);
//
//        
//        // Instancias para cargar la data del los controllers
//        new PanelBuscarDomoController(panelBuscar);
//        new PanelListarHuespedesController(paneListarHuespedes);
//        new PanelBuscarGuiaTurismoController(panelBuscarGuia);
//        new PanelListarEmpleadosController(panelListarEmpleados);
//
//        // Añadir al  CardLayout
//        panelDerecho.add(panelInicio, "inicio");
//        panelDerecho.add(panelCrearDomo, "crearDomo");
//        panelDerecho.add(panelCheckin, "Checkin");
//        panelDerecho.add(panelBuscar, "panel2");
//        panelDerecho.add(paneListarHuespedes, "panel4");
//        panelDerecho.add(panelBuscarGuia, "panel9");
//        panelDerecho.add(panelListarEmpleados, "panel5");
//        panelDerecho.add(panelListarEmpleados, "panel6");
//        
//        
//        panelDerecho.add(d8, "panel8");
//        
//
//        // Menú Izq
//        JPanel menuIzquierdo = new JPanel(new BorderLayout());
//        menuIzquierdo.setPreferredSize(new Dimension(250, 0));
//        menuIzquierdo.setBackground(new Color(230, 230, 230));
//
//        JLabel lblMenu = new JLabel("Menú Domos", SwingConstants.CENTER);
//        lblMenu.setFont(new Font("Arial", Font.BOLD, 14));
//        menuIzquierdo.add(lblMenu, BorderLayout.NORTH);
//
//        JPanel botonesMenu = new JPanel(new GridLayout(10, 1, 5, 5));
//        JButton[] botones = new JButton[10];
//        String[] nombrePanel = {"Checkin", "panel2", "panel3", "panel4", "panel5", "panel6", "panel7", "panel8", "panel9", "panel10"};
//        for (int i = 0; i < 10; i++) {
//            botones[i] = new JButton("Domo " + (i + 1));
//            final int index = i + 1;
//            String panel = nombrePanel[i];
//            botones[i].addActionListener(e -> clPanel.show(panelDerecho, panel));
//            botonesMenu.add(botones[i]);
//        }
//        menuIzquierdo.add(botonesMenu, BorderLayout.CENTER);
//
//        // Panel que se carga primero
//        clPanel.show(panelDerecho, "inicio");
//
//        add(menuIzquierdo, BorderLayout.WEST);
//        add(panelDerecho, BorderLayout.CENTER);
//    }
//}
package view;

import controller.PanelBuscarDomoController;
import controller.PanelBuscarGuiaTurismoController;
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
        new PanelBuscarDomoController(panelListarDomos);
        new PanelListarHuespedesController(panelListarHuespedes);
        new PanelBuscarGuiaTurismoController(panelListarGuias);
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
