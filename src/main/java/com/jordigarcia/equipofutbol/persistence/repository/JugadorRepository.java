package com.jordigarcia.equipofutbol.persistence.repository;

import com.jordigarcia.equipofutbol.entities.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Integer> {
    @Query("SELECT j FROM Jugador j WHERE j.equipoCod=:id")
    List<Jugador> findPlayerByEquipoCod(@Param("id")int id);
}