package lessons.lesson4;

public class Main {
    public static void main(String[] args) {
        Good table = new Good(); //создали объект
        table.setTitle("Стол");
        table.setPrice(700);
        System.out.println(table.toString());
        System.out.println(table.getTitle());

        Good chair = new Good("hhh");
        chair.setTitle("Стул");
        chair.setPrice(200);
        System.out.println(chair.toString());
        System.out.println(chair.getTitle());

        Good door = new Good("Дверь", 1000);


        Storage storage = new Storage();
        storage.addGood(table);
        storage.addGood(chair);
        storage.addGood(chair);
        storage.addGood(chair);
        storage.showGoods();

    }
}
