package com.backend.magicosfc.app.modulos.jugadores;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorService {
    @Autowired

    JugadorRepository jugadorRepository;
    @Transactional
    public List<Jugador> obtenerJugadores (){

        return jugadorRepository.findAll();

    }
    @Transactional
    public Jugador obtenerPorId (Long id ){

        return jugadorRepository.findById(id).get();

    }
    @Transactional
    public Jugador crearJugador (Jugador nuevoJugador){

        return jugadorRepository.save(nuevoJugador);

    }
    @Transactional
    public Jugador actualizarJugador (Jugador nuevoJugador){

        return jugadorRepository.save(nuevoJugador);

    }
    @Transactional
    public void borrarJugador (Long id){

        jugadorRepository.deleteById(id);
    }
}
