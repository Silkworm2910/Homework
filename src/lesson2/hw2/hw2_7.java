package lesson2.hw2;

public class hw2_7 {
    public static void main(String[] args) {
        /*Задача 7
        Электронные часы показывают время в формате от 00:00 до 23:59.
        Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
        симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
        int desCh, edCh, desMin, edMin;
        int kolichestvo = 0;
        for (desCh = 0; desCh < 25; desCh++) {
            for (edCh = 0; edCh < 25; edCh++) {
                for (desMin = 0; desMin < 25; desMin++) {
                    for (edMin = 0; edMin < 25; edMin++) {
                        if ((desCh == edMin) && (edCh == desMin)) {
                                kolichestvo++;
                            }
                        }
                    }
                }
            }
        System.out.println(kolichestvo);
        }
        }

