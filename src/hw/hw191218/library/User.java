package hw.hw191218.library;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements Runnable {

    private String userName;
    private ArrayList<Book> booksList;
    Library library;
    Book userBook;

    public User(String userName, Library library) {
        this.userName = userName;
        this.booksList = new ArrayList<>();
        this.library = library;
    }

    public Book getUserBook() {
        return userBook;
    }

    public void setUserBook(Book userBook) {
        this.userBook = userBook;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String wantedBook, returnedBook;
        boolean b = true;

        while (b) {
            System.out.println("Введите название желаемой книги либо exit");
            wantedBook = scanner.nextLine();

            for (Book book : library.getBooks().keySet()) {
                if (wantedBook.equals("exit")) {
                    b = false;
                    break;
                } else if ((book.getName()).equals(wantedBook)) {
                    booksList.add(book);
                    System.out.println("Выдана книга " + book.getName() );
                    library.removeBook(library.getBooks(), book);
                }
            }
        }

        boolean b1 = true;

        while (b1) {
            System.out.println("Введите название возвращаемой книги либо exit");
            returnedBook = scanner.nextLine();

            if (returnedBook.equals("exit")) {
                b1 = false;
                break;
            } else {

                for (Book book : booksList) {
                    if (returnedBook.equals(book.getName())) {
                        booksList.remove(book);
                        library.addBook(book);
                        System.out.println("Вернули книгу " + book.getName());

                    }
                }
            }
        }


        System.out.println("Книги в библиотеке: " + library.getBooks());
        System.out.println("Книги у читателя" + booksList);
    }

    }

