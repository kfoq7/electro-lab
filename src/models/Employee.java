package models;

import lombok.NoArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@Data
public class Employee {

    int id;
    String nombre;
    String apellido;
    float sueldo;
    int turno;
    String usuario;
    String password;

}
