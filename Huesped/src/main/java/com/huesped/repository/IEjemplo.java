package com.huesped.repository;

import com.huesped.entity.Ejemplo;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IEjemplo extends CrudRepository<Ejemplo,String>{

}
