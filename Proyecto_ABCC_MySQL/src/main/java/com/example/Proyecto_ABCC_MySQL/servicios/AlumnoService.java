package com.example.Proyecto_ABCC_MySQL.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Proyecto_ABCC_MySQL.models.AlumnoModel;
import com.example.Proyecto_ABCC_MySQL.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    private final AlumnoRepository alumnoRepository;

    public AlumnoService(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }

public AlumnoModel guardar(AlumnoModel alumno) {
    return alumnoRepository.save(alumno);
}
    public List<AlumnoModel> findAlumnos(){
        return alumnoRepository.findAll();
    }
    
}
