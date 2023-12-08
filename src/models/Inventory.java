package models;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Inventory {

    @SerializedName("id")
    private int id;

//    private Date fechaEntrada;
//    private Supplier proveedor;
    
    @SerializedName("products")
    private ArrayList<Product> productos;
//    private User usuario;
}
