package hw.hw051218.observer;

public class Red implements Alarm {

    private int prevTemp;

    @Override
    public void tempChanged(int temperature) {

        if ((prevTemp < temperature) && (prevTemp < 600) && (temperature >= 600)) {
            System.out.println ("Red alarm");
        }

        prevTemp = temperature;
    }
}
