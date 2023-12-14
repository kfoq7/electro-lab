package controllers;

import java.sql.SQLException;
import models.User;
import services.UserService;

public class LoginController {

    UserService service;

    public LoginController() throws SQLException {
        service = new UserService();
    }

    public User login(String username, String password) {
        User user = new User();
        user.setId(0);
        user.setFirstName("dawd");
        user.setLastName("dawd");
        user.setPassword("dawdaw");
        user.setUsername("dawdwa");
        return user;
    }

}
