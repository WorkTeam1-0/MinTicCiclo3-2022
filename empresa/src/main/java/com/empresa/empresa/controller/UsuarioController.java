package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    /*public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }*/

    @GetMapping
    public List<Usuario> getUsuario () {
        return usuarioService.getUsuario();
    }

    @PostMapping
    public RedirectView postUsuario (@ModelAttribute Usuario usuario) {
        usuarioService.addNewUser(usuario);
        return new RedirectView("/usuario");
    }

    @PutMapping
    public RedirectView updateUsuario(@ModelAttribute Usuario usuario){
        this.usuarioService.updateUsuario(usuario);
        return new RedirectView("/usuario");
    }

    @GetMapping("/{id}")
    public RedirectView delete(@PathVariable long id){
        this.usuarioService.deleteUsuario(id);
        return new RedirectView("/usuario");
    }

}
