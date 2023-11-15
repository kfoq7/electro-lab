package controllers;

import java.sql.SQLException;
import models.User;
import services.UserService;

public class LoginController {

    UserService service;

    public LoginController() throws SQLException {
        service = new UserService();
    }

    public User login(String username, String password) throws SQLException, Exception {
        User user = service.findByUsername(username);
        if (user == null) {
            throw new Exception("Usuario no encontrado");
        }

        if (!user.getPassword().equals(password)) {
            throw new Exception("Contraseña incorrecta");
        }

        return user;
    }

}
