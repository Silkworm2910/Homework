package hw.hw_synt.animals2;

public class Main {
    public static void main(String[] args) {
        /*Задача 1
        Написать метод, который определяет, объект какого класса ему передали,
        и выводит на экран одну из надписей: Кошка, Собака, Птица.
*/
    Dogs dog = new Dogs();
    Cats cat = new Cats();
    Birds bird = new Birds();
    Dogs tuzik = new Dogs();
    bird.whoAreYou();
    tuzik.whoAreYou();
    }
}
