package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Usuario implements Serializable {

    private int id;
    private String password;
    private String username;
    private String nombre;
    private String apellido;
    private String turno;
    private ArrayList<Date> fechaEntrada;
    private ArrayList<Date> fechaSalida;

    public Usuario() {
        this.fechaEntrada = new ArrayList<>();
        this.fechaSalida = new ArrayList<>();
    }

    public Usuario(int id, String password, String username, String nombre, String apellido, String turno) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
        this.fechaEntrada = new ArrayList<>();
        this.fechaSalida = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public ArrayList<Date> getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada.add(fechaEntrada);
    }

    public ArrayList<Date> getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida.add(fechaSalida);
    }

}
