package com.backend.magicosfc.app.modulos.equipos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/equipos")
public class EquipoController {
    @Autowired

    EquipoService equipoService;

    @GetMapping
    public List<Equipo> mostrarEquipo (){

        return equipoService.obtenerEquipo();

    }

    @GetMapping("/{id}")
    public Equipo mostrarPorId (@PathVariable Long id ){
        return equipoService.obtenerPorId(id);

    }

    @PostMapping
    public Equipo crearEquipo (@RequestBody Equipo nuevoEquipo){

        return equipoService.crearEquipo(nuevoEquipo);
    }

    @PutMapping
    public Equipo actualizarEquipo (@RequestBody Equipo actualizarEquipo){

        return equipoService.actualizarEquipo(actualizarEquipo);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        equipoService.borrarEquipo(id);

    }
}
