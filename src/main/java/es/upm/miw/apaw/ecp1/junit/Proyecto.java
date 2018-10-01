package es.upm.miw.apaw.ecp1.junit;

import java.time.LocalDateTime;

public class Proyecto {
    private int id;
    private LocalDateTime fecha;
    private String descripcion;

    public Proyecto() {
        this.id = 0;
        this.fecha = null;
        this.descripcion = "";
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

}
