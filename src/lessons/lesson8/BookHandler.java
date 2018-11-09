package lessons.lesson8;

import org.sqlite.JDBC;

import java.sql.*;
import java.util.Arrays;

public class BookHandler {
    public static void createTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS Book (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + //text, real (пл.тчк), integer, blob, numeric
                "title TEXT NOT NULL, " +
                "pages INTEGER NOT NULL);"; //; перед " обязательно
        //регистрируем драйвер
        DriverManager.registerDriver((new JDBC()));
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            Statement statement = connection.createStatement();
            int row = statement.executeUpdate(sql);
            System.out.println(row);
        }
    }

    public static void insertIntoTable(Book book) throws SQLException {
        String sql = "INSERT INTO BOOK (title, pages)" +
                "VALUES (?, ?);";
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, book.getTitle());
            statement.setInt(2, book.getPages());
            int row = statement.executeUpdate();
            System.out.println(row);

        }
    }

    public static Book[] selectData(int id) throws SQLException {
        // String sql = "SELECT * FROM Example WHERE id > 3;"; //* - выборка по всей таблице, либо перечисляем ферстКолумн и тп
        // String sql = "SELECT * FROM Book WHERE id = ?;"; //* - выборка по всей таблице, либо перечисляем ферстКолумн и тп
        String sql = "SELECT * FROM Book WHERE id = ?;";
        // Book book = new Book();
        try (Connection connection =
                     DriverManager.getConnection("jdbc:sqlite:lesson8.db")) {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Book[] books = new Book[3];
            for (int i = 0; resultSet.next(); i++) {
                Book book = new Book();
                book.setTitle(resultSet.getString("title"));
                book.setPages(resultSet.getInt("pages"));
                books[i]=book;
            }
            //  while (resultSet.next()) {
            //    String title = resultSet.getString("title");
            //  int pages = resultSet.getInt("pages");
            //book.setTitle(title);
            //book.setPages(pages);
            // System.out.println("title = " + title);
            //   System.out.println("pages = " + pages);
            //  }

            //return book;
            return books;
        }
    }

    public static void main(String[] args) throws SQLException {
        Book book1 = new Book("Азбука", 500);
        Book book2 = new Book("Азбука2", 400);

        try {
         //   BookHandler.createTable();
         //   BookHandler.insertIntoTable(book1);
           // System.out.println(BookHandler.selectData(1));
            System.out.println(Arrays.toString(BookHandler.selectData(2)));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
