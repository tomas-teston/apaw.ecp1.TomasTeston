package es.upm.miw.apaw.ecp1.junit;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private Departamento departamento;
    private String nombre;
    private int edad;

    private List<Nomina> nominas;

    public Empleado() {
        this.id = 0;
        this.departamento = null;
        this.nombre = "";
        this.edad = 0;
        this.nominas = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

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