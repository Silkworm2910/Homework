package hw.hw191218.library;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Library {

    private ConcurrentHashMap<Book, Integer> libraryBooks;

    public Library() {
        libraryBooks = new ConcurrentHashMap<>();
    }

    public ConcurrentHashMap<Book, Integer> getBooks() {
        return libraryBooks;
    }

    public ConcurrentHashMap<Book, Integer> addBook(Book book) {
        libraryBooks.putIfAbsent(book, 1);
        return libraryBooks;
    }

    public ConcurrentHashMap<Book, Integer> removeBook(ConcurrentHashMap<Book, Integer> books, Book book) {
        Iterator<Map.Entry<Book, Integer>> iterator = books.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Book, Integer> entry = iterator.next();
            if (entry.getKey().equals(book)) {
                iterator.remove();
            }
        }
        return books;
    }

}
