package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> getUsuario () {
        return usuarioService.getUsuario();
    }

    @PostMapping
    public void postUsuario (@RequestBody Usuario usuario) {
        usuarioService.addNewUser(usuario);
    }

    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return this.usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping
    public void deleteUsuario(@PathVariable long id){
        this.usuarioService.deleteUsuario(id);
    }

}
