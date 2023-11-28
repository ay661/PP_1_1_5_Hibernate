package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {

        private final static String URL = "jdbc:mysql://localhost:3306/test114";
        private final static String USERNAME = "root1";
        private final static String PASSWORD = "root";


    private static Connection connection = null;
    private static Util instance = null;

    private Util() {
        try {
            if (null == connection || connection.isClosed()) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Util getInstance() {
        if (null == instance) {
            instance = new Util();
        }
        return instance;
    }
    public static Connection getConnection() {
        return connection;
    }
    }
