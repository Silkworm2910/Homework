package hw.hw191218.library;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class User implements Runnable {

    private String userName;
    private ConcurrentHashMap<Book, Integer> userBooks;
    Library library;

    public User(String userName, Library library) {
        this.userName = userName;
        this.userBooks = new ConcurrentHashMap<>();
        this.library = library;
    }

    private void takeBooks() {
        Scanner scanner = new Scanner(System.in);
        String wantedBook;
        boolean b = true;

        while (b) {
            System.out.println(userName + ", введите название желаемой книги либо exit");
            wantedBook = scanner.nextLine();

            boolean availability = false;

            for (Book book : library.getBooks().keySet()) {
                if (wantedBook.equals("exit")) {
                    b = false;
                    return;
                } else if ((book.getName()).equals(wantedBook)) {
                    availability = true;
                    userBooks.putIfAbsent(book, 1);
                    System.out.println("Выдана книга " + book);
                    library.removeBook(library.getBooks(), book);
                }
            }
            if (!availability) {
                System.out.println("В библиотеке нет книги с названием '" + wantedBook + "'");
            }
        }

    }

    private void returnBooks() {
        Scanner scanner = new Scanner(System.in);
        String returnedBook;
        boolean b1 = true;

        while (b1) {
            System.out.println(userName + ", введите название возвращаемой книги либо exit");
            returnedBook = scanner.nextLine();

            boolean onHands = false;

            if (returnedBook.equals("exit")) {
                b1 = false;
                return;
            } else {

                Iterator<Map.Entry<Book, Integer>> iterator = userBooks.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Book, Integer> entry = iterator.next();
                    if (entry.getKey().getName().equals(returnedBook)) {
                        onHands = true;
                        library.addBook(entry.getKey());
                        iterator.remove();
                        System.out.println("Вернули книгу " + entry.getKey());
                    }
                }

                if (!onHands) {
                    System.out.println("У вас нет книги с названием '" + returnedBook + "'");
                }

            }
        }
    }

    private void printUserBooks() {
        System.out.println("Книги у читателя " + userName + " " + userBooks);
    }

    private void printLibraryBooks() {
        System.out.println("Книги в библиотеке: " + library.getBooks());
    }


    @Override
    public void run() {
           printLibraryBooks();

            takeBooks();

            printLibraryBooks();
            printUserBooks();

            returnBooks();

            printLibraryBooks();
            printUserBooks();

    }
}

