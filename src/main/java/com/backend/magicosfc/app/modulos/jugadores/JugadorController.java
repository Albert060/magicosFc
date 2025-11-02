package com.backend.magicosfc.app.modulos.jugadores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/Jugadores")
public class JugadorController {

    @Autowired
    JugadorService jugadorService;

    @GetMapping
    public List<Jugador> mostrarJugadores (){

        return jugadorService.obtenerJugadores();

    }

    @GetMapping("/{id}")
    public Jugador mostrarPorId (@PathVariable Long id ){
        return jugadorService.obtenerPorId(id);

    }

    @PostMapping
    public Jugador crearJugador (@RequestBody Jugador nuevoJugador){

        return jugadorService.crearJugador(nuevoJugador);
    }

    @PutMapping
    public Jugador actualizarJugador (@RequestBody Jugador actualizarJugador){

        return jugadorService.actualizarJugador(actualizarJugador);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        jugadorService.borrarJugador(id);

    }
}
