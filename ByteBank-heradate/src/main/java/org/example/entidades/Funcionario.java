package org.example.entidades;


public class Funcionario {
    private String nombre;
    private int documento;
    private double salario;

    public Funcionario(String nombre, int documento, double salario) {
        this.nombre = nombre;
        this.documento = documento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double bonificacion(){
        return this.salario * 0.1;
    }
}
