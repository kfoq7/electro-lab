package models;

import java.util.ArrayList;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Inventory {

    private int id;
    private Date fechaEntrada;
    private Supplier proveedor;
    private ArrayList<Product> productos;
    private User usuario;

}
