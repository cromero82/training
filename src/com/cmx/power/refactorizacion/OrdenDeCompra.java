package com.cmx.power.refactorizacion;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
    private String  id;
    private Cliente cliente;
    List<String> items = new ArrayList<>();
    int totalItems=0;

    public void agregarCliente(String codigo, String nombre, double precio){
        items.add(new String[]{codigo, nombre, String.valueOf(precio)});
        totalItems++;
    }

    public int getTotalItems() {
        return this.totalItems;
    }
}
