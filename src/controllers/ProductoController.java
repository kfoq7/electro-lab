package controllers;

import java.io.IOException;
import java.util.ArrayList;
import models.Producto;
import services.ProductoService;

public class ProductoController {

    ProductoService service;

    public ProductoController() throws IOException {
        service = new ProductoService();
    }

    public ArrayList<Producto> getProducts() throws IOException {
        return service.getProducts();
    }

}
