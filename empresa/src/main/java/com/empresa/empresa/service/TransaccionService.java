package com.empresa.empresa.service;

import com.empresa.empresa.entity.Transaccion;
import com.empresa.empresa.repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {

    private final TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    @Autowired
    public List<Transaccion> getTransaccion() {
        return transaccionRepository.findAll();
    }

    public void addNewTransaccion(Transaccion transaccion) {
        transaccionRepository.save(transaccion);
        System.out.println(transaccion);
    }

    public Transaccion updateTransaccion(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public void deleteTransaccion(long id) {
        transaccionRepository.deleteById(id);
    }
}
