package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Empresa;
import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.EmpresaService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView updateEmpresa(@ModelAttribute Empresa empresa){
        this.empresaService.updateEmpresa(empresa);
        return new RedirectView("/empresa");
    }

    @DeleteMapping ("/{id}")
    public void deleteEmpresa (@PathVariable long id){
        this.empresaService.deleteEmpresa(id);
    }
}
