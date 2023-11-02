
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Usuario;
import views.Login;


public class LoginController {
    String pathname = "./database/users.txt";
    FileWriter fw;
    FileReader fr;
    BufferedReader br;
    StringTokenizer st;
    ArrayList<Usuario> usuarios = new ArrayList<>();
    public LoginController() {
        readFIle();
    }
            
    public void writeFile(String user, String password) throws IOException {
        fw = new FileWriter(pathname, true);
        try {
            fw.write(user + "|" + password + "\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readFIle() {
        try {
            fr = new FileReader(pathname);
            br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {                
                st = new StringTokenizer(line, "|");
                Usuario user = new Usuario();
                user.setUser(st.nextToken());
                user.setPassword(st.nextToken());
                usuarios.add(user);
            }
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Usuario searchUser(String userName) {
        Usuario user = null;
        for (Usuario usuario : usuarios) {
            if (userName.equals(usuario.getUser())) {
               user = usuario;
            }
        }
        if (user == null) {
            JOptionPane.showMessageDialog(null, "Usuario no registrado");
        }
        return user;
    }
    
    
           
}
