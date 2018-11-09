package hw.hw4.library;

public class Book {
    private String title;
    public int quantity;

    public Book (String title) {
        this.title = title;
    }

    public String toString() {
        return "Книга {" +
                "title='" + title + '\'' +
                '}';
    }
}
