package controllers;

import java.io.IOException;
import java.util.ArrayList;
import models.Producto;
import services.ProductService;

public class ProductoController {

    ProductService service;

    public ProductoController() throws IOException {
        service = new ProductService();
    }

    public ArrayList<Producto> getProducts() throws IOException {
        return service.getProducts();
    }

}
