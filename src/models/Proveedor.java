package models;

public class Proveedor {

    int id;
    String nombre;
    int RUC;
    String email;
    int numero;
    String empresa;

    public Proveedor() {
    }

    public Proveedor(int id, String nombre, int RUC, String email, int numero, String empresa) {
        this.id = id;
        this.nombre = nombre;
        this.RUC = RUC;
        this.email = email;
        this.numero = numero;
        this.empresa = empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRUC() {
        return RUC;
    }

    public void setRUC(int RUC) {
        this.RUC = RUC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
