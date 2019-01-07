package hw.hw051218.observer;

public class Yellow implements Alarm {

    private int prevTemp;

    @Override
    public void tempChanged(int temperature) {

        if ((prevTemp < temperature) && (prevTemp < 300) && (temperature >= 300) && (temperature < 600)) {
            System.out.println ("Yellow alarm");
        }

        prevTemp = temperature;
    }
}
