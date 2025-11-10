/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;

public class DashboardTest extends JFrame{
        public DashboardTest(String username) {
        setTitle("Dashboard - Bienvenido " + username);
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel lblBienvenida = new JLabel("Bienvenido, " + username + "!");
        lblBienvenida.setBounds(120, 80, 200, 25);
        add(lblBienvenida);

        setVisible(true);
    }
}
