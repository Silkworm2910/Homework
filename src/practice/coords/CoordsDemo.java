package practice.coords;

public class CoordsDemo {
    public static void main(String[] args) {
        Coords obj = new Coords(); //создание объекта
        obj.set(5.0, 0, 2.5);
        obj.y = -4.3; // обращение к полю объекта
        System.out.println("Расстояние до точки: " + obj.getDistance()); // обращение к методу объекта
    }
}
