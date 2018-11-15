package hw.hw_synt.cats;

public class Cat {
   /* У кота должно быть имя (name, String),
    возраст (age, int),
    вес (weight, int),
    сила (strength, int).*/

    String name;
    int age;
    int weight;
    int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    private double power() {
        return weight*strength - age;
    }

    public boolean fight(Cat cat) {
        if (this.power() > cat.power()) {
            return true;
        } else {
            return false;
        }
    }
}
