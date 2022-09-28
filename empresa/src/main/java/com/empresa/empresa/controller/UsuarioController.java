package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/api/user")
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
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public RedirectView delete(@PathVariable long id){
        this.usuarioService.deleteUsuario(id);
        return new RedirectView("/usuario");
    }

}
