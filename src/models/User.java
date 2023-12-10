package models;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class User {

//    @JsonProperty("")
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
