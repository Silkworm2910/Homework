package lesson7.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Война и Мир", "Л.Н. Толстой");
        book1.setPages(1000);

        // выводим объект в консоль
        System.out.println(book1.toString());
// результат вывода до переопределения метода toString() lesson7.book.Book@f5f2bb7
// результат вывода после переопределения метода toString() Book{title='Война и Мир', author='Л.Н. Толстой', pages=1000}

        Book book2 = new Book("Война и Мир", "Л.Н. Толстой");
        book2.setPages(1000);

        // сравниваем объекты
        System.out.println(book1 == book2); // false - вернет true, только если переменные - ссылки на один объект
        System.out.println(book1.equals(book2));
//результат вывода до переопределения методов equals() и hashCode() - false
//результат вывода после переопределения методов equals() и hashCode() - true

        // сравним, как ведут себя статическая и нестатическая переменные
        // нестатичекие переменные привязаны к объектам, статическая принадлежит классу,
        // ее значение будет одинаково для всех объектов
        book1 = new Book("Война и Мир", "Л.Н. Толстой");
        book1.setPages(1000);
        book2 = new Book("Обломов", "И.А. Гончаров");
        book2.setPages(700);

        book1.sellBook();
        book1.sellBook();
        book1.showInfo();
        book2.showInfo();

        book2.sellBook();
        book1.showInfo();
        book2.showInfo();

        // к статичесой переменно можно обратиться по имени класса(без создания объекта)
        Book.soldBookCounterStatic = 45;
        // можно и через объект
        System.out.println(book1.soldBookCounterStatic);
        System.out.println(book2.soldBookCounterStatic);

        // к статическим методам также обращаются по имени класса (без создания объекта)
        Book.showPriceList();

    }
}
