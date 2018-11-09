package lesson7.nested;

public class HiLoSum {
    int sum(int value) {
        // Получаем экземпляр вложенного класса.
        HiLow hiLow = split(value);
        return hiLow.hi + hiLow.low;
    }
    // Приватный метод, который возвращает экземпляр вложенного класса.
    private HiLow split(int value) {
        return new HiLow(value >>> 16, value & 0xFFFF);
    }

//    Часто бывает нужен класс в рамках работы другого класса, и больше
//    нигде, а создание нового файла захлямляет проект. Для таких случаев
//    часто используют вложенные классы (static nested classes):

    // Объявляем вложенный класс, т.к. он объявлен static, то не
    // имеет доступа к полям основного класса HiLoSum.
    static class HiLow {
        int hi;
        int low;
        HiLow(int hi, int low) {
            this.hi = hi;
            this.low = low;
        }
    }
}
