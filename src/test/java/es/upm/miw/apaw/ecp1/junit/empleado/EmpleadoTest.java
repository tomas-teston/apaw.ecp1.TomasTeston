package es.upm.miw.apaw.ecp1.junit.empleado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.miw.apaw.ecp1.junit.Empleado;
import es.upm.miw.apaw.ecp1.junit.EmpleadoReferencesFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmpleadoTest {

    private Empleado empleado;
    private Empleado empleado2;
    private Empleado empleadoEvento;

    ObserverEmpleadoTest observerEmpleadoTest;

    @BeforeEach
    void before() {
        this.empleado = new Empleado(0);
        this.empleado2 = new Empleado(1);
        EmpleadoReferencesFactory.getFactory().setReference(this.empleado);
        EmpleadoReferencesFactory.getFactory().setReference(this.empleado2);
        this.observerEmpleadoTest = new ObserverEmpleadoTest(EmpleadoReferencesFactory.getFactory());
    }

    @Test
    void testDepartamento() {
        assertNull(this.empleado.getDepartamento());
    }

    @Test
    void testJefe() {
        assertNull(this.empleado.getJefe());
    }

    @Test
    void testId() {
        assertEquals(0, this.empleado.getId());
    }

    @Test
    void testEdad() {
        assertEquals(0, this.empleado.getEdad());
    }

    @Test
    void testNombre() {
        assertEquals("", this.empleado.getNombre());
    }

    @Test
    void testNominas() {
        assertEquals(0, this.empleado.getNominas().size());
    }

    @Test
    void testReferencesFactory() {
        assertEquals(this.empleado.getId(), EmpleadoReferencesFactory.getFactory().getReference(this.empleado.getId()).getId());
        assertEquals(this.empleado2.getId(), EmpleadoReferencesFactory.getFactory().getReference(this.empleado2.getId()).getId());
    }

    @Test
    void testEventAddNewReferenceEmpleado(){
        this.empleadoEvento = new Empleado(2);
        EmpleadoReferencesFactory.getFactory().setReference(this.empleadoEvento);
        assertTrue(this.observerEmpleadoTest.getState());
    }


}
