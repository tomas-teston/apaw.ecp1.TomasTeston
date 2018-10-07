package es.upm.miw.apaw.ecp1.junit.empleado;

import es.upm.miw.apaw.ecp1.junit.EmpleadoReferencesFactory;
import es.upm.miw.apaw.ecp1.junit.Observer;

public class ObserverEmpleadoTest implements Observer {

    private EmpleadoReferencesFactory empleadoReferencesFactory;
    private boolean lanzado = false;

    public ObserverEmpleadoTest(EmpleadoReferencesFactory empleadoReferencesFactory) {
        this.empleadoReferencesFactory = empleadoReferencesFactory;
        this.empleadoReferencesFactory.addObserver(this);
    }

    @Override
    public void update() {
        this.lanzado = true;
    }

    public boolean getState() {
        return this.lanzado;
    }


}
