package models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Inventory {

    @SerializedName("id")
    private int id;

    private Date fechaEntrada;
    private Supplier proveedor;
    
    @SerializedName("products")
    private ArrayList<Product> productos;
    private User usuario;
}
