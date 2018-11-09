package hw.hw3;
import java.util.Arrays;
public class hw3_str3 {
    public static void main(String[] args) {
        String str = "дом 48, корпус 9, парадная 7, этаж 4";
       String[] strArr = (str.replaceAll("\\D+", " ")
                .trim()).split(" ");
        System.out.println(Arrays.toString(strArr));
    }
}
