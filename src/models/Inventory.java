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

    @SerializedName("delivery_date")
    private Date deliveryDate;

    @SerializedName("products")
    private ArrayList<Product> productos;

    @SerializedName("employee")
    private Employee employee;

    private User usuario;

}
