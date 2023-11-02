package controllers;

import java.io.IOException;
import models.Usuario;
import services.UsuarioService;

public class LoginController {

    UsuarioService service;

    public LoginController() throws IOException {
        service = new UsuarioService();
    }

    public boolean login(String username, String password) throws Exception {
        Usuario user = service.findUserByUsername(username);
        if (user == null) {
            throw new Exception("Usuario no encontrado");
        }

        if (!user.getPassword().equals(password)) {
            throw new Exception("Contraseña incorrecta");
        }

        return true;
    }

}
