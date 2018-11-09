package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args) {
        String string = "Строка 1 для поиска И4 и замены СИМВОЛОВ_ё";
        String pattern = "иск";
        System.out.println(string.replaceAll(pattern, "*!*"));
        pattern = "^Стр"; //домик - привязка к началу строки, $ - к концу
        System.out.println(string.replaceAll(pattern, "*!*"));
     //   "^Стр$" - Строка должны быть равна Стр
        pattern = "[иск]";// перечень символов []
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[^иск]";// исключение, ищутся все, кроме этих
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\d"; // цифровой символ
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\D";// не цифровой символ в тч пробелы, символы и проч
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\w";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "\\W";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[а-я, ё]";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я]";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я0-9]";
        System.out.println(string.replaceAll(pattern, "*"));
        pattern = "[А-Я][0-9]";
        System.out.println(string.replaceAll(pattern, "*"));



        // w - буквенно-цифровой символ или _
        // W - не w
        // s - любой пробельный символ (пробелы, отступы, перенос строки)
        // S - не S

        // Pattern | Matcher
        string = "String B1 to search and replaceии CHARS";
      //  string = "Strиии";

       // Pattern pattern1 = Pattern.compile(".{6,}"); // символ . (любой символ) должен повторяться от 6 раз до беск.
        Pattern pattern1 = Pattern.compile(".{6,}");
        pattern1 = Pattern.compile("(?=.*\\d)(?=.\\[a-z])(?=.*\\[A-Z]).{8}"); //3 подвыражения
        //1- в строке обязательно должна быть цифра; 2 - в строке должны быть обзательно буквы A-Z; 3 - минимум 8 символов
        Matcher matcher = pattern1.matcher(string);
        System.out.println(matcher.find()); // true | false
        Pattern pattern2 = Pattern.compile("и.{2}");
        Matcher matcher1 = pattern2.matcher(string);
        System.out.println(matcher1.find());


    }
}
