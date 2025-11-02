package com.backend.magicosfc.app.modulos.cuerpoTecnico;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TecnicoService {
    @Autowired

    TecnicoRepository tecnicoRepository;
    @Transactional
    public List<Tecnico> obtenerTecnico (){

        return tecnicoRepository.findAll();

    }
    @Transactional
    public Tecnico obtenerPorId (Long id ){

        return tecnicoRepository.findById(id).get();

    }
    @Transactional
    public Tecnico crearTecnico (Tecnico nuevoTecnico){

        return tecnicoRepository.save(nuevoTecnico);

    }
    @Transactional
    public Tecnico actualizarTecnico (Tecnico nuevoTecnico){

        return tecnicoRepository.save(nuevoTecnico);

    }
    @Transactional
    public void borrarTecnico (Long id){

        tecnicoRepository.deleteById(id);
    }
}
