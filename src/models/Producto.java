package models;

public class Producto {

    private int id;
    private String nombre;
    private int stock;
    private Proveedor proveedor;

    public Producto() {
    }

    public Producto(int id, String nombre, int stock, Proveedor proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.proveedor = proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
}
