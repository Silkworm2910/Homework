package practice.trucks;

public class Truck {
    int length;
    int width;
    int height;

    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}