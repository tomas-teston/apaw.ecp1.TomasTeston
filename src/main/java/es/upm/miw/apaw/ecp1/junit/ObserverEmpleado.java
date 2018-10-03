package es.upm.miw.apaw.ecp1.junit;

public class ObserverEmpleado implements Observer {

    private EmpleadoReferencesFactory empleadoReferencesFactory;
    private String state = "";

    public ObserverEmpleado(EmpleadoReferencesFactory empleadoReferencesFactory) {
        this.empleadoReferencesFactory = empleadoReferencesFactory;
        this.empleadoReferencesFactory.addObserver(this);
    }

    @Override
    public void update() {
        this.state = "añadido";
    }

    public String getState() {
        return state;
    }


}
