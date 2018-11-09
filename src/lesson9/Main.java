package lesson9;

import lesson9.classes.Book;
import lesson9.classes.Car;
import lesson9.classes.ChildBook;
import lesson9.storage.Storage;

public class Main {

    public static void main(String[] args) {
        Book tails = new Book("Сказки", 500);
        Book flowers = new Book("Цветы", 600);

        Car car = new Car("green", 1000);

        Storage<Book> bookStorage = new Storage();
        bookStorage.add(tails);
        bookStorage.add(flowers);
      //  bookStorage.add(car);

        // ClassCastException возникает на моменте исполнения
        Book bookFromStorage = (Book) bookStorage.get(1);
        System.out.println(bookFromStorage);

        Storage<ChildBook> childBookStorage = new Storage<>();
        ChildBook bears = new ChildBook("Маша и медведи", 200, "pic");
        ChildBook coloring = new ChildBook("Coloring", 100, "pic");
        childBookStorage.add(bears);

    //    Book firstBook = getFirst(bookStorage);
        Book firstBook = getFirst(childBookStorage);

    }

 /*   public static Book getFirst(Storage<Book> storage) {
        return storage.get(0);*/ //не работает


    public static Book getFirst(Storage<? extends Book> storage) {
        return  storage.get(0);
    }

    //super
    public static void addToStorage (Storage <? super Book> storage) {
        Book book = new Book("book", 10);
        storage.add(book);

       // Book b = storage.get(0);
        Object b = storage.get(0);
        System.out.println(b);

    }

    public static void addGet (Storage<?> storage) {

    }

  //  public void someVoid(Storage<String> storage) {}//нелья
    // public void someVoid(Storage<Integer> storage) {}//нельзя
}
