package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class NominaTest {

    private Nomina nomina;

    @BeforeEach
    void before() {
        this.nomina = new Nomina(2.0, false);
    }

    @Test
    void testSalario() {
        assertEquals(0,0, nomina.getSalario());
    }

    @Test
    void testCobrada() {
        assertFalse(nomina.isCobrada());
    }

}
