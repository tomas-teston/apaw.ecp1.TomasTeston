package es.upm.miw.apaw.ecp1.junit;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private int edad;

    private List<Nomina> nominas;
    private Departamento departamento;
    private Jefe jefe;

    public Empleado() {
        this.id = 0;
        this.nombre = "";
        this.edad = 0;
        this.nominas = new ArrayList<>();
        this.departamento = null;
        this.jefe = null;

    }

    public Empleado(int id) {
        this();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Jefe getJefe() { return this.jefe; }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Nomina> getNominas() {
        return nominas;
    }

}