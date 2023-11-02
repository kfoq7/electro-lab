package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import models.Usuario;

public class UsuarioService {

    String pathname = "./database/users.txt";
    FileReader fr;
    BufferedReader br;
    StringTokenizer st;
    ArrayList<Usuario> usuarios;

    public UsuarioService() throws IOException {
        usuarios = getUsuarios();
    }

    public ArrayList<Usuario> getUsuarios() throws IOException {
        ArrayList<Usuario> list = new ArrayList<>();

        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);

            String line = "";

            while ((line = br.readLine()) != null) {
                st = new StringTokenizer(line, "|");
                Usuario user = new Usuario();
                user.setUser(st.nextToken());
                user.setPassword(st.nextToken());
                list.add(user);
            }
        } catch (IOException ex) {
            throw ex;
        }

        return list;
    }

    public Usuario findUserByUsername(String username) throws Exception {
        for (Usuario usuario : usuarios) {
            if (username.equals(usuario.getUser())) {
                return usuario;
            }
        }

        return null;
    }

}
