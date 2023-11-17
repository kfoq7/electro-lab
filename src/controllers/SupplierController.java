package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Supplier;
import services.SupplierService;

public class SupplierController {

    SupplierService service;

    public SupplierController() throws SQLException {
        service = new SupplierService();
    }

    public ArrayList<Supplier> getSuppliers() throws SQLException {
        return service.getAllSupplier();
    }

}
