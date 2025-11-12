/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.DashboardView;

public class DashboardController {
    private DashboardView vista;
    
    public DashboardController(String usuario){
        vista = new DashboardView(usuario);
        vista.setVisible(true);
    }
}
