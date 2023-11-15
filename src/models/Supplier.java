package models;

public class Supplier {

    private int id;
    private String name;
    private int RUC;
    private String email;
    private int phoneNumber;
    private String company;

    public Supplier() {
    }

    public Supplier(int id, String name, int RUC, String email, int phoneNumber, String company) {
        this.id = id;
        this.name = name;
        this.RUC = RUC;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}
