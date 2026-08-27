/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package main.java.com.kafusoft.abarroteria.kinal.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import main.java.com.kafusoft.abarroteria.kinal.service.DashboardService;

/**
 * FXML Controller class
 *
 * @author informatica
 */
public class DashboardController implements Initializable {
    private DashboardService dashboardService;
    
    public DashboardController(DashboardService dashboardService){
        this.dashboardService = dashboardService;
    
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
