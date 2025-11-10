/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.*;
import javax.swing.*;

import modelo.Iniciar_Sesion_model;
import modelo.Iniciar_Sesion_DAO;
import vista.Iniciar_Sesion_view;
import vista.DashboardTest;

public class Iniciar_Sesion_controller implements ActionListener{
    
    private Iniciar_Sesion_view vista;
    private Iniciar_Sesion_DAO dao;

    public Iniciar_Sesion_controller(Iniciar_Sesion_view vista, Iniciar_Sesion_DAO dao) {
        this.vista = vista;
        this.dao = dao;
        this.vista.inicioSesionBtn.addActionListener(this);
        this.vista.cancelarBtn.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == vista.inicioSesionBtn) {
            
            String usuarioText = vista.usuarioTextField.getText();
            String contraseniaText = vista.contraseniaTextField.getText();
            
            Iniciar_Sesion_model usuario = new Iniciar_Sesion_model(usuarioText, contraseniaText);
            
            if (dao.validarLogin(usuario)) {
                JOptionPane.showMessageDialog(vista, "Login exitoso");
                vista.dispose();
                new DashboardTest(usuarioText);
            } else {
                JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
            }
        }
        
        if (ae.getSource() == vista.cancelarBtn) {
            vista.dispose();
        }
       
    }
    
}
