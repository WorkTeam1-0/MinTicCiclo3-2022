package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Rol;
import com.empresa.empresa.service.RolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol")
public class RolController {
    private final RolService rolService;

    public RolController(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> getRol () {
        return rolService.getRol();
    }

    @PostMapping
    public void postRol (@RequestBody Rol rol) {
        rolService.addNewRol(rol);
    }
}