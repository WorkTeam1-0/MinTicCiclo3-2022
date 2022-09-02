package com.workteam.WorkTeam.controller;

import com.workteam.WorkTeam.service.EjemploServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class EjemploControlador {
    
    @Autowired
    private EjemploServicio ejemploServicio;
    
    // Metodos HTTP (GET, POST, PATCH, DELETE)
    
}
