package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Empleado;
import com.empresa.empresa.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleado")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<Empleado> getEmpleado () {
        return empleadoService.getEmpleado();
    }

    @PostMapping
    public void postEmpleado (@RequestBody Empleado empleado) {
        empleadoService.addNewEmpleado(empleado);
    }

    @PutMapping
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.updateEmpleado(empleado);
    }

    @DeleteMapping ("/{id}")
    public void deleteEmpleado(@PathVariable long id){
        this.empleadoService.deleteEmpleado(id);
    }

}
