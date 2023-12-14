package models;

import com.google.gson.annotations.SerializedName;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

    @SerializedName("id")
    private int id;

    @SerializedName("password")
    private String password;

    @SerializedName("username")
    private String username;

    @SerializedName("name")
    private String firstName;

    @SerializedName("last_name")
    private String lastName;

    public String getFullName() {
        return firstName + lastName;
    }

}
