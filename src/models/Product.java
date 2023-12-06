package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Product {

    @JsonProperty("id")
    private int id;

    @JsonProperty("name_product")
    private String name;

    @JsonProperty("unique_stock")
    private int stock;

    @JsonProperty("supplier")
    private int supplierId;

    @Override
    public String toString() {
        return id + ": " + name;
    }

}
