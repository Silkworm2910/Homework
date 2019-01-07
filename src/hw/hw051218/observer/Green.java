package hw.hw051218.observer;

public class Green implements Alarm {

    private int prevTemp;

    @Override
    public void tempChanged(int temperature) {

     if ((prevTemp < temperature) && (prevTemp < 100) && (temperature >= 100) && (temperature < 300)) {
                System.out.println ("Green alarm");
     }

        prevTemp = temperature;
    }
}
