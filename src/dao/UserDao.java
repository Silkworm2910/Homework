package dao;

import java.sql.*;

public class UserDao extends User implements IDao<User> {
    public UserDao(int id, String login) {
        super(id, login);
    }

    @Override
    public void add() {
        String insert = "INSERT INTO User (id, login) VALUES (?, ?);";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(insert);
            statement.setInt(1, this.id);
            statement.setString(2, this.login);
            int row = statement.executeUpdate();
            System.out.println("пользователь " + this.login + " добавлен");

        } catch (SQLException e) {
            System.out.println("пользователь с этим id уже существует");
        }
    }

        @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, IDao dao) {

    }

    @Override
    public User[] getAll() {
        return new User[0];
    }

    @Override
    public User getById(int id) {
        return null;
    }
}
