package com.example.Proyecto_ABCC_MySQL.repositories;

import com.example.Proyecto_ABCC_MySQL.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long> {
}