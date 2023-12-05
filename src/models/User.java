package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class User {

    @JsonProperty("")
    private int id;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String shift;

    public String getFullName() {
        return firstName + lastName;
    }

}
