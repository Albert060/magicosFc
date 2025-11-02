package com.backend.magicosfc.app.modulos.usuarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping ("/api/Usuarios")
public class UsuarioController {
    @Autowired

    UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> mostrarTecnico (){

        return usuarioService.obtenerUsuario();

    }

    @GetMapping("/{id}")
    public Usuario mostrarPorId (@PathVariable Long id ){
        return usuarioService.obtenerPorId(id);

    }

    @PostMapping
    public Usuario crearUsuario (@RequestBody Usuario nuevoUsuario){

        return usuarioService.crearUsuario(nuevoUsuario);
    }

    @PutMapping
    public Usuario actualizarUsuario (@RequestBody Usuario actualizarUsuario){

        return usuarioService.actualizarUsuario(actualizarUsuario);
    }

    @DeleteMapping("/{id}")
    public void  borrarPorId (@PathVariable Long id ){
        usuarioService.borrarUsuario(id);

    }
}
