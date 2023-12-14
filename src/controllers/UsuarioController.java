package controllers;

import java.sql.SQLException;
import java.util.List;
import models.User;
import services.AuthService;

public class UsuarioController {

    AuthService service;

    public UsuarioController() {
        service = new AuthService();
    }

//    public List<User> getUsuarios() throws SQLException {
//        return service.getAllUsers();
//    }

}
