package lessons.lesson4;

public class Good {

        /*
        объекты:
        товары
        характеристики: название, цена, цвет (опционально в шаблоне)
        методы: установить название, установить цену

        объект:
        хранилище
        характеристики: размер
        методы: добавление товаров, удаление товаров
        */

       private String title;
       private int price;
       //alt+insert
    // setter - устанаваливает, getter - возвращает


    public void setTitle(String title) {

        this.title = title;
    }

    //serTitle() - вызов метода, можно setTitle("Table") будет
    // this.title = "Table"
    //если метод что-то вовзращает, то можно int res = setTitle; - записать рез-т

    @Override
    public String toString() {
        return "Good{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
    public Good(){}
    public Good(String title){
        this.title = title;
    }

    public Good(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(int price) {
        this.price = price;


    }
}
