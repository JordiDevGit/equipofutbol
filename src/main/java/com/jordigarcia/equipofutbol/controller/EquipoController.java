package com.jordigarcia.equipofutbol.controller;

import com.jordigarcia.equipofutbol.entities.Equipo;
import com.jordigarcia.equipofutbol.persistence.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin // Para hacer peticiones desde otro servidor
@RestController // Para hacer peticiones REST
@RequestMapping("/people")
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;

    @PostMapping("/")
    public void createEquipo(@RequestBody Equipo person) {
        equipoRepository.save(person);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipo(@PathVariable("id") Integer id) {
        Equipo i = new Equipo();
        i.setEquipoCod(id);
        equipoRepository.delete(i);
    }

    @GetMapping
    public List<Equipo> selectEquipo() {
        List<Equipo> equipos = equipoRepository.findAll();
        return equipos;
    }

    @PutMapping("/{id}")
    public void updateEquipo(@RequestBody Equipo equipo, @PathVariable("id")Integer id) {
        equipo.setEquipoCod(id);
        equipoRepository.save(equipo);
    }
}
