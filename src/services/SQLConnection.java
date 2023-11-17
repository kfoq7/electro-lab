package services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    private static Connection cn;
    private final static String database = "LaboratorioInventario;";
    private final static String username = System.getProperty("USER");
    private final static String password = System.getProperty("PASSWORD");
    private final static String baseURL = "jdbc:sqlserver://localhost:1433;trustServerCertificate=true";

    public static Connection getConnection() throws SQLException {
        String connectionURL = baseURL + ";database=" + database;

        try {
            cn = DriverManager.getConnection(connectionURL, username, password);
        } catch (SQLException e) {
            throw e;
        }

        return cn;
    }

}
