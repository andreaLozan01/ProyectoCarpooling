package com.ProyectoCarpooling.app.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/conductor")
public class ConductorControlador {

    @GetMapping("/dashboard")
    public String mostrarDashboardConductor() {
        return "dashboard-conductor"; // Coincide con dashboard-conductor.html en templates/
    }
}