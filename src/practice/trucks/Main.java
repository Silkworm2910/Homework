package practice.trucks;

public class Main {
    public static void main(String[] args) {

        BridgeOfficer bo1 = new BridgeOfficer(50);
        Truck truck = new Truck();
        truck.length = 5;
        truck.height = 6;
        truck.width = 2;
        System.out.println(bo1.checkTruck(truck));
    }
}
