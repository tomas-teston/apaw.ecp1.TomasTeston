package es.upm.miw.apaw.ecp1.junit;

public class Jefe{

    private String id;
    private String nombre;
    private String telefono;

    public Jefe(String id, String nombre, String telefono) {
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

    public String getTelefono() {
        return telefono;
    }
}
