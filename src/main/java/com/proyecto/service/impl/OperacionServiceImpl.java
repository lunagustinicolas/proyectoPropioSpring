/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.service.impl;

import com.proyecto.domain.Operacion;
import com.proyecto.repository.OperacionRepository;
import com.proyecto.service.OperacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Agustin
 */
@Service
@Transactional
public class OperacionServiceImpl implements OperacionService {

    @Autowired
    private OperacionRepository operacionRepository;

    @Override
    public Operacion buscarPorId(long id) {
        return operacionRepository
                .findById(id)
                .orElse(null);
    }

    @Override
    public List<Operacion> mostrarTodas() {
        return operacionRepository
                .findAll();
    }

    @Override
    public void agregarOperacion(Operacion operacion) {
        operacionRepository.save(operacion);
    }

}
