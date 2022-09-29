package com.empresa.empresa.FrontController;

import com.empresa.empresa.entity.Empresa;
import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.service.EmpresaService;
import com.empresa.empresa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/empresa")
public class FrontEmpresa {

    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public String index (Model modelo) {
        modelo.addAttribute("empresa", empresaService.getEmpresa());
        return "Empresa";
    }

    @GetMapping ("/nuevaEmpresa")
    public String newEmpresa (Model modelo){
        modelo.addAttribute("empresa", new Empresa());
        return "registerEmpresa";
    }

    @GetMapping ("/actualizarEmpresa/{id}")
    public String updateEmpresa (Model modelo, @PathVariable long id){
        modelo.addAttribute("empresa", empresaService.getEmpresaForId(id));
        return "actualizarEmpresa";
    }
}
