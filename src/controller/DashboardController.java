package controller;
import view.DashboardView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;

public class DashboardController {
    private DashboardView vista;

    public DashboardController(DashboardView vista) {
        this.vista = vista;
        this.vista.addMenuListeners(new MenuListener());
        vista.setVisible(true);
    }

    class MenuListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            CardLayout cl = (CardLayout)(vista.panelContenido.getLayout());
            if (e.getSource() == vista.btnPanel1) {
                cl.show(vista.panelContenido, "panel1");
            } else if (e.getSource() == vista.btnPanel2) {
                cl.show(vista.panelContenido, "panel2");
            }
        }
    }
}