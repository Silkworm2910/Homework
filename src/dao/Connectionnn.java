package dao;

import org.sqlite.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectionnn {
    public static void createTable() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        String UserDB = "CREATE TABLE IF NOT EXISTS User (id INTEGER PRIMARY KEY NOT NULL, login TEXT NOT NULL);";
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(UserDB);
            System.out.println(row);
        }
        String ArticleDB = "CREATE TABLE IF NOT EXISTS Article (id INTEGER PRIMARY KEY NOT NULL, iduser INTEGER NOT NULL, title TEXT NOT NULL);";
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(ArticleDB);
            System.out.println(row);
        }
    }
}
