package com.proyecto.service;

import com.proyecto.ApplicationConfigApplication;
import com.proyecto.domain.Operacion;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationConfigApplication.class)
class ApplicationConfigApplicationTests {

    @Autowired
    private OperacionService operacionService;

    @Test
    void mostrarTodas_ejecutoMetodo_retornaListaDeOperaciones() {
        List<Operacion> listaDeOperaciones = operacionService.mostrarTodas();
        listaDeOperaciones.forEach(op -> {
            System.out.println(op.getId());
        });
        assertEquals(5, listaDeOperaciones.size());
    }

    void buscarPorId_ingresoIdExistente_retornaOperacion() {
        Operacion operacionBuscada = operacionService.buscarPorId(5);
        assertEquals("Concepto raro", operacionBuscada.getConcepto());
    }

}
