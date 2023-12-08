package controllers;

import java.util.ArrayList;
import models.Supplier;
import services.SupplierService;

public class SupplierController {

    SupplierService service;

    public SupplierController() throws Exception {
        service = new SupplierService();
    }

    public ArrayList<Supplier> getSuppliers() throws Exception {
        return service.getAllSupplier();
    }

}
