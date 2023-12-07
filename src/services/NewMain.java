package services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
import models.Product;

/**
 *
 * @author kfoqiu7
 */
public class NewMain {

    public static void main(String[] args) throws IOException, SQLException {
//        String user = System.getProperty("USER");
//        String password = System.getProperty("PASSWORD");
////        System.out.println(user + " " + password);
//
//        Connection cn = SQLConnection.getConnection();
//        String selectQuery = "SELECT * FROM Employee";
//        Statement st = cn.createStatement();
//        ResultSet rs = st.executeQuery(selectQuery);
//
//        while (rs.next()) {
//            System.out.println(rs.getString(1) + "|" + rs.getString(2));
//        }
//        

        getProducts();

//        UserService userService = new UserService();
//        userService.validateAuthentication("Admin", "1234");
    }

    // User service
//    public class TestingUserServices {
//
//        UserService service;
//
//        public TestingUserServices() {
//            service = new UserService();
//        }
//
//        public void getUserAuth() throws SQLException {
//            service.validateAuthentication("Admin", "1234");
//        }
//    }
    public static void getProducts() {
        try {
            String jsonString = "[{\"id\":1,\"name_product\":\"Product 1\",\"unique_stock\":5,\"supplier\":1}]";
            Gson parser = new Gson();
            ArrayList<Product> productList = parser.fromJson(jsonString, new TypeToken<ArrayList<Product>() {
            }.getType());
            for (Product product : productList) {
                System.out.println(product.getName());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
