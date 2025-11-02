package com.backend.magicosfc.app.modulos.entrenamientos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenamientoService {
    @Autowired

    EntrenamientoRepository entrenamientoRepository;
    @Transactional
    public List<Entrenamiento> obtenerEntrenamiento (){

        return entrenamientoRepository.findAll();

    }
    @Transactional
    public Entrenamiento obtenerPorId (Long id ){
        return entrenamientoRepository.findById(id).get();

    }
    @Transactional
    public Entrenamiento crearEntrenamiento (Entrenamiento nuevoEntrenamiento){

        return entrenamientoRepository.save(nuevoEntrenamiento);

    }
    @Transactional
    public Entrenamiento actualizarEntrenamiento (Entrenamiento nuevoEntrenamiento){

        return entrenamientoRepository.save(nuevoEntrenamiento);

    }
    @Transactional
    public void borrarEntrenamiento (Long id){

        entrenamientoRepository.deleteById(id);
    }


}
