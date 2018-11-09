package lessons.lesson3;

public class Lesson3_2 {
    public static void main(String[] args) {
    /*    //строки - полноценный объект
        String str = "String";
        String str2 = new String("String");
        "String".length();// = sout("String")
        String str3 = String.format("String %02d", 8); //не используем, ест память
        System.out.println(str3);
        String str4 = "String String";
        String str5 = "String";

        System.out.println(str == str2); //false
        System.out.println(str == str5); //true

        //сравниваем так: посимвольно
        System.out.println(str.equals(str2)); //true
        System.out.println(str.equals(str5)); //true

        String str6 = ("strinG");
        System.out.println(str.equalsIgnoreCase(str6));// без учета регистра true
        System.out.println(str.equals(str6));

        System.out.println(str.startsWith("Q"));//начинается ли строка с последлвательности символов с учетом регистра
        System.out.println(str.endsWith("g"));//заканчивается ли

        String str10 = "string";
        String str11 = new String("string");
        String str12 = "str";
        String str13 = "String string";

        System.out.println(str10.compareTo(str11));// 0, если обе строки равны
        System.out.println(str11.compareTo(str12)); если вызывающая строка >, то рез-т положительный,
        если отрицательный, то вызывающая строка меньще
   /*     System.out.println(str11.compareTo(str13));// стр 13 считается меньше при таком ст=равнении тк буквы маленькие
        System.out.println("string".compareToIgnoreCase("String string"));//регистр проигнорирован, поэтому считаем, что вызывающая строка меньше

        int compareRes = str11.compareTo(str12); //0 -23 +23
        if (str11.compareTo(str12) == 0) {
            System.out.println("==");
        } else if (compareRes < 0) {
            System.out.println("<0");
        } else {
            System.out.println(">0");
        }


        String a = "Astring";
        String b = "Bstring";
        String c = "Строка \n\"строка\"";

        String[] strArr = {c, a, b};
        */
    /*
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        System.out.println(c.substring(3, 13));//метод из строки возьмет подстроку начиная с 3 элемента до 13
        System.out.println(a.contains("str"));//true если подстрочка найдена в строке

        String[] arr = {"qwe", "rty", "yui"};
        System.out.println();

  */      String string = "First ";
        String string2 = "Second ";
        string2 += string; // "Second " + "First"
        System.out.println(string2); //Second First

        for (int i = 0; i < 10; i++) {
        string += string2;
    }
        System.out.println(string);

       /* StringBuffer | StringBuilder работают одинаково, билдер обладает большей производительностью,
         но с ним нельзя работать в многопоточности. Вилдер быстрее, Баффер для потоков*/
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append(string);
       for (int i = 0; i < 10; i++) {
           stringBuilder.append("string ").append(("str "));
       }
        System.out.println(stringBuilder);
        }
    }

