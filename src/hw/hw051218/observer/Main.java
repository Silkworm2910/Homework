package hw.hw051218.observer;

public class Main {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.addAlarm(new Green());
        sensor.addAlarm(new Yellow());
        sensor.addAlarm(new Red());

        for (int i = 50; i < 651; i += 100) { // повышаем с шагом 100, поочередно выводятся все алармы
            sensor.changeTemp(i);
        }

        sensor.changeTemp(50); // понижаем до безопасного уровня, ничего не выводится
        sensor.changeTemp(850); // повышаем до red level, red alarm
        sensor.changeTemp(150); // понижаем до green level, ничего не выводится
        sensor.changeTemp(450); // повышаем до yellow level, выводится yellow alarm

    }
}
