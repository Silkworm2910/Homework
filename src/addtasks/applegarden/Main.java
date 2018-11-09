package addtasks.applegarden;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        apple1.setAge(28);
        apple1.setColor("red");
        apple1.setSize(5);
        apple1.setSpoiled(0);
        apple1.setOnTheTree(1);
        apple2.setAge(36);
        apple2.setColor("red");
        apple2.setSize(5);
        apple2.setSpoiled(0);
        apple2.setOnTheTree(1);
        apple1.toFall();
        apple2.toFall();
        apple1.toSpoil();
        apple2.toSpoil();
        Garden garden = new Garden();
        garden.addTrees();
        garden.showTrees();



    }
}
