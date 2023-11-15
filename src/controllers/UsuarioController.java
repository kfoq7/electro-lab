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

//    public void updateUserFechaEntrada(int id, Date fecha) throws IOException, ClassNotFoundException {
//        ArrayList<User> list = service.getUsuarios();
//        for (User usuario : list) {
//            if (usuario.getId() == id) {
//                usuario.setFechaEntrada(fecha);
//            }
//        }
//
//        service.saveUsers(list);
//    }
}
