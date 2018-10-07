package es.upm.miw.apaw.ecp1.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JefeTest {

    private JefeComposite jefeComposite;
    private Jefe jefe;

    @BeforeEach
    void before() {
        this.jefeComposite = new JefeComposite("composicion");
        this.jefe = new Jefe("JefeRRHH", 1, "Ramon", "918551234");
        this.jefeComposite.add(jefe);
    }

    @Test
    void testNombre() {
        assertEquals("Ramon", jefe.getNombre());
    }

    @Test
    void testId() {
        assertEquals(0, jefe.getId());
    }

    @Test
    void testTelefono() {
        assertEquals(0, jefe.getTelefono());
    }

    @Test
    void testCompositeView(){
        assertEquals("composicion", this.jefeComposite.view());
    }

    @Test
    void testLeafJefeView(){
        assertEquals("0", this.jefe.view());
    }


}
