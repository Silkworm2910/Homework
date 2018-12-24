package lessons.lesson14;

import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;

public class CatchException {

    public static void main(String[] args) {
//        целочисленное деление на ноль
        int a = 9;
        int b = 0;
//        System.out.println(a/b); // java.lang.ArithmeticException

        // попытка получить 10-й элемент
        // из массива размером в 5 элементов
        int[] arr = new int[5];
//        arr[10] = 12; // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(arr));

//        попытка получить доступ к объекту по null ссылке
        String str = null;
//        str.equals("string"); // java.lang.NullPointerException

        // Развернутый стэк вызовов называется stack trace,
        // он позволаяет легко найти где в коде возникла проблема.
//        Integer.parseInt("abc"); // java.lang.NumberFormatException

//        Метод parseInt довольно сложен и имеет несколько вызовов других методов
        /*Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at lesson14.CatchException.main(CatchException.java:26)*/

        // можем выбросить свое исключение
//        throw new NumberFormatException("NumberFormatException");

//        Обработка исключений осуществляется при помощи структуры try-catch
        Object data = "42";
//        Integer intData = (Integer) data; // Здесь будет выброшен ClassCastException.
//        System.out.println("Программа завершена"); // Этот код не выполнится.

//        мы выполняем потенциально опасный код,
//        то можем обезопасить себя следующим образом
        try {
//          Когда выбросится исключение, то исполнение кода передастся блоку catch
            Integer intData = (Integer) data; // ClassCastException
            System.out.println("Код после возможного исключения"); // Этот код не выполнится.
        } catch (ClassCastException e) {
//          блок catch ловит исключение ClassCastException и всех его наследников
            System.out.println("Поймали ClassCastException: " + e.getMessage());
        }

        System.out.println("Программа завершена"); // Этот код выполнится.


        data  = "42";
        arr = new int[10];
        // несколько блоков catch | объединение исключений в одном блоке
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                Integer intData = (Integer) data; // ClassCastException
            }
            else {
                arr[10] = 42; // ArrayIndexOutOfBoundsException
            }
            System.out.println("Hello after disaster!"); //код не выполнится
        }
//        вариант 1 - несколько блоков catch
//        catch (ClassCastException e) {
//            System.out.println("We caught ClassCastException here: " + e.getMessage());
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("We caught ArrayIndexOutOfBoundsException: " +
//                    e.getMessage());
//        }
        // вариант 2 - объединение через RuntimeException
//        catch (RuntimeException e) {
//            System.out.println("We caught RuntimeException here: " +
//                    e.getMessage());
//        }

        // вариант 3 - объединение через RuntimeException
        catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("We caught ClassCastException or " +
                    "ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        }

//        блок finally
//        например если есть исключение которое ты не ожидал
//        в catch(DBException ex), а произошла ошибка деления на ноль
        finally {
            System.out.println("Высвобождение ресурсов, открытых в блоке try");
        }
        System.out.println("Завершение");

//        Если вызывается метод, который пробрасывает checked exception, то
//        необходимо снова провести обработку исключения аналогичным образом
        try {
            voidWithException();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void voidWithException() throws Exception {

        //        checked exceptions (обрабатываемые исключения)
//        Такие исключения вынуждают программиста либо их обработать, либо
//        пробросить на уровень выше с помощью ключевого слова throws
        // Ошибка компиляции!
//        throw new Exception("Useless exception");
//        Вариант решения 1 — обработать в блоке try-catch:
//        try {
//            throw new Exception("Useless exception");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //        Вариант решения 2 — пробросить на уровень выше
        throw new Exception("Useless exception");

    }

}
