package hw.hw191218.library;

import java.util.concurrent.ConcurrentHashMap;

public class Library {

    private ConcurrentHashMap<Book, String> books;

    public Library() {
        books = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<Book, String> getBooks() {
        return books;
    }

    public ConcurrentHashMap<Book, String> addBook(Book book) {
        books.putIfAbsent(book,book.getAuthor());
        return books;
    }

    public ConcurrentHashMap<Book, String> removeBook (ConcurrentHashMap<Book, String> books, Book book) {
        books.remove(book);
        return books;
    }
}
