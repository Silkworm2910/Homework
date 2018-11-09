package addtasks.applegarden;

import java.util.Arrays;

public class Tree {
    private int size = 5;
    private Apple[] apples = new Apple[size];

    public void addApples(Apple apple) {
        for (int i = 0; i < apples.length; i++) {
                       if (apples[i] == null) {
                apples[i] = apple;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Tree{" +
                apples +
                '}';
    }
    public void showApples() {
        System.out.println(Arrays.toString(apples));
    }
}
