package addtasks.applegarden;

import java.util.Arrays;

public class Garden {
    private int size = 3;
    public Tree[] trees = new Tree[size];

    public int getSize() {
        return size;
    }

    public Tree[] getTrees() {
        return trees;
    }

    public void addTrees() {
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] == null) {
                trees[i] = trees[i];
                return;
            }
        }
    }


    public void showTrees() {
        for (int i = 0; i < trees.length; i++) {
            System.out.println(trees[i]);
        }
    }
}


