package dao;


import org.sqlite.JDBC;

import java.sql.*;

public class Main {


/*public static void selectData() throws SQLException {
    String sql = "SELECT * FROM User;";
    try (Connection connection =
                 DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int i = resultSet.getInt("id");
            String str = resultSet.getString("login");
            System.out.println("id = " + i);
            System.out.println("login = " + str);
        }
    }
}*/
    public static void main(String[] args) {
        try {
            String sql = "CREATE TABLE IF NOT EXISTS User (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL," +
                    "login TEXT NOT NULL);";

            String insert = "INSERT INTO User (id, login) VALUES (?, ?);";
            String getAll = "SELECT * FROM User;";
            String getById = "SELECT * FROM User WHERE id=?;";
            String update = "UPDATE User SET id=?, login=? WHERE id=?";
            String delete = "DELETE FROM User WHERE id=?;";


            DriverManager.registerDriver((new JDBC()));
            try (Connection connection =
                         DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
                Statement statement = connection.createStatement();
                int row = statement.executeUpdate(sql);
                System.out.println(row);
            }
            UserDao user1 = new UserDao(125, "125");
            UserDao user2 = new UserDao(135, "135");
            UserDao user3 = new UserDao(135, "135");
            UserDao user4 = new UserDao(145, "145");
            user1.add();
            user2.add();
            user3.add();
            user4.add();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

