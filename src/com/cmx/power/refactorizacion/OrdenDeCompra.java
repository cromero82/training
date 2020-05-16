package com.cmx.power.refactorizacion;

import java.util.ArrayList;
import java.util.List;

public class OrdenDeCompra {
    private String  id;
    private Cliente cliente;
    List<Cliente> items = new ArrayList<>();

    public void agregarCliente(Cliente _cliente){
        items.add(_cliente);
    }

    public int getTotalItems() {
        return this.items.size();
    }
}
