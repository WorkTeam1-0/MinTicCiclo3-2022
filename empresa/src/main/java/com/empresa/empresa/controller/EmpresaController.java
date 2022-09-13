package com.empresa.empresa.controller;

import com.empresa.empresa.entity.Empresa;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequestMapping("/api")
public class EmpresaController {

    /*@GetMapping("/empresa/{id}")
    public Empresa findByIdEmpresa (@PathVariable long idEmpresa){
        Empresa empresa = new Empresa();
        empresa.setIdEmpresa(idEmpresa);
        empresa.setNombre("WorkTeam1.0 S.A");
        empresa.setTipoIdentificacion("NIT");
        empresa.setNumeroIdentificacion(12345689l);
        empresa.setTelefono(3135116275l);
        empresa.setDireccion("Cartagena");
        return empresa;
    }

    @PostMapping("/empresa")
    public Empresa createEmpresa (@RequestBody Empresa empresa){
        Empresa empresa1 = new Empresa();
        empresa1.setIdEmpresa(empresa1.getIdEmpresa());
        empresa1.setNombre(empresa1.getNombre());
        empresa1.setTipoIdentificacion(empresa1.getTipoIdentificacion());
        empresa1.setNumeroIdentificacion(empresa1.getNumeroIdentificacion());
        empresa1.setTelefono(empresa1.getTelefono());
        empresa1.setDireccion(empresa1.getDireccion());
        return empresa1;
    }

    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa (@PathVariable long idEmpresa, @RequestBody Empresa empresa) {
        Empresa empresa2 = new Empresa();
        empresa2.setIdEmpresa(idEmpresa);
        empresa2.setNombre("WorkTeam2.0 S.A");
        empresa2.setTipoIdentificacion("RUT");
        empresa2.setNumeroIdentificacion(345667788l);
        empresa2.setTelefono(3215433444l);
        empresa2.setDireccion("BOGOTÁ");
        return empresa2;
    }

    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long idEmpresa){
        Empresa deleteEmpresa = findByIdEmpresa(idEmpresa);

    }*/
}
