package controller;
import view.DashboardView;


public class DashboardController {

    public DashboardController() {
        DashboardView vista = new DashboardView("Fulano");
        vista.setVisible(true);
    }
}
