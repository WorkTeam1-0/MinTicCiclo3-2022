package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Empresa;
import com.empresa.empresa.service.EmpresaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping
    public List<Empresa> getEmpresa () {
        return empresaService.getEmpresa();
    }

    @PostMapping
    public void postEmpresa (@RequestBody Empresa empresa) {
        empresaService.addNewEmpresa(empresa);
    }

    @PutMapping
    public Empresa updateEmpresa (@RequestBody Empresa empresa){
        return this.empresaService.updateEmpresa(empresa);}

    @DeleteMapping ("/{id}")
    public void deleteEmpresa (@PathVariable long id){
        this.empresaService.deleteEmpresa(id);
    }
}
