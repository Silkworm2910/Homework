package hw.hw4.figures;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1,2,16,1);
        System.out.println("Площадь круга: " + circle.getSqr());
        System.out.println("Длина окружности: " + circle.getLength());
        Rectangle rectangle = new Rectangle(2,2,7,4);
        System.out.println("Площадь прямоугольника: " + rectangle.getSqr());
        System.out.println("Периметр прямоугольника: " + rectangle.getLength());
        Triangle triangle = new Triangle(3,5, 3, 2, 6, 2);
        System.out.println("Площадь прямоугольника: " + triangle.getSqr());
        System.out.println("Периметр прямоугольника: " + triangle.getLength());
    }
}
