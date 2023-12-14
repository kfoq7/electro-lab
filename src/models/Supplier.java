package models;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Supplier {

    @SerializedName("id")
    private int id;

    @SerializedName("company_name")
    private String name;

    @Override
    public String toString() {
        return "Supplier={id="
                + id;
    }

}
