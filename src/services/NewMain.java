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

//        Connection cn = SQLConnection.getConnection();
//        String selectQuery = "SELECT * FROM [dbo].[User]";
//        Statement st = cn.createStatement();
//        ResultSet rs = st.executeQuery(selectQuery);
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1) + " " + rs.getString(2));
//        }
        UserService userService = new UserService();
        userService.validateAuthentication("Admin", "1234");
    }

    // User service
    public class TestingUserServices {

        UserService service;

        public TestingUserServices() {
            service = new UserService();
        }

        public void getUserAuth() throws SQLException {
            service.validateAuthentication("Admin", "1234");
        }
    }

}
