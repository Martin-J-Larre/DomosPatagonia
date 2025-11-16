package controller;

import model.EmpleadoAdminDAO;
import model.ListarEmpleadoAdminModel;
import view.domos.PanelListarEmpleadosAdmin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelListarEmpleadosAdminController {

    private PanelListarEmpleadosAdmin vista;
    private EmpleadoAdminDAO dao;

    // Constructor
    public PanelListarEmpleadosAdminController(PanelListarEmpleadosAdmin vista) {
        this.vista = vista;
        this.dao = new EmpleadoAdminDAO();
        
        initController();
        cargarTabla(); 
        
    }
        private void initController() {
        vista.getBtnFiltrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cargarTabla();
            }
        });
    }
        
    private void cargarTabla() {
        String nombre = vista.getFiltroNombre();
        String apellido = vista.getFiltroApellido();
        String idiomas = vista.getFiltroIdiomas();

        List<ListarEmpleadoAdminModel> lista = dao.listarEmpleadoAdmin(nombre, apellido, idiomas);
        vista.actualizarTabla(lista);
    }



}
