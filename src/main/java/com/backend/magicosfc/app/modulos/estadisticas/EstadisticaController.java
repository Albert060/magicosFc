package com.backend.magicosfc.app.modulos.estadisticas;

import com.backend.magicosfc.app.modulos.cuerpoTecnico.Tecnico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/Estadisticas")
public class EstadisticaController {
    @Autowired

    EstadisticaService estadisticaService;

    @GetMapping
    public List<Estadistica> mostrarEstadisticas (){

        return estadisticaService.obtenerEstadisticas();

    }

    @GetMapping("/{id}")
    public Estadistica mostrarPorId (@PathVariable Long id ){
        return estadisticaService.obtenerPorId(id);

    }

    @PostMapping
    public Estadistica crearEstadistica (@RequestBody Estadistica nuevaEstadistica){

        return estadisticaService.crearEstadistica(nuevaEstadistica);
    }

    @PutMapping
    public Estadistica actualizarEstadistica (@RequestBody Estadistica actualizarEstadistica){

        return estadisticaService.actualizarEstadistica(actualizarEstadistica);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        estadisticaService.borrarEstadistica(id);

    }
}
