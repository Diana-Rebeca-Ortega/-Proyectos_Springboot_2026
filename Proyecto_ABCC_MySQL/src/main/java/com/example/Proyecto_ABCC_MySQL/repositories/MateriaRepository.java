package com.example.Proyecto_ABCC_MySQL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Proyecto_ABCC_MySQL.models.Materia;

public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}