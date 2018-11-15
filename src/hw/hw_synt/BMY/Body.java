package hw.hw_synt.BMY;

public class Body {
    public static void bmi(double a, double b) {
        double ind = a/(Math.pow(b,2));
        if (ind < 18.5) {
            System.out.println("Недовес: меньше чем 18.5");
        } else if ((18.5 <= ind) && (ind <= 24.9)) {
            System.out.println("Нормальный: между 18.5 и 24.9");
        } else if ((25 <= ind) && (ind <= 29.9)) {
            System.out.println("Избыточный вес: между 25 и 29.9");
        } else {
            System.out.println("Ожирение: 30 или больше");
        }
    }
}
