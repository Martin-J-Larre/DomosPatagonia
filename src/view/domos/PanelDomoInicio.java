package view.domos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PanelDomoInicio extends JPanel {

    private JButton crearDomoBtn;

    public PanelDomoInicio(CardLayout cl, JPanel parent) {
        setLayout(new BorderLayout());

        // Imagen background
        JLabel background = new JLabel();
        background.setLayout(new BorderLayout());
        background.setIcon(new ImageIcon("src/img/interior-test-1.png")); 

        // Panel central solo para título y botón enviar (En algun Z + para que salga arriba de la foto)
        JPanel centerPanel = new JPanel();
        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(150, 0, 0, 0));

        // Titulo
        JLabel lblTitulo = new JLabel("Administrar Domos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 28));
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        // Btn
        crearDomoBtn = new JButton("Crear Domo");
        crearDomoBtn.setFont(new Font("Arial", Font.BOLD, 16));
        crearDomoBtn.setFocusPainted(false);
        crearDomoBtn.setBackground(new Color(52, 152, 219));
        crearDomoBtn.setForeground(Color.WHITE);
        crearDomoBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
        crearDomoBtn.setMaximumSize(new Dimension(200, 40));
        
        // Escucha en btn
        crearDomoBtn.addActionListener((ActionEvent e) -> {
            cl.show(parent, "crearDomo");
        });

        
        centerPanel.add(lblTitulo);
        centerPanel.add(Box.createVerticalStrut(30));
        centerPanel.add(crearDomoBtn);

        background.add(centerPanel, BorderLayout.CENTER);
        add(background, BorderLayout.CENTER);
    }
}
