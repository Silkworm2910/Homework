package lessons.lesson9.storage;

import lessons.lesson9.classes.Book;

public class BookContainer<T extends Book> {
    private T book;
    public BookContainer(T book) {
        this.book = book;
    }

    public String getBookTitle() {
        return  this.book.getName();
    }

    public static void main(String[] args) {
        Book tails = new Book("Сказки", 500);
        BookContainer<Book> container = new BookContainer<>(tails);
        System.out.println(container.getBookTitle());

        //T someType = new T(); //не допустимо
        //public static T staticVoid() {}//не допустимо
    }
}


