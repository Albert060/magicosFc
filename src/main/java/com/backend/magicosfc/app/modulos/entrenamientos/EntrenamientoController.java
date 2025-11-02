package com.backend.magicosfc.app.modulos.entrenamientos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/Entrenamientos")
public class EntrenamientoController {

    @Autowired
    EntrenamientoService entrenamientoService;

    @GetMapping
    public List<Entrenamiento> mostrarEntrenamiento (){

        return entrenamientoService.obtenerEntrenamiento();

    }

    @GetMapping("/{id}")
    public Entrenamiento mostrarPorId (@PathVariable Long id ){
        return entrenamientoService.obtenerPorId(id);

    }

    @PostMapping
    public Entrenamiento crearEntrenamiento (@RequestBody Entrenamiento nuevoEntrenamiento){

        return entrenamientoService.crearEntrenamiento(nuevoEntrenamiento);
    }

    @PutMapping
    public Entrenamiento getActualizarEntrenamiento (@RequestBody Entrenamiento actualizarEntrenamiento){

        return entrenamientoService.actualizarEntrenamiento(actualizarEntrenamiento);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        entrenamientoService.borrarEntrenamiento(id);

    }
}
