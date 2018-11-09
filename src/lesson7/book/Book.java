package lesson7.book;

public class Book {
    private String title;
    private String author;
    private String description;
    private int pages;

    // создадим константную переменную
    // присвоить значения константам можно только при объявлении переменой или в конструкторе
    final String PRINTING_HOUSE; // = "Неизвестная типография";

    // создадим нестатическую переменную (счетчик проданных книг)
    private int soldBookCounter;

    // создадим статическую переменную (счетчик проданных книг)
    public static int soldBookCounterStatic;


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        // присвоим значение нестатической переменной
        soldBookCounter = 0;
        // присвоить значения константам можно в конструкторе
        PRINTING_HOUSE = "Неизвестная типография";
    }

    // статический блок - для инициализации статических переменных
    // используется для создания статических ресурсов, когда класс загружается
    // нельзя получить доступ к нестатическим переменным в статическом блоке
    // статический блок кода выполняется только один раз, когда класс загружается в память
    static {
        // присвоим значение статической переменной
        // в статическом блоке
        soldBookCounterStatic = 0;
    }

    public void setPrintingHouse(String printingHouse){
        // изменить значение константной (final) переменной нельзя
        // PRINTING_HOUSE = printingHouse;
    }

    // продажа книг
    public void sellBook(){
        soldBookCounter++; // увеличиваем значение нестатической переменной на 1
        soldBookCounterStatic++; // увеличиваем значение статической переменной на 1
    }

    // методы, которые отображают значения soldBookCounter и soldBookCounterStatic
    // final методы нельзя переопределить в дочерних классах
    // см. класс ChildrensBook ниже
    final public void showInfo(){
        System.out.println("soldBookCounter = " + soldBookCounter);
        System.out.println("soldBookCounterStatic = " + soldBookCounterStatic);
    }

    public void setDescription(final String description) {
//        description = "Нельзя изменить final аргументы";
        this.description = description; // final аргументы доступны только для чтения
    }

    // статический метод
    // начиная с Java 8, можно использовать статические методы и в интерфейсах
    public static void showPriceList(){
        // из статического метода можно обратиться только к статическим переменным и методам
        // System.out.println(soldBookCounterStatic);
        // из статического метода нельзя обратиться к нестатическим переменным и методам
        // System.out.println(soldBookCounter); // ошибка - нет доступа
        // showInfo(); // ошибка - нет доступа
        System.out.println("Книги до 500 страниц - 1000p. \n" +
                "Книги более 500 страниц - 2000р.");
    }


    public void setPages(int pages) {
        this.pages = pages;
    }

    // Для удобства вывода обекта в консоль
    // переопределим метод toString() класса Object(родительский класс всех классов Java)
    // ALT + insert в Intellij IDEA

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }

    // Если необходимо будет сравнивать объекты, то нужно переопределить методы
    // equals() и hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (pages != book.pages) return false;
        if (title != null ? !title.equals(book.title) : book.title != null) return false;
        return author != null ? author.equals(book.author) : book.author == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + pages;
        return result;
    }
}

//от final класса нельзя наследоваться
// см. класс ColoringBook
final class ChildrensBook extends Book{

    public ChildrensBook(String title, String author) {
        super(title, author);
    }

//    final методы нельзя переопределить в дочерних классах
//    @Override
//    final public void showInfo(){...}

}

//class ColoringBook extends ChildrensBook{ //от final класса нельзя наследоваться

//    public ColoringBook(String title, String author) {
//        super(title, author);
//    }
//}
