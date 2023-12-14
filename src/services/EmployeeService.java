package services;

import lib.Fetch;
import models.Employee;

public class EmployeeService {

    private Fetch<Employee> fetch;

    public EmployeeService() {
        fetch = new Fetch<>("/entities/employee", Employee.class);
    }

}
