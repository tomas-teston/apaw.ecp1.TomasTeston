package es.upm.miw.apaw.ecp1.junit;

public class ProyectoContext {
    private ProyectoStrategy proyectoStrategy;

    public ProyectoContext(ProyectoStrategy proyectoStrategy) {
        this.proyectoStrategy = proyectoStrategy;
    }

    public void setProyectoStrategy(ProyectoStrategy proyectoStrategy) {
        this.proyectoStrategy = proyectoStrategy;
    }

    public String getDescripcion() {
        return proyectoStrategy.descripcion();
    }
}
