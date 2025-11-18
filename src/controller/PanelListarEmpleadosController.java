package controller;

import model.ListarEmpleadosDAO;
import model.ListarEmpleadosModel;
import view.domos.PanelListarEmpleados;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelListarEmpleadosController {

    private PanelListarEmpleados vista;
    private ListarEmpleadosDAO dao = new ListarEmpleadosDAO();

    public PanelListarEmpleadosController(PanelListarEmpleados vista) {
        this.vista = vista;

        cargarTabla("");

        vista.getBtnFiltrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filtro = vista.getTxtFiltro().getText().trim();
                cargarTabla(filtro);
            }
        });
    }

    private void cargarTabla(String filtro) {

        var modelo = vista.getModeloTabla();
        modelo.setRowCount(0);

        for (ListarEmpleadosModel empleado : dao.listar(filtro)) {
            modelo.addRow(new Object[]{
                    empleado.getIdEmpleado(),
                    empleado.getApellido(),
                    empleado.getNombre(),
                    empleado.getDni(),
                    empleado.getEdad(),
                    empleado.getGenero(),
                    empleado.getTelefono(),
                    empleado.getArea(),
                    empleado.getTurno(),
                    empleado.getEmail()
            });
        }
    }
}

