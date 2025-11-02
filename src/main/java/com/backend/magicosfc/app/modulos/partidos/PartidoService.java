package com.backend.magicosfc.app.modulos.partidos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PartidoService {
    @Autowired

    PartidoRepository partidoRepository;
    @Transactional
    public List<Partido> obtenerPartido (){

        return partidoRepository.findAll();

    }
    @Transactional
    public Partido obtenerPorId (Long id ){

        return partidoRepository.findById(id).get();

    }
    @Transactional
    public Partido crearPartido (Partido nuevoPartido){

        return partidoRepository.save(nuevoPartido);

    }
    @Transactional
    public Partido actualizarPartido (Partido nuevoPartido){

        return partidoRepository.save(nuevoPartido);

    }
    @Transactional
    public void borrarPartido (Long id){

        partidoRepository.deleteById(id);
    }
}
