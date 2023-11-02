package controllers;

import java.io.IOException;
import java.util.ArrayList;
import models.Producto;
import services.ProductoService;

public class ProductoController {

    ProductoService service;
    ArrayList<Producto> productos;

    public ProductoController() throws IOException {
        service = new ProductoService();
        productos = service.getProducts();
    }

    public ArrayList<Producto> getProducts() throws IOException {
        return productos;
    }

}
