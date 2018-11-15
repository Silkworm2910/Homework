package hw.hw_synt.dogs;

/*
Создать класс Dog с пятью конструкторами:
        - Имя,
        - Имя, вес, возраст
        - Имя, возраст (вес стандартный)
        - вес, цвет (имя, адрес и возраст неизвестны, это бездомный пес)
        - вес, цвет, адрес (домашний пес)
*/


public class Dogs {
    String name, color, adress;
    int weight, age;

    private static int count;

    static int getDogCount() {
        return count;
    }

    public Dogs(String name) {
        this.name = name;
        this.weight = 10;
        this.age = 1000;
        this.color = null;
        this.adress = null;
        count++;
    }

    public Dogs(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = null;
        this.adress = null;
        count++;
    }

    public Dogs(String name, int age) {
        this.name = name;
        this.weight = 10;
        this.age = age;
        this.color = null;
        this.adress = null;
        count++;
    }

    public Dogs(int weight, String color) {
        this.name = "Имя неизвестно";
        this.weight = weight;
        this.age = 1000;
        this.color = color;
        this.adress = null;
        count++;
    }

    public Dogs(int weight, String color, String adress) {
        this.name = "Имя неизвестно";
        this.weight = weight;
        this.age = 1000;
        this.color = color;
        this.adress = adress;
        count++;
    }

    @Override
    public String toString() {
        if (age == 1000) {
            return "Dogs{" +
                    "имя: " + name +
                    ", цвет: " + color +
                    ", адрес: " + adress +
                    ", вес: " + weight +
                    ", возраст: неизвестен}";
        } else {
            return "Dogs{" +
                    "имя: " + name +
                    ", цвет: " + color +
                    ", адрес: " + adress +
                    ", вес: " + weight +
                    ", возраст: " + age +
                   "}";
        }
    }
}