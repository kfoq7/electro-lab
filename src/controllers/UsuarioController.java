package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import models.Usuario;
import services.UsuarioService;

public class UsuarioController {

    UsuarioService service;

    public UsuarioController() throws IOException, ClassNotFoundException {
        service = new UsuarioService();
    }

    public ArrayList<Usuario> getUsuarios() throws IOException, ClassNotFoundException {
        return service.getUsuarios();
    }

    public void updateUserFechaEntrada(int id, Date fecha) throws IOException, ClassNotFoundException {
        ArrayList<Usuario> list = service.getUsuarios();
        for (Usuario usuario : list) {
            if (usuario.getId() == id) {
                usuario.setFechaEntrada(fecha);
            }
        }

        service.saveUsers(list);
    }

}
