package models;

import lombok.Getter;
import lombok.Setter;

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

    public Employee() {
    }

    public Employee(int id, String nombre, String apellido, float sueldo, int turno, String usuario, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.turno = turno;
        this.usuario = usuario;
        this.password = password;
    }

   

}
