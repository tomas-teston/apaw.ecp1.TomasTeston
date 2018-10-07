package es.upm.miw.apaw.ecp1.junit;

public class Jefe{

    private int id;
    private String nombre;
    private int telefono;

    public Jefe(int id, String nombre, String telefono) {
        this.id = 0;
        this.nombre = nombre;
        this.telefono = 0;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
