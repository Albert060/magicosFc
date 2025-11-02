package com.backend.magicosfc.app.modulos.torneos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/torneos")
public class TorneoController {
    @Autowired

    TorneoService torneoService;

    @GetMapping
    public List<Torneo> mostrarTorneo (){

        return torneoService.obtenerTorneo();

    }

    @GetMapping("/{id}")
    public Torneo mostrarPorId (@PathVariable Long id ){
        return torneoService.obtenerPorId(id);

    }

    @PostMapping
    public Torneo crearTorneo (@RequestBody Torneo nuevoTorneo){

        return torneoService.crearTorneo(nuevoTorneo);
    }

    @PutMapping
    public Torneo actualizarTorneo (@RequestBody Torneo actualizarTorneo){

        return torneoService.actualizarTorneo(actualizarTorneo);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        torneoService.borrarTorneo(id);

    }
}
