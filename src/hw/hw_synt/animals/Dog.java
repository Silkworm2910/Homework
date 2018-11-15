package hw.hw_synt.animals;

public class Dog
    extends Animal
        implements Movable, Eat

{
        @Override
    public void move(){
        System.out.println("Собакен двигается");
        }

        @Override
    public void eat(Animal animal) {
            System.out.println("Собакен съел " + animal);
        }
    @Override
    public String toString() {
        return "Собакен";
    }
        }



