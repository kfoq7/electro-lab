package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class User implements Serializable {

    private int id;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String shift;
    private ArrayList<Date> entryDates;
    private ArrayList<Date> exitDates;

    public User() {
        this.entryDates = new ArrayList<>();
        this.exitDates = new ArrayList<>();
    }

    public User(int id, String password, String username, String firstName, String lastName, String shift) {
        this.id = id;
        this.password = password;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shift = shift;
        this.entryDates = new ArrayList<>();
        this.exitDates = new ArrayList<>();
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public ArrayList<Date> getEntryDates() {
        return entryDates;
    }

    public void setEntryDates(Date entryDate) {
        this.entryDates.add(entryDate);
    }

    public ArrayList<Date> getExitDates() {
        return exitDates;
    }

    public void setExitDates(Date exitDate) {
        this.exitDates.add(exitDate);
    }
    
    public String getFullName() {
        return firstName + lastName;
    }

}
