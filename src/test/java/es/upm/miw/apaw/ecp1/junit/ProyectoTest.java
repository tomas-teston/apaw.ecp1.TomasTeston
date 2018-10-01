package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ProyectoTest {

    private Proyecto proyecto;

    @BeforeEach
    void before() {
        this.proyecto = new Proyecto();
    }

    @Test
    void testId() {
        assertEquals(0,proyecto.getId());
    }

    @Test
    void testFecha() {
        assertNull(proyecto.getFecha());
    }

    @Test
    void testDescripcion() {
        assertEquals("", proyecto.getDescripcion());
    }

}
