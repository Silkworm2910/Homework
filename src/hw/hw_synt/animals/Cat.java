package hw.hw_synt.animals;

public class Cat
    extends Animal
    implements Movable, Eat, Eatable

{
    @Override
        public void move () {
        System.out.println("Котэ двигается");
    }
    @Override
    public String toString() {
        return "Котэ";
    }
    @Override
    public void eat(Animal animal) {
        System.out.println("Котэ съел " + animal);
    }
    @Override
    public void eatenBy(Animal animal) {
        System.out.println(animal + " съел Котэ");
    }
    }

