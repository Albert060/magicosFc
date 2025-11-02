package com.backend.magicosfc.app.modulos.torneos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TorneoService {
    @Autowired

    TorneoRepository torneoRepository;
    @Transactional
    public List<Torneo> obtenerTorneo (){

        return torneoRepository.findAll();

    }
    @Transactional
    public Torneo obtenerPorId (Long id ){

        return torneoRepository.findById(id).get();

    }
    @Transactional
    public Torneo crearTorneo (Torneo nuevoTorneo){

        return torneoRepository.save(nuevoTorneo);

    }
    @Transactional
    public Torneo actualizarTorneo (Torneo nuevoTorneo){

        return torneoRepository.save(nuevoTorneo);

    }
    @Transactional
    public void borrarTorneo (Long id){

        torneoRepository.deleteById(id);
    }
}
