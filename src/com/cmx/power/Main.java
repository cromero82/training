package com.cmx.power;
import  com.cmx.power.refactorizacion.*;
public class Main {

    public static void main(String[] args) {
        IngenieroSoporte obj = new IngenieroSoporte();
        obj.setSalarioNivel1();
        System.out.println(obj.calcularSalario());
    }
}
