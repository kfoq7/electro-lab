package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class User implements Serializable {

    private int id;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String shift;
    private ArrayList<Date> entryDates;
    private ArrayList<Date> exitDates;

    public String getFullName() {
        return firstName + lastName;
    }
    
}
