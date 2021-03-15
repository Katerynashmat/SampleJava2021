package org.obrii.mit.dp2021.shmat.ShmatKateryna2021.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String driverClassName = "org.postgresql.Driver";
    //    private static final String connectionUrl = "jdbc:postgresql://localhost:5432/postgres";
    //    private static final String dbUser = "postgres";
    //    private static final String dbPwd = "root";
    private static final String connectionUrl = "jdbc:postgresql://obrii.org:5432/db2021mit21s20";
    private static final String dbUser = "s20";
    private static final String dbPwd = "6546";

    private static ConnectionFactory connectionFactory = null;

    private ConnectionFactory() {
        try {
            Class.forName(driverClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
    }

    public static ConnectionFactory getInstance() {
        if (connectionFactory == null) {
            connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }
}
