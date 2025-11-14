package controller;

import model.HuespedDAO;
import model.HuespedModel;
import view.domos.PanelListarHuespedes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelListarHuespedesController {

    private PanelListarHuespedes view;
    private HuespedDAO dao;

    public PanelListarHuespedesController(PanelListarHuespedes view) {
        this.view = view;
        this.dao = new HuespedDAO();

        initController();
        cargarTabla();
    }

    private void initController() {
        view.getBtnBuscar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarTabla();
            }
        });
    }

    private void cargarTabla() {
        String nombre = view.getFiltroNombre();
        String apellido = view.getFiltroApellido();

        List<HuespedModel> lista = dao.listarHuespedes(nombre, apellido);
        view.actualizarTabla(lista);
    }
}
