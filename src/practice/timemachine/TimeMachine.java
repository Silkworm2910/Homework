package practice.timemachine;


public class TimeMachine {

    public void goToFuture(Year year) {

        year.year += 10;
    }

    public void goToPast(Year year) {

        year.year -= 10;


    }

    public static void main(String[] args) {

        TimeMachine timeMachine = new TimeMachine();
        Year year = new Year(2018);

        System.out.println("Какой сейчас год?");
        System.out.println(year.year);

        timeMachine.goToPast(year);
        System.out.println("А сейчас?");
        System.out.println(year.year);
    }
}