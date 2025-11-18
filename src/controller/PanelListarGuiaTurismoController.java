package controller;

import model.GuiaTurismoDAO;
import model.GuiaTurismoModel;
import view.domos.PanelListarGuiasTurismo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelListarGuiaTurismoController {

    private PanelListarGuiasTurismo view;
    private GuiaTurismoDAO dao;

    public PanelListarGuiaTurismoController(PanelListarGuiasTurismo view) {
        this.view = view;
        this.dao = new GuiaTurismoDAO();

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
        String especialidad = view.getEspecialidadSeleccionada();
        String temporada = view.getTemporadaSeleccionada();

        List<GuiaTurismoModel> lista = dao.listarGuias(especialidad, temporada);
        view.actualizarTabla(lista);
    }
}
