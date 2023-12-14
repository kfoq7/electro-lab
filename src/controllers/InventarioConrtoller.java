package controllers;

import java.util.ArrayList;
import models.Inventory;
import services.InventoryService;

public class InventarioConrtoller {

    private InventoryService service;

    public InventarioConrtoller() throws Exception {
        service = new InventoryService();
    }

    public ArrayList<Inventory> getInvetarios() throws Exception {
        return service.getInvetarios();
    }

    public void saveInventory(Inventory invetory) {
        service.createInventory(invetory);
    }

}
