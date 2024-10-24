package com.jordigarcia.equipofutbol.persistence.repository;

import com.jordigarcia.equipofutbol.entities.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
    @Query("SELECT e FROM Equipo e WHERE e.equipoCod=:id")
    Equipo findEquipoByEquipoCod(@Param("id")int id);
}