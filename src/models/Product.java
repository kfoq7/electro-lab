package models;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Product {

    @SerializedName("id")
    private int id;

    @SerializedName("name_product")
    private String name;

    @SerializedName("unique_stock")
    private int stock;

    @SerializedName("supplier")
    private Supplier supplier;

    @Override
    public String toString() {
        return id + ": " + name;
    }

}
