package com.cmx.power.refactorizacion;

public class IngenieroSoporte {
    double salario;

    public double setSalario(int nivel, double salario) {
        if (nivel==1)
            this.salario = 900;
        if (nivel==2)
            this.salario = 1500;
        return  calcularVariable(this.salario);
    }

    private double calcularVariable(double salario) {
        return  salario+salario*0.1;
    }
}


