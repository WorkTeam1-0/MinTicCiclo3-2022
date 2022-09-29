package com.empresa.empresa.service;

import com.empresa.empresa.entity.Empresa;
import com.empresa.empresa.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

    private final EmpresaRepository empresaRepository;


    @Autowired
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> getEmpresa(){
        return empresaRepository.findAll();
    }

    public void addNewEmpresa (Empresa empresa){
        empresaRepository.save(empresa);
        System.out.println(empresa);
    }

    public Empresa updateEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    public void deleteEmpresa(long id) {
        empresaRepository.deleteById(id);
    }

    public Empresa getEmpresaForId(long id) {
        Empresa empresa=empresaRepository.findById(id).get();
        return empresa;
    }
}
