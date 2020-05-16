package com.cmx.power.refactorizacion;

public class IngenieroSoporte {
    double salario;

    public void setSalarioNivel1() {
        this.salario = 900;
    }

    public void setSalarioNivel2() {
        this.salario = 1500;
    }

    public double calcularVariable() {
        return  this.salario*0.1;
    }

    public double calcularSalario() {
        return this.salario + this.calcularVariable();
    }
}


