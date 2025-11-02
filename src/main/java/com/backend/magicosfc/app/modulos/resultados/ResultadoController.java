package com.backend.magicosfc.app.modulos.resultados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("api/Resultados")

public class ResultadoController {
    @Autowired
    ResultadoService resultadoService;

    @GetMapping
    public List<Resultado> mostrarResultado (){

        return resultadoService.obtenerResultado();

    }

    @GetMapping("/{id}")
    public Resultado mostrarPorId (@PathVariable Long id ){
        return resultadoService.obtenerPorId(id);

    }

    @PostMapping
    public Resultado crearResultado (@RequestBody Resultado nuevoResultado){

        return resultadoService.crearResultado(nuevoResultado);
    }

    @PutMapping
    public Resultado actualizarResultado (@RequestBody Resultado actualizarResultado){

        return resultadoService.actualizarResultado(actualizarResultado);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        resultadoService.borrarResultado(id);

    }
}
