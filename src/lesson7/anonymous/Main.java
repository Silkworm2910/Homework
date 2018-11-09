package lesson7.anonymous;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        Calculator calculator = new Calculator(a, b);
//        анонимные классы (anonymous inner class)
//        не имеют имени, им достаточно реализации
//        Наследуют класс, или имплиментирует интерфейс(ы)
        calculator.execute(new Operation() {
            @Override
            public double apply(double a, double b) {
                return a + b;
            }
        });
        calculator.showRes();

        calculator.execute(new Operation() {
            @Override
            public double apply(double a, double b) {
                return a - b;
            }
        });
        calculator.showRes();
    }
}
