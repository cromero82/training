package com.cmx.power.refactorizacion;

public class Cliente {
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    String codigo;
    String nombre;
    double precio;

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
