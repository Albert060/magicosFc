package com.backend.magicosfc.app.modulos.cuerpoTecnico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/cuerpoTecnico")
public class TecnicoController {

    @Autowired
    TecnicoService tecnicoService;

    @GetMapping
    public List<Tecnico> mostrarTecnico (){

        return tecnicoService.obtenerTecnico();

    }

    @GetMapping("/{id}")
    public Tecnico mostrarPorId (@PathVariable Long id ){
        return tecnicoService.obtenerPorId(id);

    }

    @PostMapping
    public Tecnico crearTecnico (@RequestBody Tecnico nuevoTecnico){

        return tecnicoService.crearTecnico(nuevoTecnico);
    }

    @PutMapping
    public Tecnico actualizarTecnico (@RequestBody Tecnico actualizarTecnico){

        return tecnicoService.actualizarTecnico(actualizarTecnico);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        tecnicoService.borrarTecnico(id);

    }

}
