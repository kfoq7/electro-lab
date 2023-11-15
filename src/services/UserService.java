package services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.User;

public class UserService {

    private Connection connection;
    private PreparedStatement ps;
    private Statement statement;
    private ResultSet resultSet;

    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        User user;
        String query;

        try {
            connection = SQLConnection.getConnection();
            query = "SELECT * FROM [dbo].[User]";

            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
                userList.add(user);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            connection.close();
        }

        return userList;
    }

    public User findByUsername(String username) throws SQLException {
        User user = null;
        String query;

        try {
            connection = SQLConnection.getConnection();
            query = "SELECT * FROM [dbo].[User] WHERE username = ?";

            ps = connection.prepareStatement(query);
            ps.setString(1, username);

            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt(1));
                user.setUsername(resultSet.getString(2));
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            connection.close();
        }

        return user;
    }

}
