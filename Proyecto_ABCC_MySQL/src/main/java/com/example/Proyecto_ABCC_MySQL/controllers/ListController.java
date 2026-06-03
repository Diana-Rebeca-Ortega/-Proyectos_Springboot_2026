package com.example.Proyecto_ABCC_MySQL.controllers;

import com.example.Proyecto_ABCC_MySQL.models.*;
import com.example.Proyecto_ABCC_MySQL.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Importante para que el frontend no tenga problemas
public class ListController {

    @Autowired private AlumnoService alumnoService;
    @Autowired private MateriaService materiaService;
    @Autowired private ActividadService actividadService;

    // --- ALUMNOS ---
    @GetMapping("/alumnos")
    public List<AlumnoModel> listarAlumnos() { return alumnoService.findAlumnos(); }

    @PostMapping("/alumnos")
    public AlumnoModel guardarAlumno(@RequestBody AlumnoModel alumno) { return alumnoService.guardar(alumno); }

    @DeleteMapping("/alumnos/{id}")
    public void eliminarAlumno(@PathVariable Integer id) { alumnoService.eliminar(id); }

    // --- MATERIAS ---
    @GetMapping("/materias")
    public List<Materia> listarMaterias() { return materiaService.listarTodas(); }

    @PostMapping("/materias")
    public Materia guardarMateria(@RequestBody Materia materia) { return materiaService.guardar(materia); }

    @DeleteMapping("/materias/{id}")
    public void eliminarMateria(@PathVariable Integer id) { materiaService.eliminar(id); }

    // --- ACTIVIDADES ---
    @GetMapping("/actividades")
    public List<Actividad> listarActividades() { return actividadService.listarTodas(); }

    @PostMapping("/actividades")
    public Actividad guardarActividad(@RequestBody Actividad actividad) { return actividadService.guardar(actividad); }

    @DeleteMapping("/actividades/{id}")
    public void eliminarActividad(@PathVariable Integer id) { actividadService.eliminar(id); }
}