package practice.myclass;

public class MyClass {
    private int a, b; //закрытые поля
    private void showab() { //закрытый метод
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void setab (int x, int y) {//открытый метод
        a = x; b = y;
        System.out.println("Присвоены значения полям");

    }

    void getab () { //открытый метод
        System.out.println("Проверка значений полей: ");
        showab(); // обращение к закрытому методу в классе
    }

}
