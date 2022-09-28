package com.empresa.empresa.FrontController;

import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping ("/usuario")
public class FrontUsuario {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public String index (Model modelo) {
        modelo.addAttribute("usuarios", usuarioService.getUsuario());
        return "Usuarios";
    }

    @GetMapping ("/nuevoUsuario")
    public String newUsuario (Model modelo){
        modelo.addAttribute("usuario", new Usuario());
        return "registerUsuario";
    }
}
