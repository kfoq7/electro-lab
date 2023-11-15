package controllers;

import java.io.IOException;
import java.util.ArrayList;
import models.Inventory;
import services.InventoryService;

public class InventarioConrtoller {

    private InventoryService service;

    public InventarioConrtoller() throws IOException {
        service = new InventoryService();
    }

    public ArrayList<Inventory> getInvetarios() throws IOException {
        return service.getInvetarios();
    }

}
