package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Inventory;
import services.InventoryService;

public class InventarioConrtoller {

    private InventoryService service;

    public InventarioConrtoller() throws SQLException {
        service = new InventoryService();
    }

    public ArrayList<Inventory> getInvetarios() throws SQLException {
        return service.getInvetarios();
    }

    public void saveInventory(Inventory invetory)throws SQLException{
        service.createInventory(invetory);
    }
    
}
