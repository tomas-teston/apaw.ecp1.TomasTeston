package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JefeTest {

    private Jefe jefe;

    @BeforeEach
    void before() {
        this.jefe = new Jefe();
    }

    @Test
    void testNombre() {
        assertEquals("", jefe.getNombre());
    }

    @Test
    void testId() {
        assertEquals(0, jefe.getId());
    }

    @Test
    void testTelefono() {
        assertEquals(0, jefe.getTelefono());
    }


}
