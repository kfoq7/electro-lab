/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package services;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import models.User;

/**
 *
 * @author kfoqiu7
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        String user = System.getProperty("USER");
        String password = System.getProperty("PASSWORD");
        System.out.println(user + " " + password);

        Connection cn = SQLConnection.getConnection();
        String selectQuery = "SELECT * FROM [dbo].[User]";
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(selectQuery);

        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2));
        }

//        ArrayList<Usuario> list = new ArrayList<>();
//        Usuario user1 = new Usuario(1, "password123", "luis", "luis", "paulino", "mañana");
//        Usuario user2 = new Usuario(2, "password123", "luis", "luis", "paulino", "mañana");
//        list.add(user1);
//        list.add(user2);
////        saveUsersToFile(list, "./database/usuario.dat");
//        list = loadUsersFromFile("./database/usuario.dat");
//        for (Usuario usera : list) {
//            System.out.println(usera.getId() + " " + usera.getNombre() + " ");
//            for (Date currentdate : usera.getFechaEntrada()) {
//                System.out.println(currentdate);
//            }
//        }
    }

    private static void saveUsersToFile(ArrayList<User> users, String filePath) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<User> loadUsersFromFile(String filePath) throws FileNotFoundException, IOException {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
            return (ArrayList<User>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // If the file doesn't exist, return an empty list
            return new ArrayList<>();
        }
    }

}
