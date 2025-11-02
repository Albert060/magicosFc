package com.backend.magicosfc.app.modulos.equipos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoService {
    @Autowired

    EquipoRepository equipoRepository;
    @Transactional
    public List<Equipo> obtenerEquipo (){

        return equipoRepository.findAll();

    }
    @Transactional
    public Equipo obtenerPorId (Long id ){
        return equipoRepository.findById(id).get();

    }
    @Transactional
    public Equipo crearEquipo (Equipo nuevoEquipo){

        return equipoRepository.save(nuevoEquipo);

    }
    @Transactional
    public Equipo actualizarEquipo (Equipo nuevoEquipo){

        return equipoRepository.save(nuevoEquipo);

    }
    @Transactional
    public void borrarEquipo (Long id){

        equipoRepository.deleteById(id);
    }
}
