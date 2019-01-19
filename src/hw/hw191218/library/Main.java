package hw.hw191218.library;

public class Main {
    public static void main(String[] args)  {
        Library library = new Library();

        Book book1 = new Book("Война и мир", "Л. Н. Толстой");
        Book book2 = new Book("Сто лет одиночества", "Г. Г. Маркес");
        Book book3 = new Book("Унесенные ветром", "М. Митчелл");
        Book book4 = new Book("Великий Гэтсби", "Ф. Фицджеральд");
        Book book5 = new Book("Три мушкетера", "А. Дюма");
        Book book6 = new Book("Лолита", "В. Набоков");
        Book book7 = new Book("1984", "Д. Оруэлл");
        Book book8 = new Book("Над пропастью во ржи", "Д. Сэлинджер");
        Book book9 = new Book("Колыбельная", "Ч. Паланик");
        Book book10= new Book("Мгла", "С. Кинг");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);

        User user1 = new User("user1", library);
        Thread thread1 = new Thread(user1);
        thread1.start();

    }
}
