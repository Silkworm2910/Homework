package lesson7.member;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        Iterator iterator = myArray.evenIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next()); // 0 2 4 6 8

// Новый экземпляр внутреннего класса может быть создан
// только при помощи экземпляра объекта основного класса
        MyArray.EvenIterator evenIterator = myArray.new EvenIterator();
    }
}
