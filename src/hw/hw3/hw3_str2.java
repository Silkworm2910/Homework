package hw.hw3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw3_str2 {
    public static void main(String[] args) {
        /*2) Требуется удалить из нее повторяющиеся символы и все пробелы.
Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/

                Scanner in = new Scanner(System.in);
                System.out.println("Введите строку:");
                String str = in.nextLine();
                str = str.replaceAll(" ", "");
                List<Character> letters = new ArrayList<>();
                StringBuilder newStr = new StringBuilder();
                for(int i = 0;i<str.length();i++){
                    if(!letters.contains(str.charAt(i))){
                        letters.add(str.charAt(i));
                        newStr.append(str.charAt(i));
                    }
                }
                System.out.println("Новая строка: "+newStr.toString());
}
}
