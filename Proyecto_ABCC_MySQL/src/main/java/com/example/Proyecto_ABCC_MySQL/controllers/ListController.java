package com.example.Proyecto_ABCC_MySQL.controllers;

import java.util.List;
import com.example.Proyecto_ABCC_MySQL.models.AlumnoModel;
import com.example.Proyecto_ABCC_MySQL.servicios.AlumnoService;
import org.springframework.web.bind.annotation.*;

@RestController // Esto permite que el controlador devuelva JSON automáticamente
@RequestMapping("/api") // Define el prefijo para todas las rutas de este controlador
public class ListController {

    private final AlumnoService alumnoService;

    // Inyección de dependencias mediante constructor (es la forma recomendada por Spring)
   
    public ListController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    // Ruta para consultar todos los alumnos: /api/alumnos
    @GetMapping("/alumnos")
    public List<AlumnoModel> obtenerAlumnos() {
        return alumnoService.findAlumnos();
    }

    // Ruta para registrar un nuevo alumno: /api/alumnos
    @PostMapping("/alumnos")
    public AlumnoModel agregarAlumno(@RequestBody AlumnoModel alumno) {
        return alumnoService.guardar(alumno);
    }
@DeleteMapping("/alumnos/{id}")
public void eliminar(@PathVariable Integer id) {
    alumnoService.eliminar(id);
}
    @PutMapping("/alumnos")
public AlumnoModel actualizarAlumno(@RequestBody AlumnoModel alumno) {
    return alumnoService.guardar(alumno); // save() en JPA también funciona para actualizar si el ID existe
}
}