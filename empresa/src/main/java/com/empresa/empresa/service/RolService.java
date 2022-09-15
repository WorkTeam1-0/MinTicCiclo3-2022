package com.empresa.empresa.service;

import com.empresa.empresa.entity.Rol;
import com.empresa.empresa.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    private final RolRepository rolRepository;

    @Autowired
    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    public List<Rol> getRol(){
        return rolRepository.findAll();
    }

    public void addNewRol (Rol rol){
        rolRepository.save(rol);
        System.out.println(rol);
    }
}
