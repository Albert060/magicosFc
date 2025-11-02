package com.backend.magicosfc.app.modulos.medicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/medicos")
public class MedicoController {

    @Autowired
    MedicoService medicoService;

    @GetMapping
    public List<Medico> mostrarMedico (){

        return medicoService.obtenerMedico();

    }

    @GetMapping("/{id}")
    public Medico mostrarPorId (@PathVariable Long id ){
        return medicoService.obtenerPorId(id);

    }

    @PostMapping
    public Medico crearMedico (@RequestBody Medico nuevoMedico){

        return medicoService.crearMedico(nuevoMedico);
    }

    @PutMapping
    public Medico actualizarMedico (@RequestBody Medico actualizarMedico){

        return medicoService.actualizarMedico(actualizarMedico);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        medicoService.borrarMedico(id);

    }

}
