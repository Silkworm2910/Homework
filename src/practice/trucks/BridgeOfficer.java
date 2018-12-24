package practice.trucks;

public class BridgeOfficer {
    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.getVolume() > maxWeight) {


            return false;
        } else {

            return true;
        }
    }
}
