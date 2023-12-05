package services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.User;

public class UserService {

    private Connection cn;
    private PreparedStatement ps;
    private CallableStatement cs;
    private Statement st;
    private ResultSet rs;
    String query;

    public UserService() {
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        User user;

        try {
            cn = SQLConnection.getConnection();
            query = "SELECT * FROM Employee";

            st = cn.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt(1));
                user.setUsername(rs.getString(2));
                userList.add(user);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }

        return userList;
    }

    public User validateAuthentication(String username, String password) throws SQLException {
        User user = null;

        try {
            cn = SQLConnection.getConnection();
            query = "{call authenticateEmployee(?, ?, ?)}";

            cs = cn.prepareCall(query);
            cs.setString(1, username);
            cs.setString(2, password);
            cs.registerOutParameter(3, java.sql.Types.BIT);
            cs.execute();

            boolean authenticationResult = cs.getBoolean(3);
            if (!authenticationResult) {
                throw new SQLException("Authentication failed");
            }

            rs = cs.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id_employee"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("name"));
                user.setLastName(rs.getString("lastname"));
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }

        return user;
    }

    public User findByUsername(String username) throws SQLException {
        User user = null;

        try {
            cn = SQLConnection.getConnection();
            query = "SELECT * FROM [dbo].[User] WHERE username = ?";

            ps = cn.prepareStatement(query);
            ps.setString(1, username);

            rs = st.executeQuery(query);

            while (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id_employee"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setFirstName(rs.getString("name"));
                user.setLastName(rs.getString("lastname"));
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }

        return user;
    }

}
