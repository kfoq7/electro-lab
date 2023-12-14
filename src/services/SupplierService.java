package services;

import java.util.ArrayList;
import lib.Fetch;
import models.Supplier;

public class SupplierService {

    private Fetch<Supplier> fetch;

    public SupplierService() {
        fetch = new Fetch<>("/entities/supplier/", Supplier.class);
    }

    public ArrayList<Supplier> getAllSupplier() throws Exception {
        ArrayList<Supplier> list;

        list = fetch.get();

        return list;
    }

}
