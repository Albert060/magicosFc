package com.backend.magicosfc.app.modulos.resultados;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ResultadoService {
    @Autowired

    ResultadoRepository resultadoRepository;
    @Transactional
    public List<Resultado> obtenerResultado (){

        return resultadoRepository.findAll();

    }
    @Transactional
    public Resultado obtenerPorId (Long id ){

        return resultadoRepository.findById(id).get();

    }
    @Transactional
    public Resultado crearResultado (Resultado nuevoResultado){

        return resultadoRepository.save(nuevoResultado);

    }
    @Transactional
    public Resultado actualizarResultado (Resultado nuevoResultado){

        return resultadoRepository.save(nuevoResultado);

    }
    @Transactional
    public void borrarResultado (Long id){

        resultadoRepository.deleteById(id);
    }
}
