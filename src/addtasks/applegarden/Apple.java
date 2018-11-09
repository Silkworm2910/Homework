package addtasks.applegarden;

public class Apple {

    /*Яблоки должны иметь определяться:
-возрастом
-цветом
-размером
-флаг испорченности (0 - свежее, 1 - испорченное)
-флаг упавшего с дерева (0 - на дереве, 1 - упало)

Яблоки имею методы:
-упасть с дерева
-испортиться */

    private int age;
    private String color;
    private int size;
    private int spoiled;
    private int onTheTree;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSpoiled() {
        return spoiled;
    }

    public void setSpoiled(int spoiled) {
        this.spoiled = spoiled;
    }

    public int getOnTheTree() {
        return onTheTree;
    }

    public void setOnTheTree(int onTheTree) {
        this.onTheTree = onTheTree;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "возраст: " + age +
                ", цвет: " + color +
                ", размер: " + size +
                ", испорчено? : " + spoiled +
                ", на дереве? : " + onTheTree +
                '}';
    }

    public void toFall() {
        if (getAge( )> 29) {
            setOnTheTree(0);
        }
    }

    public void toSpoil () {
        if (getOnTheTree( ) == 0 ) {
            setSpoiled(1);
        }
    }

}
