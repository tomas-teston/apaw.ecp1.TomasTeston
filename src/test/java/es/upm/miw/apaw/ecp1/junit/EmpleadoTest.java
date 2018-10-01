package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmpleadoTest {

    private Empleado empleado;

    @BeforeEach
    void before() {
        this.empleado = new Empleado();
    }

    @Test
    void testDepartamento() {
        assertNull(empleado.getDepartamento());
    }

    @Test
    void testId() {
        assertEquals(0, empleado.getId());
    }

    @Test
    void testEdad() {
        assertEquals(0, empleado.getEdad());
    }

    @Test
    void testNombre() {
        assertEquals("", empleado.getNombre());
    }

    @Test
    void testNominas() {
        assertEquals(0, empleado.getNominas().size());
    }


}
