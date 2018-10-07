package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class ProyectoB implements ProyectoStrategy{
    private int id;
    private LocalDateTime fecha;
    private String descripcion;

    public ProyectoB(String descripcion) {
        this.id = 0;
        this.fecha = null;
        this.descripcion = descripcion;
    }

    public int getId() {
        return this.id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override public String descripcion() {
        return this.getDescripcion();
    }
}
