package com.backend.magicosfc.app.modulos.estadisticas;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EstadisticaService {
    @Autowired

    EstadisticaRepository estadisticaRepository;
    @Transactional
    public List<Estadistica> obtenerEstadisticas (){

        return estadisticaRepository.findAll();

    }
    @Transactional
    public Estadistica obtenerPorId (Long id ){

        return estadisticaRepository.findById(id).get();

    }
    @Transactional
    public Estadistica crearEstadistica (Estadistica nuevaEstadistica){

        return estadisticaRepository.save(nuevaEstadistica);

    }
    @Transactional
    public Estadistica actualizarEstadistica (Estadistica nuevaEstadistica){

        return estadisticaRepository.save(nuevaEstadistica);

    }
    @Transactional
    public void borrarEstadistica (Long id){

        estadisticaRepository.deleteById(id);
    }
}
