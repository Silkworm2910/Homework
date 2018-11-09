package practice.dynamiclist;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // исходный объект
        obj.create(3); // создание списка из 4х объектов
        //проверка содержимого списка:
        System.out.println("Значение поля number объектов:");
        System.out.println("2-й после начального -> "+obj.getNumber(2));
        System.out.println("4-й после начального -> "+obj.getNumber(4));
        System.out.println("2-й после 1-го -> "+obj.next.getNumber(2));

    }
}
