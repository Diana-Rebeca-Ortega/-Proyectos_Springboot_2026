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
    // --- AGREGAR A ListController ---

// Este sirve para el "fetch" que rellena el formulario al editar
@GetMapping("/alumnos/{id}")
public AlumnoModel obtenerAlumno(@PathVariable Integer id) {
    return alumnoService.obtenerPorId(id);
}
@PutMapping("/alumnos/{id}")
public AlumnoModel actualizarAlumno(@PathVariable Integer id, @RequestBody AlumnoModel alumno) {
    alumno.setId(id); // Asegura que el ID del objeto coincida con el de la URL
    return alumnoService.guardar(alumno);
}
// --- AGREGAR A ListController para Materias ---

// Para precargar el formulario cuando das clic en Editar
@GetMapping("/materias/{id}")
public Materia obtenerMateria(@PathVariable Integer id) {
    return materiaService.obtenerPorId(id);
}

// Para guardar cambios cuando das clic en Guardar desde el modal
@PutMapping("/materias/{id}")
public Materia actualizarMateria(@PathVariable Integer id, @RequestBody Materia materia) {
    materia.setId(id); // Asegura que el ID se mantenga para el UPDATE
    return materiaService.guardar(materia);
}
// --- AGREGAR A ListController para Actividades ---

@GetMapping("/actividades/{id}")
public Actividad obtenerActividad(@PathVariable Integer id) {
    return actividadService.obtenerPorId(id);
}

@PutMapping("/actividades/{id}")
public Actividad actualizarActividad(@PathVariable Integer id, @RequestBody Actividad actividad) {
    actividad.setId(id); // Importante para que JPA haga un UPDATE en lugar de un INSERT
    return actividadService.guardar(actividad);
}
}