package hw.hw071218.reflectiveToString;

/*1. Написать рефлексивный toString():
public static String toString(Object o)
        Метод принимает любой объект и формирует строку
        на основании его полей без необходимости переопределять метод toString() объекта.
        Добавить аннотацию @Exclude для полей, которые не должны быть включены в результирующую строку.
        Методы, которые могут понадобиться:
        Object.getClass()

        Class.getDeclaredFields()
        Class.getSimpleName()
        Class.isPrimitive()
        Class.isArray()

        Field.getName()
        Field.getType()
        Field.setAccessible()
        Field.get()*/

import java.lang.reflect.Field;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
}
