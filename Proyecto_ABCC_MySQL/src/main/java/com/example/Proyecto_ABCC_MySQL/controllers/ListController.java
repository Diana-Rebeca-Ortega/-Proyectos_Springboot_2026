package com.example.Proyecto_ABCC_MySQL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ListController {
    @GetMapping
    public String listaAlumnos(){
        return "list";
    }


}
