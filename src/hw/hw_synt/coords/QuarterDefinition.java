package hw.hw_synt.coords;

public class QuarterDefinition {
   /* для первой четверти a>0 и b>0;
    для второй четверти a<0 и b>0;
    для третьей четверти a<0 и b<0;
    для четвертой четверти a>0 и b<0.*/

    public static void quart(int a, int b) {
        if (a > 0) {
            if (b > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else if (b<0) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }
    }
}