package homework.homework30.singletone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
    private static DBConnection instance;

    private final Connection connection;

    private DBConnection() {
        /*
        Свойства БД которые стоит вынести в какой-нибудь файл конфигурации, но для наглядности оставил это тут.
         */
        final String URL = "jdbc:postgresql://localhost:5432/BankDB";
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

    public Connection getConnection() {
        return connection;
    }
}