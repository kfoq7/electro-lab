package models;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Product {

    @SerializedName(value = "id", alternate = "product_id")
    private int id;

    @SerializedName(value = "name_product", alternate = "name")
    private String name;

    @SerializedName(value = "unique_stock", alternate = "stock")
    private int stock;

    @SerializedName(value = "supplier", alternate = "supplier_id")
    private int supplierId;

    @Override
    public String toString() {
        return id + ": " + name;
    }

}
