package models;

import java.util.ArrayList;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Inventory {

    private int id;
    private Date fechaEntrada;
    private Supplier proveedor;
    private ArrayList<Product> productos;
    private User usuario;

}
