package lesson2.lesson;

import java.util.Scanner;
public class Lesson2 {

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Введите код. Трехзначное число");//123
        int code = in.nextInt();
        if (code == 123) {
            System.out.println("Вы вошли как администратор");
        } else if (code == 345) {//дополнительный else if
            System.out.println("Вы вошли как участник");
        } else System.out.println("Вы не вошли");


        //---------------
        int a = 5;
        int b = 7;
        if (a == 5) {
            System.out.println("Совпадение найдено a");
        } else if (b == 7) {
            System.out.println("Совпадение найдено b");
        } else {
            System.out.println("Совпадений нет");
        }

        // ---------- switch оператор выбора
        // большой приз 333333
        //средний 333334 333335
        // большой 333344 333355 333366
        Scanner in2 = new Scanner (System.in);
        System.out.println("Введите 6значный номер билета");
        int userTicketNum = in2.nextInt();
        String prize;
        switch (userTicketNum) {
            case 333333:
                prize = "Большой приз";
                break;
            case 333334:
            case 333335:
                prize = "Средний приз";
                break;
            case 333344:
            case 333355:
            case 333366:
                prize = "Малый приз";
                break;
             default:
                 prize = "Приза нет";
        }
        System.out.println("Результат " + prize);

        //----------------
        // while
        int messageCount = 5;
        // while (слуовие) {тц}

        while(messageCount > 0) {
            System.out.println("Сообщение № " + messageCount);
            messageCount --;
        }

       //=======================
        Scanner in3;
        System.out.println("ВВедите код. Трехзначное чсило");
        int code2;
        while (true) {
            in3 = new Scanner (System.in);
            code2 = in3.nextInt ();
            if (code2 == 123) {
                System.out.println("Вы вошли как администратор");
                in3.close ();
                break;
            }
            if (code2 == 345) {
                System.out.println("Вы вошли как участник");
                in3.close ();
                break;
            } else {
                System.out.println("Повторите попытку");
            }
            }

        //=====
        //уикл с постусловием do while
        do {
            System.out.println("Первая итерация");
        } while (false);
        //цикл for
        // for (инизиализация; проверка условия; шаг) {тело цикла}
        // вывести все нечетные числа о 1 до 11 (не вкл)
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0) continue;
            {
                System.out.println("i = " + i);
            }
        }
        //======
        for (int i = 0; i < 3; i++){
            System.out.println("Внешний цикл. i = " + i);
            for (int j = 0; j < 15; j++) {
                System.out.println("j = " +j);
                if (j == 5) break ;
*/
       //------------
      outer:  for (int i = 0; i < 3; i++){
            System.out.println("Внешний цикл. i = " + i);
            for (int j = 0; j < 15; j++) {
                System.out.println("j = " +j);
                if (j == 5) break outer;
            }
        }
        }


    }




