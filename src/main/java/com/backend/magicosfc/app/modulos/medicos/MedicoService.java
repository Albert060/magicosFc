package com.backend.magicosfc.app.modulos.medicos;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {
    @Autowired

    MedicoRepository medicoRepository;
    @Transactional
    public List<Medico> obtenerMedico (){

        return medicoRepository.findAll();

    }
    @Transactional
    public Medico obtenerPorId (Long id ){

        return medicoRepository.findById(id).get();

    }
    @Transactional
    public Medico crearMedico (Medico nuevoMedico){

        return medicoRepository.save(nuevoMedico);

    }
    @Transactional
    public Medico actualizarMedico (Medico nuevoMedico){

        return medicoRepository.save(nuevoMedico);

    }
    @Transactional
    public void borrarMedico (Long id){

        medicoRepository.deleteById(id);
    }
}
