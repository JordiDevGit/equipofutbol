package com.jordigarcia.equipofutbol.controller;

import com.jordigarcia.equipofutbol.entities.Jugador;
import com.jordigarcia.equipofutbol.persistence.repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin // Para hacer peticiones desde otro servidor
@RestController // Para hacer peticiones REST
@RequestMapping("/jugadores")
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;

    @PostMapping("/")
    public void createJugador(@RequestBody Jugador person) {
        jugadorRepository.save(person);
    }

    @DeleteMapping("/{id}")
    public void deleteJugador(@PathVariable("id") Integer id) {
        Jugador i = new Jugador();
        i.setJugadorCod(id);
        jugadorRepository.delete(i);
    }

    @GetMapping("/{id}")
    public List<Jugador> selectJugador(@PathVariable("id") Integer id) {
        return jugadorRepository.findPlayerByEquipoCod(id);
    }

    @PutMapping("/{id}")
    public void updateJugador(@RequestBody Jugador jugador, @PathVariable("id")Integer id) {
        jugador.setJugadorCod(id);
        jugadorRepository.save(jugador);
    }
}
