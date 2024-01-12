package homework.homework20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance;
    public Connection connection;

    private DBConnection() {
        final String URL = "jdbc:postgresql://localhost:5432/TMS_Homework";
        final String USERNAME = "postgres";
        final String PASSWORD = "postgres";

        try {
            this.connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}
