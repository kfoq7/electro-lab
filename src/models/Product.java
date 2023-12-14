package models;

import com.google.gson.annotations.SerializedName;
import java.time.LocalDate;
import java.util.Date;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Product {

    @SerializedName("id")
    private int id;

    @SerializedName("name_product")
    private String name;

    @SerializedName("unique_stock")
    private int stock;

    @SerializedName("supplier")
    private Supplier supplier;

    @SerializedName("date_product")
    private LocalDate date;
    
    @Override
    public String toString() {
        return id + ": " + name;
    }

}
