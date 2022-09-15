package com.empresa.empresa.repository;

import com.empresa.empresa.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository <Transaccion, Long> {
}
