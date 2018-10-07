package es.upm.miw.apaw.ecp1.junit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ObserverEmpleado implements Observer {

    private EmpleadoReferencesFactory empleadoReferencesFactory;
    private String state = "";

    public ObserverEmpleado(EmpleadoReferencesFactory empleadoReferencesFactory) {
        this.empleadoReferencesFactory = empleadoReferencesFactory;
        this.empleadoReferencesFactory.addObserver(this);
    }

    @Override
    public void update() {
        LogManager.getLogger(this.getClass()).debug("update");
    }

    public String getState() {
        return state;
    }


}
