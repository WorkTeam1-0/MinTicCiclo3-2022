package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Transaccion;
import com.empresa.empresa.service.TransaccionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacciones")
public class TransaccionController {

    public final TransaccionService transaccionService;

    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @GetMapping
    public List<Transaccion> getTransaccion () {
        return transaccionService.getTransaccion();
    }

    @PostMapping
    public void postTransaccion (@RequestBody Transaccion transaccion) {
        transaccionService.addNewTransaccion(transaccion);
    }
}
