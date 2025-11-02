package com.backend.magicosfc.app.modulos.utileros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/utileros")
public class UtileroController {
    @Autowired

    UtileroService utileroService;

    @GetMapping
    public List<Utilero> mostrarUtilero (){

        return utileroService.obtenerUtilero();

    }

    @GetMapping("/{id}")
    public Utilero mostrarPorId (@PathVariable Long id ){
        return utileroService.obtenerPorId(id);

    }

    @PostMapping
    public Utilero crearUtilero (@RequestBody Utilero nuevoUtilero){

        return utileroService.crearUtilero(nuevoUtilero);
    }

    @PutMapping
    public Utilero actualizarUtilero (@RequestBody Utilero actualizarUtilero){

        return utileroService.actualizarUtilero(actualizarUtilero);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        utileroService.borrarUtilero(id);

    }
}
