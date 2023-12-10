package models;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Employee {

    int id;
    String nombre;
    String apellido;
    float sueldo;
    int turno;
    String usuario;
    String password;

}
