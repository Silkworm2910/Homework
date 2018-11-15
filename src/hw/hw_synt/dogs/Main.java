package hw.hw_synt.dogs;


public class Main {
    public static void main(String[] args) {

    /*Создать класс Dog с пятью конструкторами:
            - Имя,
            - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет (имя, адрес и возраст неизвестны, это бездомный пес)
        - вес, цвет, адрес (домашний пес)*/
        //последовательный ввод известных полей: имя, вес, возраст, цвет, вдрес
        Dogs dog1 = new Dogs(20, "grey");
        Dogs dog2 = new Dogs("Meatball", 8, 3);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println("Количество собак: " + Dogs.getDogCount());
        Dogs dog3 = new Dogs(15, "white", "Ватутина, 45/1-3");
        Dogs dog4 = new Dogs("Cinnamon", 12);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println("Количество собак: " + Dogs.getDogCount());
    }
}