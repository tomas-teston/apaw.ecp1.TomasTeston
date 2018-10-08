package es.upm.miw.apaw.ecp1.junit;

public class Jefe{

    private String id;
    private String nombre;
    private int telefono;

    public Jefe(String id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
