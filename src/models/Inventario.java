package models;

import java.util.ArrayList;
import java.util.Date;

public class Inventario {

    int id;
    Date fechaEntrada;
    Proveedor proveedor;
    ArrayList<Producto> productos;

    public Inventario() {
    }

    public Inventario(int id, Date fechaEntrada, Proveedor proveedor, ArrayList<Producto> productos) {
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

}
