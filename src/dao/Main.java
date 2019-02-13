package dao;


import org.sqlite.JDBC;

import java.sql.*;

public class Main {


    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setLogin("User1");

        User user2 = new User();
        user2.setId(2);
        user2.setLogin("User2");

        UserDao userDao = new UserDao();
        try {
            Connectionnn.createTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        userDao.add(user1);
        userDao.add(user2);
        userDao.getAll();

        userDao.update(user1);
        userDao.update(user2);

        userDao.delete(user1);

        Article article1 = new Article();

        article1.setId(1);
        article1.setUserId(1);
        article1.setTitle("article1");

        ArticleDao articleDao = new ArticleDao();
        articleDao.add(article1);
        articleDao.getAll();
        articleDao.update(article1);
        articleDao.delete(article1);
    }
}

