package models;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee extends User {

    @SerializedName("id")
    private int id;
    
    @SerializedName("salary")
    private float salary;

    @SerializedName("shift")
    private String shift;

}
