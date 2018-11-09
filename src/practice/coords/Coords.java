package practice.coords;

public class Coords {
    double x, y, z;
    void set (double a, double b, double c) { // метод присваивает значения полям
        x = a; y = b; z = c;

    }
     double getDistance() {
        return Math.sqrt(x*x + y*y + z*z);
     }

}
