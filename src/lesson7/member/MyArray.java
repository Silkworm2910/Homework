package lesson7.member;

//Особенностью nested класса является то, что он
//не имеет доступа к полям и методам объекта основного класса.
//Чтобы восполнить этот пробел, Java предлагает внутренние
//классы (member inner class)

import java.util.Iterator;

public class MyArray {
    private Object[] array;

    public MyArray() {
        array = new Object[10];
        for (int i = 0; i < array.length; i++)
            array[i] = String.valueOf(i);
    }
    class EvenIterator implements Iterator {
        private int nextIndex;
        @Override
        public boolean hasNext() {
            // array - поле основного класса.
            return nextIndex < array.length;
        }
        @Override
        public Object next() {
            // array - поле основного класса.
            Object next = array[nextIndex];
            nextIndex += 2;
            return next;
        }
    }
    public Iterator evenIterator() {
        return new EvenIterator();
    }
}
