package es.upm.miw.apaw.ecp1.junit;

public class Jefe extends JefeComponent {

    private int id;
    private String nombre;
    private int telefono;

    public Jefe(String name, int id, String nombre, String telefono) {
        super(name);
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

    @Override public void add(JefeComponent jefeComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override public void remove(JefeComponent jefeComponent) {
        throw new UnsupportedOperationException("Operación no soportada");
    }

    @Override public boolean isComposite() {
        return false;
    }

    @Override public String view() {
        return Integer.toString(this.getId());
    }
}
