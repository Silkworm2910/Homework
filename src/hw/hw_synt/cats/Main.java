package hw.hw_synt.cats;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Легкий 5летний котэ со средней силой", 5, 5, 3);
        Cat cat2 = new Cat("Тяжелый 5летний котэ со средней силой", 5, 10, 3);
        if (cat1.fight(cat2) == true) {
            System.out.println("Побеждает: " + cat1.name);
        } else {
            System.out.println("Побеждает: " + cat2.name);
        }

        Cat cat3 = new Cat("Легкий 2летний котэ с высокой силой", 2, 3, 5);
        Cat cat4 = new Cat("Тяжелый 10летний котэ с низкой силой", 10, 10, 2);
        if (cat3.fight(cat4) == true) {
            System.out.println("Побеждает: " + cat3.name);
        } else {
            System.out.println("Побеждает: " + cat4.name);
        }
    }
}