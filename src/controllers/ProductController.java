package controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import models.Product;
import services.ProductService;

public class ProductController {

    ProductService service;

    public ProductController() {
        service = new ProductService();
    }

    public ArrayList<Product> getProducts() throws Exception {
        return service.getAllProducts();
    }

    public void saveProduct(Product product) throws SQLException {
        service.createProduct(product);
    }

}
