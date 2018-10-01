package es.upm.miw.apaw.ecp1.junit;

public class Nomina {
    private Double salario;
    private boolean cobrada;

    public Nomina() {
        this.salario = 0.0;
        this.cobrada = false;
    }

    public Nomina(Double salario, boolean cobrada) {
        this.salario = salario;
        this.cobrada = cobrada;
    }

    public Double getSalario() {
        return salario;
    }

    public boolean isCobrada() {
        return this.cobrada;
    }

}
