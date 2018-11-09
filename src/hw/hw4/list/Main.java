package hw.hw4.list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List list = new List();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.print();
        list.remove(1);
        list.print();
    }
}
