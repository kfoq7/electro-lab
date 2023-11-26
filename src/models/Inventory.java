package models;

import java.util.ArrayList;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {

    private int id;
    private Date fechaEntrada;
    private Supplier proveedor;
    private ArrayList<Product> productos;
    private User usuario;

    public Inventory() {
    }

    public Inventory(int id, Date fechaEntrada, Supplier proveedor, ArrayList<Product> productos) {
        this.id = id;
        this.fechaEntrada = fechaEntrada;
        this.proveedor = proveedor;
        this.productos = productos;
    }

}
