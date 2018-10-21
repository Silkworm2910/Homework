package lesson2.hw2;

public class hw2_8 {
    public static void main(String[] args) {
        /*Задача 8
        Есть три вершины X, Y, Z.
        Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа.
        Нужно определить - является ли треугольник с заданными координатами прямоугольным.
*/
        int x1 = 3; int y1 = 2; int x2 = 4; int y2 = 2; int x3 = 3; int y3 = 7;
        if (((x1 == x2) | (x3 == x2) | (x1 == x3)) & ((y1 == y2) | (y3 == y2) | (y1 == y3))) {
            System.out.println("Я прямоугольный");
        }
        else {
            System.out.println("Я не прямоугольный");
        }
        }
        }

