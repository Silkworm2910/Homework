package dao;

import java.sql.*;
import java.util.Scanner;

public class ArticleDao implements Dao {

    private static final String CONNECT = "jdbc:sqlite:lesson8.db";
    private Connection connection;

    ArticleDao() {
        try {
            this.connection = DriverManager.getConnection(CONNECT);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add(ObjClass article) {
        Article articleDao = (Article) article;
        String insert = "INSERT INTO Article (id, iduser, title) VALUES (?, ?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insert)){
            preparedStatement.setInt(1, articleDao.getId());
            preparedStatement.setInt(2, articleDao.getUserId());
            preparedStatement.setString(3, articleDao.getTitle());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.getMessage();
        }
    }

    @Override
    public void delete(ObjClass article) {
        Article articleDao = (Article) article;
        String delete = "DELETE FROM Article WHERE id=?;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(delete)) {
            preparedStatement.setInt(1, articleDao.getId());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void update(ObjClass article) {
        Article articleDao = (Article) article;
        Scanner in = new Scanner(System.in);
        System.out.println("Задать новый title: ");
        String newTitle = in.next();
        System.out.println("Задать новый userId: ");
        int userId = in.nextInt();

        String update = "UPDATE User SET id=?, login=? WHERE id=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(update)) {
            preparedStatement.setInt(1, articleDao.getId());
            preparedStatement.setString(2, newTitle);
            preparedStatement.setInt(3, userId);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    @Override
    public void getAll() {
        String getAll = "SELECT * FROM Article;";
        try (PreparedStatement preparedStatement = connection.prepareStatement(getAll)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int userId = resultSet.getInt("id");

                System.out.println(id + " " + title + " " + "userID: " + userId);
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }
}
