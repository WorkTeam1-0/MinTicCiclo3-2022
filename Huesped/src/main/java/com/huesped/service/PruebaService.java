package com.huesped.service;

import com.huesped.entity.Ejemplo;
import com.huesped.repository.IEjemplo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PruebaService {

    @Autowired
    private IEjemplo repositorio;

   public void create(Ejemplo ejemplo) {
       repositorio.save(ejemplo);
    }

   public void update(Ejemplo ejemplo){
       repositorio.save(ejemplo);
   }

   public void delete(Ejemplo ejemplo){
       repositorio.delete(ejemplo);
   }

}
