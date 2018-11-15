package hw.hw_synt.animals;

public class Mouse
        extends Animal
        implements Movable, Eatable

{  @Override
public void move () {
    System.out.println("Мышь двигается");
}
@Override
    public String toString() {
    return "Мышь";
}

    @Override
    public void eatenBy(Animal animal) {
        System.out.println(animal + " съел Мышь");
    }
}
