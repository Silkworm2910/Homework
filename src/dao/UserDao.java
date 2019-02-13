package dao;

import java.sql.*;
import java.util.Scanner;

public class UserDao implements Dao {

    private static final String CONNECT = "jdbc:sqlite:lesson8.db";
    private Connection connection;

    UserDao() {
        try {
            this.connection = DriverManager.getConnection(CONNECT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(ObjClass user) {
        User userDao = (User) user;
        String insert = "INSERT INTO User (id, login) VALUES (?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)) {
            preparedStatement.setInt(1, userDao.getId());
            preparedStatement.setString(2, userDao.getLogin());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void delete(ObjClass user) {
        User userDao = (User) user;
        String delete = "DELETE FROM User WHERE id=?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(delete)) {
            preparedStatement.setInt(1, userDao.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public void update(ObjClass user) {
        User userDao = (User) user;
        Scanner in = new Scanner(System.in);
        System.out.println("Задать новый login: ");
        String newLogin = in.next();


        String update = "UPDATE User SET id=?, login=? WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(update)) {
            preparedStatement.setInt(1, userDao.getId());
            preparedStatement.setString(2, newLogin);
            preparedStatement.setInt(3, userDao.getId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }

    }

    @Override
    public void getAll() {
        String getAll = "SELECT * FROM User;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(getAll)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String login = resultSet.getString("login");
                System.out.println(id + " " + login);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
