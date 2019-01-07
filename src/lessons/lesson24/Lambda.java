package lessons.lesson24;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {

    private static int someVar = 12;

    public static void main(String[] args) {
        // синтаксис
//        (аргументы)->тело;
//        ()->тело;
//        ()->{
//            тело;
//            на;
//            несколько строк;
//            [return возвращаемое значение;]
//        }
//        (a,b)->a+b;
//        (a,b)->{
//
//
//            return a + b;
//        };

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        });

        new Thread(()-> System.out.println("hello"));
        Runnable runnable = ()-> System.out.println("hello");
        new Thread(runnable);

        Operation plus = (a, b)->a+b;
        Operation minus = (a, b)->a-b;

        double result = plus.execute(12, 23);
        result = minus.execute(12, 23);

        final int[] someLocalVar = {12};

        Operation operation = (a, b)->{
            someVar -= a;
            someLocalVar[0] += b;
            return someVar;
        };
        operation.execute(1, 2);
        System.out.println(Arrays.toString(someLocalVar));



        // ссылка на метод через нотацию
        ButtonFactory<Button> factory = Button::new;
        Button button = factory.set("Cancel", "pink");
        System.out.println(button);

//        Предикаты
        Predicate<Integer> pos = (num)-> num > 0;
        boolean predicateRes = pos.test(4);
        Predicate<Integer> neg = (num)-> num < 0;
        predicateRes = neg.test(23);

        predicateRes = pos.or(neg).test(2);
        System.out.println(predicateRes);
        predicateRes = pos.and(neg).test(2);
        System.out.println(predicateRes);

        Button.tstVoid(pos, 7);

        // Функции
        Function<Integer, Integer> plusTen = (a)->a+10;
        Function<Integer, Integer> minusTwo = (a)->a-2;
        Function<Integer, Integer> plusSix = (a)->a+6;

        int functionRes = plusSix.apply(4);
        functionRes = plusSix
                .andThen(plusTen)
                .andThen(plusTen)
                .compose(plusTen)
                .apply(1);
        System.out.println(functionRes);

//        Consumer
        Consumer<Button> makeResetBtn =
                (button1) -> button1.setValue("Reset");
        makeResetBtn.accept(button);
        System.out.println(button);

        // Компараторы
        Button button1 = new Button("First", "gray");
        Button button2 = new Button("Second", "gray");

        Comparator<Button> buttonComparator =
                Comparator.comparing(Button::getValue);
//        (b1, b2)->b1.getValue().compareTo(b2.getValue());
        int compareRes = buttonComparator.compare(button1, button2);
        System.out.println(compareRes);
        compareRes = buttonComparator.reversed().compare(button1, button2);
        System.out.println(compareRes);


//        forEach(лямбда выражение)

        List<Integer> integers =
                new ArrayList<>(Arrays.asList(23, 67, 12, -12, 0));
        List<Integer> integers1 = new ArrayList<>();

        integers.forEach((s)-> System.out.println(s + " "));

        integers.forEach((s)-> integers1.add(s+10));
        System.out.println(integers1);

//        removeIf()
        integers.removeIf((s)->s < 20);
        integers.removeIf(pos);
        System.out.println(integers);

//        Map.forEach()
        Map<String, String> books = new HashMap<>();
        books.put("Книга 1", "Автор книги 1");
        books.put("Книга 2", "Автор книги 2");

        books.forEach((key, value)->
                System.out.println("Title: " + key + " Author: " + value));

//        Map.compute()
        books.compute("Книга 1", (key, val)->val+ " и еще один автор");
        System.out.println(books);

//        books.computeIfAbsent();
//        books.computeIfPresent();

//        Map.getOrDefault()
        String author = books.getOrDefault("Книга 3", "нет автора");
        System.out.println(author);

        System.out.println(books);


//        SomeClass someClass = new SomeClass();
//        someClass.someClassVoid((a, b)-> a+b);




    }
}

interface SomeInterface {
    int someVoid(int a, int b);
}

interface SomeInterface2 {
    int someVoid2(int a, int b);
}

class SomeClass{
    void someClassVoid(SomeInterface someInterface){
        System.out.println("SomeInterface");
        someInterface.someVoid(2, 3);
    }
    void someClassVoid(SomeInterface2 someInterface){
        System.out.println("SomeInterface2");
        someInterface.someVoid2(2, 3);
    }
}


@FunctionalInterface
interface Operation{
    double execute(int a, int b);
}
interface ButtonFactory<T extends Button>{
    T set(String value, String color);
}

class Button{
    private String value;
    private String color;

    public Button(String value, String color) {
        this.value = value;
        this.color = color;
    }

    public Button(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void tstVoid(Predicate<Integer> predicate,
                               int i){
        predicate.test(i);
    }

    @Override
    public String toString() {
        return "Button{" +
                "value='" + value + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
