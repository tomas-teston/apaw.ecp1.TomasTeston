package es.upm.miw.apaw.ecp1.junit;

import java.util.HashMap;
import java.util.Map;

public final class EmpleadoReferencesFactory {

    private static EmpleadoReferencesFactory empleadoReferencesFactory = new EmpleadoReferencesFactory();

    private Map<Integer, Empleado> references;

    private EmpleadoReferencesFactory() {
        this.references = new HashMap<>();
    }

    public static EmpleadoReferencesFactory getFactory() {
        return empleadoReferencesFactory;
    }

    public Empleado getReference(Integer id) {
        return references.get(id);
    }

    public Empleado setReference(Empleado empleado) {
        return references.put(empleado.getId(), empleado);
    }

    public void removeReference(Integer key) {
        this.references.remove(key);
    }

}