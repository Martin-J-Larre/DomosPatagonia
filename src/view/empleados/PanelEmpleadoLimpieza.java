/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.empleados;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author martin
 */

public class PanelEmpleadoLimpieza extends JPanel {
    public PanelEmpleadoLimpieza(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        JLabel lbl = new JLabel("Formulario para agregar empleado de Limpieza", SwingConstants.CENTER);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        add(lbl, BorderLayout.CENTER);

        JButton btnVolver = new JButton("Volver al inicio");
        btnVolver.addActionListener(e -> cl.show(parent, "inicio"));
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnVolver);
        add(panelBoton, BorderLayout.SOUTH);
    }
}