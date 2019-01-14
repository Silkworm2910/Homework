package hw.hw191218.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Война и мир", "Л. Н. Толстой");
        Book book2 = new Book("Сто лет одиночества", "Г. Г. Маркес");
        Book book3 = new Book("Унесенные ветром", "М. Митчелл");
        Book book4 = new Book("Великий Гэтсби", "Ф. Фицджеральд");
        Book book5 = new Book("Три мушкетера", "А. Дюма");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        User user1 = new User("user1", library);
        Thread thread = new Thread(user1);
        thread.start();
    }
}
