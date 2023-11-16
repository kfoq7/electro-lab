package controllers;

import java.sql.SQLException;
import java.util.List;
import models.User;
import services.UserService;

public class UsuarioController {

    UserService service;

    public UsuarioController() {
        service = new UserService();
    }

    public List<User> getUsuarios() throws SQLException {
        return service.getAllUsers();
    }

}
