package com.empresa.empresa.service;

import com.empresa.empresa.entity.Empleado;
import com.empresa.empresa.entity.Usuario;
import com.empresa.empresa.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {
    private final EmpleadoRepository empleadoRepository;

    @Autowired
    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> getEmpleado() {
        return empleadoRepository.findAll();
    }

    public void addNewEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }


    public Empleado updateEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    public void deleteEmpleado(long id) {
        empleadoRepository.deleteById(id);

    }
}
