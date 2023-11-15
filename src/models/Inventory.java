package models;

import java.util.ArrayList;
import java.util.Date;

public class Inventory {

    private int id;
    private Date fechaEntrada;
    private Supplier proveedor;
    private ArrayList<Producto> productos;
    private User usuario;

    public Inventory() {
    }

    public Inventory(int id, Date fechaEntrada, Supplier proveedor, ArrayList<Producto> productos) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.proveedor = proveedor;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Supplier getProveedor() {
        return proveedor;
    }

    public void setProveedor(Supplier proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

}
