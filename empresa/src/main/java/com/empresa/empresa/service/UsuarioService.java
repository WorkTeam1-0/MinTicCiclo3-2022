package com.empresa.empresa.service;

import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getUsuario(){
        return usuarioRepository.findAll();
    }

    public void addNewUser (Usuario usuario){
        usuarioRepository.save(usuario);
        System.out.println(usuario);
    }

}