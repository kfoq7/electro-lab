package models;

import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Product {

    private int id;
    private String name;
    private int stock;
    private Supplier supplier;

    @Override
    public String toString() {
        return id + ": " + name;
    }

}
