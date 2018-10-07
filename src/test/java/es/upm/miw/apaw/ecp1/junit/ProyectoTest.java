package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProyectoTest {

    private ProyectoA proyecto;
    private ProyectoStrategy proyectoA;
    private ProyectoStrategy proyectoB;
    private ProyectoContext proyectoContext;

    @BeforeEach
    void before() {
        this.proyecto = new ProyectoA("Proyecto para RRHH");
        this.proyectoB = new ProyectoB("Proyecto para Seguridad");
        this.proyectoContext = new ProyectoContext(proyecto);
    }

    @Test
    void testId() {
        assertEquals("0", proyecto.getId());
    }

    @Test
    void testFecha() {
        assertNull(proyecto.getFecha());
    }

    @Test
    void testStrategyProyectoA() {
        assertEquals("Proyecto para RRHH", this.proyectoContext.getDescripcion());
    }

    @Test
    void testStrategyProyectoB() {
        this.proyectoContext.setProyectoStrategy(proyectoB);
        assertEquals("Proyecto para Seguridad", this.proyectoContext.getDescripcion());
    }

}
