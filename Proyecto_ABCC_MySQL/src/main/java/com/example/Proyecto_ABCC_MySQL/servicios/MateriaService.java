package com.example.Proyecto_ABCC_MySQL.servicios;

import com.example.Proyecto_ABCC_MySQL.models.Materia;
import com.example.Proyecto_ABCC_MySQL.repositories.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository repo;

    public List<Materia> listarTodas() {
        return repo.findAll();
    }

    public Materia guardar(Materia m) {
        return repo.save(m);
    }

    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
    // Agrega esto dentro de MateriaService.java
public Materia obtenerPorId(Integer id) {
    return repo.findById(id).orElse(null);
}
}