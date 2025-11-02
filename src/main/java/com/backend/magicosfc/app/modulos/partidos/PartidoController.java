package com.backend.magicosfc.app.modulos.partidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/partidos")
public class PartidoController {
    @Autowired

    PartidoService partidoService;

    @GetMapping
    public List<Partido> mostrarPartido (){

        return partidoService.obtenerPartido();

    }

    @GetMapping("/{id}")
    public Partido mostrarPorId (@PathVariable Long id ){
        return partidoService.obtenerPorId(id);

    }

    @PostMapping
    public Partido crearPartido (@RequestBody Partido nuevoPartido){

        return partidoService.crearPartido(nuevoPartido);
    }

    @PutMapping
    public Partido actualizarPartido (@RequestBody Partido actualizarPartido){

        return partidoService.actualizarPartido(actualizarPartido);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        partidoService.borrarPartido(id);

    }
}
