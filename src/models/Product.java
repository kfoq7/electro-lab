package models;

public class Product {

    private int id;
    private String name;
    private int stock;
    private Supplier supplier;

    public Product() {
    }

    public Product(int id, String name, int stock, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.supplier = supplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

}
