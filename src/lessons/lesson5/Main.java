package lessons.lesson5;

import lessons.lesson5.battleunit.Knight;
import lessons.lesson5.battleunit.Spearman;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight(100, 20);
        Spearman spearman = new Spearman(60, 70);

        knight.attack(spearman);
    }
}



