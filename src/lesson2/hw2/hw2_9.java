package lesson2.hw2;

public class hw2_9 {
    public static void main(String[] args) {
        /*Задача 9
        Задать количество тарелок и количество моющего средства.
        Моющее средство расходуется из расчета 0,5 на одну тарелку.
        В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
        В конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот.
*/
        int tarelki = 10;
        float fairy = 5F;
        do {tarelki--; fairy-=0.5;
            System.out.println("Осталось средства: " + fairy);
        }while ((fairy > 0) & (tarelki>0));
        if (fairy > 0) {
            System.out.println("Тарелки вымыты. Осталось средства: " + fairy);}
            else if (tarelki > 0) {
                System.out.println("Средство закончено. Осталось не вымыто тарелок: " + tarelki);
            }
                else {
                    System.out.println("Средство закончено. Тарелки вымыты");
                }
            }
        }

