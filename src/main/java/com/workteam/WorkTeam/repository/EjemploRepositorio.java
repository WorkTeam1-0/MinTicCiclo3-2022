package com.workteam.WorkTeam.repository;

import com.workteam.WorkTeam.entity.Ejemplo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EjemploRepositorio extends CrudRepository<Ejemplo, Long> {
    
}
