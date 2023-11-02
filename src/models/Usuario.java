package models;

public class Usuario {

    private int id;
    private String password;
    private String user;

    public Usuario() {
    }

    public Usuario(int id, String password, String user) {
        this.id = id;
        this.password = password;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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

}
