package hw.hw_synt.animals;

public class Main {
    public static void main(String[] args) {
       /* Задача 5  (синтаксис классов)
        Создать классы Dog, Artifact и Mouse.
        Реализовать интерфейсы (Movable, Eatable, Eat ) в классах, учитывая что:
        - Кот может передвигаться, может кого-то съесть и может быть сам съеден.
        - Мышь может передвигаться и может быть съедена.
        - Собака может передвигаться и съесть кого-то.*/

       Dog dog = new Dog();
       Cat cat = new Cat();
       Mouse mouse = new Mouse();
       dog.move();
       cat.move();
       mouse.move();
       dog.eat(mouse);
       dog.eat(cat);
       cat.eat(mouse);
       mouse.eatenBy(dog);
       mouse.eatenBy(cat);
       cat.eatenBy(dog);

    }
}
