package com.example.Proyecto_ABCC_MySQL.servicios;

import com.example.Proyecto_ABCC_MySQL.models.Actividad;
import com.example.Proyecto_ABCC_MySQL.repositories.ActividadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActividadService {
    @Autowired
    private ActividadRepository actividadRepository;

    public List<Actividad> listarTodas() {
        return actividadRepository.findAll();
    }

    public Actividad guardar(Actividad actividad) {
        return actividadRepository.save(actividad);
    }
}