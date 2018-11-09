package lesson7.anonymous;

public class Calculator {
    double a;
    double b;
    double res;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void execute(Operation operation){
        res = operation.apply(a, b);
    }

    public void showRes() {
        System.out.println("res = " + res);
    }
}
