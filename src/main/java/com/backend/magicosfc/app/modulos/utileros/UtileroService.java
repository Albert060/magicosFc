package com.backend.magicosfc.app.modulos.utileros;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UtileroService {
    @Autowired

    UtileroRepository utileroRepository;
    @Transactional
    public List<Utilero> obtenerUtilero (){

        return utileroRepository.findAll();

    }
    @Transactional
    public Utilero obtenerPorId (Long id ){

        return utileroRepository.findById(id).get();

    }
    @Transactional
    public Utilero crearUtilero (Utilero nuevoUtilero){

        return utileroRepository.save(nuevoUtilero);

    }
    @Transactional
    public Utilero actualizarUtilero (Utilero nuevoUtilero){

        return utileroRepository.save(nuevoUtilero);

    }
    @Transactional
    public void borrarUtilero (Long id){

        utileroRepository.deleteById(id);
    }
}
