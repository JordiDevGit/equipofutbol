package com.jordigarcia.equipofutbol.persistence.repository;

import com.jordigarcia.equipofutbol.entities.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadioRepository extends JpaRepository<Estadio, Integer> {
/*
   Puedes ampliar las operaciones contra la base de datos que es posible realizar con el repository añadiendo líneas como las siguientes a esta interfaz:

   @Query("SELECT e FROM Equipo e WHERE e.equipo_cod=:id")
   Equipo findEquipoByEquipoCod(@Param("id")int id);

   @Transactional
   void deleteByNombre(String nombre);
*/
}