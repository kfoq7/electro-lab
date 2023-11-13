package controllers;

import java.io.IOException;
import java.util.ArrayList;
import models.Inventario;
import services.InventarioService;

public class InventarioConrtoller {

    private InventarioService service;

    public InventarioConrtoller() throws IOException {
        service = new InventarioService();
    }

    public ArrayList<Inventario> getInvetarios() throws IOException {
        return service.getInvetarios();
    }

}
