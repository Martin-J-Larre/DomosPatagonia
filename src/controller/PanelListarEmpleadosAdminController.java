package controller;

import model.EmpleadoAdminDAO;
import model.ListarEmpleadoAdminModel;
import view.domos.PanelListarEmpleadosAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelListarEmpleadosAdminController {

    private PanelListarEmpleadosAdmin vista;
    private EmpleadoAdminDAO dao = new EmpleadoAdminDAO();

    public PanelListarEmpleadosAdminController(PanelListarEmpleadosAdmin vista) {
        this.vista = vista;

        cargarTabla("", "");

        vista.getBtnFiltrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String titulo = vista.getTxtTitulo().getText().trim();
                String idioma = vista.getComboIdiomas().getSelectedItem().toString();

                if (idioma.equals("Todos")) idioma = "";

                cargarTabla(titulo, idioma);
            }
        });
    }

    private void cargarTabla(String titulo, String idioma) {

        var modelo = vista.getModeloTabla();
        modelo.setRowCount(0);

        for (ListarEmpleadoAdminModel lea : dao.listar(titulo, idioma)) {

            modelo.addRow(new Object[]{
                    lea.getIdUsuarioAdmin(),
                    lea.getCredencial(),
                    lea.getIdiomas(),
                    lea.getTitulo(),
                    lea.getNombreEmpleado(),
                    lea.getApellidoEmpleado()
            });
        }
    }
}
