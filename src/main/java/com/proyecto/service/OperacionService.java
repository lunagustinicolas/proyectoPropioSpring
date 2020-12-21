/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.service;

import com.proyecto.domain.Operacion;
import java.util.List;

/**
 *
 * @author Agustin
 */
public interface OperacionService {

    Operacion buscarPorId(long id);
    
    List<Operacion> mostrarTodas();
    
    void agregarOperacion(Operacion operacion);
}
