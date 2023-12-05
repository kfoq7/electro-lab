package models;

import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Supplier {

    private int id;
    private String name;
    private int RUC;
    private String email;
    private int phoneNumber;
    private String company;

}
