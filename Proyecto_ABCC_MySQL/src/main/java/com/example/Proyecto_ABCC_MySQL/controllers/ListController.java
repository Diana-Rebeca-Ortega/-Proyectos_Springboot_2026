package com.example.Proyecto_ABCC_MySQL.controllers;
import java.util.List;
import com.example.Proyecto_ABCC_MySQL.models.AlumnoModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.Proyecto_ABCC_MySQL.servicios.AlumnoService;

@Controller
public class ListController {
    private final AlumnoService alumnoService;
    
    public ListController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping()
    public String listaAlumnos(Model model){
        List<AlumnoModel> listaAlumnos = alumnoService.findAlumnos();
        model.addAllAttribute("alumnos", listaAlumnos);


       // return "list";
       return "index";
    }


}
