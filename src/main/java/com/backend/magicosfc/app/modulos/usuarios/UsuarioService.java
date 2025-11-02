package com.backend.magicosfc.app.modulos.usuarios;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    @Autowired

    UsuarioRepository usuarioRepository;
    @Transactional
    public List<Usuario> obtenerUsuario (){

        return usuarioRepository.findAll();

    }
    @Transactional
    public Usuario obtenerPorId (Long id ){

        return usuarioRepository.findById(id).get();

    }
    @Transactional
    public Usuario crearUsuario (Usuario nuevoUsuario){

        return usuarioRepository.save(nuevoUsuario);

    }
    @Transactional
    public Usuario actualizarUsuario (Usuario nuevoUsuario){

        return usuarioRepository.save(nuevoUsuario);

    }
    @Transactional
    public void borrarUsuario (Long id){

        usuarioRepository.deleteById(id);
    }
}
