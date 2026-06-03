package com.example.Proyecto_ABCC_MySQL.controllers;

import com.example.Proyecto_ABCC_MySQL.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired private AlumnoService alumnoService;
    @Autowired private MateriaService materiaService;
    @Autowired private ActividadService actividadService;

    @GetMapping("/")
    public String index(Model model) {
        // Pasamos las listas al frontend para que Thymeleaf pueda renderizarlas
        model.addAttribute("listaAlumnos", alumnoService.findAlumnos());
        model.addAttribute("listaMaterias", materiaService.listarTodas());
        model.addAttribute("listaActividades", actividadService.listarTodas());
        
        // Retorna el nombre de tu archivo HTML (index.html)
        return "index";
    }
    
    // Opcional: Ruta para el login si decides implementarlo así
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}