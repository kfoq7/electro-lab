package services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import models.Usuario;

public class UsuarioService {

    private final String pathname = "./database/usuario.dat";
    private ArrayList<Usuario> usuarios;
    private ObjectInputStream inputStream;

    public UsuarioService() throws IOException, ClassNotFoundException {
        usuarios = getUsuarios();
    }

    public ArrayList<Usuario> getUsuarios() throws IOException, ClassNotFoundException {
        ArrayList<Usuario> list;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(pathname));
            list = (ArrayList<Usuario>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            throw ex;
        }

        return list;
    }

    public Usuario findUserByUsername(String username) throws Exception {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.getUsername());
            if (username.equals(usuario.getUsername())) {
                return usuario;
            }
        }

        return null;
    }
    
    public void saveUsers(ArrayList<Usuario> usuarios) {
         try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(pathname))) {
            outputStream.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
