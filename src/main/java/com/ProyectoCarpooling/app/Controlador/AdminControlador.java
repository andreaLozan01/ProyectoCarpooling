package com.ProyectoCarpooling.app.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminControlador {

    @GetMapping("/dashboard")
    public String mostrarDashboardAdmin() {
        return "dashboard-admin"; // Coincide con dashboard-admin.html en templates/
    }
}