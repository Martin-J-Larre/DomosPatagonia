package controller;

import model.DomoDAO;
import model.BuscarDomosModel;
import view.domos.PanelBuscarDomo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelBuscarDomoController {

    private PanelBuscarDomo view;
    private DomoDAO dao;

    public PanelBuscarDomoController(PanelBuscarDomo view) {
        this.view = view;
        this.dao = new DomoDAO();

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
        String tipoCama = view.getTipoCamaSeleccionada();
        boolean soloDisponibles = view.isSoloDisponiblesSeleccionado();

        List<BuscarDomosModel> lista = dao.obtenerDomos(tipoCama, soloDisponibles);
        view.actualizarTabla(lista);
    }
}
