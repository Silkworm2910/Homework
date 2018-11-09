package lesson7.nested;

public class Main {
    public static void main(String[] args) {
        HiLoSum sum = new HiLoSum();
        int res = sum.sum(0x00010001);
        System.out.println(res); // 2

//      Если позволяет область видимости, то можно получить доступ к классу,
//      как и к любой переменной или методу, обозначенными static
        HiLoSum.HiLow hilow = new HiLoSum.HiLow(10, 20);
    }
}
