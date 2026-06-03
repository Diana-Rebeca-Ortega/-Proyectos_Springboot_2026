package com.example.Proyecto_ABCC_MySQL.controllers;

import com.example.Proyecto_ABCC_MySQL.servicios.AlumnoService; // Ajusta según tus servicios
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @Autowired 
    private AlumnoService alumnoService;
    // @Autowired private MateriaService materiaService; 
    // @Autowired private ActividadService actividadService;

    @GetMapping("/")
    public String index(Model model) {
        // Aquí pasamos los datos a la vista
        model.addAttribute("listaAlumnos", alumnoService.findAlumnos());
        return "index";
    }
}