package hw.hw2;

public class hw2_6 {
    public static void main(String[] args) {
        /*Задача 6
В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
«Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
как, например, в билетах с номерами 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю
каждого счастливого билета и теперь раздумывает, как много сувениров потребуется.
С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
*/
        int symb1, symb2, symb3, symb4, symb5, symb6;
        int kolichestvo = 0;
        for (symb1 = 0; symb1 < 10; symb1++) {
            for (symb2 = 0; symb2 < 10; symb2++) {
                for (symb3 = 0; symb3 < 10; symb3++) {
                    for (symb4 = 0; symb4 < 10; symb4++) {
                        for (symb5 = 0; symb5 < 10; symb5++) {
                            for (symb6 = 0; symb6 < 10; symb6++) {
                                if (symb1 + symb2 + symb3 == symb4 + symb5 + symb6) {
                                    kolichestvo++;
                                }
                                }
                            }
                        }
                    }
                }
            }
        System.out.println(kolichestvo-1);//тк исключаем билет 000000

        /*        int souvenir = 0;
        for (int ticket = 1; ticket <= 999999; ticket++) {
            int part1 = ticket / 100000 + ticket / 10000 % 10 + ticket / 1000 % 10;
            int part2 = ticket / 100 % 10 + ticket / 10 % 10 + ticket % 10;
            if (part1 == part2) {
                ++souvenir;
            }

        }
        System.out.println("Количество сувениров: " + souvenir);*/
        }
        }

