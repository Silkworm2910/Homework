package hw.hw051218.observer;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    public void changeTemp(int currTemp){
        System.out.println("Current temp: " + currTemp);
        notifyAll(currTemp);
    }

    private List<Alarm> alarms = new ArrayList<>();

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    private void notifyAll (int currTemp) {
        for (Alarm alarm:alarms) {
            alarm.tempChanged(currTemp);
        }
    }
}
