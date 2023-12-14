package controllers;

import models.User;
import services.AuthService;


public class LoginController {

    AuthService service;

    public LoginController() {
//        service = new AuthService();
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
