package controllers;

import java.sql.SQLException;
import models.User;
import services.UserService;

public class LoginController {

    UserService service;

    public LoginController() throws SQLException {
        service = new UserService();
    }

    public User login(String username, String password) throws SQLException {
        return service.validateAuthentication(username, password);
    }

}
